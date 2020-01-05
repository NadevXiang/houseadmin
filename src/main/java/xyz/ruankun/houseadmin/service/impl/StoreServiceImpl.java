package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.Store;
import xyz.ruankun.houseadmin.mapper.StoreMapper;
import xyz.ruankun.houseadmin.service.StoreService;

/**
 * ---------------------------
 * 商家信息 (StoreServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreMapper storeMapper;

	@Override
	public int save(Store record) {
		if(record.getId() == null || record.getId() == 0) {
			return storeMapper.add(record);
		}
		return storeMapper.update(record);
	}

	@Override
	public int delete(Store record) {
		return storeMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Store> records) {
		for(Store record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Store findById(Long id) {
		return storeMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, storeMapper);
	}
	
}
