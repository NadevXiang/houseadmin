package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.ImMsg;
import xyz.ruankun.houseadmin.mapper.ImMsgMapper;
import xyz.ruankun.houseadmin.service.ImMsgService;

/**
 * ---------------------------
 *  (ImMsgServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class ImMsgServiceImpl implements ImMsgService {

	@Autowired
	private ImMsgMapper imMsgMapper;

	@Override
	public int save(ImMsg record) {
		if(record.getId() == null || record.getId() == 0) {
			return imMsgMapper.add(record);
		}
		return imMsgMapper.update(record);
	}

	@Override
	public int delete(ImMsg record) {
		return imMsgMapper.delete(record.getId());
	}

	@Override
	public int delete(List<ImMsg> records) {
		for(ImMsg record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public ImMsg findById(Long id) {
		return imMsgMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, imMsgMapper);
	}
	
}
