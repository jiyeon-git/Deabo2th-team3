package edu.kosa.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Map;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO USERS VALUES (#{userid}, #{password}, SYSDATE, 1, #{authority})")
    int insertUser(Map<String, String> map);
    
    @Update("UPDATE USERS SET password=#{newPassword} WHERE userid=#{userid}")
    int updateUser(Map<String, String> map);
    
    @Select("SELECT password FROM USERS WHERE userid=#{userid}")
    String selectPassword(String userid);
}
