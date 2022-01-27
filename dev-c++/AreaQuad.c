#include <stdio.h>
main()
{
	float lado, area;
	printf("\n Digite o valor do lado do quadrado:");
	scanf("%f",&lado);
	area=lado*lado;
	printf("\nA area do quadrado=%.2f\n\n", area);
	system("pause");
}
