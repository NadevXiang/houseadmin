package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 * 记录手动打款记录 (TransferRecord)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:02
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class TransferRecord {

	/** 这个表用于记录手动打款记录 */
	private Integer id;
	/** 生成的提款订单号 */
	private String withdrawMent;
	/**  */
	private String wxId;
	/** 付给用户的钱 */
	private Double transferMoney;
	/** 创建日期 */
	private java.util.Date gmtCreate;
	/** 修改日期 */
	private java.util.Date gmtModify;

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

	public String getWxId() {
		return wxId;
	}

	public void setWxId(String wxId) {
		this.wxId = wxId;
	}

	public Double getTransferMoney() {
		return transferMoney;
	}

	public void setTransferMoney(Double transferMoney) {
		this.transferMoney = transferMoney;
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

}