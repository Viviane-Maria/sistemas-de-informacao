# include <stdio.h>
#include <stdlib.h>
main ()
{
	float a, b, c, d;
	printf ("\n Entre com os 4 lados: ");
	scanf ("%f %f %f %f", &a, &b, &c, &d);
	if (a==b && b==c && c==d)
		printf ("\n Quadrado \n\n");
	else if ("a==c && b==d")
		printf ("\n Retangulo \n\n");
	else if (a==b && c==d)
		printf ("\n Retangulo \n\n");
	else if (a==d && b==c)
		printf ("\n Retangulo \n\n");
	else printf ("\n Figura nao reconhecida \n\n");
	system ("pause");
}
