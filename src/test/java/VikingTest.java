import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import viking.Viking;
import viking.movestrategy.Fly;
import viking.movestrategy.Move;
import viking.movestrategy.Walk;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VikingTest {
    @Test
    @DisplayName("doit faire avancer de 1 quand il marche  une fois")
    void shouldMoveOneWhenWalkingOnce() {
        Viking sut = new Viking();

        sut.setMoveStrategy(new Walk());
        sut.move();

        assertEquals(1, sut.getPosition());
    }

    @Test
    @DisplayName("doit faire avancer de 2 quand il bouge deux fois en marchant")
    void shouldMoveTwoWhenWalkingTwice() {
        // Arrange
        Viking sut = new Viking();

        // Act
        sut.setMoveStrategy(new Walk());
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

        // Act
        sut.setMoveStrategy(new Fly());
        sut.move();

        // Assert
        assertEquals(10, sut.getPosition());
    }

    @Test
    @DisplayName("doit faire avancer de 11 quand il vole une fois puis marche une fois")
    void shouldMoveElevenWhenFlyingOnceAndMovingOnce() {
        // Arrange
        Viking sut = new Viking();

        // Act
        sut.setMoveStrategy(new Fly());
        sut.move();

        sut.setMoveStrategy(new Walk());
        sut.move();

        // Assert
        assertEquals(11, sut.getPosition());
    }
}
