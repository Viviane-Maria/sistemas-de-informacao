#include <stdio.h>
#include <stdlib.h>

main()
{
    float bc,ac,ab,a,b,c;
    printf ("\nEntre com os tres lados do triangulo:\n\n");
    scanf ("%f %f %f", &a, &b, &c);
    bc = b-c;
    if (bc < 0)
    bc = bc * - 1;
   
    ac = a-c; 
    if (ac < 0)
        ac  = ac * - 1;

    ab = a-b;
    if (ab < 0)
        ab  = ab * - 1;
    
     if ((bc < a  && a < b + c ) && (ac < b && b < a + c ) && (ab < c && c < a+b)) 
     	if ((a = b) && (b = c))
     	printf ("\nTriangulo Equilatero\n\n");
      	else if ((a=b) || (b=c) || (c=a))
    	printf ("\nTriangulo Isosceles\n\n");
     	else printf ("\nTriangulo Escaleno\n\n");
     
else
printf ("\nEstes valores nao sao de um triangulo\n\n");
system ("pause");
}
