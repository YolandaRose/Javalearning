package tree;

public class FindRedundantDirectedConnection {
	 
	public static void main(String[] args) {
		int[][] edges= {{2,1},{3,1},{4,2},{1,4}};
		Solution_4 s = new Solution_4();
		int[] res=s.findRedundantDirectedConnection(edges);
		System.out.print("[");
		System.out.print(res[0]+",");
		System.out.print(res[1]+"]");

	}

}
class Solution_4 {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n=edges.length;
        UnionFind uf = new UnionFind(n+1);
        int[] pre = new int[n+1];
        for(int i=1;i<=n;i++){
            pre[i]=i;
        }
        //有两种矛盾情况
        int conflict = -1;//有冲突但无环，附加边不构成环
        int cycle = -1;//附加边构成环

        for(int i=0;i<n;i++){
            int[] edge = edges[i];
            int n1=edge[0],n2=edge[1];
            if(pre[n2]!=n2){
                //n2已经有parent了，有冲突
                conflict=i;
            }else{
                pre[n2]=n1;
                if(uf.find(n1) == uf.find(n2)){//出现环
                    cycle=i;
                }else{
                    uf.union(n1,n2);
                }
            }
        }

        if(conflict<0){
            int[] red = {edges[cycle][0],edges[cycle][1]};
            return red;
        }else{
            int[] conflictEdge = edges[conflict];
            if(cycle >= 0){
                int[] red = {pre[conflictEdge[1]],conflictEdge[1]};
                return red;
            }else{
                int [] red = {conflictEdge[0],conflictEdge[1]};
                return red;
            }
        }
    }
}
class UnionFind{
    int[] ances;

    public UnionFind(int n){
        ances = new int[n];
        for(int i=0;i<n;i++){
            ances[i]=i;
        }
    }

    public void union(int index1, int index2){
        ances[find(index1)]=find(index2);
    }

    public int find(int index){
        if(ances[index] !=index){
            ances[index] = find(ances[index]);
        }
        return ances[index];
    }
}