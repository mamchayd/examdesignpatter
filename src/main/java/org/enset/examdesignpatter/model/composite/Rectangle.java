package org.enset.examdesignpatter.model.composite;

import org.enset.examdesignpatter.aspect.log.MyLog;
import org.enset.examdesignpatter.model.observres.Observable;
import org.enset.examdesignpatter.model.observres.Parametrage;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Rectangle extends Figure implements Serializable {

    public double L;
    public double H;

    public Rectangle(double l,double h,Point p) {
        super(p);
        this.L=l;
        this.H=h;
    }
    public Rectangle() {
        super(new Point(0,0));

    }
    @MyLog
    @Override
    public double surface() {
        return L * H;
    }

    @MyLog
    @Override
    public double piremiter() {
        return 2 * (L + H);
    }

    @Override
    public void dessiner() {
        System.out.println("L : " + L + "H :" + H + "piremiter :" + piremiter() + "surface :" + surface());
    }

    @Override
    public void update(Observable o) {
        int cc = ((Parametrage) o).getColorC();
        int cs = ((Parametrage) o).getColorS();
        int ec = ((Parametrage) o).getEpaisseurC();
        System.out.println("color conteur :" + cc + " colore surface :" + cs + "Epaisseur Color" + ec);
    }
}
