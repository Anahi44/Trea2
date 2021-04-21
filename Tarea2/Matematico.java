
/**
 * Write a description of class Matematico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematico
{
    private Robot indicador;
    private Cuadrado area;
    private Ubicador cuadrante;
    private Calculador distancia;
    public Matematico(Robot i, Cuadrado a, Ubicador c, Calculador d){
        indicador = i;
        area = a;
        cuadrante = c;
        distancia = d;
    }

}
