package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.HouseImg;
import xyz.ruankun.houseadmin.mapper.HouseImgMapper;
import xyz.ruankun.houseadmin.service.HouseImgService;

/**
 * ---------------------------
 * 房源图片 (HouseImgServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class HouseImgServiceImpl implements HouseImgService {

	@Autowired
	private HouseImgMapper houseImgMapper;

	@Override
	public int save(HouseImg record) {
		if(record.getId() == null || record.getId() == 0) {
			return houseImgMapper.add(record);
		}
		return houseImgMapper.update(record);
	}

	@Override
	public int delete(HouseImg record) {
		return houseImgMapper.delete(record.getId());
	}

	@Override
	public int delete(List<HouseImg> records) {
		for(HouseImg record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public HouseImg findById(Long id) {
		return houseImgMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, houseImgMapper);
	}
	
}
