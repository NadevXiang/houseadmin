package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.User;
import xyz.ruankun.houseadmin.mapper.UserMapper;
import xyz.ruankun.houseadmin.service.UserService;

/**
 * ---------------------------
 * 用户信息表 (UserServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int save(User record) {
		if(record.getId() == null || record.getId() == 0) {
			return userMapper.add(record);
		}
		return userMapper.update(record);
	}

	@Override
	public int delete(User record) {
		return userMapper.delete(record.getId());
	}

	@Override
	public int delete(List<User> records) {
		for(User record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public User findById(Long id) {
		return userMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, userMapper);
	}
	
}
