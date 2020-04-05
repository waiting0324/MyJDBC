package com.waiting.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class MappedStatement {

    private String id;
    private String sql;
    private String parameterType;
    private String resultType;

}
