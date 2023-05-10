package edu.guilford;

public class handcheck {
    // attributes for checking a hand of poker for any winning combinations
    private int[] hand;
    private int[] handValue;
    private int[] handSuit;
    private int[] handRank;

    // constructor for handcheck
    public handcheck(int[] hand) {
        this.hand = hand;
        this.handValue = new int[5];
        this.handSuit = new int[5];
        this.handRank = new int[5];
    }

    
}
