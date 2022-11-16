package cz.mateusz.number.theory.practice;

public class Handshaker {

    public int makeHandshake(int guests) {
        if(guests <= 1) return 0;
        return (guests - 1) + makeHandshake(guests - 1);
    }
}
