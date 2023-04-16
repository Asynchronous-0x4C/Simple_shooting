package Simple_shooting.Bridge;

import java.util.function.Consumer;

import Simple_shooting.Simple_shooting;

public enum Applet_Bridge {
  INSTANCE;

  private Simple_shooting s;

  private Applet_Bridge(){

  }

  public void setApplet(Simple_shooting s){
    this.s=s;
  }

  public void AddEventListener(String s,Consumer<?>c){

  }

  public void setStrategy(int i){
    s.setStrategy(i);
  }
}
