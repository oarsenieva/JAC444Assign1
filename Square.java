/**
 * Last Name: Arsenieva
 * First Name: Olga
 * Student ID: 067871137
 * codeboard UserName: arsenievaolga
 */


/**
 * Class Square creates a square with side length s
 *
 */
public class Square  implements Shape {

    private int s;
    
    /**
     * Class Constructor receives side length of new square
     * @param a side length of square
     */
    public Square(int a) {
        this.s = a;
    }
    
    /**
     * Getter for side of square
     * @return current side length
     */
    public int getSide(){
    	return s;
    }
    
    /**
     * Setter for side of square
     * @param side new side length
     */
    public void setSide(int side){
    	this.s=side;
    }
    
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "[Square( s=" + s + " ) has perimeter: "+getPerimeter()+"]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		
		if(this == o){
			return true;
		}
		if(!(o instanceof Square)){
			return false;
		}
		
		Square sqr = (Square) o;
		if(s != sqr.s){
			return false;
		}
		
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode(){
		int result = s;
		return result;
	}
	
	/* (non-Javadoc)
	 * @see Arsenieva067.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*s;
	}	
	
}
