#include <stdio.h>
#include <stdlib.h>
main ()
{
int x;
printf ("\n Entre com um numero: ");
scanf ("%d", &x);
if (x % 2 == 0)
printf ("\n %d e par\n\n", x);
else printf ("\n %d e impar \n\n", x);
system ("pause");
}
	
