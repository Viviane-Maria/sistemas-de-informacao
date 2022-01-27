#include <stdio.h>

main()
{
	int x, y;
	x = 2;
	y = 4;
	x = ++y;
	y = x++;
	printf ("\nx= %d e y= %d\n", x, y);
	system("pause");
}
