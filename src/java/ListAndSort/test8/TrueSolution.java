package ListAndSort.test8;

/**
 * dfs ,用的是别人的源码
 */
public class TrueSolution {
    public int findCircleNum(int[][] M) {
        /**
         使用一个visited数组, 依次判断每个节点, 如果其未访问, 朋友圈数加1并对该节点进行dfs搜索标记所有访问到的节点
         **/
        boolean[] visited = new boolean[M.length];
        int ret = 0;
        for(int i = 0; i < M.length; ++i) {
            if(!visited[i]) {
                dfs(M, visited, i);
                ret++;
            }
        }
        return ret;
    }

    /**
     * 刚在写一个用例，需要在方法中改变传递的参数的值，可是java中只有传值调用，没有传址调用。所以在java方法中改变参数的值是行不通的。但是可以改变引用变量的属性值。

     可以仔细理解一下下面几句话：

     1、对于基本类型参数，在方法体内对参数进行重新赋值，并不会改变原有变量的值。

     2、对于引用类型参数，在方法体内对参数进行重新赋予引用，并不会改变原有变量所持有的引用。 

     3、方法体内对参数进行运算，不影响原有变量的值。 

     4、方法体内对参数所指向对象的属性进行操作，将改变原有变量所指向对象的属性值。 

     也就是说，对于基本数据类型，实现的是传值，只是个形参，不会改变原有值。对于引用数据类型，对这个引用进行操作，其实也是相当于对形参的操作，不会改变原来的引用。但是，当对这个引用的属性进行操作的时候，相当于CPP中的传址调用，可以改变这个引用的属性的值。
     */

    /**
     * 即参数里有数组或者引用类型的对象时，不改变其地址，但可以改变其指向的值
     * @param m
     * @param visited
     * @param i
     */
    private void dfs(int[][] m, boolean[] visited, int i) {
        for(int j = 0; j < m.length; ++j) {
            if(m[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(m, visited, j);
            }
        }
    }
}
