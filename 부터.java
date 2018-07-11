import java.util.*;
class 부터
{
	public static void main(String[] args) 
	{
		for ( int i = 1 ; i<=100 ; i++)
		{
			System.out.printf("%-4d" , i);

			/* printf 를 써야한다.
			 또 "%d" , 변수   이렇게 써서 d앞에 아무것도 없으면 그 변수값에 따라 
			 자리수를 배정하는 것이고
			 %4d 이렇게 되있다면 4자리를 확보하라 이 뜻이다. 
			 또한 %-4d 는 좌측 정렬이고 
			 %+4d 는 우측 정렬이다  보통 우리는 +가 생략된 우측 정렬을 기본으로 사용하고 있다
			 &04d는 변수의 공간이 남는 곳에 0을 집어넣는것을 뜻한다. 
			                   */

			//System.out.print(i + " ");

			if(i%10 ==0)
			{
				System.out.print("\n");
			}
		}
		System.out.print("합합합합");
		
	}
}
