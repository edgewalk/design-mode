package com.edgewalk.designmode.strategy.service.impl;

import com.edgewalk.designmode.strategy.service.PayService;
import org.springframework.stereotype.Service;

//微信支付
@Service("wechat")
public class WechatPayService implements PayService {

    public String pay(String uid, double amount) {
        System.out.println("欢迎使用微信支付,\n查询账户余额，开始扣款");
        return "success";
    }
}