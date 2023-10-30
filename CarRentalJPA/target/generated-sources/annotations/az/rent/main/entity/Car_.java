package az.rent.main.entity;

import az.rent.main.entity.Category;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-30T18:31:37", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Car.class)
public class Car_ { 

    public static volatile SingularAttribute<Car, Integer> price;
    public static volatile SingularAttribute<Car, String> model;
    public static volatile SingularAttribute<Car, Category> category;
    public static volatile SingularAttribute<Car, String> brand;
    public static volatile SingularAttribute<Car, Integer> carId;

}