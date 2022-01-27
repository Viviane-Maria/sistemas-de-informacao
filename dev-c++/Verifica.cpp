#include <stdio.h>
#include <stdlib.h>

main ()
{
	float x;
	printf ("\n Entre com um numero:");
	scanf ("%f", &x);
	if (x > 0 && x < 100)
	printf ("\n %.2f esta entre 0 e 100\n\n", x);
	else printf ("\n %.2f nao esta entre 0 e 100\n\n", x);
	system ("pause");
}
