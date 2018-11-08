package pers.robin.micsd.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import pers.robin.micsd.DO.UserDO;
import pers.robin.micsd.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public UserDO login() {
        System.out.println("user has login!");
        return null;
    }
}
