package com.main.buff.board.service;

import java.util.List;

import com.main.buff.common.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> boardList(BoardVO paramVO) throws Exception;
	
	public int boardCnt(BoardVO paramVO) throws Exception;
}
