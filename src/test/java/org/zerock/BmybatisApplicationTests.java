package org.zerock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.persistence.TimeMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BmybatisApplicationTests {
  
  @Autowired
  TimeMapper timeMapper;

  @Test
  public void contextLoads() {
  }

  @Test
  public void test1(){
    
    System.out.println("---------------------------");
  
    System.out.println("TIME: " + timeMapper.getTime());
    
  }
  
	@Test
	public void test2(){
		
		System.out.println("---------------------------");
	
		System.out.println("TIME: " + timeMapper.getTimeXML());
		
	}

  
}
