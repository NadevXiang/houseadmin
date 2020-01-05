package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 退款给用户 (RefundUser)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class RefundUser {

	/** 这个表用来给退款给用户 */
	private Long id;
	/** 微信提供的用户唯一ID(相对于本小程序) */
	private String openId;
	/** 付款的时候自己生成的订单号 */
	private String outTradeNo;
	/** 订单生成时间 */
	private java.util.Date gmtCreate;
	/** 订单状态更改时间 */
	private java.util.Date gmtModify;
	/** 付款金额 */
	private Double money;
	/** 0为退款失败，1为退款成功 */
	private Integer isSuccess;

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

	public Integer getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Integer isSuccess) {
		this.isSuccess = isSuccess;
	}

}