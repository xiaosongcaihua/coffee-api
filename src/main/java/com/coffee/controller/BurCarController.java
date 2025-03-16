package com.coffee.controller;

import com.coffee.common.R;
import com.coffee.pojo.BuyCar;
import com.coffee.service.BuyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("buycar")
public class BurCarController {
    @Resource
    private BuyCarService buyCarService;

    @PostMapping("insert")
    public R insert(@RequestBody Map<String , Object> map){
        BuyCar car = new BuyCar();
        car.setCcup((Integer) map.get("Ccup"));
        car.setCtno((Integer) map.get("Ctno"));
        car.setCsum((Integer) map.get("Csum"));
        car.setCtime((String) map.get("ctime"));
        car.setCtemp((Integer) map.get("Ctemp"));
        car.setTname((String) map.get("Tname"));
        car.setUno((String) map.get("Uno"));
        car.setCsweetness((Integer) map.get("Csweetness"));
        BuyCar buyCar = buyCarService.insert(car);
        if (buyCar == null) {
            return R.error("新增购物车失败");
        } else {
            return R.ok(buyCar);
        }
    }

}
