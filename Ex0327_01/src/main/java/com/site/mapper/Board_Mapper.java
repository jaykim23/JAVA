package com.site.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.site.dto.dsa;

@Mapper
public interface Board_Mapper {
	
	//xml 선언 : namespace : Board_Mapper //id :selectBoardList
	
	dsa selectloginService(dsa dto);
}
