package prototype03;

import java.awt.*;

public abstract class Figure {

    protected int x;
    protected int y;
    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract boolean contains(int x, int y);

    protected abstract void draw(Graphics g);
}