
public class Triangle {
	private double aSide;
	private double bSide;
	private double cSide;
	
	Triangle(double sideA, double sideB, double sideC){
		this.aSide = sideA;
		this.bSide = sideB;
		this.cSide = sideC;
	}
	
	public String checkTriangle() {
		String returnString;	
		
		if((aSide < 0) || (bSide < 0) || (cSide < 0)) {
			returnString = "INVALID";		
		}else {
			if((aSide + bSide > cSide) && (aSide + cSide > bSide) && (cSide + bSide > aSide)) {
				if((aSide == bSide) && (aSide == cSide)) {				
					returnString = "EQUILATERAL";
				}else if((aSide == bSide) || (aSide == cSide) || (bSide == cSide)) {
					returnString = "ISOSCELES";
				}else {
					returnString = "SCALENE";
				}
			}else {
				returnString = "INVALID";
			}
			
		}
		
		return returnString;
	}
}
