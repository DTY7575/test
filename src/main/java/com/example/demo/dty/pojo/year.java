package com.example.demo.dty.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class year {

    private Integer year;

    private Integer month;

    private Integer day;

    private Integer done;

    private Integer failed;

    private Integer doing;


}
