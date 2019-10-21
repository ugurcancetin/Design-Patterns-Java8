package com.cetin.objectpool;

import javafx.geometry.Point2D;

public interface Image extends Poolable{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);

}
