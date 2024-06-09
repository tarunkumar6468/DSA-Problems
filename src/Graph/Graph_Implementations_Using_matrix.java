package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph_Implementations_Using_matrix {
    public static class Graph_Adj{
        public static int[][] crateAdjMatrix(ArrayList<ArrayList<Integer>> graph, int num){
            int [][] adjMatrix = new int[num][num];

            // Fill the adjacency matrix based on the edges in the graph
            for(int i = 0; i<num; i++){
                for(int j = 0; j<num; j++){
                    if(graph.get(i).get(j)==1){
                        adjMatrix[i][j] = 1;
                        adjMatrix[j][i] = 1;
                    }
                }
            }
            return adjMatrix;
        }
    }
    public static void main(String[]args){
        Graph_Adj G = new Graph_Adj();
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();

        graph.add(new ArrayList<>(Arrays.asList(0,1,0,0)));

        graph.add(new ArrayList<>(Arrays.asList(1,0,1,0)));

        graph.add(new ArrayList<>(Arrays.asList(0,1,0,1)));

        graph.add(new ArrayList<>(Arrays.asList(0 ,0,1, 0)));

        int num = graph.size();
        int [][] adjMatrix = G.crateAdjMatrix(graph, num);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(adjMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
