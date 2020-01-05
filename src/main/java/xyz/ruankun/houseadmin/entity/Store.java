package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 商家信息 (Store)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class Store {

	/**  */
	private Integer id;
	/** 商家名称 */
	private String name;
	/** 标题图 */
	private String headImg;
	/** 商家地址 */
	private String address;
	/** 营业时间段 */
	private String openingHours;
	/** 联系电话 */
	private String phone;
	/** 商家分类 零食便利 美容美发餐饮美食 */
	private String type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}