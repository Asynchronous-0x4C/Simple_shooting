package Simple_shooting.Strategy;

import processing.opengl.PGraphicsOpenGL;

public abstract class Strategy {
  
  public abstract void display(PGraphicsOpenGL g,float deltaTime);
  
  public abstract void update(float deltaTime);
}
