package com.sigma.dp;

/**
 * Created with IDEA
 * User: Omega
 * Date: 16/8/14
 * Time: 10:38
 */
public class Bird extends ChangeDecorator{

    public Bird(TheGreatestSage sage){
        super(sage);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Bird move");
    }
}
