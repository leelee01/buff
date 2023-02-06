package com.main.buff.common.vo;

import lombok.Data;

// lombok 의존성 주입하면 Data로 getter, setter 뿐만 아니라 toString 함수, 생성자 생성까지 자동으로 해줌
// pom.xml에 dependency 추가해도 적용이 안될 경우, lombok jar파일을 이클립스 설치 폴더 경로에 다운받아줘야함!
// 참고자료 : https://kitty-geno.tistory.com/79
@Data
public class BoardVO {
	// alt + shift + a = 화면 수정모드로 바꾸는 단축키
	
	private String board_id;
	private String board_code;
	private String title;
	private String contents;
	private String view_cnt;
	private String anser_yn;
	
	// getter, setter
//	public String getBoard_id() {
//		return board_id;
//	}
//	public void setBoard_id(String board_id) {
//		this.board_id = board_id;
//	}
//	public String getBoard_gbn() {
//		return board_gbn;
//	}
//	public void setBoard_gbn(String board_gbn) {
//		this.board_gbn = board_gbn;
//	}
}