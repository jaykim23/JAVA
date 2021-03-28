package com.site.service;

import java.util.ArrayList;

import com.site.dto.BoardDto;
import com.site.dto.MemberDto;

public interface BoardService {
	
	MemberDto loginService(MemberDto dto);

	ArrayList<BoardDto> boardList();

	BoardDto boardContentView(String bId);
	
}
