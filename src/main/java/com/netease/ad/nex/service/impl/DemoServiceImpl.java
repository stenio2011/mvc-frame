package com.netease.ad.nex.service.impl;

import com.netease.ad.nex.dao.DemoMapper;
import com.netease.ad.nex.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by stenio on 2017/10/26.
 */
@Service
public class DemoServiceImpl implements DemoService {

    public DemoServiceImpl(){
        System.out.println(1111);
    }

    @Autowired
    private DemoMapper demoMapper;

    @Override
    //@Transactional
    public int insert() {
        int i = demoMapper.test();
        if (i == 1) {
            //throw new RuntimeException();
        }
        return demoMapper.test();
    }
}
