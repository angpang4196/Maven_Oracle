package com.biz.oracle.vo;

public class ScoreVO {

	private String sc_num;
	private int sc_kor;
	private int sc_eng;
	private int sc_math;

	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScoreVO(String sc_num, int sc_kor, int sc_eng, int sc_math) {
		super();
		this.sc_num = sc_num;
		this.sc_kor = sc_kor;
		this.sc_eng = sc_eng;
		this.sc_math = sc_math;
	}

}
