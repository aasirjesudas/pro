#include<stdio.h>
 
int main()
{
   int n, i = 3, count, c,t,sum1=0;
 
   printf("Enter the number of prime numbers required\n");
   scanf("%d",&n);
 
   if ( n >= 1 )
   {
      printf("First %d prime numbers are :\n",n);
      printf("2\n");
   }
 
   for ( count = 2 ; count <= n ;  )
   {
      for ( c = 2 ; c <= i - 1 ; c++ )
      {
         if ( i%c == 0 )
            break;
      }
      if ( c == i )
      { 
      	 while(i!=0)
      	 {
      	 	t=i%10;
      	 	sum1=sum1+t;
      	 i=i/10;
      	 }
      	 if(sum1<100)
      	 {
         printf("%d\n",sum1);
         }
        count++;
       }
      i++;}
       
   return 0;
}
