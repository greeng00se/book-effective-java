package greeng00se.effectivejava.chapter01.item02;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class BuilderCoffee {

    private final int size;
    private final int water;
    private final boolean iced;

    public static class Builder {
        // 필수 매개변수
        private final int size;
        // 선택적 매개변수는 초기값을 가진다.
        private int water = 0;
        private boolean iced = false;

        public Builder(int size) {
            this.size = size;
        }

        public Builder water(int val) {
            water = val;
            return this;
        }

        public Builder iced(boolean b) {
            iced = b;
            return this;
        }

        public BuilderCoffee build() {
            return new BuilderCoffee(this);
        }
    }

    private BuilderCoffee(Builder builder) {
        this.size = builder.size;
        this.water = builder.water;
        this.iced = builder.iced;
    }
}
