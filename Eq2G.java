
/**
 * Escreva a descrição da classe Eq2G aqui.
 * 
 * @author (Breno G. do Amaral, Gabrielle S. Ramos, Victor B. Bulhões) 
 * @version (1.0 beta)
 */
public class Eq2G
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    protected double a;
    protected double b;
    protected double c;
    protected double Delta;
    protected double x1;
    protected double x2;

    /**
     * Construtor para objetos da classe Eq2G
     */
    public Eq2G()
    {
        setA(a);
        setB(b);
        setC(c);
    }
    
    // A
    protected void setA(double a){
        this.a = a;
    }
    protected double getA(){
        return this.a;
    }
    
    // B
    protected void setB(double b){
        this.b = b;
    }
    protected double getB(){
        return this.b;
    }
    
    //C
    protected void setC(double c){
        this.c = c;
    }
    protected double getC(){
        return this.c;
    }
    
    
    private double calcDelta(double a, double b,double c){
        return Math.sqrt(getB() * getB() - 4 * getA() * getC());
    }
}
