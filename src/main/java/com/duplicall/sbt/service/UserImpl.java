package com.duplicall.sbt.service;

import org.springframework.stereotype.Service;

/**
 * Created by raymond on 2016/6/7.
 */
@Service
public class UserImpl implements IUser {
    @Override
    public void hello() {
        System.out.println("======");
    }
}
