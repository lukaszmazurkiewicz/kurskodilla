package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {

        System.out.println("Start Testing: ");
    }

    @AfterClass
    public static void afterAllTests() {

        System.out.println("The end of all tests.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test nr " + testCounter);
    }
    @After
    public void afterEveryTest() {

        System.out.println("End of test nr " + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(7,10);
        //When
        shapeCollector.addFigure(shape);
        System.out.println("Test dodania figury");
        //Then
        Assert.assertEquals(1 , shapeCollector.getSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(5);
        shapeCollector.addFigure(shape);
        //When
        shapeCollector.removeFigure(shape);
        System.out.println("Test usuwania figury");
        //Then
        Assert.assertEquals(0, shapeCollector.getSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(5);
        Shape shape2 = new Triangle(5,10);
        Shape shape3 = new Circle(5);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        //When
        Shape givenShape = shapeCollector.getFigure(2);
        System.out.println("Test pobierania wybranej figury");
        //Then
        Assert.assertEquals(shape3, givenShape );
    }

    @Test
    public void testGetField() {
        //Given
        Shape shape = new Square(5);
        //When
        long result = (long) shape.getField();
        System.out.println("Test poprawności pola figury");
        //Then
        Assert.assertEquals(25, result);
    }

    @Test
    public void testGetShapeName() {
        //Given
        Shape shape = new Circle(5);
        //When
        String name = shape.getShapeName();
        System.out.println("Test poprawnosci nazwy figury");
        //
        Assert.assertEquals("Circle", name);
    }

}
