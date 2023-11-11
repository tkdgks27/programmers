package algo;
public class algo {
	public static void main(String[] args) {
//		정수가 담긴 리스트 num_list가 주어집니다. 
//		num_list의 홀수만 순서대로 이어 붙인 수와 
//		짝수만 순서대로 이어 붙인 수의 합을 return하도록
//		solution 함수를 완성해주세요.
		class Solution {
		    public int solution(int[] num_list) {
		        StringBuilder sb = new StringBuilder();
		        StringBuilder s = new StringBuilder();
		        for(int i : num_list){
		            if(i % 2 != 0){
		                sb.append(i);
		            }else{
		                s.append(i);
		            }
		            
		        }
		        int a = Integer.parseInt(sb.toString());
		        int b = Integer.parseInt(s.toString());
		        int answer = a+b;
		        return answer;
		    }
		}
	}
	
//	정수 리스트 num_list가 주어질 때, 마지막 원소가
//	그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀
//	값을 마지막 원소가 그전 원소보다 크지 않다면 마지막
//	원소를 두 배한 값을 추가하여 return하도록 solution 함수를
//	완성해주세요.
	import java.util.ArrayList;

	class Solution {
	    public int[] solution(int[] num_list) {
	        ArrayList<Integer> answer = new ArrayList<>();
	        for (int i = 0; i<num_list.length; i++){
	            answer.add(num_list[i]);
	        }
	        
	        if(num_list[num_list.length-1]>num_list[num_list.length-2]){
	            answer.add((num_list[num_list.length-1] - num_list[num_list.length-2]));
	        }else{
	            answer.add((num_list[num_list.length-1]*2));
	        }
	        
	        return answer.stream().mapToInt(Integer::intValue).toArray();
	    }
	}
	
	
	
}
