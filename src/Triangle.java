
public class Triangle {
	private double aSide;
	private double bSide;
	private double cSide;

	Triangle(double sideA, double sideB, double sideC) {
		aSide = sideA;
		bSide = sideB;
		cSide = sideC;
	}

	public boolean isValid() {
		return checkNegative() && checkSides();
	}

	public String checkType() {
		String returnString;

		if ((aSide == bSide) && (aSide == cSide)) {
			returnString = "EQUILATERAL";
		} else if ((aSide == bSide) || (aSide == cSide) || (bSide == cSide)) {
			returnString = "ISOSCELES";
		} else {
			returnString = "SCALENE";
		}

		return returnString;
	}

	private boolean checkNegative() {
		return aSide > 0 && bSide > 0 && cSide > 0;
	}

	private boolean checkSides() {
		return (aSide + bSide > cSide) && (aSide + cSide > bSide) && (cSide + bSide > aSide);
	}
}
