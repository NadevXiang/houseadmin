package xyz.ruankun.houseadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;

import xyz.ruankun.houseadmin.entity.Store;
import xyz.ruankun.houseadmin.service.StoreService;

/**
 * ---------------------------
 * 商家信息 (StoreController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("store")
public class StoreController {

	@Autowired
	private StoreService storeService;

	/**
	 * 保存商家信息
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Store record) {
		return HttpResult.ok(storeService.save(record));
	}

    /**
     * 删除商家信息
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Store> records) {
		return HttpResult.ok(storeService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */    
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(storeService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */ 	
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Integer id) {
		return HttpResult.ok(storeService.findById((long) id));
	}
}
