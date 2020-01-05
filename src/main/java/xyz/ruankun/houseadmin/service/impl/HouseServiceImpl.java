package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.House;
import xyz.ruankun.houseadmin.mapper.HouseMapper;
import xyz.ruankun.houseadmin.service.HouseService;

/**
 * ---------------------------
 * 房源信息 (HouseServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class HouseServiceImpl implements HouseService {

	@Autowired
	private HouseMapper houseMapper;

	@Override
	public int save(House record) {
		if(record.getId() == null || record.getId() == 0) {
			return houseMapper.add(record);
		}
		return houseMapper.update(record);
	}

	@Override
	public int delete(House record) {
		return houseMapper.delete(record.getId());
	}

	@Override
	public int delete(List<House> records) {
		for(House record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public House findById(Long id) {
		return houseMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, houseMapper);
	}
	
}
