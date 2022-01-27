#include <stdio.h>

main()
{
	float a,b,soma;
	printf("\n Digite 2 numeros reais:\n");
	scanf("%f %f",&a,&b);
	soma = a + b;
	printf("\n%.2f+%.2f = %f\n",a,b,soma);
	system("pause");
}
