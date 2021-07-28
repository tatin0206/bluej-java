public class Gorila extends Animal
{
    private double longDientePrinc;
    
    
    public void setLongDientePrinc(double longDientePrinc)
    {
        this.longDientePrinc = longDientePrinc;
    }
    
    public double getLongDientePrinc()
    {
        return longDientePrinc;
    }
    
    public Gorila()
    {
        super();
        this.longDientePrinc = 0;
    }
    
    public Gorila (double peso, double altura)
    {
        this.peso = peso;
        this.altura = altura;
    }
    
    public void setAlimsIngeridos( Alimento [] alimsIngeridos)
    {
        this.alimsIngeridos = alimsIngeridos;
    }
    
    public Alimento [] getAlimsIngeridos()
    {
        return alimsIngeridos;
    }
    public double getPesoAlims()
    {   
        double suma = 0;
        for (Alimento sum: alimsIngeridos)
        {
            suma = suma + sum.getGramos();
        }
        return suma;
    }
    
    public double getIMC()
    {
      double IMC = this.peso / (this.altura*this.altura);
      return IMC;
    }
    
    
}