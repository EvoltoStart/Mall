package com.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulimall.product.entity.BrandEntity;
import com.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.ServerSocket;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
//        brandEntity.setBrandId(16L);
        brandEntity.setName("xxx");
        brandEntity.setDescript("我就是xxx");
        brandEntity.setShowStatus(1);
////        brandEntity.setName("xxx");
       brandService.save(brandEntity);
//        System.out.println("保存成功。。。");
////        brandService.updateById(brandEntity);
        brandService.save(brandEntity);
        System.out.println("修改成功");
        List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",9L));
      list.forEach((item)->{
          System.out.println(item);
      });

    }

}
