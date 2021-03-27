package com.site.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.dto.dsa;
import com.site.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/")
	public String index() {
		return"index";
	}
	//여기까지 만들고 잘 연결이 되는지 체크

	@RequestMapping("/login")
	public String login() {
		return"login";
	}
	
	@RequestMapping("/loginForm_send")
	public String login_check(dsa dto,HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		dsa memberdto = boardService.loginService(dto);
		
		System.out.println("dto 값 id: "+dto.getId());
		
		System.out.println("맴버디티오 값 : "+memberdto);
		//롬복때문에 문제가 되는 것 같음.
		if(memberdto==null) {
			System.out.println("로그인 실패");
			session.setAttribute("session_flag", "fail");
		}else {
			System.out.println("로그인 성공");
			session.setAttribute("session_flag", "success");
			session.setAttribute("session_id", memberdto.getId());
			session.setAttribute("session_nickName", memberdto.getNickName());
		}
		
		return"redirect:/login_check"; //여기서 redirect가 아니면 그냥 login_check.jsp 로 간다
	}
	
	
	@RequestMapping("/login_check")
	public String login_check() {
		return"login_check";
	}
	
	
}
