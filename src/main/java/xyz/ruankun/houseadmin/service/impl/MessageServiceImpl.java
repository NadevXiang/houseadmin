package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.Message;
import xyz.ruankun.houseadmin.mapper.MessageMapper;
import xyz.ruankun.houseadmin.service.MessageService;

/**
 * ---------------------------
 * 系统消息表 (MessageServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageMapper messageMapper;

	@Override
	public int save(Message record) {
		if(record.getId() == null || record.getId() == 0) {
			return messageMapper.add(record);
		}
		return messageMapper.update(record);
	}

	@Override
	public int delete(Message record) {
		return messageMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Message> records) {
		for(Message record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Message findById(Long id) {
		return messageMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, messageMapper);
	}
	
}
