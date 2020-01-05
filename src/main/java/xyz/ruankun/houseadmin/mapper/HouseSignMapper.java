package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.HouseSign;

/**
 * ---------------------------
 * 用户签约信息 (HouseSignMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface HouseSignMapper {

	/**
	 * 添加用户签约信息
	 * @param record
	 * @return
	 */
    int add(HouseSign record);

    /**
     * 删除用户签约信息
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改用户签约信息
     * @param record
     * @return
     */
    int update(HouseSign record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    HouseSign findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<HouseSign> findPage();
    
}