package com.sigma.dp;

/**
 * Created with IDEA
 * User: Omega
 * Date: 16/8/14
 * Time: 10:37
 */
public class Fish extends ChangeDecorator{


    public Fish(TheGreatestSage sage){
        super(sage);
    }


    @Override
    public void move() {
        super.move();
        System.out.println("Fish move");
    }
}
