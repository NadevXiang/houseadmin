package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 房源信息 (House)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class House {

	/**  */
	private Integer id;
	/** 房东openid */
	private Integer userId;
	/** 房屋信息 */
	private String houseInfo;
	/** 是否发布 */
	private Integer released;
	/** 是否出租 */
	private Integer rented;
	/** 房客,租房者id */
	private Integer tenantId;
	/** 租金 */
	private Integer cash;
	/** 租金付款类型 eg: 押一付三 */
	private String cashType;
	/** 面积 */
	private Float area;
	/** 所在楼层 */
	private Integer floor;
	/**  */
	private java.util.Date gmtCreate;
	/**  */
	private java.util.Date gmtModify;
	/** 房屋朝向 */
	private String orientation;
	/** 采光 */
	private String daylighting;
	/**  */
	private String textarea;
	/** 是否有电梯 */
	private Integer hasElevator;
	/** 是否有电视 */
	private Integer hasTelevison;
	/** 是否有冰箱 */
	private Integer hasRefrigerator;
	/** 是否有洗衣机 */
	private Integer hasWasher;
	/** 是否有空调 */
	private Integer hasAirConditioner;
	/** 热水器 */
	private Integer hasHeater;
	/** 床 */
	private Integer hasBed;
	/** 暖气 */
	private Integer hasHeating;
	/** 宽带 */
	private Integer hasBoradband;
	/** 衣柜 */
	private Integer hasWardrobe;
	/** 天然气 */
	private Integer hasGas;
	/** 省份 */
	private String province;
	/** 市 */
	private String city;
	/** 区县 */
	private String district;
	/** 街道 */
	private String street;
	/** 门牌号 */
	private String streetNumber;
	/** 纬度 */
	private Double lat;
	/** 经度 */
	private Double lng;
	/** 户型 */
	private String houseType;
	/** 周边配套是否齐全 */
	private Integer hasComplete;
	/** 可短租 */
	private Integer shortRent;
	/** 女生合租 */
	private Integer girlShared;
	/** 男生合租 */
	private Integer boyShared;
	/** 有独立阳台 */
	private Integer hasBalcony;
	/** 1 整租 0 合租 */
	private Integer rentType;
	/** 标题图 */
	private String headingImg;
	/** 房源标签列表 ["精选", "近地铁"] */
	private String tags;
	/** 标题 */
	private String title;
	/** 装修 */
	private String decoration;
	/** 入住日期 */
	private java.util.Date checkInDate;
	/** 看房 */
	private String inspection;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getHouseInfo() {
		return houseInfo;
	}

	public void setHouseInfo(String houseInfo) {
		this.houseInfo = houseInfo;
	}

	public Integer getReleased() {
		return released;
	}

	public void setReleased(Integer released) {
		this.released = released;
	}

	public Integer getRented() {
		return rented;
	}

	public void setRented(Integer rented) {
		this.rented = rented;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public Integer getCash() {
		return cash;
	}

	public void setCash(Integer cash) {
		this.cash = cash;
	}

	public String getCashType() {
		return cashType;
	}

	public void setCashType(String cashType) {
		this.cashType = cashType;
	}

	public Float getArea() {
		return area;
	}

	public void setArea(Float area) {
		this.area = area;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public java.util.Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(java.util.Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public java.util.Date getGmtModify() {
		return gmtModify;
	}

	public void setGmtModify(java.util.Date gmtModify) {
		this.gmtModify = gmtModify;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getDaylighting() {
		return daylighting;
	}

	public void setDaylighting(String daylighting) {
		this.daylighting = daylighting;
	}

	public String getTextarea() {
		return textarea;
	}

	public void setTextarea(String textarea) {
		this.textarea = textarea;
	}

	public Integer getHasElevator() {
		return hasElevator;
	}

	public void setHasElevator(Integer hasElevator) {
		this.hasElevator = hasElevator;
	}

	public Integer getHasTelevison() {
		return hasTelevison;
	}

	public void setHasTelevison(Integer hasTelevison) {
		this.hasTelevison = hasTelevison;
	}

	public Integer getHasRefrigerator() {
		return hasRefrigerator;
	}

	public void setHasRefrigerator(Integer hasRefrigerator) {
		this.hasRefrigerator = hasRefrigerator;
	}

	public Integer getHasWasher() {
		return hasWasher;
	}

	public void setHasWasher(Integer hasWasher) {
		this.hasWasher = hasWasher;
	}

	public Integer getHasAirConditioner() {
		return hasAirConditioner;
	}

	public void setHasAirConditioner(Integer hasAirConditioner) {
		this.hasAirConditioner = hasAirConditioner;
	}

	public Integer getHasHeater() {
		return hasHeater;
	}

	public void setHasHeater(Integer hasHeater) {
		this.hasHeater = hasHeater;
	}

	public Integer getHasBed() {
		return hasBed;
	}

	public void setHasBed(Integer hasBed) {
		this.hasBed = hasBed;
	}

	public Integer getHasHeating() {
		return hasHeating;
	}

	public void setHasHeating(Integer hasHeating) {
		this.hasHeating = hasHeating;
	}

	public Integer getHasBoradband() {
		return hasBoradband;
	}

	public void setHasBoradband(Integer hasBoradband) {
		this.hasBoradband = hasBoradband;
	}

	public Integer getHasWardrobe() {
		return hasWardrobe;
	}

	public void setHasWardrobe(Integer hasWardrobe) {
		this.hasWardrobe = hasWardrobe;
	}

	public Integer getHasGas() {
		return hasGas;
	}

	public void setHasGas(Integer hasGas) {
		this.hasGas = hasGas;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public Integer getHasComplete() {
		return hasComplete;
	}

	public void setHasComplete(Integer hasComplete) {
		this.hasComplete = hasComplete;
	}

	public Integer getShortRent() {
		return shortRent;
	}

	public void setShortRent(Integer shortRent) {
		this.shortRent = shortRent;
	}

	public Integer getGirlShared() {
		return girlShared;
	}

	public void setGirlShared(Integer girlShared) {
		this.girlShared = girlShared;
	}

	public Integer getBoyShared() {
		return boyShared;
	}

	public void setBoyShared(Integer boyShared) {
		this.boyShared = boyShared;
	}

	public Integer getHasBalcony() {
		return hasBalcony;
	}

	public void setHasBalcony(Integer hasBalcony) {
		this.hasBalcony = hasBalcony;
	}

	public Integer getRentType() {
		return rentType;
	}

	public void setRentType(Integer rentType) {
		this.rentType = rentType;
	}

	public String getHeadingImg() {
		return headingImg;
	}

	public void setHeadingImg(String headingImg) {
		this.headingImg = headingImg;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDecoration() {
		return decoration;
	}

	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}

	public java.util.Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(java.util.Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getInspection() {
		return inspection;
	}

	public void setInspection(String inspection) {
		this.inspection = inspection;
	}

}