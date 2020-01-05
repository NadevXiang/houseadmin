package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.TransferRecord;

/**
 * ---------------------------
 * 记录手动打款记录 (TransferRecordMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface TransferRecordMapper {

	/**
	 * 添加记录手动打款记录
	 * @param record
	 * @return
	 */
    int add(TransferRecord record);

    /**
     * 删除记录手动打款记录
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改记录手动打款记录
     * @param record
     * @return
     */
    int update(TransferRecord record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    TransferRecord findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<TransferRecord> findPage();
    
}