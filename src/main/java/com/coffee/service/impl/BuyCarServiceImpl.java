package com.coffee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coffee.common.R;
import com.coffee.pojo.BuyCar;
import com.coffee.service.BuyCarService;
import com.coffee.mapper.BuyCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 谭方杰
* @description 针对表【buy_car】的数据库操作Service实现
* @createDate 2025-03-15 15:18:30
*/
@Service
public class BuyCarServiceImpl extends ServiceImpl<BuyCarMapper, BuyCar>
    implements BuyCarService{

    @Autowired
    private BuyCarMapper buyCarMapper;

    public BuyCar insert(BuyCar car){
        int insert = buyCarMapper.insert(car);
        if (insert != 0) {
            return buyCarMapper.selectOne(new LambdaQueryWrapper<BuyCar>().eq(BuyCar::getCtime
                    , car.getCtime()).eq(BuyCar::getUno , car.getUno()));
        } else {
            return null;
        }
    }
}




