package com.coffee.controller;

import com.coffee.common.R;
import com.coffee.pojo.BuyCar;
import com.coffee.service.BuyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jnlp.IntegrationService;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("buycar")
public class BurCarController {
    @Resource
    private BuyCarService buyCarService;

    @PostMapping("insert")
    public R insert(@RequestBody Map<String , Object> map){
        BuyCar car = new BuyCar();
        car.setCcup((Integer) map.get("ccup"));
        car.setCtno((Integer) map.get("ctno"));
        car.setCsum((Integer) map.get("csum"));
        car.setCtime((String) map.get("ctime"));
        car.setCtemp((Integer) map.get("ctemp"));
        car.setTname((String) map.get("tname"));
        car.setUno((String) map.get("uno"));
        car.setCsweetness((Integer) map.get("csweetness"));
        BuyCar buyCar = buyCarService.insert(car);
        if (buyCar == null) {
            return R.error("新增购物车失败");
        } else {
            return R.ok(buyCar);
        }
    }
    @PostMapping("delete")
    public R delete(@RequestBody Map<String , Object> map){
        String ctime = (String) map.get("ctime");
        String uno = (String) map.get("uno");
        Integer delete = buyCarService.delete(ctime , uno);
        if (delete == null || delete.equals(0)) {
            return R.error("删除购物项失败");
        } else {
            return R.ok();
        }
    }
    @PostMapping("update")
    public R update(@RequestBody Map<String , Object> map){
        BuyCar car = new BuyCar();
        car.setCcup((Integer) map.get("ccup"));
        car.setCtno((Integer) map.get("ctno"));
        car.setCsum((Integer) map.get("csum"));
        car.setCtime((String) map.get("ctime"));
        car.setCtemp((Integer) map.get("ctemp"));
        car.setTname((String) map.get("tname"));
        car.setUno((String) map.get("uno"));
        car.setCsweetness((Integer) map.get("csweetness"));
        Integer update = buyCarService.update(car);
        if (update == 0) {
            return R.error("修改购物车失败");
        } else {
            return R.ok();
        }
    }
    @PostMapping("all")
    public R getAllBuyCar(@RequestBody Map<String , Object> map){
        String uno = (String) map.get("uno");
        return R.ok(buyCarService.selectAll(uno));
    }

}
