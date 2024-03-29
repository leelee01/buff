package com.main.buff.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.buff.common.vo.BoardVO;
import com.main.buff.mapper.BoardMapper;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public int boardListCnt(BoardVO paramVO) throws Exception {
		return boardMapper.boardListCnt(paramVO);
	}

	@Override
	public List<BoardVO> boardList(BoardVO paramVO) throws Exception {
		return boardMapper.boardList(paramVO);
	}
}
