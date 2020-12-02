package core;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // JVM

public class CalculatorTest2 {

    @Test(timeout=1000) // @Ignore
    public void test_06_div_4() {
        System.out.println("Test # 06: Divide 4 params");
        assertEquals("Not correct", Calculator.divide(200.0, 2.0, 25.0, 2.0), 2.0, 0.09);}

    @Test(timeout=1000) // @Ignore
    public void test_05_div_3() {
        System.out.println("Test # 05: Divide 3 params");
        assertEquals("Not correct", Calculator.divide(8.0, 4.0, 2.0), 1.0, 0.09);}

    @Test(timeout=1000) // @Ignore
    public void test_07_miltiply_2() {
        System.out.println("Test # 07: Multiply 4 params");
        assertEquals("Not correct", Calculator.multiply(44.00, 25.00), 1100.0, 0.09);}

    @Test(timeout=1000) // @Ignore
    public void test_04_divide_2() {
        System.out.println("Test # 04: Divide 2 params");
        assertEquals("Not correct", Calculator.divide(90.0, 30.0), 3.0, 0.09);}

    @Test(timeout=1000) // @Ignore
    public void test_01_add_2() {
        System.out.println("Test # 01: Add 2 params");
        assertEquals("Not correct", Calculator.add(40.0, 8.0), 48.0, 0.09);}

    @Test(timeout=1000) // @Ignore
    public void test_09_multiply_4() {
        System.out.println("Test # 09: Mu;tiply 4 params");
        assertEquals("Not correct", Calculator.multiply(600.0, 50.0, 4.0, 2.0), 240000.0, 0.09);}

    @Test(timeout=1000) // @Ignore
    public void test_02_add_3() {
        System.out.println("Test # 02: Add 3 params");
        assertEquals("Not correct", Calculator.add(9.0, 5.0,3.0), 17.0, 0.09);}

    @Test(timeout=1000) // @Ignore
    public void test_04_add_4() {
        System.out.println("Test # 04: Add 5 params");
        assertEquals("Not correct", Calculator.add(20.0, 5.0, 8.0,7.0), 40.0, 0.09);}

    @Test(timeout=1000) // @Ignore
    public void test_08_multiply_3() {
        System.out.println("Test # 08: Multiply 3 params");
        assertEquals("Not correct", Calculator.multiply(24.0, 2.0, 10.0), 480.0, 0.09);}



}
