package org.deegaem.ims.comments.entity;

public class CommentInfo {

	private Comment comment;
	private String byUserName;

	public CommentInfo() {
	}

	public CommentInfo(Comment c) {
		this.comment = c;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public String getByUserName() {
		return byUserName;
	}

	public void setByUserName(String byUserName) {
		this.byUserName = byUserName;
	}

}