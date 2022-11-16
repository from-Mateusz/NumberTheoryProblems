package cz.mateusz.number.theory.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BrahmaTowerTests {

    private BrahmaTower brahmaTower;

    @BeforeEach
    public void incorporateObjects() {
        brahmaTower = new BrahmaTower();
    }

    @Test
    public void when_thereAreNoDisksAtAll_then_makeNoMoves() {
        int moves = brahmaTower.moveDisks(0);
        assertThat(moves, is(0));
    }

    //Our basic step
    @Test
    public void when_thereIsOnlyOneDisk_then_makeOneMove() {
        int moves = brahmaTower.moveDisks(1);
        assertThat(moves, is(1));
    }

    @Test
    public void when_thereAreTwoDisks_then_makeThreeMoves() {
        int moves = brahmaTower.moveDisks(2);
        assertThat(moves, is(3));
    }

    @Test
    public void when_thereAreFourDisks_then_makeFifteenMoves() {
        int moves = brahmaTower.moveDisks(4);
        assertThat(moves, is(15));
    }
}
