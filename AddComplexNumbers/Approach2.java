/**
 *
 * @author shruti.kuvekar
 */
class ComplexNumber{
    private float real;
    private float imaginary;
    
    public ComplexNumber(float real, float imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber addComplexNumber(ComplexNumber c2){
        float real = this.real +c2.real;
        float imaginary = this.imaginary + c2.imaginary;
//        System.out.println(this.real);
//        System.out.println(this.imaginary);
//        System.out.println(real);
//        System.out.println(imaginary);
        return new ComplexNumber(real, imaginary);
    }
    public void showComplexNumber(){
        System.out.println(this.real+" + "+this.imaginary+"i");
    }
}

public class Approach2{
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 6);
        ComplexNumber c2 = new ComplexNumber(7, 9);
        
        ComplexNumber result = c1.addComplexNumber(c2);
        result.showComplexNumber();
    }
}

//output:
run:
10.0 + 15.0i
BUILD SUCCESSFUL (total time: 0 seconds)
