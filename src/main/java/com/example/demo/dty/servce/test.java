package com.example.demo.dty.servce;

import com.example.demo.dty.pojo.year;
import com.example.demo.dty.utin.RandomUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class test {

@Test
    public void test (){
    List<year> result = new ArrayList<>(12);

        for (int i = 1; i <= 12; i++) {
        result.add(year.builder()
                .year(11)
                .month(i)
                .done(RandomUtils.nextInt())
                .failed(RandomUtils.nextInt())
                .doing(RandomUtils.nextInt())
                .build());
    }

        System.out.println(result);

    }
}
