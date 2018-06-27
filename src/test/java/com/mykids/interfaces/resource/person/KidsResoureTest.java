package com.mykids.interfaces.resource.person;

import java.util.Collection;

import org.junit.Assert;

import com.mykids.domain.model.person.Kid;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KidsResoureTest {

	//@Autowired
	private KidsResource kids;
	
	//@Test
	public void test() {

	   Collection<Kid> all	= kids.all();
	   
	   Assert.assertTrue(!all.isEmpty());
	}

}
