package com.wangxuegang.system.api.exception;


import com.wangxuegang.system.api.exception.base.BusinessException;

/**
 * 短信发送太频繁
 *
 * @author zhangxd
 */
public class SmsTooMuchException extends BusinessException {

    public SmsTooMuchException(String message) {
        super(message);
    }

}
