package com.oitct.Tkshop.VO;

public class BookInsertVO {
	
	String Bookid; //도서코드
	String Bookname; //도서명
	int Unitprice; //가격
	String Author; //저자
	String Publisher; //출판사
	String Releasedate; //출판일
	String Totalpages; //총페이지
	String Description; //상세정보
	String Category; //분류
	String Unitsinstock; //재고수
	String Situation; //상태
	
	
	public String getBookid() {
		return Bookid;
	}
	public void setBookid(String bookid) {
		Bookid = bookid;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public int getUnitprice() {
		return Unitprice;
	}
	public void setUnitprice(int unitprice) {
		Unitprice = unitprice;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getReleasedate() {
		return Releasedate;
	}
	public void setReleasedate(String releasedate) {
		Releasedate = releasedate;
	}
	public String getTotalpages() {
		return Totalpages;
	}
	public void setTotalpages(String totalpages) {
		Totalpages = totalpages;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getUnitsinstock() {
		return Unitsinstock;
	}
	public void setUnitsinstock(String unitsinstock) {
		Unitsinstock = unitsinstock;
	}
	public String getSituation() {
		return Situation;
	}
	public void setSituation(String situation) {
		Situation = situation;
	}

}
