package com.main.buff.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.main.buff.common.vo.BoardVO;

@Mapper
public interface BoardMapper {
	
	// 게시판 리스트 갯수
	public int boardListCnt(BoardVO paramVo) throws Exception;
	
	// 게시판 리스트
	public List<BoardVO> boardList(BoardVO paramVo) throws Exception;
}
