package com.java.service.impl;

import com.java.base.BaseDao;
import com.java.base.BaseServiceImpl;
import com.java.mapper.ShopCartMapper;
import com.java.po.ShopCart;
import com.java.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl extends BaseServiceImpl<ShopCart> implements ShopCartService {

    @Autowired
    private ShopCartMapper carMapper;

    @Override
    public BaseDao<ShopCart> getBaseDao() {
        return carMapper;
    }
}
