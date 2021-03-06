package spring.basic.di.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring.basic.di.component.service"})
public class AppContext {

    /*
    @Bean
    public OrderService orderService(){
        return new OrderService();
    }
    */

    @Bean
    public CoffeeDao coffeeDao(){
        CoffeeDao coffeeDao = new CoffeeDao();
        coffeeDao.insert(new Coffee("라떼",1200));
        coffeeDao.insert(new Coffee("모카",1400));
        return coffeeDao;
    }


}
