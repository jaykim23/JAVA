package com.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dto.dsa;
import com.site.mapper.Board_Mapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	Board_Mapper board_Mapper;
	
	@Override
	public dsa loginService(dsa dto) {
		dsa dsa = board_Mapper.selectloginService(dto);
		System.out.println("임팔리먼트 맴버 디티오값"+dsa);
		return dsa;
	}

}
