package Day_10_20210412;
import java.util.Scanner;
public class Review_2 {
	public static void main(String [] args) {
		// 거스름돈 출력하기
		int [] coin = {500, 100, 50, 10};
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int change = scan.nextInt();
		for(int i=0; i<coin.length; i++) {
			int coinCount = change/coin[i];
			System.out.println(coin[i]+"원 동전 : "+coinCount+"개");
			change=change%coin[i];
		}
	}
}
