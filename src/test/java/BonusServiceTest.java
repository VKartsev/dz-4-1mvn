import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit1() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int amount = 1000;
        boolean registered = true;
        int expected = 30;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit2() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int amount = 1_000_000;
        boolean registered = true;
        int expected = 500;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit3() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int amount = 900;
        boolean registered = true;
        int expected = 27;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit4() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        int amount = 1_000_001;
        boolean registered = true;
        int expected = 500;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit5() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        // проверяем незарегистрированного клиента !!
        int amount = 1000;
        boolean registered = false;
        int expected = 10;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit6() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        // проверяем сумму меньше лимита !!
        int amount = 9;
        boolean registered = true;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}

