package com.totoro.listener_spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@Component
public class SendEmailListener implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent event) {
        System.out.println("给尊贵的" + event.getUser().getName() +"发送一封邮件");
    }
}
