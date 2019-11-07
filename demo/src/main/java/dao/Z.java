package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @desc:
 * @author: CuiShiHao
 **/
@Component
public class Z {

	@Autowired
	public Y y;

	public Z(){
		System.out.println("Z的默认构造方法");
	}
}
