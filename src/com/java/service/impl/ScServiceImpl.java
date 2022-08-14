package com.java.service.impl;

import com.java.base.BaseDao;
import com.java.base.BaseServiceImpl;
import com.java.mapper.CollectMapper;
import com.java.po.Collect;
import com.java.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScServiceImpl extends BaseServiceImpl<Collect> implements ScService {

    @Autowired
    private CollectMapper scMapper;

    @Override
    public BaseDao<Collect> getBaseDao() {
        return scMapper;
    }
}
