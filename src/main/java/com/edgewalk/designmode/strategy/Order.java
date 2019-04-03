package com.edgewalk.designmode.strategy;

import com.edgewalk.designmode.strategy.service.PayService;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户订单信息实体类
 */
@Data
@AllArgsConstructor
public class Order {
    private String uid;
    private String orderId;
    private double amount;
    private String paytype;

    public String doPay(PayService pay) {
        return pay.pay(this.uid, this.amount);
    }
}