package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.RefundUser;

/**
 * ---------------------------
 * 退款给用户 (RefundUserMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface RefundUserMapper {

	/**
	 * 添加退款给用户
	 * @param record
	 * @return
	 */
    int add(RefundUser record);

    /**
     * 删除退款给用户
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改退款给用户
     * @param record
     * @return
     */
    int update(RefundUser record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    RefundUser findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<RefundUser> findPage();
    
}