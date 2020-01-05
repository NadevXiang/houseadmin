package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.Recommend;

/**
 * ---------------------------
 *  (RecommendMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface RecommendMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(Recommend record);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改
     * @param record
     * @return
     */
    int update(Recommend record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Recommend findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Recommend> findPage();
    
}