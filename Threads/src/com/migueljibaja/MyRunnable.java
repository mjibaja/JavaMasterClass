package com.migueljibaja;

import static com.migueljibaja.ThreadColors.ANSI_RED;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from my Runnable implementation of run()");
    }
}
