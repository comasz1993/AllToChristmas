package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.security.spec.NamedParameterSpec;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)

class BusinessClassTest {

    BusinessClass businessClass;

    @BeforeEach
    void setUp() {
        businessClass = new BusinessClass(nameAsker);
    }

    @Test
    void greet_shouldReturnProperGreet() {
        assertThat(businessClass.greet("")).isEqualTo("Hello, Jan");
    }

    @Test
    void greet_shouldReturnProperGreetToUpperCase() {
        assertThat(businessClass.greet("JAN")).isEqualTo("HELLO JAN");
    }

    @Test
    void greet_shouldReturnProperGreet2Args() {
        assertThat(businessClass.greet("Jan", "Marika")).isEqualTo("Hello, Jan i Marika");
    }

    @Test
    void greet_shouldReturnProperGreetVarArgs() { // zadanie 5 i 6 w jednym
        assertThat(businessClass.greet("Jan", "MONIKA", "Janusz")).isEqualTo("Hello, Jan, Monika and Janusz");
    }

    @Test
    void greet_shouldReturnProperGreetSplit() { // zadanie 7
        assertThat(businessClass.greetAndSplit("Jan", "Monika, Janusz")).isEqualTo("Hello, Jan, Monika and Janusz");
    }

    @Mock
    NameAsker nameAsker;

    @Test
    void greet_shouldReturnProperGreetMocking() { // zadanie 8
        when(nameAsker.ask()).thenReturn(List.of("ala", "ania"));
        assertThat(businessClass.sayHello()).isEqualTo("Hello, [ala, ania]");
    }
}