#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main() {
    char a[1000];
    int i,b[1000]={0};
    scanf("%[^\n]s",a);
    for(i=0;i<strlen(a);i++)
        {
        if(a[i]>=97&&a[i]<=122)
           b[a[i]%97]+=1;
    }
     for(i=0;i<strlen(a);i++)
         {
         if(b[a[i]%97]>0)
         printf("%c%d",a[i],b[a[i]%97]);
         b[a[i]%97]=0;
         
       }
    return 0;
}
