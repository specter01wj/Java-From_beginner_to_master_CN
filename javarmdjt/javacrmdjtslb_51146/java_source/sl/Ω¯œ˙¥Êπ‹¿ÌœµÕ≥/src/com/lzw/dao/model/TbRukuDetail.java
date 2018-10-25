package com.lzw.dao.model;
public class TbRukuDetail implements java.io.Serializable {
	private String id;
	private String tbSpinfo;
	private String tbRukuMain;
	private Double dj;
	private Integer sl;
	public TbRukuDetail() {
	}
	public TbRukuDetail(String tbSpinfo, String tbRukuMain, Double dj,
			Integer sl) {
		this.tbSpinfo = tbSpinfo;
		this.tbRukuMain = tbRukuMain;
		this.dj = dj;
		this.sl = sl;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String lsh) {
		this.id = lsh;
	}
	public String getTabSpinfo() {
		return this.tbSpinfo;
	}
	public void setTabSpinfo(String tbSpinfo) {
		this.tbSpinfo = tbSpinfo;
	}
	public String getTabRukuMain() {
		return this.tbRukuMain;
	}

	public void setTabRukuMain(String tbRukuMain) {
		this.tbRukuMain = tbRukuMain;
	}

	public Double getDj() {
		return this.dj;
	}

	public void setDj(Double dj) {
		this.dj = dj;
	}

	public Integer getSl() {
		return this.sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}

}