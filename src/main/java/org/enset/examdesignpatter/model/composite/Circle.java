package org.enset.examdesignpatter.model.composite;

import org.enset.examdesignpatter.aspect.log.MyLog;
import org.enset.examdesignpatter.model.observres.Observable;
import org.enset.examdesignpatter.model.observres.Parametrage;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Circle extends Figure implements Serializable {

    public double rayon;

    public Circle(double centre, Point point) {
        super(point);
    }
    public Circle() {
        super(new Point(0,0));
    }
    @MyLog
    @Override
    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @MyLog
    @Override
    public double piremiter() {
        return 2 * Math.PI * rayon;
    }

    @MyLog
    @Override
    public void dessiner() {
        System.out.println("rayen :" + rayon + "Surface : " + surface() + "pirimetre :" + piremiter());
    }

    @Override
    public void update(Observable o) {
        int c1 = ((Parametrage) o).getColorC();
        int c2 = ((Parametrage) o).getColorS();
        int c3 = ((Parametrage) o).getEpaisseurC();
        System.out.println("color conteur :" + c1 + " colore surface :" + c2 + "Epaisseur Color" + c3);
    }
}
