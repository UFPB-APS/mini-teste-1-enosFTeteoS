public class LogicaCusto implements Custo
{
    private String nome;
    private double taxa;
    private final double imposto = 0.05;

    public void seguro(String nome, double taxa)
    {
        this.nome = nome;
        this.taxa = taxa;
    }

    public double calcularCusto(Venda venda)
    {
        return (venda.getTotal() * this.taxa) +
            (venda.getTotal() * this.imposto);
    }
    

    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setTaxa(double taxa)
    {
        this.taxa = taxa;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public double getTAXA()
    {
        return this.taxa;
    }
}
