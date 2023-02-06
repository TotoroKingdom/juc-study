package com.totoro;

import com.totoro.pojo.Apple;
import com.totoro.pojo.Card;
import com.totoro.pojo.User;
import com.totoro.service.AppleService;
import com.totoro.service.CardService;
import com.totoro.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@SpringBootTest
public class ListenerTest {

    @Resource
    private AppleService appleService;

    @Resource
    private UserService userService;

    @Resource
    private CardService cardService;

    @Test
    void springListenerAnnonationTest(){
        Card card = new Card();
        card.setName("神里凌华");
        card.setStar("5星");

        cardService.lottery(card);
    }

    @Test
    void springListenerTest(){
        User user = new User();
        user.setName("totoro");
        user.setAge("18");

        userService.registerUser(user);
    }

    @Test
    void contextLoads() {

        Apple apple = new Apple();
        apple.setName("iphone");
        apple.setColor("星光色");

        appleService.buyApple(apple);

    }
}
