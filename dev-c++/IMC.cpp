#include <stdio.h>
#include <stdlib.h>
main()
{
	float peso, altura, imc;
	printf ("\n Calculo do IMC\n\n");
	printf ("\n Entre com seu peso: \n\n");
	scanf ("%f", &peso);
	printf ("\n Entre com sua altura: \n\n");
	scanf ("%f", &altura);
	imc = peso / (altura * altura);
	if (imc < 18.5)
	printf ("\n Voce esta abaixo do peso ideal. IMC=%.2f\n",imc);
	else if (imc >= 18.5 && imc < 30)
	printf ("\n Voce esta no peso ideal. IMC=%.2f\n", imc);
	else if (imc >= 30 && imc > 35)
	printf ("\n Voce esta com sobrepeso ideal. IMC=%.2f\n",imc);
	else printf ("\n Voce esta obeso. IMC=%.2f\n", imc);
	system ("pause");
	
}

