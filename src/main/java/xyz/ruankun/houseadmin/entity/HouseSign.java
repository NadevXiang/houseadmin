package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 用户签约信息 (HouseSign)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class HouseSign {

	/** 这个表用于记录用户签约信息 */
	private Integer id;
	/**  */
	private Integer userId;
	/**  */
	private Integer houseId;
	/** 签约时间 */
	private java.util.Date startDate;
	/** 到期时间 */
	private java.util.Date endDate;
	/** 有效期,单位为月 */
	private Integer expDate;
	/** 订单创建时间 */
	private java.util.Date gmtCreate;
	/** 修改时间 */
	private java.util.Date gmtModified;
	/** 付款账单号 */
	private byte[] outTradeNo;
	/** 是否支付  0未支付，1支付 */
	private Integer isPaid;
	/** 是否履行中 0否1是 */
	private Integer isFulfill;
	/** 手写签名的地址 */
	private String handWriteImg;
	/** 合同 */
	private String contractImg;
	/**  签订用户的姓名 */
	private String userName;
	/** 签订用户的身份证号码 */
	private byte[] idcardNum;
	/** 签约是否过期 */
	private Integer isOut;
	/** 是否已作废, */
	private Integer isDeleted;

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

	public Integer getHouseId() {
		return houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}

	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}

	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public Integer getExpDate() {
		return expDate;
	}

	public void setExpDate(Integer expDate) {
		this.expDate = expDate;
	}

	public java.util.Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(java.util.Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public java.util.Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(java.util.Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public byte[] getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(byte[] outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Integer getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Integer isPaid) {
		this.isPaid = isPaid;
	}

	public Integer getIsFulfill() {
		return isFulfill;
	}

	public void setIsFulfill(Integer isFulfill) {
		this.isFulfill = isFulfill;
	}

	public String getHandWriteImg() {
		return handWriteImg;
	}

	public void setHandWriteImg(String handWriteImg) {
		this.handWriteImg = handWriteImg;
	}

	public String getContractImg() {
		return contractImg;
	}

	public void setContractImg(String contractImg) {
		this.contractImg = contractImg;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public byte[] getIdcardNum() {
		return idcardNum;
	}

	public void setIdcardNum(byte[] idcardNum) {
		this.idcardNum = idcardNum;
	}

	public Integer getIsOut() {
		return isOut;
	}

	public void setIsOut(Integer isOut) {
		this.isOut = isOut;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

}