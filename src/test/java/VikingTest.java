import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import viking.Viking;
import viking.movestrategy.Fly;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VikingTest {
    @Test
    @DisplayName("doit faire avancer de 1 quand il marche  une fois")
    void shouldMoveOneWhenWalkingOnce() {
        Viking sut = new Viking();

        sut.move();

        assertEquals(1, sut.getPosition());
    }

    @Test
    @DisplayName("doit faire avancer de 2 quand il bouge deux fois en marchant")
    void shouldMoveTwoWhenWalkingTwice() {
        // Arrange
        Viking sut = new Viking();

        // Act
        sut.move();
        sut.move();

        // Assert
        assertEquals(2, sut.getPosition());
    }

    @Test
    @DisplayName("doit faire avancer de 10 quand il vole une fois")
    void shouldMoveTwenWhenFlyingOnce() {
        // Arrange
        Viking sut = new Viking();
        sut.setMoveStrategy(new Fly());

        // Act
        sut.move();

        // Assert
        assertEquals(10, sut.getPosition());
    }
}
