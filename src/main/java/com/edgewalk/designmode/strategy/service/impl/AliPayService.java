package com.edgewalk.designmode.strategy.service.impl;

import com.edgewalk.designmode.strategy.service.PayService;
import org.springframework.stereotype.Service;

//阿里支付
@Service("ali")
public class AliPayService implements PayService {

    public String pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝,\n查询账户余额，开始扣款");
        return "success";
    }
}