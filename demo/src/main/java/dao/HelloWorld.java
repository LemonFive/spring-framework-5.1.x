package dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @desc:
 * @author: CuiShiHao
 **/
@Component
@Scope(value = "prototype")
public class HelloWorld  {
    private String name;
    public void setName(String name) {
        System.out.println("调用了设置属性");
        this.name = name;
    }

	public HelloWorld(){
		System.out.println("HelloWorld类初始化构造器");
		//System.out.println("HelloWorld" + this.hashCode());
	}

	@PostConstruct
    public void hello(){
		System.out.println("HelloWorld类初始化回调方法");
    }
}
