package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.House;

/**
 * ---------------------------
 * 房源信息 (HouseMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface HouseMapper {

	/**
	 * 添加房源信息
	 * @param record
	 * @return
	 */
    int add(House record);

    /**
     * 删除房源信息
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改房源信息
     * @param record
     * @return
     */
    int update(House record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    House findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<House> findPage();
    
}