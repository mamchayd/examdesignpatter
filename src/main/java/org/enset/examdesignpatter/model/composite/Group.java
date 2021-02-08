package org.enset.examdesignpatter.model.composite;

import org.enset.examdesignpatter.model.observres.Observable;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Component
public class Group extends Figure implements Serializable {

    private List<Figure> figgurs;

    public Group(Point p) {
        super(p);
        figgurs = new ArrayList<>();
    }

    public Group() {
        super(new Point(0,0));
    }
    @Override
    public double surface() {
        double s = 0;
        for (Figure f : figgurs) {
            s += f.surface();
        }
        return s;
    }

    @Override
    public double piremiter() {
        double p = 0;
        for (Figure f : figgurs) {
            p= f.piremiter();
        }

        return p;
    }

    @Override
    public void dessiner() {
        for (Figure f : figgurs) {
            f.dessiner();
        }
    }

    public void addFigure(Figure f) {
        this.figgurs.add(f);
    }

    public void remove(Figure f) {
        figgurs.remove(f);
    }

    @Override
    public void update(Observable o) {
        for (Figure f : figgurs) {
            f.update(o);
        }
    }
}
