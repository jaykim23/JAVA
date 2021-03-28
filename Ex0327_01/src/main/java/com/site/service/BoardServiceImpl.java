package com.site.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dto.BoardDto;
import com.site.dto.MemberDto;
import com.site.mapper.Board_Mapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	Board_Mapper board_Mapper;
	
	@Override
	public MemberDto loginService(MemberDto dto) {
		MemberDto memberDto = board_Mapper.selectloginService(dto);
		System.out.println("임팔리먼트 맴버 디티오값"+dto);
		return memberDto;
	}

	@Override
	public ArrayList<BoardDto> boardList() {
		//dao.selectBoardList
		ArrayList<BoardDto> list = board_Mapper.selectBoardList();
		return list;
	}

	@Override
	public BoardDto boardContentView(String bId) {
		System.out.println("boardContentView : "+bId);
		BoardDto dto = board_Mapper.selectBoardContentView(bId);
		System.out.println("boardContentView : "+dto.getbId());
		
		return dto;
	}

}
