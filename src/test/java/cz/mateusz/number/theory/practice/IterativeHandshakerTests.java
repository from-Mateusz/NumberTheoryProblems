package cz.mateusz.number.theory.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class IterativeHandshakerTests {

    private IterativeHandshaker iterativeHandshaker;

    @BeforeEach
    public void incorporateObjects() {
        this.iterativeHandshaker = new IterativeHandshaker();
    }

    @Test
    public void when_thereAreNoGuests_then_noHandshakesAreMade() {
        int handshakes = iterativeHandshaker.makeHandshake(0);
        assertThat(handshakes, is(0));
    }

    @Test
    public void when_thereIsOnlyOneGuest_then_noHandshakesAreMade() {
        int handshakes = iterativeHandshaker.makeHandshake(1);
        assertThat(handshakes, is(0));
    }

    @Test
    public void when_thereAreTwoGuests_then_oneHandshakeIsMade() {
        int handshakes = iterativeHandshaker.makeHandshake(2);
        assertThat(handshakes, is(1));
    }

    @Test
    public void when_thereAreFourPersons_then_sixHandshakesAreMade() {
        int handshakes = iterativeHandshaker.makeHandshake(4);
        assertThat(handshakes, is(6));
    }

    @Test
    public void when_thereAreOneHundredPersons_then_4950_handshakesAreMade() {
        int handshakes = iterativeHandshaker.makeHandshake(100);
        assertThat(handshakes, is(4950));
    }
}
