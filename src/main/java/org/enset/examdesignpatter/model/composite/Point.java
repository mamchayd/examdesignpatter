package org.enset.examdesignpatter.model.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
