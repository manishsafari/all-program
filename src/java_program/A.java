package java_program;

public class A {
        
        public void print(){
            System.out.println("inside A->print()");
        }
    }
    
    class B extends A{
    
        public void print(){
            System.out.println("inside B->print()");
        }
        
        public static void main(String args[]){
        
            A obj = new B();
            obj.print();
        
        }
    
    }
	
	
	

	


