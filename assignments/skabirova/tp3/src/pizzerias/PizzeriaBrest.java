package pizzerias;

import pizzas.CheeseBrestPizza;
import pizzas.GreekBrestPizza;
import pizzas.Pizza;

public class PizzeriaBrest extends Pizzeria {

    @Override
    public Pizza createPizza(String type){
        switch (type){
            case "cheese": return new CheeseBrestPizza();
            case "greek": return new GreekBrestPizza();
            default: return null;
        }
    }
}
