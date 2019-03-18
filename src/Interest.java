
public class Interest {
	
	double calculateSimpleInterest(double principleAmount,double rateOfInterest,double time) {
		double simpleInterest = (principleAmount * rateOfInterest * time) / 100;
		return simpleInterest;
	}
	
	double calculateCompoundInterest(double principleAmount,double rateOfInterest,double time,double numberOfTimesInterestCompounded) {
		double compoundInterest = principleAmount*Math.pow((1 + (rateOfInterest/numberOfTimesInterestCompounded)),(time*numberOfTimesInterestCompounded));
		return compoundInterest;
		
	}
	
}
