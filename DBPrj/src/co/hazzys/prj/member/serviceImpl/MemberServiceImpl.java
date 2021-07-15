package co.hazzys.prj.member.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.hazzys.prj.DAO;
import co.hazzys.prj.member.service.MemberService;
import co.hazzys.prj.member.vo.MemberVO;

public class MemberServiceImpl extends DAO implements MemberService {
	private PreparedStatement psmt; // sql명령을 보내고 실행하기 위한 객체
	private ResultSet rs; // select 결과를 받을 수 있는 객체

	@Override
	public List<MemberVO> memberSelectList() {
		// 전체리스트 가져오기
		List<MemberVO> list = new ArrayList<MemberVO>(); //MemberVO타입의 List 모습을 배열처럼 쓰겠다.
		MemberVO vo;
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql); //psmt 객체 초기화
			rs = psmt.executeQuery(); 	// select 일때만 executeQuery(), 다른 경우는 excuteUpdate();
			while (rs.next()) {			// 한 행씩 데이터 읽기, 행의 데이터가 없을 때 -1(purse)을 리턴해주고 빠져나옴
				vo = new MemberVO();	// 초기화
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
				vo.setAge(rs.getInt("age"));
				list.add(vo);			//리스트 추가
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}