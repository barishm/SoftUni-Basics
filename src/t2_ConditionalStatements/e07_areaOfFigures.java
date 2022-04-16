package t2_ConditionalStatements;
import java.util.Scanner;
public class e07_areaOfFigures {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        if (figure.equals("square")){
            double squareSide  = Double.parseDouble(scan.nextLine());
            double squareSize = squareSide * squareSide;
            System.out.printf("%.3f",squareSize);
        }
        if(figure.equals("rectangle")){
            double rectSide1  = Double.parseDouble(scan.nextLine());
            double rectSide2  = Double.parseDouble(scan.nextLine());
            double rectangleSize = rectSide1 * rectSide2;
            System.out.printf("%.3f",rectangleSize);
        }
        if(figure.equals("circle")){
            double radius  = Double.parseDouble(scan.nextLine());
            double area = radius * radius * Math.PI;
            System.out.printf("%.3f",area);
        }
        if(figure.equals("triangle")){
            double h = Double.parseDouble(scan.nextLine());
            double a = Double.parseDouble(scan.nextLine());
            double triangleArea = 0.5 * h * a;
            System.out.printf("%.3f",triangleArea);
        }

        }
    }

