import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import viking.Viking;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VikingTest {
    @Test
    @DisplayName("doit faire avancer de 1 quand il marche")
    void shouldMoveOneWhenWalking() {
        Viking sut = new Viking();

        sut.move();

        assertEquals(1, sut.getPosition());
    }
}
