package com.ryz2593.leetcode;

/**
 * @author ryz2593
 * @date 2019/6/14
 * @desc
 */
public class VolatileTest extends Thread {
    volatile boolean flag = false;
    int i = 0;

    public void run() {
        while(!flag) {
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTest vt = new VolatileTest();
        vt.start();
        Thread.sleep(2000);
        vt.flag = true;
        System.out.println("stope: " + vt.i);
    }

}
