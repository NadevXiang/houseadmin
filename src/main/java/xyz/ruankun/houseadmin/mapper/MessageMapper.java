package xyz.ruankun.houseadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import xyz.ruankun.houseadmin.entity.Message;

/**
 * ---------------------------
 * 系统消息表 (MessageMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Repository
public interface MessageMapper {

	/**
	 * 添加系统消息表
	 * @param record
	 * @return
	 */
    int add(Message record);

    /**
     * 删除系统消息表
     * @param id
     * @return
     */
    int delete(Integer id);
    
    /**
     * 修改系统消息表
     * @param record
     * @return
     */
    int update(Message record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Message findById(Integer id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Message> findPage();
    
}