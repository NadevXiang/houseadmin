package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.Banner;
import xyz.ruankun.houseadmin.mapper.BannerMapper;
import xyz.ruankun.houseadmin.service.BannerService;

/**
 * ---------------------------
 * banner图片 (BannerServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerMapper bannerMapper;

	@Override
	public int save(Banner record) {
		if(record.getId() == null || record.getId() == 0) {
			return bannerMapper.add(record);
		}
		return bannerMapper.update(record);
	}

	@Override
	public int delete(Banner record) {
		return bannerMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Banner> records) {
		for(Banner record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Banner findById(Long id) {
		return bannerMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, bannerMapper);
	}
	
}
