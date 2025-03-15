package com.coffee.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coffee.pojo.Bought;
import com.coffee.service.BoughtService;
import com.coffee.mapper.BoughtMapper;
import org.springframework.stereotype.Service;

/**
* @author 谭方杰
* @description 针对表【bought】的数据库操作Service实现
* @createDate 2025-03-15 15:18:29
*/
@Service
public class BoughtServiceImpl extends ServiceImpl<BoughtMapper, Bought>
    implements BoughtService{

}




