import java.util.Scanner;

    
    
    


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





    
