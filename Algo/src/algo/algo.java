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
//	정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 
//	4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라
//	n의 값을 바꿉니다.
	
	class Solution {
	    public int solution(int n, String control) {
	        
	        for(int i = 0; i < control.length(); i++) {
	            String con = control.substring(i, i + 1);
	            
	            if(con.equals("w")) {
	                n += 1;
	            } else if(con.equals("s")) {
	                n -= 1;
	            } else if(con.equals("d")) {
	                n += 10;
	            } else if(con.equals("a")) {
	                n -= 10;
	            }
	        }
	        
	        int answer = n;
	        return answer;
	    }
	}
//	정수 배열 numLog가 주어집니다. 처음에 numLog[0]에서 부터 시작해
//	"w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과
//	같은 조작을 했다고 합시다.
//	"w" : 수에 1을 더한다.
//	"s" : 수에 1을 뺀다.
//	"d" : 수에 10을 더한다.
//	"a" : 수에 10을 뺀다.
//	그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이
//	numLog입니다. 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 
//	가한 결과가 저장되어 있습니다.
//
//	주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을
//	return 하는 solution 함수를 완성해 주세요.
	class Solution {
	    public String solution(int[] numLog) {
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i = 1; i< numLog.length; i++){
	            if ((numLog[i] - numLog[i-1]) == 1) {
	                sb.append("w");
	            } else if ((numLog[i] - numLog[i-1]) == -1){
	                sb.append("s");
	            } else if ((numLog[i] - numLog[i-1]) == 10) {
	                sb.append("d");
	            } else{
	                sb.append("a");
	            }
	        }
	        
	        
	        String answer = sb.toString();
	        return answer;
	    }
	}
	
////	정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만
//	이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를
//			완성해 주세요.
//
//만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

