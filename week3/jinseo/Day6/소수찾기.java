package week3.jinseo.Day6;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {

    class Solution {

        Set<Integer> set = new HashSet<>();

        public int solution(String numbers) {

            char[] nums = numbers.toCharArray();

            dfs(nums, new boolean[nums.length], "");

            int count = 0;

            for(int num : set){
                if(isPrime(num)){
                    count++;
                }
            }
            return count;
        }

        void dfs(char[] nums, boolean[] visited, String cur){

            if(!cur.isEmpty()){
                set.add(Integer.parseInt(cur));
            }

            for(int i = 0; i < nums.length; i++){

                if(!visited[i]){

                    visited[i] = true;

                    dfs(nums, visited, cur + nums[i]);

                    visited[i] = false;
                }
            }
        }

        boolean isPrime(int n){

            if(n < 2){
                return false;
            }
            for(int i = 2 ; i*i <= n; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}