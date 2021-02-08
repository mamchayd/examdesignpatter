package org.enset.examdesignpatter.model.observres;


import org.enset.examdesignpatter.model.composite.Figure;

public interface Observable {

    void notif();
    void remove(Figure f);
    void add(Figure f);

}
