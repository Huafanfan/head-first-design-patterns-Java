package headfirst.Bulider;

import java.util.Stack;

/**
 * @author Alex
 * @version 1.0
 * @date 2020/9/24 15:03
 */
public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.A).addTopping(Pizza.Topping.A).addTopping(Pizza.Topping.B).build();
    }
}
