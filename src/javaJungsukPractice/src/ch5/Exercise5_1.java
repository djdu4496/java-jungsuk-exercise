package ch5;

/*
 * [5-1] 
 * 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명 하시오.
    a. int[] arr[];
    b. int[] arr = {1,2,3,};
    c. int[] arr = new int[5];
    d. int[] arr = new int[5]{1,2,3,4,5};
    e. int arr[5];
    f. int[] arr[] = new int[3][];
 * */
public class Exercise5_1 {

	public static void main(String[] args) {
		;
	}

}

/*
 * 정답
 * d, e
 * d - int[] arr = new int[]{1,2,3,4,5}에서는 대괄호[]안에 배열의 크기를 지정할 수 없다. 
 * 괄호{}안의 데이터의 개수에 따라 자동적으로 결정되기 때문이다.
 * d. int[] arr = new int[]{1,2,3,4,5}; 이게 올바른 코드이다.
 * e - 배열을 선언할 때는 배열의 크기를 지정할 수 없음.
 * e. int arr[];가 맞는 선언이다.
 */
