package com.airhacks.priority;

public class DisplayMessage implements Runnable{
  
  private final String message;
  
  public DisplayMessage( String message ){
    this.message = message;
  }
  
  @Override
  public void run(){
    while( true){
      System.out.println( message );
    }
  }
}
