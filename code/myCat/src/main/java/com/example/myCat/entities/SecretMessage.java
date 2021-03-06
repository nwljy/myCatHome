package com.example.myCat.entities;
// Generated 2018-6-8 0:41:39 by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SecretMessage generated by hbm2java
 */
@Entity
@Table(name = "secret_message", catalog = "spring_boot")
public class SecretMessage implements java.io.Serializable {

	private Integer id;
	private EUser EUserBySendId;
	private EUser EUserByReceiveId;
	private String messageTopic;
	private String messageContent;

	public SecretMessage() {
	}

	public SecretMessage(EUser EUserBySendId, EUser EUserByReceiveId, String messageTopic, String messageContent) {
		this.EUserBySendId = EUserBySendId;
		this.EUserByReceiveId = EUserByReceiveId;
		this.messageTopic = messageTopic;
		this.messageContent = messageContent;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "send_id")
	public EUser getEUserBySendId() {
		return this.EUserBySendId;
	}

	public void setEUserBySendId(EUser EUserBySendId) {
		this.EUserBySendId = EUserBySendId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "receive_id")
	public EUser getEUserByReceiveId() {
		return this.EUserByReceiveId;
	}

	public void setEUserByReceiveId(EUser EUserByReceiveId) {
		this.EUserByReceiveId = EUserByReceiveId;
	}

	@Column(name = "message_topic", length = 60)
	public String getMessageTopic() {
		return this.messageTopic;
	}

	public void setMessageTopic(String messageTopic) {
		this.messageTopic = messageTopic;
	}

	@Column(name = "message_content")
	public String getMessageContent() {
		return this.messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

}
