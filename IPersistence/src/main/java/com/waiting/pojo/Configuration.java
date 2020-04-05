package com.waiting.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@ToString
public class Configuration {

    private DataSource dataSource;
    private Map<String, MappedStatement> mappedStatementMap = new HashMap<>();
}
