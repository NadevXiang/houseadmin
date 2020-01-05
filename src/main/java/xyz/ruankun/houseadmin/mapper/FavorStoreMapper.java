package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.FavorStore;

/**
 * ---------------------------
 * 用户收藏店铺信息 (FavorStoreMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface FavorStoreMapper {

	/**
	 * 添加用户收藏店铺信息
	 * @param record
	 * @return
	 */
    int add(FavorStore record);

    /**
     * 删除用户收藏店铺信息
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改用户收藏店铺信息
     * @param record
     * @return
     */
    int update(FavorStore record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    FavorStore findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<FavorStore> findPage();
    
}