package com.demo.practice;

public class emailid {
	
	
	
	 String concanatedString = input1.concat(input2);
     char str[] = concanatedString.toCharArray();  
     int len = str.length;
     
     //Remove Duplicate
     String uniqueString = UserMainCode.removeDuplicate(str,len);
     
     //order Descending string
     char[] s = uniqueString.toCharArray();
     descOrder(s);
     return s;
	
	
     static void descOrder(char[] s)
     {
         Arrays.sort(s);
         reverse(s);
     }
  
     static void reverse(char[] a)
     {
         int i, n = a.length;
         char t;
         for (i = 0; i < n / 2; i++)
         {
             t = a[i];
             a[i] = a[n - i - 1];
             a[n - i - 1] = t;
         }
     }
     
     static String removeDuplicate(char str[], int length)   
     {   
         int index = 0;  
         for (int i = 0; i < length; i++)   
         {   
             int j;   
             for (j = 0; j < i; j++)    
             {   
                 if (str[i] == str[j])   
                 {   
                     break;   
                 }   
             }   
     
             if (j == i)    
             {   
                 str[index++] = str[i];   
             }   
         }   
         return String.valueOf(Arrays.copyOf(str, index));
     } 
	
	
	
	
	
	
	
	
	
	
	StringBuffer sb1=new StringBuffer(input1);
	StringBuffer sb2=new StringBuffer(input2);
	sb1.append(input2);
	String s=sb1.toString();
	char []arr=s.toCharArray();
	Arrays.sort(arr);
	String s2= String.valueOf(arr);
	Character[] arr = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

    // sort Character array in descending order
    Arrays.sort(arr, Comparator.reverseOrder());

    // String join Character array
    String s2= Arrays.stream(arr).map(Objects::toString).collect(Collectors.joining());
	
	
	
	
	
	
	
	
	
	

	int n1=input1.length();
	int n2=input2.length();
	char ch;
	String s1[]=new char[n1];
	String s2[]=new char[n2];
	for(int i=0;i<n1;i++)
	{
		for(int j=i;j>=0;j--)
		{
			ch=input1.charAt(i);
			if(ch!=s1[j])
			{
				s1[i]=ch;
			}
			
		
		}
	}
	for(int i=0;i<n2;i++)
	{
		for(int j=i;j>=0;j--)
		{
			ch=input2.charAt(i);
			if(ch!=s2[j])
			{
				s2[i]=ch;
			}
			
		
		}
	}
	String sam1="";
	String sam2="";
	for(int i=0;i<n1;i++)
	{
		sam1=sam1+s1[i];
	}
	for(int i=0;i<n2;i++)
	{
		sam2=sam2+s2[i];
	}
	String sam3=sam1+sam2;
	return sam3;
	

}
