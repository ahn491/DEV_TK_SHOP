package com.oitct.Tkshop.VO;

import java.sql.Date;

public class MovieVO 
{
	private int num;
	private String title;
	private String author; // author
	private String contents;
	private java.sql.Date date;
	private int hitNum;
	private String pic_nm;
	
	
	public MovieVO(int num, String title, String architect, String contents, Date date, int hitNum, String pic_nm) {
		super();
		this.num = num;
		this.title = title;
		this.author = architect;
		this.contents = contents;
		this.date = date;
		this.hitNum = hitNum;
		this.pic_nm = pic_nm;
	}
	
	public MovieVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContents() {
		return contents;
	}
	public void setContents(String content) {
		this.contents = content;
	}
	public java.sql.Date getDate() {
		return date;
	}
	public void setDate(java.sql.Date date) {
		this.date = date;
	}
	public int getHitNum() {
		return hitNum;
	}
	public void setHitNum(int hitNum) {
		this.hitNum = hitNum;
	}
	public String getPic_nm() {
		return pic_nm;
	}
	public void setPic_nm(String pic_nm) {
		this.pic_nm = pic_nm;
	}

	@Override
	public String toString() {
		return "MovieVO [num=" + num + ", title=" + title + ", architect=" + author + ", contents=" + contents + ", date="
				+ date + ", hitNum=" + hitNum + ", pic_nm=" + pic_nm + "]";
	}
	
	
	
	
}
