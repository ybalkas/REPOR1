package assignment_day_6;

public class task5 {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		-Declare int variables inputSeconds, hours, minutes, seconds
		-Initialize the inputSeconds

		-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
		-Assign values to the hours, minutes, seconds variables */
		int inputSeconds=3695,hours,minutes,seconds;
		hours=inputSeconds/3600;
		minutes=(inputSeconds%3600)/60;
		seconds=inputSeconds%60;
		
		System.out.println(inputSeconds+" seconds");
		System.out.println(hours+" hours");
		System.out.println(minutes+ " minutes");
		System.out.println(seconds+" seconds");
	}

}
System.out.println("given n1=10 changes into n1= "+n1);
		System.out.println(" given n2=20 changes into n2= "+n2);
