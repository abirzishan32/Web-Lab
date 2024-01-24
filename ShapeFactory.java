import java.util.Scanner;
interface Shape {
    void draw();
    }

    public class Rectangle implements Shape {
    @Override
    public void draw() {
    System.out.println("Inside Rectangle::draw() method.");
        }
    }
    
    public class Square implements Shape {
    @Override
    public void draw() {
    System.out.println("Inside Square::draw() method.");
        }
    }
    


class ShapeFactory{
    private static ShapeFactory instance;
    private ShapeFactory(){}
    public static ShapeFactory getInstance(){
        if(instance==null){
            instance=new ShapeFactory();
        }
        return instance;
    }
    public shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}



public class FactoryPatternDemo {
    public static void main(String[] args) {
    ShapeFactory shapeFactory;
    
    Shape shape1 = shapeFactory.getShape("CIRCLE");
    
    shape1.draw();
  
    Shape shape2 = shapeFactory.getShape("RECTANGLE");
 
    shape2.draw();
 
    Shape shape3 = shapeFactory.getShape("SQUARE");

    shape3.draw();
    }
}

    
