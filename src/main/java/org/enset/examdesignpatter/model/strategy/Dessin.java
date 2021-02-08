package org.enset.examdesignpatter.model.strategy;

import org.enset.examdesignpatter.model.composite.Figure;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Dessin {
    List<Figure> figureList=new ArrayList<>();
    ITraiter traiter;


    public void traier(){
        traiter.traiter();
    }


    public void add(Figure figure){
        figureList.add(figure);
    }

    public void remove(Figure figure){
        figureList.remove(figure);
    }

    public void afficherDessin(){
        for(Figure f:figureList){
            f.dessiner();
        }
    }
    public void serialiser() throws Exception {
        System.out.println("serialiasable");
        File file=new File("Path");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        for(Figure f : figureList){
            objectOutputStream.writeObject(f);
        }
    }


}
