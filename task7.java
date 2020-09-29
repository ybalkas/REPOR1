package assignment_day_6;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int change,quarters,dimes,nickles,price,r1,r2;
        price=95;
        change=100-price;
        quarters=change/25;
        r1=change%25;
        dimes=r1/10;
        r2=r1%10;
        nickles=r2/5;
       
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Price in cents : "+price);
        System.out.println("Your change is "+quarters+" quarters," +dimes+" dimes, and "+nickles+" nickles." );
        
        
	}

}
