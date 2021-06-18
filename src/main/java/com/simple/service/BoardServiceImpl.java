package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;
import com.simple.mapper.BoardMapper;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	
//	@Autowired
//	@Qualifier("boardDAO")
//	private BoardDAO boardDAO;
	
	@Autowired
	private BoardMapper boardMapper;
	
	
	@Override
	public void boardRegist(BoardVO vo) {
		boardMapper.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		
		return null;
	}

	@Override
	public void boardDelete(int num) {
		
	}

}
