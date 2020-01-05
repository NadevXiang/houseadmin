package xyz.ruankun.houseadmin.entity;

/**
 * ---------------------------
 *  (ImMsg)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-12-31 11:26:01
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public class ImMsg {

	/** 该表是保存所有的聊天记录的,聊天记录有点多，上百万数据，需要定期清理 */
	private Long id;
	/** 发消息人的id */
	private Long senderId;
	/** 收消息人的id */
	private Long receiverId;
	/** 消息类型,产品类型的话msg字段可以为空,但是返回给前台必须包含产品信息 */
	private String type;
	/** 消息内容/如果类型是product可以为空 */
	private String msg;
	/** 消息是否被读过了 */
	private Integer isRead;
	/** 消息生成时间,也就是发送时间 */
	private java.util.Date gmtSend;
	/** 消息被读取时间 */
	private java.util.Date gmtRead;
	/** 如果type是product,该字段去查询相关house信息，然后返回前台 */
	private Long houseId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSenderId() {
		return senderId;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public Long getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Long receiverId) {
		this.receiverId = receiverId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getIsRead() {
		return isRead;
	}

	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}

	public java.util.Date getGmtSend() {
		return gmtSend;
	}

	public void setGmtSend(java.util.Date gmtSend) {
		this.gmtSend = gmtSend;
	}

	public java.util.Date getGmtRead() {
		return gmtRead;
	}

	public void setGmtRead(java.util.Date gmtRead) {
		this.gmtRead = gmtRead;
	}

	public Long getHouseId() {
		return houseId;
	}

	public void setHouseId(Long houseId) {
		this.houseId = houseId;
	}

}