package com.coffee.mapper;

import com.coffee.pojo.BuyCar;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 谭方杰
* @description 针对表【buy_car】的数据库操作Mapper
* @createDate 2025-03-15 15:18:30
* @Entity com.coffee.domain.BuyCar
*/
@Mapper
public interface BuyCarMapper extends BaseMapper<BuyCar> {

}




