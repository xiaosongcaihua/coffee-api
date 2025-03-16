package com.coffee.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.coffee.common.R;
import com.coffee.pojo.Bought;
import com.coffee.service.BoughtService;
import org.apache.ibatis.annotations.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("bought")
public class BoughtController {
    @Autowired
    private BoughtService boughtService;

    @RequestMapping("insert")
    public R insert(@RequestBody Map<String , Object> map){
        String bno = (String) map.get("bno");
        String btime = (String) map.get("btime");
        String btype = (String) map.get("btype");
        Double bprice = (Double) map.get("bprice");
        Integer bdno = (Integer) map.get("bdno");
        String uno = (String) map.get("uno");
        Integer bsum = (Integer) map.get("bsum");
        Bought bought = new Bought(bno , btime , btype , bprice , uno , bdno , bsum);
        boolean save = boughtService.save(bought);
        if (save) {
            return R.ok();
        } else {
            return R.error("插入表单失败");
        }
    }
    @RequestMapping("all")
    public R boughtAll(@RequestBody Map<String , Object> map){
        String uno = (String) map.get("Uno");
        return R.ok(boughtService.list(new LambdaQueryWrapper<Bought>().eq(Bought::getUno , uno)));
    }
}
