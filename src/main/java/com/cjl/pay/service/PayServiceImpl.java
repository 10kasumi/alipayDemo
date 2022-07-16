package com.cjl.pay.service;

import com.alipay.api.AlipayApiException;
import com.cjl.pay.bean.AliPayBean;
import com.cjl.pay.config.AliPayConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService{
    private static final Logger LOGGER = LoggerFactory.getLogger(PayServiceImpl.class);

    @Autowired
    private AliPayConfig alipayConfig;

    @Override
    public String aliPay(AliPayBean aliPayBean) throws AlipayApiException {
        LOGGER.info("调用支付服务接口...");
        return alipayConfig.pay(aliPayBean);
    }
}
