package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.PayOwner;
import xyz.ruankun.houseadmin.mapper.PayOwnerMapper;
import xyz.ruankun.houseadmin.service.PayOwnerService;

/**
 * ---------------------------
 * 记录平台给房东打款 (PayOwnerServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class PayOwnerServiceImpl implements PayOwnerService {

	@Autowired
	private PayOwnerMapper payOwnerMapper;

	@Override
	public int save(PayOwner record) {
		if(record.getId() == null || record.getId() == 0) {
			return payOwnerMapper.add(record);
		}
		return payOwnerMapper.update(record);
	}

	@Override
	public int delete(PayOwner record) {
		return payOwnerMapper.delete(record.getId());
	}

	@Override
	public int delete(List<PayOwner> records) {
		for(PayOwner record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public PayOwner findById(Long id) {
		return payOwnerMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, payOwnerMapper);
	}
	
}
