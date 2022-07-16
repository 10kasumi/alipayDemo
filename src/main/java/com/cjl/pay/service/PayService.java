package com.cjl.pay.service;

import com.alipay.api.AlipayApiException;
import com.cjl.pay.bean.AliPayBean;

public interface PayService {
    String aliPay(AliPayBean aliPayBean) throws AlipayApiException;
}
