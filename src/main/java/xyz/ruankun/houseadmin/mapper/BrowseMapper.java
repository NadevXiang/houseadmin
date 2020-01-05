package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.Browse;

/**
 * ---------------------------
 * 房源浏览记录 (BrowseMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface BrowseMapper {

	/**
	 * 添加房源浏览记录
	 * @param record
	 * @return
	 */
    int add(Browse record);

    /**
     * 删除房源浏览记录
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改房源浏览记录
     * @param record
     * @return
     */
    int update(Browse record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Browse findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Browse> findPage();
    
}