package com.coffee.service;

import com.coffee.pojo.BuyCar;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 谭方杰
* @description 针对表【buy_car】的数据库操作Service
* @createDate 2025-03-15 15:18:30
*/
public interface BuyCarService extends IService<BuyCar> {
    BuyCar insert(BuyCar car);

    Integer delete(String ctime , String uno);

    Integer update(BuyCar buyCar);

    List<BuyCar> selectAll(String uno);
}
