package com.main.buff.board.service;

import java.util.List;

import com.main.buff.common.vo.BoardVO;

public interface BoardService {
	
	public int boardListCnt(BoardVO paramVO) throws Exception;

	public List<BoardVO> boardList(BoardVO paramVO) throws Exception;
}
