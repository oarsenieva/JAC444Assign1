
/**
 * Last Name: Arsenieva
 * First Name: Olga
 * Student ID: 067871137
 * codeboard UserName: arsenievaolga
 */
 
/**
 * Class Circle creates a circle with radius r, and implements Shape interface
 *
 */
public class Circle implements Shape  {

    private int r;
    
    /**
     * Class constructor receives radius of Circle to create
     * @param rad is radius of new Circle object
     */
    public Circle(int rad) {
        this.r = rad;
        
    }	
    
    /**
     * Getter for radius of Circle
     * @return current radius of Circle object
     */
    public int getRadius(){
    	return r;
    }
    
    /**
     * Setter for radius of Circle
     * @param radius new radius of Circle
     */
    public void setRadius(int radius){
    	this.r = radius;
    }
    
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "[Circle( r=" + r + " ) has perimeter: "+getPerimeter()+"]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(!(o instanceof Circle)){
			return false;
		}
		
		Circle c = (Circle) o;
		if(r != c.r){
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode(){
		int result = r;
		return result;
	}
	
	/* (non-Javadoc)
	 * @see Arsenieva067.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}	
    
}
