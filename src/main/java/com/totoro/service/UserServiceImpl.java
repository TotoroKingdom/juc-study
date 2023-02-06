package com.totoro.service;

import com.totoro.listener_spring.UserRegisterEvent;
import com.totoro.pojo.Apple;
import com.totoro.pojo.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@Service
public class UserServiceImpl implements UserService, ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void registerUser(User user) {
        System.out.println("注册用户信息：" + user);
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this,user));
    }


}
