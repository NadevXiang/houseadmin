package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.Banner;

/**
 * ---------------------------
 * banner图片 (BannerMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface BannerMapper {

	/**
	 * 添加banner图片
	 * @param record
	 * @return
	 */
    int add(Banner record);

    /**
     * 删除banner图片
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改banner图片
     * @param record
     * @return
     */
    int update(Banner record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Banner findById(Integer id);

    /**
     * 基础分页查询
     * @param
     * @return
     */    
    List<Banner> findPage();
    
}