package com.edgewalk.designmode.strategy.service.impl;

import com.edgewalk.designmode.strategy.service.PayService;
import org.springframework.stereotype.Service;

//京东支付
@Service("jd")
public class JDPayService implements PayService {

    public String pay(String uid, double amount) {
        System.out.println("欢迎使用京东,\n查询账户余额，开始扣款");
        return "success";
    }
}