package xyz.ruankun.houseadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;

import xyz.ruankun.houseadmin.entity.TransferRecord;
import xyz.ruankun.houseadmin.mapper.TransferRecordMapper;
import xyz.ruankun.houseadmin.service.TransferRecordService;

/**
 * ---------------------------
 * 记录手动打款记录 (TransferRecordServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class TransferRecordServiceImpl implements TransferRecordService {

	@Autowired
	private TransferRecordMapper transferRecordMapper;

	@Override
	public int save(TransferRecord record) {
		if(record.getId() == null || record.getId() == 0) {
			return transferRecordMapper.add(record);
		}
		return transferRecordMapper.update(record);
	}

	@Override
	public int delete(TransferRecord record) {
		return transferRecordMapper.delete(record.getId());
	}

	@Override
	public int delete(List<TransferRecord> records) {
		for(TransferRecord record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public TransferRecord findById(Long id) {
		return transferRecordMapper.findById(id.intValue());
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, transferRecordMapper);
	}
	
}
