package mapa.cuadro;
import graficos.Pantalla;
import graficos.sprites;
public abstract class cuadro {
    public int x;
    public int y;
    public sprites sprite;
    //coleccion de cuadros alv compa
    public static final cuadro roca = new cuadroAsfalto(sprites.roca);
    //ya son todos compa, depositame un bit coin porfas
    public cuadro(sprites sprite){
        this.sprite = sprite;
    }
    public void mostrar(int x, int y, Pantalla pantallax){       
    }
    public boolean solido(){
        return false;
    }
}
