package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.Withdraw;

/**
 * ---------------------------
 * 提现记录表 (WithdrawMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface WithdrawMapper {

	/**
	 * 添加提现记录表
	 * @param record
	 * @return
	 */
    int add(Withdraw record);

    /**
     * 删除提现记录表
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改提现记录表
     * @param record
     * @return
     */
    int update(Withdraw record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Withdraw findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Withdraw> findPage();
    
}