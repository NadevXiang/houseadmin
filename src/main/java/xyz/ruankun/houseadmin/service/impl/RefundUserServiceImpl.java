package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.RefundUser;
import xyz.ruankun.houseadmin.mapper.RefundUserMapper;
import xyz.ruankun.houseadmin.service.RefundUserService;

/**
 * ---------------------------
 * 退款给用户 (RefundUserServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class RefundUserServiceImpl implements RefundUserService {

	@Autowired
	private RefundUserMapper refundUserMapper;

	@Override
	public int save(RefundUser record) {
		if(record.getId() == null || record.getId() == 0) {
			return refundUserMapper.add(record);
		}
		return refundUserMapper.update(record);
	}

	@Override
	public int delete(RefundUser record) {
		return refundUserMapper.delete(record.getId());
	}

	@Override
	public int delete(List<RefundUser> records) {
		for(RefundUser record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public RefundUser findById(Long id) {
		return refundUserMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, refundUserMapper);
	}
	
}
