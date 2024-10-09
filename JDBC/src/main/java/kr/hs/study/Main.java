package kr.hs.study;

import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.testDAO;
import kr.hs.study.dto.testDTO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        // 1. testDAO 가지고 와서 dao에 대입
        testDAO dao = ctx.getBean(testDAO.class);
        // 2. testDTO 객체 t1 만들기
        testDTO t1 = new testDTO();
        // 2. t1에 kim넣기
        t1.setId(1);
        t1.setName("kim");

        dao.insert(t1);
        // dao의 insert 호출하기
        System.out.println("insert!!");
    }
}