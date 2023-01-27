package com.main.buff.board.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.buff.board.service.BoardService;
import com.main.buff.common.vo.BoardVO;

@Controller
public class BoardController {

	private static final Logger LOGGER = LogManager.getLogger(BoardController.class);

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/board/list")
	public ModelAndView selectBoardList(@ModelAttribute BoardVO paramVO) {
		ModelAndView mav = new ModelAndView("board/boardList");
		
		try {
			paramVO = new BoardVO();
			paramVO.setBoard_id("1");
			System.out.println("paramVO : "+paramVO.toString());
			LOGGER.info("log -> " + paramVO.toString());
			int cnt = boardService.boardCnt(paramVO);
			
			mav.addObject("cnt", cnt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mav.addObject("paramVO", paramVO);
		return mav;
	}
}
