package com.main.buff.common.vo;

import lombok.Data;
import lombok.Setter;

@Data
public class BoardVO {
	// alt + shift + a = 화면 수정모드로 바꾸는 단축키
	
	private String board_id;
	private String board_gbn;
	
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
