package com.site.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.site.dto.BoardDto;
import com.site.dto.MemberDto;

@Mapper
public interface Board_Mapper {
	
	//xml 선언 : namespace : Board_Mapper //id :selectBoardList
	
	MemberDto selectloginService(MemberDto dto);

	ArrayList<BoardDto> selectBoardList();

	BoardDto selectBoardContentView(String bId);
}
