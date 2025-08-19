package oops_question;

class Shape {
    void draw() {
        System.out.println("you can draw any shapes");
    }
}

    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("draw circle shape");
        }
    }
        class Square extends Shape {
            @Override
            void draw() {
                System.out.println("draw Squares shape");
            }
        }

public class UsingPolymorphism {
    public static void main(String[] args){
        Shape s1 = new Square();
        s1.draw();
        Shape s2 = new Circle();
        s2.draw();
        Shape s3 = new Shape();
        s3.draw();

    }
}
