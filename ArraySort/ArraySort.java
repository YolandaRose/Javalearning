package arraysort;

public class ArraySort {
	private  int sim[];
	public ArraySort(int []sim) {
		this.sim=sim;
	}
	
	
	public void setOrder() {
		int temp, j;
		//冒泡排序
			for (j= 0; j <= 4; j++) {
				if (sim[j] > sim[j + 1]) {
					temp = sim[j + 1];
					sim[j+1] = sim[j];
					sim[j] = temp;
				}
			}
			for (j= 0; j <= 5; j++) {
			System.out.print(sim[j]+" ");
		}
	}
}
