package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 这个表用于记录租客的账单 (Bill)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class Bill {

	/**  */
	private Integer id;
	/** 用户id */
	private Integer userId;
	/** 房子id */
	private Integer houseId;
	/** 付款金额 */
	private Double money;
	/** 支付项目类型   */
	private String payItem;
	/** 是否支付 */
	private Integer isPaid;
	/** 付款单号 */
	private String outTradeNo;
	/** 创建日期  */
	private java.util.Date gmtCreate;
	/** 备注 */
	private String remark;
	/** 最迟缴费日期 */
	private java.util.Date deadDate;
	/** 用户缴费日期 */
	private java.util.Date payDate;
	/** 支付详细 */
	private String payDetail1;
	/** 支付详细金额 */
	private Double payDetailFee1;
	/** 支付详细 */
	private String payDetail2;
	/** 支付详细金额 */
	private Double payDetailFee2;
	/** 水使用量 */
	private String waterUse;
	/** 水单价 */
	private Double waterUntPrice;
	/** 电使用量 */
	private String eleUse;
	/** 电单价 */
	private Double eleUntPrice;

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

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getPayItem() {
		return payItem;
	}

	public void setPayItem(String payItem) {
		this.payItem = payItem;
	}

	public Integer getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Integer isPaid) {
		this.isPaid = isPaid;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public java.util.Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(java.util.Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public java.util.Date getDeadDate() {
		return deadDate;
	}

	public void setDeadDate(java.util.Date deadDate) {
		this.deadDate = deadDate;
	}

	public java.util.Date getPayDate() {
		return payDate;
	}

	public void setPayDate(java.util.Date payDate) {
		this.payDate = payDate;
	}

	public String getPayDetail1() {
		return payDetail1;
	}

	public void setPayDetail1(String payDetail1) {
		this.payDetail1 = payDetail1;
	}

	public Double getPayDetailFee1() {
		return payDetailFee1;
	}

	public void setPayDetailFee1(Double payDetailFee1) {
		this.payDetailFee1 = payDetailFee1;
	}

	public String getPayDetail2() {
		return payDetail2;
	}

	public void setPayDetail2(String payDetail2) {
		this.payDetail2 = payDetail2;
	}

	public Double getPayDetailFee2() {
		return payDetailFee2;
	}

	public void setPayDetailFee2(Double payDetailFee2) {
		this.payDetailFee2 = payDetailFee2;
	}

	public String getWaterUse() {
		return waterUse;
	}

	public void setWaterUse(String waterUse) {
		this.waterUse = waterUse;
	}

	public Double getWaterUntPrice() {
		return waterUntPrice;
	}

	public void setWaterUntPrice(Double waterUntPrice) {
		this.waterUntPrice = waterUntPrice;
	}

	public String getEleUse() {
		return eleUse;
	}

	public void setEleUse(String eleUse) {
		this.eleUse = eleUse;
	}

	public Double getEleUntPrice() {
		return eleUntPrice;
	}

	public void setEleUntPrice(Double eleUntPrice) {
		this.eleUntPrice = eleUntPrice;
	}

}