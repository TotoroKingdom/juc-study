package com.totoro.listener_spring;

import com.totoro.pojo.User;
import org.springframework.context.ApplicationEvent;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
public class UserRegisterEvent extends ApplicationEvent {

    private User user;

    public UserRegisterEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

    public UserRegisterEvent(Object source) {
        super(source);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
