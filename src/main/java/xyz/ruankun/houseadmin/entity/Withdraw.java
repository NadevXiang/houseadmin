package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 提现记录表 (Withdraw)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class Withdraw {

	/**  */
	private Integer id;
	/** 生成的提款订单号 */
	private String withdrawMent;
	/**  */
	private String openId;
	/** 微信号，用于手动打款时使用 */
	private String wxId;
	/** 创建日期 */
	private java.util.Date gmtCreate;
	/** 修改日期 */
	private java.util.Date gmtModify;
	/** 提款金额 */
	private Double money;
	/** 提现处理是否异常  0异常   1无异常 */
	private Integer withdrawStatus;
	/** 订单是否完成 0未完成 1 完成
 */
	private Integer isFinish;
	/** 备注 */
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWithdrawMent() {
		return withdrawMent;
	}

	public void setWithdrawMent(String withdrawMent) {
		this.withdrawMent = withdrawMent;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getWxId() {
		return wxId;
	}

	public void setWxId(String wxId) {
		this.wxId = wxId;
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

	public Integer getWithdrawStatus() {
		return withdrawStatus;
	}

	public void setWithdrawStatus(Integer withdrawStatus) {
		this.withdrawStatus = withdrawStatus;
	}

	public Integer getIsFinish() {
		return isFinish;
	}

	public void setIsFinish(Integer isFinish) {
		this.isFinish = isFinish;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}