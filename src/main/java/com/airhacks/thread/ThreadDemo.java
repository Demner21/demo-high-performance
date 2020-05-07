package com.airhacks.thread;

public class ThreadDemo extends Thread{
  
  private Thread       t;
  private final String threadName;
  
  public ThreadDemo( String threadName ){
    this.threadName = threadName;
  }
  
  public void run(){
    System.out.println( "Runnig" + threadName );
    try{
      for( int i = 4; i > 0; i-- ){
        System.out.println( String.format( "Thread: %s , %s", threadName, i ) );
        Thread.sleep( 50 );
      }
    }
    catch( InterruptedException e ){
      System.out.println( String.format( "Thread: %s interrumped", threadName ) );
    }
    System.out.println( String.format( "Thread: %s exiting", threadName ) );
  }
  
  public void start(){
    System.out.println( "Starting " + threadName );
    if( t == null ){
      t = new Thread( this, threadName );
      t.start();
    }
  }
}
