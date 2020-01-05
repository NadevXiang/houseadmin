package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.HouseRepair;
import xyz.ruankun.houseadmin.mapper.HouseRepairMapper;
import xyz.ruankun.houseadmin.service.HouseRepairService;

/**
 * ---------------------------
 * 报修信息表 (HouseRepairServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class HouseRepairServiceImpl implements HouseRepairService {

	@Autowired
	private HouseRepairMapper houseRepairMapper;

	@Override
	public int save(HouseRepair record) {
		if(record.getId() == null || record.getId() == 0) {
			return houseRepairMapper.add(record);
		}
		return houseRepairMapper.update(record);
	}

	@Override
	public int delete(HouseRepair record) {
		return houseRepairMapper.delete(record.getId());
	}

	@Override
	public int delete(List<HouseRepair> records) {
		for(HouseRepair record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public HouseRepair findById(Long id) {
		return houseRepairMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, houseRepairMapper);
	}
	
}
