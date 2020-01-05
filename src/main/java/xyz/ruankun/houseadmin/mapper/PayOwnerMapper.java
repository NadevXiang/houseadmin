package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.PayOwner;

/**
 * ---------------------------
 * 记录平台给房东打款 (PayOwnerMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface PayOwnerMapper {

	/**
	 * 添加记录平台给房东打款
	 * @param record
	 * @return
	 */
    int add(PayOwner record);

    /**
     * 删除记录平台给房东打款
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改记录平台给房东打款
     * @param record
     * @return
     */
    int update(PayOwner record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    PayOwner findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<PayOwner> findPage();
    
}