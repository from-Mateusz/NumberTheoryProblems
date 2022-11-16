package cz.mateusz.number.theory.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HandshakerTests {

    private Handshaker handshaker;

    @BeforeEach
    public void incorporateObjects() {
        this.handshaker = new Handshaker();
    }

    @Test
    public void when_thereAreNoPersonsAtAll_then_noHandshakesAreMade() {
        int handshakes = handshaker.makeHandshake(0);
        assertThat(handshakes, is(0));
    }

    @Test
    public void when_thereIsOnlyOnePerson_then_noHandshakesAreMade() {
        int handshakes = handshaker.makeHandshake(1);
        assertThat(handshakes, is(0));
    }

    @Test
    public void when_thereAreTwoPersons_then_totalNumberOfHandshakesMustBe_1() {
        // Total number of handshakes where there is n persons, and n >= 2 is equal to h(n - 1) + (n - 1);
        int handshakes = handshaker.makeHandshake(2);
        assertThat(handshakes, is(1));
    }

    @Test
    public void when_thereAreFourPersons_then_totalNumberOfHandshakesMustBe_6() {
        int handshakes = handshaker.makeHandshake(4);
        assertThat(handshakes, is(6));
    }
}
