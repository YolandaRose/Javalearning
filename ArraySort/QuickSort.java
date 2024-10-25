package arraysort;

public class QuickSort {
	//快速排序主方法，传入数组、最小索引、最大索引
	public static void quickSort(int[] arr,int low,int high) {
		//如果低索引小于高索引，说明数组还没排完
		if(low<high) {
			//找到基准元素位置，并把数组分成两部分
			int keyIndex=partition(arr,low,high);
			
			//递归地对基准左边部分快速排序
			quickSort(arr,low,keyIndex-1);
			//递归地对基准右边部分快速排序
			quickSort(arr,keyIndex+1,high);
		}
	}
	
	//分区方法：选择一个基准值，把小于基准的放左边，大于基准的放右边
	private static int partition(int[] arr,int low,int high) {
		//选择最右边的元素作为基准
		int key=arr[high];
		
		//i用来追踪小于基准值的元素位置
		int i=low-1;
		//遍历数组，找到所有小于基准值的元素
		for(int j=low;j<high;j++) {
			//当前元素小于等于基准值
			if(arr[j]<=key) {
				i++;//准备交换小元素位置
				
				//交换arr[i]和arr[j],把小元素放前面
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
		
		//最后，把基准值放到正确的位置（中间）
		int tmp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=tmp;
		
		//返回基准值位置
		return i+1;
	}
	
	public static void main(String[] args) {
		int[] arr= {8,3,5,1,9,6};
		
		System.out.println("排序前：");
		printArray(arr);
		
		//快速排序
		quickSort(arr,0,arr.length-1);
		
		System.out.println("排序后：");
		printArray(arr);

	}
	
	private static void printArray(int[] arr) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
