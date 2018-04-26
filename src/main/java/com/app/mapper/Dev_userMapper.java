package com.app.mapper;

import com.app.pojo.App_category;
import com.app.pojo.App_info;
import com.app.pojo.Dev_user;
import org.apache.ibatis.annotations.Select;

/**
 * @Description:测试帐号的接口数据访问层
 * @Author 罗曼蒂克
 * @Date Created in 14:05   2018/4/25
 */
public interface Dev_userMapper {

    @Select("select * from dev_user where devcode = #{devCode} and devpassword = #{devPassword}")
    Dev_user dologin(Dev_user user);

    /**
     * 增
     */


    /**
     * 删
     */


    /**
     * 改
     */


    /**
     * 查
     */
}
