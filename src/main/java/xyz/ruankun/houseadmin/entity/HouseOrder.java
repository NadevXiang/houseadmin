package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 这个表记录了用户预支付信息 (HouseOrder)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class HouseOrder {

	/** 这个表记录了用户预支付信息 */
	private Long id;
	/**  */
	private Integer userId;
	/**  */
	private Integer houseId;
	/** 用户id */
	private String openId;
	/** 随机生成的订单号 */
	private String outTradeNo;
	/** 微信生成预支付订单号 */
	private String prepayId;
	/** 总金额 */
	private Double totalFee;
	/** 订单生成时间 */
	private java.util.Date gmtCreate;
	/** 订单状态更改时间 */
	private java.util.Date gmtModify;
	/** 是否已经支付,0未支付,1已支付 */
	private Integer isPaid;
	/** 是否已完成，后台判断了密码后，才应该确认更改此字段 */
	private Integer isFinished;
	/** 用户付款IP */
	private byte[] addrIp;
	/** 付款的项目,目前应该只有押金：deposit,水电：utilities,租金：cash */
	private String payItem;
	/** 租期  单位以月计算 */
	private Integer lease;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPrepayId() {
		return prepayId;
	}

	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
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

	public Integer getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Integer isPaid) {
		this.isPaid = isPaid;
	}

	public Integer getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}

	public byte[] getAddrIp() {
		return addrIp;
	}

	public void setAddrIp(byte[] addrIp) {
		this.addrIp = addrIp;
	}

	public String getPayItem() {
		return payItem;
	}

	public void setPayItem(String payItem) {
		this.payItem = payItem;
	}

	public Integer getLease() {
		return lease;
	}

	public void setLease(Integer lease) {
		this.lease = lease;
	}

}