package com.example.simplenotedemo.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Github: https://github.com/Shisan1325
 * <p>
 * Project Name: simplenote demo
 * Created by 拾三 on 2024/8/13.
 **/

@Setter
@Getter
@Data
public class SimpleNote {
    private int id;
    private String content;
    private String time;

}
