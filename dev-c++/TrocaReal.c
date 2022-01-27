#include <stdio.h>
#include <stdlib.h>
main()
{
	float a, b, aux;
	printf ("\nDigite o valor de A:");
	scanf ("%f", &a);
	printf ("\nDigite o valor de B:");
	scanf("%f", &b);
	aux = a;
	a = b;
	b = aux;
	printf ("\nAgora o valor de A e: %.2f e de B: %.2f\n", a,b);
	system("pause");
}
