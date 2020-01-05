package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.Store;

/**
 * ---------------------------
 * 商家信息 (StoreMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface StoreMapper {

	/**
	 * 添加商家信息
	 * @param record
	 * @return
	 */
    int add(Store record);

    /**
     * 删除商家信息
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改商家信息
     * @param record
     * @return
     */
    int update(Store record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Store findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Store> findPage();
    
}