#include <stdio.h>
int main(){
	int a, b, c, d;
	float media;
	printf("Digite 4 numeros inteiros:\n");
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	scanf("%d",&d);
	media = (float)(a +b + c + d) / 4;
	printf("A m�dia dos 4 n�meros � = %.2f",media);
	return 0;
}
