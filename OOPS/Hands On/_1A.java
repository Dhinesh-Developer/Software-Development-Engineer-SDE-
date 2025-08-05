package Day5_handson;

/*@author DHINESHKUMAR M 
 * Hands on problems
 * */

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _1A {
	static Scanner in = new Scanner(System.in);
	
	private static void program1() {
		System.out.println("Enter the Ticket number");
		int ticket = in.nextInt();
		System.out.println(ticket%10==0?"Group Leader" : "Group Member");
	}
	
	private static void program2() {
		System.out.println("Enter the number");
		int number = in.nextInt();
		for(int i=1;i<=20;i++) {
			if(i!=number) {
				System.out.print(i+" ");
			}
		}
	}
	
	private static void program3() {
		System.out.println("Enter the number");
		int number = in.nextInt();
		for(int i=1;i<=number;i++) {
			if(i%3==0 || i%5==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	private static void program4() {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			int num = in.nextInt();
			if(num==0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
	}
	
	private static void program5() {
		System.out.println("Enter the code");
		int code = in.nextInt();
		
		switch(code) {
		case 1:
			double n1 = in.nextDouble();
			double n2 = in.nextDouble();
			System.out.println(n1+n2);
			break;
		case 2:
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			System.out.println(num1 * num2);
			break;
			
		case 3:
			String s1 = in.next();
			String s2 = in.next();
			System.out.println(s1+s2);
			break;
		}
	}
	
	private static void program6() {
		System.out.println("Enter the N");
		 int N = in.nextInt();
	        for (int i = 2; i <= N; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime)
	                System.out.print(i + " ");
	        }
		}
	
	private static void program9() {
		System.out.println("Enter the number");
		int n = in.nextInt();
		int dup = n;
		int sum = 0;
		while(n > 0) {
			int last = n%10;
			int res = 1;
			for(int i=1;i<=last;i++) {
				res *= i;
			}
			sum += res;
			n = n/10;
		}
		System.out.println(sum==dup?1:0);
	}
	
	private static void program8() {
		System.out.println("enter the car number");
		int lucky = in.nextInt();
		int dup = lucky;
		
		if(lucky < 1000 || lucky >9999) {
			System.out.println(lucky +"  is a not valid car number ");
		}
		int sum=0;
		while(lucky > 0) {
			sum += lucky%10;
			lucky/=10;
		}
		
		if(sum %3==0 || sum %5==0 || sum %7==0) {
			System.out.println(dup +" is a valid car number ");
		}else {
			System.out.println(dup +"  is a not valid car number ");
		}
	}
	
	private static void program10() {
		System.out.println("Enter the number");
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}
	private static void program11() {
		System.out.println("Enter the number");
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	private static void program12() {
		System.out.println("Enter the number");
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i+1);j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

	private static void program13() {
		System.out.println("Enter the Number");
		int n = in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	private static void program14() {
		System.out.println("Enter the number");
		int n = in.nextInt();
		
		int cnt = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println();
		}
	}
	
	private static void program15() {
		System.out.println("Enter the Number");
		int n = in.nextInt();
		
		int start =1;
		for(int i=1;i<=n;i++) {
			if(i%2==1) start = 1;
			else start = 0;
			for(int j=1;j<=i;j++) {
				System.out.print(start+" ");
				start = 1-start;
			}
			System.out.println();
		}
	}
	
	private static void program17() {
		System.out.println("Enter the number");
		String s = in.next();
		Map<Character,Integer> map = new HashMap<>();
		  for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }
		for(Map.Entry<Character, Integer> x : map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
	}
	private static void multipleTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*n);
		}
	}
	private static void program16() {
		System.out.println("Enter the number");
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			multipleTable(i);
			System.out.println();
		}
	}
	
	private static void program18() {
		System.out.println("Enter the Armstrong Number");
		int n = in.nextInt();
		
		  int copy = n;
		    while (copy > 0) {
		        n++;
		        copy /= 10;
		    }

		    int sum = 0;
		    copy = n;
		    while (copy > 0) {
		        int digit = copy % 10;
		        sum += Math.pow(digit, n);
		        copy /= 10;
		    }
		System.out.println(copy==sum);
	}
	
	private static void program19() {
		System.out.println("Enter the 20 numbers");
		int[] ar = new int[20];
		for(int i=1;i<=20;i++) {
			ar[i] = in.nextInt();
		}
		
		int postiveNumber = 0;
		int negativeNumber = 0;
		int oddNumber = 0;
		int evenNumber = 0;
		int zeros = 0;
		
		for(int i=1;i<=20;i++) {
			if(postiveNumber > 0) {
				postiveNumber++;
			}
			else if(negativeNumber > 0) {
				negativeNumber++;
			}
			else if(oddNumber%2== 1) {
				oddNumber++;
			}
			else if(evenNumber %2==0) {
				evenNumber++;
			}else if(zeros == 0) {
				zeros++;
			}
		}
		
		System.out.println(postiveNumber+" "+" "+negativeNumber+" "+oddNumber+" "+evenNumber+" "+zeros);
	}
	
	private static void program20() {
		System.out.println("Enter the Number");
		int size = in.nextInt();
		
		String[] ar = new String[size];
		for(int i=0;i<size;i++) {
			ar[i] = in.next();
		}
		System.out.println();
		System.out.println("Enter the Name");
		String name = in.next();
		int res = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i].equals(name)) {
				System.out.println(i);
			}
		}
		
	}
	
	
	private static void program21() {
		System.out.println("Enter the size");
		int size = in.nextInt();
		
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		
		int target = 10;
		for(int i=1;i<ar.length;i++) {
			if(ar[i]+ar[i-1] == target) {
				System.out.println(ar[i]+" "+ar[i-1]);
			}
		}
		
	}
	
	private static void program29() {
		System.out.println("Enter the String");
		String s = in.next();
		
		String res = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				res = res+ch;
			}
		}
		System.out.println("Contains only alphabets "+res);
	}
	
	private static void program31() {
		System.out.println("Enter the String");
		String s = in.next();
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character x : set) {
			System.out.print(x+" ");
		}
	}
	
	private static void program30() {
		System.out.println("Enter the size");
		int size = in.nextInt();
		
		String[] ar = new String[size];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.next();
		}
		
		Arrays.sort(ar);
		
		for(String x : ar) {
			System.out.print(x+" ");
		}
	}
	
	
	private static void program28() {
		System.out.println("Enter the sentence:");
        String sentence = in.nextLine();

        System.out.println("Enter the word to search:");
        String target = in.next();

        // Split sentence to words and check for match
        String[] words = sentence.split(" ");
        boolean found = false;

        for (String word : words) {
            if (word.equals(target)) {
                found = true;
                break;
            }
        }
		
        if (found) {
            StringBuilder toggled = new StringBuilder();
            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                if (Character.isUpperCase(ch)) {
                    toggled.append(Character.toLowerCase(ch));
                } else if (Character.isLowerCase(ch)) {
                    toggled.append(Character.toUpperCase(ch));
                } else {
                    toggled.append(ch); 
                }
            }
            System.out.println(toggled.toString());
        } else {
            System.out.println("Search String not found");
        }
	}
	
	
	private static void program27() {
		System.out.println("enter the String");
		String s = in.next();
		
		String res = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				res = res + 'z';
			}else {
				res = res + ch;
			}
		}
		System.out.println(res);
	}
	
	
	private static void program26() {
		System.out.println("Enter the String");
		String s = in.next();
		
		if(s.length() <= 1) {
			System.out.println("String Length should be atleast Two");
		}
		
		String t = "";
		int ind = 0;
		for(int i=s.length()-1;i>=0;i--) {
			t = t+s.charAt(i);
			ind++;
			if(ind==2) {
				break;
			}
		}
		
		
		StringBuilder sb = new StringBuilder(t+t+t);
		System.out.println(sb.reverse());
	}
	
	private static void program24() {
		Scanner in = new Scanner(System.in);
		int[] ar = new int[10];
		System.out.println("Enter the Numbers");
		for(int i=0;i<10;i++) {
			ar[i] = in.nextInt();
		}
		
		boolean isAp = true;
		boolean isGp = true;
		
		int diff = ar[1]-ar[0];
		double ratio = (double) ar[1]/ar[2];
		
		for(int i=2;i<ar.length;i++) {
			if(ar[i] - ar[i-1] != diff) {
				isAp = false;
			}
			if(ar[i-1] == 0 || (double) ar[i]/ar[i-1] != ratio) {
				isGp = false;
			}
		}
		
		if(isAp) {
			System.out.println("Arithmetic progresion");
		}
		if(isGp) {
			System.out.println("Geometric Progression");
		}else {
			System.out.println("Random order");
		}
		
	}
	private static void program23() {
		int[] set1 = {2, 4, 7, 11, 16, 22, 29, 37, 46, 56};
        int[] set2 = {1, 5, 9, 10, 13, 18, 19, 22, 25, 28};

        System.out.print("Enter coupon number: ");
        int coupon = in.nextInt();

        boolean inSet1 = false;
        boolean inSet2 = false;

        for (int num : set1) {
            if (num == coupon) {
                inSet1 = true;
                break;
            }
        }

        if (!inSet1) {
            for (int num : set2) {
                if (num == coupon) {
                    inSet2 = true;
                    break;
                }
            }
        }

        if (inSet1) {
            System.out.println("Rs.10000 Cash Prize");
        } else if (inSet2) {
            System.out.println("Tour Tickets for two days");
        } else {
            System.out.println("Better luck next time");
        }
	}
	
	private static void program22() {
		List<Integer> li = new ArrayList<>();
		while(true) {
			int num = in.nextInt();
			if(num < 0) break;
			li.add(num);
		}
		
		List<Integer> modified = new ArrayList<>();
		for(int x : li) {
			int replace = getReplacement(x);
			modified.add(replace);
		}
	}
	private static int getReplacement(int num) {
		int maxRuleValue = -1;
		
        if (num % 2 == 0)
            maxRuleValue = Math.max(maxRuleValue, 0);

        if (num % 2 != 0)
            maxRuleValue = Math.max(maxRuleValue, 1);

        if (num % 8 == 0)
            maxRuleValue = Math.max(maxRuleValue, 2);

        if (num % 10 == 3)
            maxRuleValue = Math.max(maxRuleValue, 3);

        if (num % 9 == 0) 
        	maxRuleValue = Math.max(maxRuleValue, 4);

        return maxRuleValue;
	}

	public static void main(String[] args) {

//		program1(); 
//		program2();
//		program3();
//		program4();
//		program5();
//		program6();
//		program7();
//		program8();
//		program9();
//		program10();
//		program11();
//		program12();
//		program13();
//		program14();
//		program15();
//		program16();
//		program17();
//		program18();
//		program19();
//		program20();
//		program21();
//		program22();
//		program23();
//		program24();
//		program26();
//		program27();
//		program28();
//		program29();
//		program30();
//		program31();
		
	}	
}
