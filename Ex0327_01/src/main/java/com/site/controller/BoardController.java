package com.site.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.site.dto.BoardDto;
import com.site.dto.MemberDto;
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
	public String login_check(MemberDto dto,HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		MemberDto memberdto = boardService.loginService(dto);
		
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
			session.setAttribute("session_nickName", memberdto.getnName());
		}
		
		return"redirect:/login_check"; //여기서 redirect가 아니면 그냥 login_check.jsp 로 간다
	}
	
	
	@RequestMapping("/login_check")
	public String login_check() {
		return"login_check";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return"logout";
	}
	@RequestMapping("/list")
	public String list(Model model) {
		ArrayList<BoardDto> list = boardService.boardList();
		model.addAttribute("list",list);
		return"epilogue";
	}
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request,Model model) {
		String bId = request.getParameter("bId");
		System.out.println("content_view-bId : "+bId);
		
		BoardDto dto = boardService.boardContentView(bId);
		System.out.println("dto.getbId() : "+dto.getbId());
		model.addAttribute("dto", dto);
		return "epilogue_view";
	}
	
}
