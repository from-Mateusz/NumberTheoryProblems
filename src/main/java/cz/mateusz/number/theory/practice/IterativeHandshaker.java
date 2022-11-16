package cz.mateusz.number.theory.practice;

public class IterativeHandshaker {

    public int makeHandshake(int guests) {
        if(guests <= 1) return 0;
        int handshakes = 0;
        for(int g = 2; g <= guests; g++) {
            handshakes += g - 1;
        }
        return handshakes;
    }
}
