package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.FavorStore;
import xyz.ruankun.houseadmin.mapper.FavorStoreMapper;
import xyz.ruankun.houseadmin.service.FavorStoreService;

/**
 * ---------------------------
 * 用户收藏店铺信息 (FavorStoreServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class FavorStoreServiceImpl implements FavorStoreService {

	@Autowired
	private FavorStoreMapper favorStoreMapper;

	@Override
	public int save(FavorStore record) {
		if(record.getId() == null || record.getId() == 0) {
			return favorStoreMapper.add(record);
		}
		return favorStoreMapper.update(record);
	}

	@Override
	public int delete(FavorStore record) {
		return favorStoreMapper.delete(record.getId());
	}

	@Override
	public int delete(List<FavorStore> records) {
		for(FavorStore record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public FavorStore findById(Long id) {
		return favorStoreMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, favorStoreMapper);
	}
	
}
