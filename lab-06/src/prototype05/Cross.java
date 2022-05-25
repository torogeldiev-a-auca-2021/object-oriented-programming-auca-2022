package prototype05;

import prototype03.Figure;
import prototype03.Rect;

import java.awt.*;

public class Cross extends Figure {
    private Rect vRect;
    private Rect hRect;

    public Cross(int x, int y, int w, int h) {
        super(x, y);
        vRect = new Rect(x - w / 2, y - h / 2, w, h);
        hRect = new Rect(x - h / 2, y - w / 2, h, w);
    }

    @Override
    public boolean contains(int xClick, int yClick) {
        return vRect.contains(xClick, yClick) || hRect.contains(xClick, yClick);
    }

    @Override
    public void draw(Graphics g) {
        vRect.draw(g);
        hRect.draw(g);
    }

    @Override
    public String toString(){
        return String.format("Cross %s: %s", vRect, hRect);
    }

    @Override
    public void move(int dx,int dy){
        super.move(dx, dy);
        hRect.move(dx, dy);
        vRect.move(dx, dy);
    }

    @Override
    public void setSelected(boolean state){
        super.setSelected(state);
        vRect.setSelected(state);
        hRect.setSelected(state);
    }
}
("Cross %s: %s", vRect, hRect);
        }

@Override
public void move(int dx,int dy){
        super.move(dx, dy);
        hRect.move(dx, dy);
        vRect.move(dx, dy);
        }

@Override
public void setSelected(boolean state){
        super.setSelected(state);
        vRect.setSelected(state);
        hRect.setSelected(state);
        }
        }
        ("Cross %s: %s", vRect, hRect);
        }

@Override
public void move(int dx,int dy){
        super.move(dx, dy);
        hRect.move(dx, dy);
        vRect.move(dx, dy);
        }

@Override
public void setSelected(boolean state){
        super.setSelected(state);
        vRect.setSelected(state);
        hRect.setSelected(state);
        }
        }