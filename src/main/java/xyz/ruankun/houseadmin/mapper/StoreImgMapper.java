package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.StoreImg;

/**
 * ---------------------------
 * 商家图片 (StoreImgMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface StoreImgMapper {

	/**
	 * 添加商家图片
	 * @param record
	 * @return
	 */
    int add(StoreImg record);

    /**
     * 删除商家图片
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改商家图片
     * @param record
     * @return
     */
    int update(StoreImg record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    StoreImg findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<StoreImg> findPage();
    
}