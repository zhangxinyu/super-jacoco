package com.xiaoju.basetech;

import com.xiaoju.basetech.util.GitHandler;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CodeCovApplication.class)
public class commonTest {
    @Autowired
    public GitHandler gitHandler;


    public void test01(){
    }
}
