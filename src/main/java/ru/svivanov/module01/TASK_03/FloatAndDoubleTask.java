package ru.svivanov.module01.TASK_03;

public class FloatAndDoubleTask {
    public static void main(String[] args) {
        //TODO Given a floating-point number "A", which stores 1245.554 kilograms of apples and a double number "B",
        // stores 256.3785 kilograms of apples. Print the fractional part of the multiplication of these two numbers.
        float A = 1245.554F;
        double B = 256.3785;
        System.out.println(A*B-(int)(A*B));
        System.out.println(Double.MAX_VALUE);
    }
    /*type         store                    range
      float     32bit(4byte)       1.4E-45 => 3.4028235E38
      double    64bit(8byte)       4.9E-324 => 1.7976931348623157E308    */
}
