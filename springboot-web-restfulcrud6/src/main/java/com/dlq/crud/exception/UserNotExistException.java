package com.dlq.crud.exception;

/**
 *@program: SpringBoot
 *@description:
 *@author: Hasee
 *@create: 2020-08-04 16:56
 */
public class UserNotExistException extends RuntimeException{

    public UserNotExistException() {
        super("用户不存在");
    }
}
