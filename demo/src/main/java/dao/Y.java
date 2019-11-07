package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @desc:
 * @author: CuiShiHao
 **/
@Component
public class Y {

	@Autowired
	public Z z;

	public Y(){
		System.out.println("Y的默认构造方法");
	}

	@PostConstruct
	public void lifeCycleCallBackY(){
		System.out.println("Y的方法——生命周期回调");
	}
}
