package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import step3.strategy.ForTestStrategy;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {


    @DisplayName("자동차 전진 테스트")
    @ParameterizedTest
    @CsvSource(value = {
            "False:0",
            "True:1",
    }, delimiter = ':')
    public void test3(boolean move, int expected) {
        Car car = new Car(new ForTestStrategy(() -> move));
        car.move();
        assertThat(car.getLocation()).isEqualTo(expected);
    }

}
