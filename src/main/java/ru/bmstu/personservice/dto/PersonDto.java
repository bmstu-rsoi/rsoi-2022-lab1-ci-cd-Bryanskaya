package ru.bmstu.personservice.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Accessors(chain = true)
public class PersonDto {
    private Integer id;
    private String name;
    private String address;
    private String work;
    private Integer age;
}
