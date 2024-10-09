package kr.hs.study.dao;

import kr.hs.study.dto.testDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

// 실제 crud를 실행하는 곳 : 메소드 형식으로 실행
@Component
public class testDAO {
    @Autowired
    private JdbcTemplate jdbc; // jdbc : beanConfigClass에서 만든 jdbctemplate 객체 주소가 들어있음

    // 저장
    public void insert(testDTO dto) {
        String sql = "insert into test values(?, ?)";
        jdbc.update(sql, dto.getId(), dto.getName());
    }
}
