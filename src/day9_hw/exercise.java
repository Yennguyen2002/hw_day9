package day9_hw;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		int array[] = { 1, 2, -3, -4, 5, 6, 7, 3, 9, 10 };
		// 1 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		int countX = countX(array, x);
		System.out.println("The number " + x + " appears " + countX + " times in the array");
		// 2
		int count = countPrimeArrays(array);
		System.out.println("Total Prime: " + count);
		// 3
		sortAsc(array);
		System.out.println("Sort Ascending: " + array);
		//6
		chiaHetcho3(array, 10);
		System.out.println("Chia het cho 3: " + array);
		// 8
		int x1 = sc.nextInt();
		int k = 0;
		InsertX(array, x1, k);
		//11 
		int x2 = sc.nextInt();
		int delete = DeleteX(array, x2);
		//13
		int x3 = sc.nextInt();
		Average(array, x3);

	}
	//1
	public static boolean isPrime(int n)
	{
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3;i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}


	public static int countX(int[] array, int x)
	{
		int countX = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				countX++;
			}
		}
		return countX;
	}
	//2

	public static int countPrimeArrays(int[] array) 
	{
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i])) {
				count++;
			}
		}
		return count;
	}

	//3
	public static void sortAsc(int [] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void sortOdd(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] % 2 != 0 && array[j] % 2 != 0) {
					if (array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
	}

	//8

	public static void InsertX(int [] array,int x1, int k)
	{
		for(int i = 0; i < array.length; i++)
		array[i] = array[i-1];
		array[k] = x1;
	}

	//11 

	public static int DeleteX(int [] array, int x1)
	{
		int count =0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == x1)
			{
				for(int j = i; j < array.length-1; j++)
				{
					array[j] = array[j+1];
				}
				count ++;
				
			}
		}
		if(count == 0)
			return -1;
		else
			return count;
	}

	//13
	public static float Average(int [] array, int x3)
	{
		int sum = 0;
		int count = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
			count++;
		}
		if (count == 0)
		{
			System.out.println("No number in the array");
		}
		return sum/count;		
	}

	// 6 

	public static void swapIndex(int [] array, int x)
	{
		int temp = array[x];
		for(int i = x; i > 0; i--)
		{
			array[i] = array[i-1];
		}
		array[0] = temp;
	}

	public static void chiaHetcho3(int[] array, int x)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] % 3 == 0)
			{
				swapIndex(array,i);
			}
		}
	}
}
