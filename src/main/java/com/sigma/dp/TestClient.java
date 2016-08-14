package com.sigma.dp;

/**
 * Created with IDEA
 * User: Omega
 * Date: 16/8/14
 * Time: 10:39
 */
public class TestClient {

    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();

        TheGreatestSage fishAndBirdForMonkey = new Fish(new Bird(sage));
        fishAndBirdForMonkey.move();
    }
}
