package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 用户信息表 (User)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class User {

	/**  */
	private Integer id;
	/** 微信提供的用户唯一ID(相对于本小程序) */
	private String openId;
	/** 昵称 */
	private String nickName;
	/** 所在城市 */
	private String city;
	/** 省份 */
	private String province;
	/** 国家 */
	private String country;
	/** 语言 */
	private String language;
	/** 性别 0-无,1-男,2-女 */
	private Integer gender;
	/** 钱包余额 */
	private Double money;
	/** 创建时间 */
	private java.util.Date gmtCreate;
	/** 修改时间 */
	private java.util.Date gmtModify;
	/** 是否房东 */
	private Integer landlord;
	/** 认证了房东 有相关的图片链接 身份证
 */
	private String authImgUrl;
	/** 证件正面 */
	private String idCardFrontImg;
	/** 证件背面 */
	private String idCardBackImg;
	/** 电子手签图 */
	private String handwrittenSignature;
	/** 是否身份认证 */
	private Integer isAuth;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
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

	public Integer getLandlord() {
		return landlord;
	}

	public void setLandlord(Integer landlord) {
		this.landlord = landlord;
	}

	public String getAuthImgUrl() {
		return authImgUrl;
	}

	public void setAuthImgUrl(String authImgUrl) {
		this.authImgUrl = authImgUrl;
	}

	public String getIdCardFrontImg() {
		return idCardFrontImg;
	}

	public void setIdCardFrontImg(String idCardFrontImg) {
		this.idCardFrontImg = idCardFrontImg;
	}

	public String getIdCardBackImg() {
		return idCardBackImg;
	}

	public void setIdCardBackImg(String idCardBackImg) {
		this.idCardBackImg = idCardBackImg;
	}

	public String getHandwrittenSignature() {
		return handwrittenSignature;
	}

	public void setHandwrittenSignature(String handwrittenSignature) {
		this.handwrittenSignature = handwrittenSignature;
	}

	public Integer getIsAuth() {
		return isAuth;
	}

	public void setIsAuth(Integer isAuth) {
		this.isAuth = isAuth;
	}

}