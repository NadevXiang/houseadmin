package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.Withdraw;
import xyz.ruankun.houseadmin.mapper.WithdrawMapper;
import xyz.ruankun.houseadmin.service.WithdrawService;

/**
 * ---------------------------
 * 提现记录表 (WithdrawServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class WithdrawServiceImpl implements WithdrawService {

	@Autowired
	private WithdrawMapper withdrawMapper;

	@Override
	public int save(Withdraw record) {
		if(record.getId() == null || record.getId() == 0) {
			return withdrawMapper.add(record);
		}
		return withdrawMapper.update(record);
	}

	@Override
	public int delete(Withdraw record) {
		return withdrawMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Withdraw> records) {
		for(Withdraw record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Withdraw findById(Long id) {
		return withdrawMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, withdrawMapper);
	}
	
}
