package com.coffee.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coffee.mapper.BuyCarMapper;
import com.coffee.pojo.BuyCar;
import com.coffee.service.BuyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谭方杰
 * @description 针对表【buy_car】的数据库操作Service实现
 * @createDate 2025-03-15 15:18:30
 */
@Service
public class BuyCarServiceImpl extends ServiceImpl<BuyCarMapper, BuyCar>
        implements BuyCarService {

    @Autowired
    private BuyCarMapper buyCarMapper;

    public BuyCar insert(BuyCar car) {
        int insert = buyCarMapper.insert(car);
        if (insert != 0) {
            return buyCarMapper.selectOne(new LambdaQueryWrapper<BuyCar>().eq(BuyCar::getCtime
                    , car.getCtime()).eq(BuyCar::getUno, car.getUno()));
        } else {
            return null;
        }
    }

    @Override
    public Integer delete(String ctime, String uno) {
        if (StringUtils.isEmpty(ctime)) {
            // 清空当前用户所有购物车
            return buyCarMapper.delete(new LambdaQueryWrapper<BuyCar>().eq(BuyCar::getUno, uno));
        } else {
            // 清空某个时间段的购物车
            return buyCarMapper.delete(new LambdaQueryWrapper<BuyCar>().eq(BuyCar::getUno, uno).eq(BuyCar::getCtime, ctime));
        }
    }

    @Override
    public Integer update(BuyCar buyCar) {
        return buyCarMapper.update(buyCar, new LambdaQueryWrapper<BuyCar>().
                eq(BuyCar::getUno, buyCar.getUno()).eq(BuyCar::getCtime, buyCar.getCtime()));
    }

    @Override
    public List<BuyCar> selectAll(String uno) {
        return buyCarMapper.selectList(new LambdaQueryWrapper<BuyCar>().eq(BuyCar::getUno, uno));
    }

}




