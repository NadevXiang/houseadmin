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

import xyz.ruankun.houseadmin.entity.Banner;
import xyz.ruankun.houseadmin.service.BannerService;

/**
 * ---------------------------
 * banner图片 (BannerController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("banner")
public class BannerController {

	@Autowired
	private BannerService bannerService;

	/**
	 * 保存banner图片
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Banner record) {
		return HttpResult.ok(bannerService.save(record));
	}

    /**
     * 删除banner图片
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Banner> records) {
		return HttpResult.ok(bannerService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(bannerService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */ 	
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(bannerService.findById(id));
	}
}
