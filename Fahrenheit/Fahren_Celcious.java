class Fahren_Celcious
{
public float temp=95;
public float c;
public static void main(String[] args)
{
Fahren_Celcious obj=new Fahren_Celcious();
System.out.println("Enter The Temperature in Fahrenheit:"+obj.temp);
obj.c=((obj.temp-32)*5)/9;
System.out.println("Temperature in Celcious:"+obj.c);
}
}



