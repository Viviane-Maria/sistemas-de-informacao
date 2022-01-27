#include <stdio.h>
#include <stdlib.h>
main()
{
	float a, por;
	printf("\nDigite o valor: ");
	scanf("%f",&a);
	por = a* 0.1;
	printf("\n10%% de %.2f e igual a %.2f\n",a,por);
	system("pause");
}
