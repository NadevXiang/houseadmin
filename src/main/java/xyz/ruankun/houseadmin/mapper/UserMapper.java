package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.User;

/**
 * ---------------------------
 * 用户信息表 (UserMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface UserMapper {

	/**
	 * 添加用户信息表
	 * @param record
	 * @return
	 */
    int add(User record);

    /**
     * 删除用户信息表
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改用户信息表
     * @param record
     * @return
     */
    int update(User record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    User findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<User> findPage();
    
}