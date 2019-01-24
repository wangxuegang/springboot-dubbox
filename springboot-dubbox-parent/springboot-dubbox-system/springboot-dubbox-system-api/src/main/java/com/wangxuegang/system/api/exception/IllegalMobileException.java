package com.wangxuegang.system.api.exception;


import com.wangxuegang.system.api.exception.base.BusinessException;

/**
 * 手机号码不合法
 *
 * @author zhangxd
 */
public class IllegalMobileException extends BusinessException {

    public IllegalMobileException(String message) {
        super(message);
    }

}
