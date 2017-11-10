package com.mykids.interfaces.resource.person;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mykids.domain.model.person.Kid;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KidsResoureTest {

	@Autowired
	private KidsResource kids;
	
	//@Test
	public void test() {

	   Collection<Kid> all	= kids.all();
	   
	   Assert.assertTrue(!all.isEmpty());
	}

}
