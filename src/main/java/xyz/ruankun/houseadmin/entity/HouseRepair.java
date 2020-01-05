package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 报修信息表 (HouseRepair)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class HouseRepair {

	/**  */
	private Long id;
	/** 房源ID 关联house表 */
	private Integer houseId;
	/** 报修用户ID */
	private Integer userId;
	/** 联系电话 */
	private String phone;
	/** 报修描述 */
	private String content;
	/** 报修状态 0 未处理 1  处理中 2 已关闭 */
	private Integer status;
	/** 报修创建时间 */
	private java.util.Date gmtCreate;
	/** 房源名字 */
	private String houseInfo;
	/**  */
	private String houseImgUrl;
	/** 上门维修时间 */
	private java.util.Date repaireTime;

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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.util.Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(java.util.Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getHouseInfo() {
		return houseInfo;
	}

	public void setHouseInfo(String houseInfo) {
		this.houseInfo = houseInfo;
	}

	public String getHouseImgUrl() {
		return houseImgUrl;
	}

	public void setHouseImgUrl(String houseImgUrl) {
		this.houseImgUrl = houseImgUrl;
	}

	public java.util.Date getRepaireTime() {
		return repaireTime;
	}

	public void setRepaireTime(java.util.Date repaireTime) {
		this.repaireTime = repaireTime;
	}

}