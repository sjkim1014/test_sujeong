package dto;

import java.util.Date;

public class Board {
	private int b_no;
	private int u_no;
	private String b_head;
	private String b_title;
	private String b_content;
	private int file_no;
	private Date b_date;
	private int b_upcount;
	private int b_count;
	
	//USERS JOIN 
	private String u_name;
	
	
	@Override
	public String toString() {
		return "board [b_no=" + b_no + ", u_no=" + u_no + ", b_head=" + b_head + ", b_title=" + b_title + ", b_content="
				+ b_content + ", file_no=" + file_no + ", b_date=" + b_date + ", b_upcount=" + b_upcount + ", b_count="
				+ b_count + "]";
	}
	
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public int getU_no() {
		return u_no;
	}
	public void setU_no(int u_no) {
		this.u_no = u_no;
	}
	public String getB_head() {
		return b_head;
	}
	public void setB_head(String b_head) {
		this.b_head = b_head;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public int getFile_no() {
		return file_no;
	}
	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}
	public Date getB_date() {
		return b_date;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}
	public int getB_upcount() {
		return b_upcount;
	}
	public void setB_upcount(int b_upcount) {
		this.b_upcount = b_upcount;
	}
	public int getB_count() {
		return b_count;
	}
	public void setB_count(int b_count) {
		this.b_count = b_count;
	}
	
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

}
