package com.example.mapper;

import com.example.pojo.UserData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MainMapper {
    @Select("select * from users where name = #{name}")
    UserData findUserByName(String name);
}
