package com.airhacks.runnable;

public class TestRunnable{
  
  public static void main( String[] args ){
    RunnableDemo r1 = new RunnableDemo( "thread-1" );
    r1.start();
    RunnableDemo r2 = new RunnableDemo( "thread-2" );
    r2.start();
  }
}