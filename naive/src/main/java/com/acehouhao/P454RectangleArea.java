package com.acehouhao;

/**
 * @author houhao
 */
public class P454RectangleArea {
    public static void main(String[] args) {
        P454RectangleArea rectangle = new P454RectangleArea(3, 4);
        System.out.println(rectangle.getArea());
    }

    /*
     * Define two public attributes width and height of type int.
     */
    int length;
    int width;


    /*
     * Define a constructor which expects two parameters width and height here.
     */
    public P454RectangleArea(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    public int getArea() {
        return length * width;
    }
}
