#include <stdio.h>

main()
{
	int resultado;
	resultado = !0 && 0 || 0;
	printf("\nresultado1= %d\n", resultado);
	resultado = !(0 && 0) || 0;
	printf("\nresultado2= %d\n", resultado);
	system("pause");
}
