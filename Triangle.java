/**
 * Last Name: Arsenieva
 * First Name: Olga
 * Student ID: 067871137
 * codeboard UserName: arsenievaolga
 */


/**
 * Class Triangle creates a triangle with sides a, b, c
 *
 */
public class Triangle  implements Shape {

   	private int a;
	private int b;
	private int c;
	
    /**
     * Class Constructor receives lengths of triangle sides
     * @param x side a length 
     * @param y side b length
     * @param z side c length
     */
    public Triangle(int x, int y, int z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }
    
    /**
     * Getter for side a
     * @return current side a
     */
    public int getA(){
    	return a;
    }
    
    /**
     * Getter for side b
     * @return current side b
     */
    public int getB(){
    	return b;
    }
    
    /**
     * Getter for side c
     * @return current side c
     */
    public int getC(){
    	return c;
    }
    
    /**
     * Setter for side a
     * @param sideA new value of side a
     */
    public void setA(int sideA){
    	this.a=sideA;
    }
    
    /**
     * Setter for side b
     * @param sideB new value of side b
     */
    public void setB(int sideB){
    	this.b=sideB;
    }
    
    /**
     * Setter for side c
     * @param sideC new value of side c
     */
    public void setC(int sideC){
    	this.c=sideC;
    }
    
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "[Triangle( a=" + a + " b=" + b + " c=" + c + " ) has perimeter: "+getPerimeter()+"]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(!(o instanceof Triangle)){
			return false;
		}
		
		Triangle tr = (Triangle) o;
		if(a != tr.a){
			return false;
		}
		if(b!=tr.b){
			return false;
		}
		if(c!=tr.c){
			return false;
		}
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode(){
		int result = a;
		result = 31 * result + b;
		result = 31 * result + c;
		return result;
	}
	
	/* (non-Javadoc)
	 * @see Arsenieva067.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}	
	
}
