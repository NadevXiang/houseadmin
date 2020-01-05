package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.HouseOrder;
import xyz.ruankun.houseadmin.mapper.HouseOrderMapper;
import xyz.ruankun.houseadmin.service.HouseOrderService;

/**
 * ---------------------------
 * 这个表记录了用户预支付信息 (HouseOrderServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class HouseOrderServiceImpl implements HouseOrderService {

	@Autowired
	private HouseOrderMapper houseOrderMapper;

	@Override
	public int save(HouseOrder record) {
		if(record.getId() == null || record.getId() == 0) {
			return houseOrderMapper.add(record);
		}
		return houseOrderMapper.update(record);
	}

	@Override
	public int delete(HouseOrder record) {
		return houseOrderMapper.delete(record.getId());
	}

	@Override
	public int delete(List<HouseOrder> records) {
		for(HouseOrder record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public HouseOrder findById(Long id) {
		return houseOrderMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, houseOrderMapper);
	}
	
}
