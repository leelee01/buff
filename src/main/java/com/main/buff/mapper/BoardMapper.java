package com.main.buff.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.main.buff.common.vo.BoardVO;

@Mapper
//@Repository("boardMapper")
public interface BoardMapper {
	
	public List<BoardVO> boardList(BoardVO paramVo) throws Exception;
	
	public int boardCnt(BoardVO paramVo) throws Exception;
}
