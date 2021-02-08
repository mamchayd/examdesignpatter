package org.enset.examdesignpatter.model.observres;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.enset.examdesignpatter.aspect.log.MyLog;
import org.enset.examdesignpatter.aspect.security.SecuredByAspect;
import org.enset.examdesignpatter.model.composite.Figure;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data @AllArgsConstructor
public class Parametrage implements Observable{
    public  int colorC;
    public int colorS;
    public int epaisseurC;
    public ArrayList<Observer> figurs;

    public Parametrage(){
        figurs=new ArrayList<>();
    }

    @Override
    public void notif() {
        for(Observer o : figurs){
            o.update(this);
        }
    }
    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void remove(Figure figure) {
        figurs.remove(figure);
    }

    @MyLog
    @SecuredByAspect(roles = {"ADMIN"})
    @Override
    public void add(Figure figure) {
        figurs.add(figure);
    }
}
