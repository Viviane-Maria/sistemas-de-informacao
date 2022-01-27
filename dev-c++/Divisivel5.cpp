#include <stdio.h>
#include <stdlib.h>

main()
{
	int x;
	printf ("\n Entre com um numero: ");
	scanf ("%d, &x");
	if (x % 5 ==0)
	printf("\n %d e divisivel por 5\n\n", x);
	else printf ("\n %d nao e divisivel por 5\n\n", x);
	system ("pause");
}
