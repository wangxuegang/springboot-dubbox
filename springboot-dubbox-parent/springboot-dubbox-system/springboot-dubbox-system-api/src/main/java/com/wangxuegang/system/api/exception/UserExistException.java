package com.wangxuegang.system.api.exception;


import com.wangxuegang.system.api.exception.base.BusinessException;

/**
 * 用户已存在
 *
 * @author zhangxd
 */
public class UserExistException extends BusinessException {

    public UserExistException(String message) {
        super(message);
    }

}
