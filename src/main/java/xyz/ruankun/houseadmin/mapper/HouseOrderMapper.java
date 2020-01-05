package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.HouseOrder;

/**
 * ---------------------------
 * 这个表记录了用户预支付信息 (HouseOrderMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface HouseOrderMapper {

	/**
	 * 添加这个表记录了用户预支付信息
	 * @param record
	 * @return
	 */
    int add(HouseOrder record);

    /**
     * 删除这个表记录了用户预支付信息
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改这个表记录了用户预支付信息
     * @param record
     * @return
     */
    int update(HouseOrder record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    HouseOrder findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<HouseOrder> findPage();
    
}