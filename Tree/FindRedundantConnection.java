package tree;

public class FindRedundantConnection {
	public static int find(int x,int[] pre) {
		if(pre[x]==x)return x;
	    return pre[x]=find(pre[x],pre);
	}
	 public static int[] findRedundantConnection(int[][] edges) {
	        
	        int[] pre=new int[10];
	        for(int i=0;i<pre.length;i++)pre[i]=i;//初始化
	        //开始查找
	        int[] res=new int[2];
	        for(int[] edge:edges){//所有放到前驱
	            int a=edge[0],b=edge[1];
	            if(pre[b]==b ){
	                pre[b]=a;
	            }else if(pre[b]!=a) {
	            	int fa=find(a,pre),fb=find(b,pre);
	            	if(fa!=fb)pre[fa]=fb;//前缀不同就合并
	            	else {//前缀相同说明是多余边
	            		res[0]=a;
			            res[1]=b;
	            	}
	            	
	            }else if(pre[b]==a) {
	            	//多余的边
	            	res[0]=a;
		            res[1]=b;
	            }
	            
	        }
	        
	        return res;
	    }
	public static void main(String[] args) {;
		int[][] edges= {{1,4},{3,4},{1,3},{1,2},{4,5}};
		int[] res=findRedundantConnection(edges);
		System.out.print("[");
		System.out.print(res[0]+",");
		System.out.print(res[1]+"]");

	}

}

//优化答案
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] par = new int[n+1];
        for(int i =1;i<=n;i++){
            par[i]=i;
        }
        for(int i=0;i<n;i++){
            int[] edge=edges[i];
            int n1=edge[0],n2=edge[1];
            if(find(par,n1)!=find(par,n2)){
                union(par,n1,n2);
            }else{
                return edge;
            }
        }
        return new int[0];
    }

    public void union(int[] par, int index1, int index2){
        par[find(par,index1)]=find(par,index2);
    }

    public int find(int[] par,int index){
        if(par[index]!=index){
            par[index] = find(par,par[index]);
        }
        return par[index];
    }
}