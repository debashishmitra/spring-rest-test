/**
 * 
 */
package com.debashish.jerseySpringTest.service;

import org.springframework.stereotype.Service;

/**
 * @author Raju
 *
 */
@Service
public class RestTestServiceImpl implements RestTestService {
	
	@Override
	public void testServiceMethod() {
		System.out.println("1");
	}

}
