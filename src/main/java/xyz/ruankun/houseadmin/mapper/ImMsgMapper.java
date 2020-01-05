package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.ImMsg;

/**
 * ---------------------------
 *  (ImMsgMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface ImMsgMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(ImMsg record);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改
     * @param record
     * @return
     */
    int update(ImMsg record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    ImMsg findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<ImMsg> findPage();
    
}