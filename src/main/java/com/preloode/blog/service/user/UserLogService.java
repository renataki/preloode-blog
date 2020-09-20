package com.preloode.blog.service.user;

import com.preloode.blog.component.DataComponent;
import com.preloode.blog.configuration.global.GlobalConfiguration;
import com.preloode.blog.enumeration.user.UserLogType;
import com.preloode.blog.model.user.User;
import com.preloode.blog.model.user.UserLog;
import com.preloode.blog.model.user.UserReference;
import com.preloode.blog.model.user.UserTargetReference;
import com.preloode.blog.repository.user.UserLogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;


@Service
public class UserLogService {


    private static final Logger logger = LoggerFactory.getLogger(UserLogService.class);

    @Autowired
    private GlobalConfiguration global;

    @Autowired
    private DataComponent data;

    @Autowired
    private UserLogRepository userLogRepository;

    @Autowired
    private UserService userService;


    public UserLog insert(HttpServletRequest request, String authentication, String description, UserLogType log, String targetId, String targetName, User user) {

        if(authentication.isEmpty()) {

            authentication = data.initializeCookie(request, global.getCookie().getPrefix() + "acn");

        }

        UserLog userLogData = new UserLog(
                "",
                data.initializeTimestampReference(user.getId(), user.getUsername(), null),
                data.initializeTimestampReference(user.getId(), user.getUsername(), null),
                authentication,
                userService.initializeAgent(request),
                description,
                new UserTargetReference(
                        targetId,
                        targetName
                ),
                log,
                new UserReference(
                        user.getId(),
                        user.getUsername()
                )
        );
        userLogRepository.save(userLogData);

        logger.info("User log inserted");

        return userLogData;

    }


}
