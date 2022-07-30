package greeng00se.effectivejava.chapter11.item89;

import java.io.Serializable;

public class ElvisStealer implements Serializable {
    static Elvis impersonator;
    private Elvis payload;

    private Object readResolve() {
        // resolve 되기 전 Elvis 인스턴스의 참조를 저장한다.
        impersonator = payload;
        // favorites 필드에 맞는 타입의 객체를 반환한다.
        return new String[]{"Foo"};
    }

    private static final long serialVersionUID = 0;
}
