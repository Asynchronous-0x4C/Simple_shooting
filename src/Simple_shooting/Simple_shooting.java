package Simple_shooting;
import java.util.ArrayList;
import java.util.function.Supplier;

import Simple_shooting.Strategy.Strategy;
import Simple_shooting.Strategy.Strategy_Game;
import Simple_shooting.Strategy.Strategy_Menu;
import processing.core.PApplet;
import processing.opengl.PGraphicsOpenGL;

public class Simple_shooting extends PApplet {
    private PGraphicsOpenGL pggl;

    private Supplier<Integer>nextStrategy=null;

    private ArrayList<Strategy>strategies;
    private Strategy strategy;

    private float startFrame;
    private float deltaTime=16f;

    public static void main(String[] args) {
        PApplet.main("Simple_shooting");
    }

    public void settings(){
        size(1280,720,P2D);
    }

    public void setup(){
        pggl=(PGraphicsOpenGL)g;
        startFrame=System.nanoTime();
        strategies=new ArrayList<>();
        strategies.add(new Strategy_Menu());
        strategies.add(new Strategy_Game());
        strategy=strategies.get(1);
    }

    public void draw(){
        strategy.display(pggl, deltaTime);
        strategy.update(deltaTime);
        if(nextStrategy!=null){
            strategy=strategies.get(nextStrategy.get());
            nextStrategy=null;
        }
        FPSTimer();
    }

    private void FPSTimer(){
        deltaTime=(System.nanoTime()-startFrame)/1000000f;
        startFrame=System.nanoTime();
    }

    public void setStrategy(int i){
        nextStrategy=()->i;
    }
}
