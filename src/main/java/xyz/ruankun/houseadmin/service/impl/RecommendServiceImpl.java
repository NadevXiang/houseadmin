package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.Recommend;
import xyz.ruankun.houseadmin.mapper.RecommendMapper;
import xyz.ruankun.houseadmin.service.RecommendService;

/**
 * ---------------------------
 *  (RecommendServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class RecommendServiceImpl implements RecommendService {

	@Autowired
	private RecommendMapper recommendMapper;

	@Override
	public int save(Recommend record) {
		if(record.getId() == null || record.getId() == 0) {
			return recommendMapper.add(record);
		}
		return recommendMapper.update(record);
	}

	@Override
	public int delete(Recommend record) {
		return recommendMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Recommend> records) {
		for(Recommend record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Recommend findById(Long id) {
		return recommendMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, recommendMapper);
	}
	
}
