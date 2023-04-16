package Simple_shooting.Entity;

import processing.core.PVector;
import processing.opengl.PGraphicsOpenGL;

public abstract class Entity {
  protected PVector position;
  protected PVector velocity;

  protected float size;

  public abstract void display(PGraphicsOpenGL g,float deltaTime);

  public abstract void update(float deltaTime);
}
