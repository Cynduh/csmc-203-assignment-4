
/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description:
 * Due: 4/8/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Johnathan Duong
*/
public class Plot extends java.lang.Object{

		private int x, y, width, depth;
		
		//Create a constructor that passes default values
		public Plot(){
			x = 0;
			y = 0;
			width = 1;
			depth = 1;
		}
		
		//Copy Constructor
		public Plot(Plot p){
			this.x = p.x; 
			this.y = p.y;
			this.width = p.width;
			this.depth = p.depth;
		}
		
		//Parameterized Constructor
		public Plot(int x, int y, int width, int depth){
			this.x = x;
			this.y = y;
			this.width = width;
			this.depth = depth;
		}
		
		public boolean overlaps(Plot plot) {
			
			return  this.x < plot.x + plot.width && this.x + width > plot.x && this.y < plot.y + plot.depth
		    		   && this.y + depth > plot.y;
		}
		
		//Determine if this plot encompasses the parameter
		public boolean encompasses(Plot plot) {
		    boolean encompass = false;
		    double X = x + width;
		    double Y = y + depth;
		    double newX = plot.getX() + plot.getWidth();
		    double newY = plot.getY() + plot.getDepth();
		    
		    if (this.x <= plot.getX() && plot.getX() <= X && this.y <= plot.getY() && 
		    plot.getY() <= Y && this.x <= X && newX <= X && 
		        this.y <= newY && newY <= Y) {
		        encompass = true;
		    }
		    return encompass;
		}
		
		//get x
		public int getX() {
			return x;
		}
		//set x
		public void setX(int x) {
			this.x = x;
		}
		//get y
		public int getY() {
			return y;
		}
		//set y
		public void setY(int y) {
			this.y = y;
		}
		//get width
		public int getWidth() {
			return width;
		}
		//set width
		public void setWidth(int width) {
			this.width = width;
		}
		//get depth
		public int getDepth() {
			return depth;
		}
		//set depth
		public void setDepth(int depth) {
			this.depth = depth;
		}
		//Prints the X,Y of the upper left corner, the width and the depth.
		public String toString() {
			
			String str= "Upper left: ("+ this.x+ ","+ this.y+"); Width: "+this.width+" Depth: "+this.depth;
			return str;
		}
}

