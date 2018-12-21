package com.jc.cc.mapper;
//sssss
import com.jc.cc.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id= #{id}")
        User getUserById(@Param("id") Integer id);
        }
        @Insert("insert into user ")
        void insertuser(@Param"username" String username,String sex);
