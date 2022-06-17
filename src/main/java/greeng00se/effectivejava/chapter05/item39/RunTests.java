package greeng00se.effectivejava.chapter05.item39;

import java.lang.reflect.Method;

public class RunTests {

    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("greeng00se.effectivejava.chapter05.item39.Sample2");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(RepeatableExceptionTest.class)
                    || m.isAnnotationPresent(RepeatableExceptionTestContainer.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("TEST %s FAIL: 예외를 던지지 않음%n", m);
                } catch (Throwable wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    int oldPassed = passed;
                    RepeatableExceptionTest[] excTests = m.getAnnotationsByType(RepeatableExceptionTest.class);
                    for (RepeatableExceptionTest excTest : excTests) {
                        if (excTest.value().isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }
                    if (passed == oldPassed)
                        System.out.printf("TEST FAIL: %s", exc);
                }
            }
        }
        System.out.printf("성공: %d, 실패: %d%n", passed, tests - passed);
    }
}
