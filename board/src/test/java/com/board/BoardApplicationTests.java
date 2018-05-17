package com.board;
 
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.domain.BoardVO;
import com.board.mapper.BoardMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.MOCK)
public class BoardApplicationTests {
    
	/*
    @Autowired
    private DataSource ds; //�ۼ�
 
    @Autowired
    private SqlSessionFactory sqlSession; //�����׽�Ʈ
    */
    @Autowired
    private BoardMapper mapper;

    @Test
    public void contextLoads() {
    }
 
    @Test
    public void testConnection() throws Exception{ //�ۼ�
    	/*
        System.out.println("ds : "+ds);       
        Connection con = ds.getConnection(); //ds(DataSource)���� Connection�� ����
        System.out.println("con : "+con); //Ȯ�� ��        
        con.close(); //close
        */
    	
    	//System.out.println("sqlSession :"+sqlSession);
    	
    	BoardVO vo = new BoardVO();
    	vo.setSubject("�����Դϴ�.");
    	vo.setContent("�����Դϴ�.");
    	vo.setWriter("�ۼ����Դϴ�.");
    	
    	mapper.boardInsert(vo);
    }
}
