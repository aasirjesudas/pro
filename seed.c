#include <stdio.h>
int main(void)
{
	int x,s,t;
	scanf("%d",x);
	s=x;
	while(n!=0)
	{
    t=x%10;
    s*=t;
    x=t/10;
	}
	printf("%d",s);
	return 0;
}
