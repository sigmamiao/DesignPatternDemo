package com.sigma.dp;

/**
 * Created with IDEA
 * User: Omega
 * Date: 16/8/14
 * Time: 10:36
 */
public class ChangeDecorator implements TheGreatestSage{

    private TheGreatestSage sage;


    public ChangeDecorator(TheGreatestSage sage){
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
