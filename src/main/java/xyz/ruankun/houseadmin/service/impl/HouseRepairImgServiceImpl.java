package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.HouseRepairImg;
import xyz.ruankun.houseadmin.mapper.HouseRepairImgMapper;
import xyz.ruankun.houseadmin.service.HouseRepairImgService;

/**
 * ---------------------------
 * 报修图片表 (HouseRepairImgServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class HouseRepairImgServiceImpl implements HouseRepairImgService {

	@Autowired
	private HouseRepairImgMapper houseRepairImgMapper;

	@Override
	public int save(HouseRepairImg record) {
		if(record.getId() == null || record.getId() == 0) {
			return houseRepairImgMapper.add(record);
		}
		return houseRepairImgMapper.update(record);
	}

	@Override
	public int delete(HouseRepairImg record) {
		return houseRepairImgMapper.delete(record.getId());
	}

	@Override
	public int delete(List<HouseRepairImg> records) {
		for(HouseRepairImg record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public HouseRepairImg findById(Long id) {
		return houseRepairImgMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, houseRepairImgMapper);
	}
	
}
