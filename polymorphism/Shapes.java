package polymorphism;

public class Shapes {

    void area(double radius, double height){
        System.out.println("these are the area of the shapes");
    }

}

class Cylinder extends Shapes{

    void area(double radius,double height){

        double pie =3.142;
        double area= 2*pie* radius * radius + 2*pie* radius * height;
        System.out.println("The area of the Cylinder is: "+area);
    }


}



