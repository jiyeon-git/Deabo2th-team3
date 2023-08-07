package edu.kosa.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO USERS VALUES (#{userid}, #{password}, SYSDATE, 1, #{authority})")
    int insertUser(Map<String, String> map);
}
