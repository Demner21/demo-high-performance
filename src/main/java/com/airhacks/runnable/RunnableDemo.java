package com.airhacks.runnable;

class RunnableDemo implements Runnable{
  
  private Thread       t;
  private final String threadName;
  
  public RunnableDemo( String threadName ){
    super();
    this.threadName = threadName;
    System.out.println("Creating " +  threadName );
  }
  
  @Override
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
    System.out.println( "Strating" + threadName );
    if( t == null ){
      t = new Thread( this, threadName );
      t.start();
    }
  }
}
