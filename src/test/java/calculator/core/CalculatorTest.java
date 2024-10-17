package calculator.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void 객체_테스트() {
        // given & when
        Calculator calculator = Calculator.enterValue("1,2:3");
        // then
        assertNotNull(calculator);
    }

    @Test
    void 기본_결과_테스트() {
        // given & when
        Calculator calculator = Calculator.enterValue("1,2:3");
        // then
        assertEquals(6, calculator.sum());
    }

    @Test
    void 커스텀_결과_테스트() {
        // given & when
        Calculator calculator = Calculator.enterValue("//;\\n1;2;3");
        // then
        assertEquals(6, calculator.sum());
    }
}