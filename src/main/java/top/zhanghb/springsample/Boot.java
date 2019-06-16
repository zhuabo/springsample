package top.zhanghb.springsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zhanghb.springsample.api.FooService;
import top.zhanghb.springsample.dto.Foo;
import top.zhanghb.springsample.exception.InstrumentNotFoundException;

public class Boot {

    public static void main(final String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        FooService fooService = (FooService) ctx.getBean("fooService");
//        fooService.insertFoo (new Foo());

        try {
            fooService.getFoo("haha","wochao");
//            fooService.updateFoo(new Foo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
