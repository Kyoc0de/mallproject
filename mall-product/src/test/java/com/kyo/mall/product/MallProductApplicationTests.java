package com.kyo.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kyo.mall.product.entity.BrandEntity;
import com.kyo.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为好用");
//        brandEntity.setDescript("");
//        brandEntity.setName("Huawei");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
//        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
