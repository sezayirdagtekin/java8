package com.lamda.thread;

public class ThreadExampleLambda {

  public static void main(String[] args) throws InterruptedException {


    Runnable runnableLamda = () -> {
      for (int i = 0; i < 3; i++) {
        System.out.println("Hello thread lamda -> " + Thread.currentThread().getName());
      }
    };


    Thread t = new Thread(runnableLamda);
    t.start();
    t.join();
  }

}
