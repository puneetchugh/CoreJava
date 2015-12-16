#include<stdio.h>
#include<string.h>
int main()
{
	char string[]="My name is Puneet Chugh";
	char * new_string = NULL;	
	new_string = strtok(string," ");
	printf("The original string : %s", string);
	while(string != NULL)
	{
		printf("%s\n", new_string);
		new_string = strtok(NULL, " ");
	}
}
