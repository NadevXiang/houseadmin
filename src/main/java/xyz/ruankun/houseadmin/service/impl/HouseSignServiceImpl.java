package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.HouseSign;
import xyz.ruankun.houseadmin.mapper.HouseSignMapper;
import xyz.ruankun.houseadmin.service.HouseSignService;

/**
 * ---------------------------
 * 用户签约信息 (HouseSignServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class HouseSignServiceImpl implements HouseSignService {

	@Autowired
	private HouseSignMapper houseSignMapper;

	@Override
	public int save(HouseSign record) {
		if(record.getId() == null || record.getId() == 0) {
			return houseSignMapper.add(record);
		}
		return houseSignMapper.update(record);
	}

	@Override
	public int delete(HouseSign record) {
		return houseSignMapper.delete(record.getId());
	}

	@Override
	public int delete(List<HouseSign> records) {
		for(HouseSign record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public HouseSign findById(Long id) {
		return houseSignMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, houseSignMapper);
	}
	
}
