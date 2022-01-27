#include <stdio.h>

main()
{
	char a,b,aux;
	printf("\nDigite o primeiro caracter: \n");
	scanf("%c",&a);
	printf("\nDigite o segundo caracter: \n");
	scanf("%c",&b);
	aux = a;
	a = b;
	b = aux;
	printf("\nAgora o primeiro caracter e:%c e o segundo e:%c\n",a,b);
	system("pause");
}
