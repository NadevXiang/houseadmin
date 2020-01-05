package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.StoreImg;
import xyz.ruankun.houseadmin.mapper.StoreImgMapper;
import xyz.ruankun.houseadmin.service.StoreImgService;

/**
 * ---------------------------
 * 商家图片 (StoreImgServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class StoreImgServiceImpl implements StoreImgService {

	@Autowired
	private StoreImgMapper storeImgMapper;

	@Override
	public int save(StoreImg record) {
		if(record.getId() == null || record.getId() == 0) {
			return storeImgMapper.add(record);
		}
		return storeImgMapper.update(record);
	}

	@Override
	public int delete(StoreImg record) {
		return storeImgMapper.delete(record.getId());
	}

	@Override
	public int delete(List<StoreImg> records) {
		for(StoreImg record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public StoreImg findById(Long id) {
		return storeImgMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, storeImgMapper);
	}
	
}
