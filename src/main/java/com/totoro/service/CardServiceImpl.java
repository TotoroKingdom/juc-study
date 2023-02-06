package com.totoro.service;

import com.totoro.pojo.Card;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:totoro
 * @createDate:2023/2/6
 * @description:
 */
@Service
public class CardServiceImpl implements CardService {

    @Resource
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void lottery(Card card) {
        System.out.println("抽到奖了：" + card);
        applicationEventPublisher.publishEvent(card);
    }
}
