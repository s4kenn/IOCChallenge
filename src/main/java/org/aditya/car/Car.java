package org.aditya.car;

public class Car {

    private Specification specification;

//    public Car(Specification specification) {
//        this.specification = specification;
//    }


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String details() {
        return specification.toString();
    }

}