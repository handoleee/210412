package Day_10_20210412;
import java.util.Scanner;
public class Review_1 {

	public static void main(String[] args) {
		//배열 검색해서 인덱스값과 같이 출력하기
		
		int num[]= {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int array = scan.nextInt();
		
		for(int i=0; i<num.length; i++) {
			if(array == num[i]) {
				System.out.println(array+"는 "+i+"번 인덱스에 있습니다.");
			}
			
		}
	}

}
