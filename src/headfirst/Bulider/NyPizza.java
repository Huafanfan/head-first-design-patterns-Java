package headfirst.Bulider;

import java.util.Objects;

/**
 * @author Alex
 * @version 1.0
 * @date 2020/9/24 14:58
 */
public class NyPizza extends Pizza{
    public enum Size {A, B, C}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        /**
         * 协便返回类型：返回正确的子类
         * @return NyPizza
         */
        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
