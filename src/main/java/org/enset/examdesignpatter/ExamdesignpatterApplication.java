package org.enset.examdesignpatter;


import org.enset.examdesignpatter.aspect.AppContext;
import org.enset.examdesignpatter.model.composite.Circle;
import org.enset.examdesignpatter.model.composite.Rectangle;
import org.enset.examdesignpatter.model.observres.Parametrage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExamdesignpatterApplication {

    public static void main(String[] args) {
        AppContext.authenticateUser("admin","admin",new String[]{"USER"});
        SpringApplication.run(ExamdesignpatterApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(Circle circle, Rectangle rectangle, Parametrage p){
        return args -> {
         /*   Dessin d =new Dessin();
            d.add(new Circle(3,new Point(1,0)));
            Group c=new Group(new Point(0,3));
            c.addFigure(new Rectangle(14,7,new Point(1,2)));
            d.add(c);
            List<Observer> observers=new ArrayList<>();
            observers.add(new Circle(4,new Point(0,0)));
            Parametrage p =new Parametrage(6,9,2,observers);
            p.notif();
*/
            circle.surface();
            rectangle.piremiter();
            p.add(circle);
            p.add(rectangle);
        };
    }
}
