#include <iostream>

using namespace std;

// Merge function to merge two sorted arrays
void merge(int arr[], int left[], int leftSize, int right[], int rightSize) {
    int i = 0, j = 0, k = 0;
    while (i < leftSize && j < rightSize) {
        if (left[i] <= right[j]) {
            arr[k++] = left[i++];
        } else {
            arr[k++] = right[j++];
        }
    }
    while (i < leftSize) {
        arr[k++] = left[i++];
    }
    while (j < rightSize) {
        arr[k++] = right[j++];
    }
}

// Recursive Merge Sort function to sort the array
void recursiveMergeSort(int arr[], int left, int right) {
    if (left >= right) {
        return;
    }
    int mid = left + (right - left) / 2;
    recursiveMergeSort(arr, left, mid);
    recursiveMergeSort(arr, mid + 1, right);
    int leftArr[mid - left + 1], rightArr[right - mid];
    for (int i = 0; i <= mid - left; i++) {
        leftArr[i] = arr[left + i];
    }
    for (int i = 0; i < right - mid; i++) {
        rightArr[i] = arr[mid + 1 + i];
    }
    merge(arr, leftArr, mid - left + 1, rightArr, right - mid);
}
int main(){
	int t;
	cin >> t;
	int a;
	int inp = 0;
	for(int i = 0 ; i < t;i++){
		cin >> a;
		int vec[a];
		for(int j = 0; j <a;j++){
			cin >> inp;
			vec[j] = inp;
		}
		recursiveMergeSort(vec, 0, a-1);
		

	 
	}
}
