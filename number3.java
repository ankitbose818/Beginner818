/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
	int num[]=new int[10];
	num[0]=5;
	num[1]=7;
	num[2]=3;
	int largest=num[0];
	for(int i=0;i<2;i++)
	{
		if(largest<num[i])
		largest=num[i];
	}
		System.out.println(largest);
 
	}
}