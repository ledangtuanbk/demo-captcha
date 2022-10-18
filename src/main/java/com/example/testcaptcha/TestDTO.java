package com.example.testcaptcha;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class TestDTO {

    @Max(value = 20)
    @Min(value = 10)
    private Integer value;
}
