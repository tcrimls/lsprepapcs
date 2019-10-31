import java.awt.Color;


public class PictureEditor {
    
    static Picture pic;
    
    public static void main(String[] args) {
        
        args = new String[1];
        args[0] = "javapic.jpg";
        
        pic = new Picture(args[0]);
        System.out.println(pic.width() + "w x " + pic.height()+"h");
        
        printPixelColors();
        removeRed();
        pic.show();
            
    }
    
    
    public static void printPixelColors() {
        int x = 0;
        int y = 0;
        Color pixelColor = pic.get(x, y);
        int red = pixelColor.getRed();
        int green = pixelColor.getGreen();
        int blue = pixelColor.getBlue();
        System.out.println("red:"+red+",green:"+green+",blue:"+blue);
    }

    public static void drawDarkerLine() {
        int y = 10;
        int width = 200;
        for (int x = 0; x < width; x++) {
            int red = 10;
            int blue = 10;
            int green = 10;
            Color pixelColor = new Color(red, green, blue);
            pic.set(x, y, pixelColor);
        }
    }

    public static void removeRed(){
        for(int x=0;x<pic.width();x++){
            for (int y=0;y<pic.height();y++){
                if(x<(pic.width()-7)&&y<(pic.height()-7)&&x>7&&y>7){
                    int newX = x+(int)(Math.random()*12-6);
                    int newY = y+(int)(Math.random()*12-6);
                    Color changeColor = pic.get(newX,newY);
                    pic.set(x,y,changeColor);
                }

            }
        }
    }

    public static void drawSquare() {

    }
    
    public static void drawCenteredSquare() {
        
    }
    
    public static void drawTriangleTop() {
        
    }
    
}