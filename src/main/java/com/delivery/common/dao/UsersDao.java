package com.delivery.common.dao;

import com.delivery.common.entity.UsersEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by finderlo on 15/04/2017.
 */
@Component
@Repository
public class UsersDao extends AbstractDao<UsersEntity> {

    public List<UsersEntity> findByUserPhone(String value) {
        return super.findBy("userPhone", value);
    }
}