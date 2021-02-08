package org.enset.examdesignpatter.model.composite;

import org.enset.examdesignpatter.aspect.log.MyLog;
import org.enset.examdesignpatter.model.observres.Observer;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public abstract class Figure implements Observer, Serializable {

    public Point p;
    public Figure(Point p ){
        this.p=p;
    }
    @MyLog
    public abstract double surface();
    @MyLog
    public abstract double piremiter();
    @MyLog
    public abstract void dessiner();

}
