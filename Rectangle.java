/**
 * Last Name: Arsenieva
 * First Name: Olga
 * Student ID: 067871137
 * codeboard UserName: arsenievaolga
 */

/**
 * Class Rectangle creates a rectangle with fields length l, and width w
 *
 */
public class Rectangle implements Shape  {

	private int l;
	private int w;
	
    /**
     * Class Constructor receives length and width of new Rectangle
     * @param a length
     * @param b width
     */
    public Rectangle(int a, int b) {
        this.l = a;
        this.w = b;
    }	
    
    /**
     * Getter for length
     * @return current length of Rectangle
     */
    public int getLength(){
    	return l;
    }
    
    /**
     * Getter for width
     * @return current width of Rectangle
     */
    public int getWidth(){
    	return w;
    }
    
    /**
     * Setter for length
     * @param length new length of Rectangle
     */
    public void setLength(int length){
    	this.l = length;
    }
    
    /**
     * Setter for width
     * @param width new width for Rectangle
     */
    public void setWidth(int width){
    	this.w = width;
    }
    
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "[Rectangle( l=" + l + " w=" + w + " ) has perimeter: "+getPerimeter()+"]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(!(o instanceof Rectangle)){
			return false;
		}
		
		Rectangle r = (Rectangle) o;
		if(l != r.l){
			return false;
		}
		if(w!=r.w){
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode(){
		int result = l;
		result = 31 * result + w;
		return result;
	}
	
	/* (non-Javadoc)
	 * @see Arsenieva067.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*l+2*w;
	}
	
}
