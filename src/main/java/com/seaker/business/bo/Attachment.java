/**
 * 
 */
package com.seaker.business.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.seaker.business.constant.AttachmentType;

/**
 * @author Admin
 *
 */
@Entity
@Table
public class Attachment implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String attachementId;
	//setting the attachmentId
	 public Attachment() {
		 
		 this.attachementId = UUID.randomUUID().toString();
	 }
	 @ManyToOne
	 @JoinColumn(name="ID")
	 private StateFullEntity id;

	@Column(name="ATTACHMENT_NAME")
	private String attachmentName;
	
	@Column(name="ATTACHMENT_TYPE")
	private AttachmentType attachmentType;
	
	/* Need to check to be used or not*/
	@Column(name="ATTACHMENT_SIZE")
	private double attachmentSize;
	
	@Column(name="ATTACHMENT_DESCRIPTION")
	private String attachmentDesc;
	
	@Column(name="CREATION_DATE")
	private Date creationTimeStamp;
	
	@Column(name="UPDATE_TIMESTAMP")
	private Date updationTimeStamp;
	
	@Column(name="REVISION_CODE")
	private String RevisionCode;
	
	@Column(name="ATTACHMENT_DATA")
	private Byte[] attachmentData;
	
	public String getAttachementId() {
		return attachementId;
	}
	public void setAttachementId(String attachementId) {
		this.attachementId = attachementId;
	}
	public String getAttachmentName() {
		return attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public AttachmentType getAttachmentType() {
		return attachmentType;
	}
	public void setAttachmentType(AttachmentType attachmentType) {
		this.attachmentType = attachmentType;
	}
	public double getAttachmentSize() {
		return attachmentSize;
	}
	public void setAttachmentSize(double attachmentSize) {
		this.attachmentSize = attachmentSize;
	}
	public String getAttachmentDesc() {
		return attachmentDesc;
	}
	public void setAttachmentDesc(String attachmentDesc) {
		this.attachmentDesc = attachmentDesc;
	}

}
