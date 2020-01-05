package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 记录平台给房东打款 (PayOwner)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class PayOwner {

	/**  */
	private Long id;
	/** 用户id */
	private String openId;
	/** 订单号 */
	private String payment;
	/** 订单生成时间 */
	private java.util.Date gmtCreate;
	/** 订单状态更改时间 */
	private java.util.Date gmtModify;
	/** 付款金额 */
	private Double money;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
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

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

}