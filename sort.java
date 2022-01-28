import java.util.*;
 
class sort
{
	public static void main(String[] args) 
	{
	 System.out.println("inside main ");	
	}
	static {
		System.out.println("inside static ");
	}
	static void abc()
	{
		System.out.println("inside static abc");
	}
	
    public int calculate_ways()
    { 
    	System.out.println("inside non static function ");
		return 0;	
    }
}
