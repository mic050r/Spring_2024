package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    @Autowired
    private Chef chef;

    @Autowired
    private Order order;

    public Chef getChef() {
        return chef;
    }

    public Order getOrder() {
        return order;
    }

    public void proData() {
        System.out.println("chef's name : " + chef.getName());
        System.out.println("chef's age : " + chef.getAge());
        System.out.println("Order menu : " + order.getMenu());
        System.out.println("Order drink : " + order.getDrink());
    }
}
