package day1.Ch03.Ex03_7;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        class Edge {
            int endNode;
            int value;

            Edge(int endNode, int value) {
                this.endNode = endNode;
                this.value = value;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Edge>[] list = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list[s].add(new Edge(e, v));
        }
    }
}