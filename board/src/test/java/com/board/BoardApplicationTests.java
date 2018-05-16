package com.board;
 
import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.MOCK)
public class BoardApplicationTests {
    
    @Autowired
    private DataSource ds; //�ۼ�
 
    @Test
    public void contextLoads() {
    }
 
    @Test
    public void testConnection() throws Exception{ //�ۼ�
        System.out.println("ds : "+ds);
        
        Connection con = ds.getConnection(); //ds(DataSource)���� Connection�� ����
        
        System.out.println("con : "+con); //Ȯ�� ��
        
        con.close(); //close
    }
}
