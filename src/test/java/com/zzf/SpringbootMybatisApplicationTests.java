package com.zzf;

import com.zzf.dao.Dao;
import com.zzf.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {
	@Autowired
	private Dao dao;

	@Test
	void contextLoads() {
		Book selectbyid = dao.selectbyid(1);



		System.out.println(selectbyid);
	}

}
