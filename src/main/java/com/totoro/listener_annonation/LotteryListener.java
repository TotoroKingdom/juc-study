package com.totoro.listener_annonation;

import com.totoro.pojo.Apple;
import com.totoro.pojo.Card;
import com.totoro.pojo.User;
import com.totoro.service.UserService;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@Component
public class LotteryListener {


    @EventListener(classes = Card.class)
    @Async
    public void sendMoments(Card card){
        System.out.println(Thread.currentThread().getName());
        System.out.println("发个朋友圈炫耀一下:"+card);

    }


    @EventListener(classes = Apple.class)
    @Async
    public void sendQQMoments(Card card){
        System.out.println(Thread.currentThread().getName());
        System.out.println("发个QQ空间炫耀一下:"+card);

    }
}
