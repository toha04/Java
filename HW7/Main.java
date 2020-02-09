package Java.HW7;

import Java.HW7.Circle;

public class Main {
    public static void main(String[] args) {
        Shape[] figures = {
                new Circle("yellow", 34),
                new Circle("blue", 500),
                new Circle("brown", -100),
                new Rectangle("black", 55.5, -15 ),
                new Rectangle("orange", 34.2, 35),
                new Rectangle("green", 0, 0),
                new Triangle("red", 12,23,45),
                new Triangle("white", -4, 0, 56),
                new Triangle("silver", 50.9, 70.8,55.1), };

                showAllFigures(figures);
        System.out.println("Sum of all figures: " + countAllAreas(figures));
        System.out.println("Sum of all indicated figures " + countAllAreas(figures, "Rectangle"));
        }
        public static void showAllFigures(Shape[] array) {
            double sum = 0;
            for (Shape elem : array) {
                double area = elem.calcArea();
                if ( area == 0) {
                    System.out.println(elem + elem.getClass().getSimpleName() + " Doesn't exist!");
                } else {
                    System.out.println(elem + "- area " + area);
                }
            }
        }
        public static double countAllAreas(Shape[] array) {
            double sum = 0;
            for (Shape elem : array) {
                double area = elem.calcArea();
                sum += area;
            }
            return sum;
        }
        public static double countAllAreas(Shape[] array, String figure) {
            double sum = 0;
            for (Shape elem : array) {
//                                       System.out.println(elem.getClass().getSimpleName());
                if (elem.getClass().getSimpleName().equals(figure)) {
                    double area = elem.calcArea();
                    sum += area;
                }
            }
            return sum;
        }
    }

