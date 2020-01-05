package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.Bill;

/**
 * ---------------------------
 * 这个表用于记录租客的账单 (BillMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface BillMapper {

	/**
	 * 添加这个表用于记录租客的账单
	 * @param record
	 * @return
	 */
    int add(Bill record);

    /**
     * 删除这个表用于记录租客的账单
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改这个表用于记录租客的账单
     * @param record
     * @return
     */
    int update(Bill record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Bill findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Bill> findPage();
    
}