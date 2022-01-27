#include <stdio.h>
main()
{
	float base, altura, area;
	printf("\nDigite a base do triangulo:");
	scanf("%f",&base);
	printf("\nDigite a altura do triangulo:");
	scanf("%f",&altura);
	area=(base*altura)/2;
	printf("\nA area do triangulo e %.2f\n\n",area);
	system("pause");
}
