package co.hazzys.prj;

import java.util.ArrayList;
import java.util.List;

import co.hazzys.prj.member.service.MemberService;
import co.hazzys.prj.member.serviceImpl.MemberServiceImpl;
import co.hazzys.prj.member.vo.MemberVO;

public class MainApp {
	public static void main(String[] args) {
		// db 연결
		MemberService dao = new MemberServiceImpl(); //db연결을 위한 객체를 초기화 (dao에 memberserviceimpl 담기)
		List<MemberVO> list = new ArrayList<MemberVO>(); //dao 객체로부터 넘어온 리스트 담기
		
		list = dao.memberSelectList(); //리스트 객체 만든 후에 memberselectlist 받음.
		
		for(MemberVO member : list) {
			member.toString();
		}
	}
}
