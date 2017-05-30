class LeapYear 
{
 
        public static void main(String[] args) 
	{
		int year=2006;
               LeapYear obj=new LeapYear();
               if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			{
                        System.out.println("This Year is a leap year");
			}
                else
			{	
                        System.out.println("This Year is not a leap year");
			}
        }
}