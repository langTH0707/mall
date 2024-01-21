package com.itlang.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itlang.mall.product.entity.BrandEntity;
import com.itlang.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        List<BrandEntity> lis = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        for (BrandEntity li : lis) {
            System.out.println(li);
        }
    }

}
