#include <stdio.h>

main()
{
	int x,y;
	x = 2;
	y = 4;
	printf("\nx=%d e y=%d\n\n", x,y);
	printf("\nx=%d e y=%d\n\n",x++, y++);
	printf("\nx=%d e y=%d\n\n",x, y);
	printf("\nx=%d e y=%d\n\n",++x, ++y);
	system ("pause");
}
