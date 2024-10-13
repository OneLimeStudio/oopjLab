#include <stdio.h>
#include <stdlib.h>

int *insert(int * arr ,int pos, int element,int n){
    if(pos >= n || pos < 0){
        
	    return arr;
    }

    arr = realloc(arr,(n)*sizeof(int) );

    for(int i = n -1; i > pos; i--){
        arr[i] = arr[i-1];
    }
    arr[pos] = element;
    return arr;

}
void delete(int **arr, int *rows,int x,int y){
	for(int i = y; i <  rows[x] ; i ++){
		arr[x][i] = arr[x][i+1];
    }
	arr[x] = realloc(arr[x] ,--rows[x]);

}

int main(){
    int **arr = malloc(sizeof(int *)*3);
    int rows[3] = {2,3,2};
    arr[1] = malloc(sizeof(int)* 3);
    arr[1][0] = 1;
    arr[1][1] = 2;
    arr[1][2] = 3;


    delete(arr,rows, 1,1);
    for(int i = 0; i < rows[1]; i++){
        printf("%d", arr[1][i]);
    }
}