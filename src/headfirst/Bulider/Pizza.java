package headfirst.Bulider;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Alex
 * @version 1.0
 * @date 2020/9/24 14:52
 */
public abstract class Pizza {
    public enum Topping {A, B, C,D};
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        /**
         * 这里的两个方法需要被子类实现
         * @return
         */
        abstract Pizza build();
        protected abstract T self();
    }
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
