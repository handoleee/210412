package Day_10_20210412;

public class Review_3 {

	public static void main(String[] args) {
		// ArraySort (버블정렬),, 
		int [] num = {3, 2, 1, 5, 4};
		int number=0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
				number=num[i];
				num[i]=num[j];
				num[j]=number;}
			}
		}
		for(int i=0; i<num.length; i++) {
				System.out.println(num[i]);	
			}
		}
	}