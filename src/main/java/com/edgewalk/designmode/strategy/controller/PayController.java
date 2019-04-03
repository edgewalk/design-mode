package com.edgewalk.designmode.strategy.controller;

import com.edgewalk.designmode.strategy.Order;
import com.edgewalk.designmode.strategy.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

/**
 * Created by: edgewalk
 * 2019-04-03 22:16
 */
@RestController
public class PayController {

    /**
     * 收集系统中所有的{@link PayService} 接口的实现
     * key就是 ValidateCodeProcessor接口实现类的注解定义的名字
     * value就是具体的实现类对象
     */
    @Autowired
    private Map<String, PayService> payServices;

    @PostMapping("pay")
    public String pay(Order order) {
        PayService payService = payServices.get(order.getPaytype());
        if (Objects.isNull(payService)) {
           return "当前支付模式不支持,当前支持的模式:"+payServices.keySet().toString();
        }
        return payService.pay(order.getUid(), order.getAmount());
    }
}
