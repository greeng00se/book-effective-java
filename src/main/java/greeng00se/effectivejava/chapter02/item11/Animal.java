package greeng00se.effectivejava.chapter02.item11;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public class Animal {
    private final int age;
    private final int height;
    private final String species;
    private final String[] foods;

    @Override
    public int hashCode() {
        // 1.int 변수 result 를 선언한 후 값 c로 초기화한다.
        int result = Integer.hashCode(age);

        // 2. 기본 타입 필드일 경우 Type.hashCode(f) 를 수행한다.
        result = 31 * result + Integer.hashCode(height);

        // 2. 참조 타입 필드인 경우 해당 필드의 hashCode() 메서드를 호출하여 사용한다.
        result = 31 * result + species.hashCode();

        // 2. 배열일 경우 모든 원소가 핵심 원소라면 Arrays.hashCode() 메서드를 사용한다.
        result = 31 * result + Arrays.hashCode(foods);

        // 3. result 를 반환한다.
        return result;
    }
}
