package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 报修图片表 (HouseRepairImg)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class HouseRepairImg {

	/**  */
	private Long id;
	/** 房屋ID 关联house表 */
	private Integer houseId;
	/** 图片url */
	private String url;
	/** 上传时间 */
	private java.util.Date gmtCreate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getHouseId() {
		return houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public java.util.Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(java.util.Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

}