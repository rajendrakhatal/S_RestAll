import java.util.regex.Pattern;

public class RegularExpressionExample {
	private static final String GSTIN_FORMAT = "^([0-9]){2}([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}([a-zA-Z0-9]){1}([a-zA-Z0-9]){2}?$";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Pattern pattern = Pattern.compile("^([0-9]){2}([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}([0-9]){1}([a-zA-Z]){1}([a-zA-Z0-9]){1}");
	
		String [] numbers = {"19BAKPS1896R1ZE","19AAACS8577K32K","19AADCT3802F1ZJ","19ADIPR5682C1Z7","19AAACI1681G1ZM","24AAAAG5588Q1Z2" ,"24AABCS1429B1Z0" ,"24AABCS1429B1Z0" ,"24ALTPP8920A1ZZ","19BSKPS6262F1Z8"};
	 for(String number: numbers){
         System.out.println( "does " + number + " is  number : "+ pattern.matcher(number).matches());
	 }
	 
	 //test check
	 String gstInno="19BAKPS1896R1ZE";
	 if (gstInno.matches(GSTIN_FORMAT)) {
		   System.out.println( "does " + gstInno + " ****: "+gstInno.matches(GSTIN_FORMAT));
	 }
	 
	 String gstInno1="24AABCS1429B1Z0";
	 if (gstInno1.matches(GSTIN_FORMAT)) {
		   System.out.println( "does " + gstInno1 + " ****: "+gstInno1.matches(GSTIN_FORMAT));
	 }
	 
	}
	

}
