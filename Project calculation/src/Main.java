import java.util.Scanner;

//Please don't change class name 'Main'

class Calculator{
    int left, right;
    Double left2, right2;
    
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void setOprands2(Double left2, Double right2){
        this.left2 = left2;
        this.right2 = right2;
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void sub(){
        System.out.println(this.left-this.right);
    }
    public void multi(){
        System.out.println(this.left*this.right);
    }
    public void division(){
        System.out.println(this.left2/this.right2);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

class Main {

    public static void main(String[] args) {
    	while(true) {
    		String plus = "+";
    		String subtrack = "-";
    		String multi = "*";
    		String division = "/";
    		
    		String operation = null;
    		
			System.out.println("연산자를 입력하세요(+,-,*,/)");
			Scanner oper = new Scanner(System.in);
			operation = oper.nextLine();
	    	
	    	
	    		if(operation.equals(plus)) {
			    	System.out.println("숫자" + "+" +"숫자");
			    	Scanner sc = new Scanner(System.in);
				    int i = sc.nextInt();
				    int j = sc.nextInt();
				    //sc.close();
			    	  
			        Calculator c1 = new Calculator();
			        c1.setOprands(i, j);
			        c1.sum();

	    		}
	    		else if(operation.equals(subtrack)){
	    			System.out.println("숫자" + "-" + "숫자");
	    			Scanner sc = new Scanner(System.in);
				    int i = sc.nextInt();
				    int j = sc.nextInt();
				    //sc.close();
			    	  
			        Calculator c1 = new Calculator();
			        c1.setOprands(i, j);
			        c1.sub();

	    		}
	    		else if(operation.equals(multi)){
	    			System.out.println("숫자" + "*" + "숫자");
	    			Scanner sc = new Scanner(System.in);
				    int i = sc.nextInt();
				    int j = sc.nextInt();
				    //sc.close();
			    	  
			        Calculator c1 = new Calculator();
			        c1.setOprands(i, j);
			        c1.multi();

	    		}
	    		else if(operation.equals(division)){
	    			System.out.println("숫자" + "/" + "숫자");
	    			Scanner sc = new Scanner(System.in);
				    Double i2 = sc.nextDouble();
				    Double j2 = sc.nextDouble();
				    //sc.close();
			    	  
			        Calculator c1 = new Calculator();
			        c1.setOprands2(i2, j2);
			        c1.division();

	    		}
	    		
        }  
    }
}
