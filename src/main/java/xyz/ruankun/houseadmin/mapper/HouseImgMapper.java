package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.HouseImg;

/**
 * ---------------------------
 * 房源图片 (HouseImgMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface HouseImgMapper {

	/**
	 * 添加房源图片
	 * @param record
	 * @return
	 */
    int add(HouseImg record);

    /**
     * 删除房源图片
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改房源图片
     * @param record
     * @return
     */
    int update(HouseImg record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    HouseImg findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<HouseImg> findPage();
    
}