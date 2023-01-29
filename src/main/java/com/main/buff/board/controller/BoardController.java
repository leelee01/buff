package com.main.buff.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.buff.board.service.BoardService;
import com.main.buff.common.vo.BoardVO;

@Controller
public class BoardController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/board/list")
	public ModelAndView selectBoardList(@ModelAttribute BoardVO paramVO) {
		LOGGER.debug("공지사항 리스트 페이지 시작");
		ModelAndView mav = new ModelAndView("board/boardList");
		List<BoardVO> resultList = new ArrayList<BoardVO>();
		int totalCount = 0;
		
		try {
			// list
			totalCount = boardService.boardListCnt(paramVO);
			
			if(totalCount > 0) {
				resultList = boardService.boardList(paramVO);
				mav.addObject("resultList", resultList);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		LOGGER.debug("공지사항 리스트 페이지 끝");
		mav.addObject("paramVO", paramVO);
		mav.addObject("totalCount", totalCount);
		return mav;
	}
}
