package com.venom;

import java.util.Scanner;

public class GeometryClass {
    private static Scanner in = new Scanner(System.in);
    private static int userOption;

    public static void main(String[] args) {
	// write your code here
        runProgram();
    }

    private static void runProgram()
    {

        showOption();

        switch (userOption)
        {
            case 0:
                break;
            case 1:
                square();
                showOption();
//                break;
            case 2:
                rectangle();
                showOption();
            case 3:
                circle();
                showOption();
            case 4:
                triangle();
                showOption();
            case 5:
                trapezoid();
                showOption();
            case 6:
                cube();
                showOption();
            case 7:
                cylinder();
                showOption();
            case 8:
                cone();
                showOption();
            case 9:
                sphere();
                showOption();
        }
    }

    private static void showOption()
    {
        System.out.println("Generate Area/Perimeter/Circumference/Volume/Surface Area where applicable for the below." +"\n"+
                "0. Quit" +"\n"+
                "1. Square" +"\n"+
                "2. Rectangle" +"\n"+
                "3. Circle" +"\n"+
                "4. Triangle" +"\n"+
                "5. Trapezoid" +"\n"+
                "6. Cube" +"\n"+
                "7. Cylinder" +"\n"+
                "8. Cone" +"\n"+
                "9. Sphere" +"\n"+
                "Please choose: ");
        userOption = in.nextInt();
        in.nextLine();
    }

    private static void square()
    {
        System.out.println("Enter side (s): ");
        int s = in.nextInt();
        in.nextLine();

        System.out.println("Area A" + "\n"+
                "A = s^2"+"\n" +
                "A = "+s+"^2"+"\n"+
                "A = "+ (double)Math.pow(s,2) +"\n");

        System.out.println("Perimeter P" + "\n"+
                "P = 4s"+"\n" +
                "P = 4("+s+")"+"\n"+
                "P = "+ (double)(4*s) +"\n");
    }

    private static void rectangle()
    {
        System.out.println("Enter length (l): ");
        int l = in.nextInt();
        in.nextLine();
        System.out.println("Enter width (w): ");
        int w = in.nextInt();
        in.nextLine();

        System.out.println("Area A" + "\n"+
                "A = l*w"+"\n" +
                "A = "+l+"*"+w+"\n"+
                "A = "+ (double)(l*w) +"\n");

        System.out.println("Perimeter P" + "\n"+
                "P = 2(l+w)"+"\n" +
                "P = 2("+l+"+"+w+")"+"\n"+
                "P = "+ (double)((l+w)*2) +"\n");
    }

    private static void circle()
    {
        System.out.println("Enter radius (r): ");
        int r = in.nextInt();
        in.nextLine();

        System.out.println("Area A" + "\n"+
                "A = pi*r^2"+"\n" +
                "A = 3.14*"+r+"^2"+"\n"+
                "A = "+ (double)((Math.PI)*Math.pow(r,2)) +"\n");

        System.out.println("Perimeter P" + "\n"+
                "P = 2*pi*r"+"\n" +
                "P = 2*3.14*"+r+"\n"+
                "P = "+ (double)(2*Math.PI*r) +"\n");
    }

    private static void triangle()
    {
        System.out.println("Enter base (b): ");
        int b = in.nextInt();
        in.nextLine();
        System.out.println("Enter height (h): ");
        int h = in.nextInt();
        in.nextLine();

        System.out.println("Area A" + "\n"+
                "A = 1/2bh"+"\n" +
                "A = 1/2*"+b+"*"+h+"\n"+
                "A = "+ (double)(0.5*b*h) +"\n");
    }

    private static void trapezoid()
    {
        System.out.println("Enter base1 (b1): ");
        int b1 = in.nextInt();
        in.nextLine();
        System.out.println("Enter base2 (b2): ");
        int b2 = in.nextInt();
        in.nextLine();
        System.out.println("Enter height (h): ");
        int h = in.nextInt();
        in.nextLine();

        System.out.println("Area A" + "\n"+
                "A = 1/2(b1+b2)h"+"\n" +
                "A = 1/2*("+b1+"+"+b2+")*"+h+"\n"+
                "A = "+ (double)(0.5*(b1+b2)*h) +"\n");
    }

    private static void cube()
    {
        System.out.println("Enter side (s): ");
        int s = in.nextInt();
        in.nextLine();

        System.out.println("Volume V" + "\n"+
                "V = s^3"+"\n" +
                "V = "+s+"^3"+"\n"+
                "V = "+ (double)Math.pow(s,3) +"\n");

        System.out.println("Surface Area SA" + "\n"+
                "SA = 6s^2"+"\n" +
                "SA = 6*"+s+"^2"+"\n"+
                "SA = "+ (double)(6*Math.pow(s,2)) +"\n");
    }

    private static void cylinder()
    {
        System.out.println("Enter radius (r): ");
        int r = in.nextInt();
        in.nextLine();
        System.out.println("Enter height (h): ");
        int h = in.nextInt();
        in.nextLine();

        System.out.println("Volume V" + "\n"+
                "V = pi*r^2*h"+"\n" +
                "V = 3.14*"+r+"^2*"+h+"\n"+
                "V = "+ (double)(Math.PI*Math.pow(r,2)*h) +"\n");

        System.out.println("Surface Area SA" + "\n"+
                "SA = 2*pi*r(h + r)"+"\n" +
                "SA = 2*3.14*"+r+"("+h+"+"+r+")"+"\n"+
                "SA = "+ (double)(2*Math.PI*r*(r+h)) +"\n");
    }

    private static void cone()
    {
        System.out.println("Enter radius (r): ");
        int r = in.nextInt();
        in.nextLine();
        System.out.println("Enter height (h): ");
        int h = in.nextInt();
        in.nextLine();
        System.out.println("Enter length (l): ");
        int l = in.nextInt();
        in.nextLine();

        System.out.println("Volume V" + "\n"+
                "V = 1/3*pi*r^2*h"+"\n" +
                "V = 1/3*3.14*"+r+"^2*"+h+"\n"+
                "V = "+ (((double)1/3)*Math.PI*Math.pow(r,2)*h) +"\n");

        System.out.println("Surface Area SA" + "\n"+
                "SA = pi*r*l"+"\n" +
                "SA = 3.14*"+r+"*"+l+"\n"+
                "SA = "+ (double)(Math.PI*r*l) +"\n");
    }

    private static void sphere()
    {
        System.out.println("Enter radius (r): ");
        int r = in.nextInt();
        in.nextLine();

        System.out.println("Volume V" + "\n"+
                "V = 4/3*pi*r^3"+"\n" +
                "V = 4/3*3.14*"+r+"^3*"+"\n"+
                "V = "+ (((double)4/3)*Math.PI*Math.pow(r,3)) +"\n");

        System.out.println("Surface Area SA" + "\n"+
                "SA = 4*pi*r^2"+"\n" +
                "SA = 4*3.14*"+r+"^2"+"\n"+
                "SA = "+ (double)(4*Math.PI*Math.pow(r,2)) +"\n");
    }

}
