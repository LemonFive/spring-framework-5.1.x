import config.AppConfig;
import dao.HelloWorld;
import dao.MyBeanFactoryPostProcessors;
import dao.Y;
import entity.Entitlement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc:
 * @author: CuiShiHao
 **/
public class MainTest {
	public static void main(String[] args) {
//		// 通过xml方式
//		// 1、创建Spring的IOC容器的对象
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//2、从IOC的容器中获取Bean的实例
//		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");
//		helloWorld.hello();

		// 通过注解方式
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		// 我们传入的配置类默认解析BeanDefinition类型为 AnnotatedGenericBeanDefinition（该类仅储存配置类）
		applicationContext.register(AppConfig.class);
		// 注意：程序员通过API手动添加的BeanFactoryPostProcessors
		// applicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessors());
		applicationContext.refresh();

		System.out.println(applicationContext.getBean("y"));
		System.out.println(applicationContext.getBean("y").getClass());
		System.out.println(applicationContext.getBeanDefinition("y").getBeanClassName());
		System.out.println(applicationContext.getBean(AppConfig.class));
		System.out.println(applicationContext.getBeanDefinition("appConfig").getBeanClassName());
//		Entitlement ent = (Entitlement)applicationContext.getBean("entitlement");
//		System.out.println(ent.getName());
//		System.out.println(ent.getTime());
	}
}
