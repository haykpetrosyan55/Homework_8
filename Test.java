package Homework_8;

public class Test {
    public static void main(String[] args) {
        Person Hayk = new Person("Hayk","Erevan, Avan");
        System.out.println(Hayk);

        Student Lilit = new Student("Lilit","Erevan","Tntesagitakan",5,290000);
        System.out.println(Lilit);

        Staff dzyadzRuben = new Staff("Ruben","Shengavit","N123",230000);
        System.out.println(dzyadzRuben);

        Circle circle = new Circle(3);
        System.out.println(circle.getArea(circle.radius));
        System.out.println(circle.getPerimeter(circle.radius));

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());

        Square square = new Square(7);
        System.out.println(square);
        System.out.println(square.getPerimeter());
    }
}
