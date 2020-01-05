package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.HouseRepair;

/**
 * ---------------------------
 * 报修信息表 (HouseRepairMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface HouseRepairMapper {

	/**
	 * 添加报修信息表
	 * @param record
	 * @return
	 */
    int add(HouseRepair record);

    /**
     * 删除报修信息表
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改报修信息表
     * @param record
     * @return
     */
    int update(HouseRepair record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    HouseRepair findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<HouseRepair> findPage();
    
}