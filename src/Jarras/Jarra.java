package Jarras;

public class Jarra {
    private int capacidad;
    private int contenido;

    public Jarra(int capacidad){
        if(capacidad <= 0){
            throw new RuntimeException("Error: la capacidad debe ser mayor que 0");
        }
        this.capacidad = capacidad;
        contenido = 0;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public int getContenido(){
        return contenido;
    }

    public void setContenido(int contenido){
        this.contenido = contenido;
    }

    public void llenar(){
        contenido = capacidad;
    }

    public void vaciar(){
        contenido = 0;
    }

    public void llenaDesde(Jarra jarra){
        if(this == jarra){
            throw new RuntimeException("Error: no puedes llenar una jarra con si misma");
        }

        int aire = capacidad - contenido;

        if(jarra.getContenido() <= aire){
            contenido += jarra.getContenido();
            jarra.vaciar();
        }

        if(jarra.getContenido() > aire){
            contenido = capacidad;
            jarra.setContenido(jarra.getContenido() - aire);
        }
        
    }

    public String toString(){
        String cadena= "J(" + getCapacidad() + "," + getContenido() + ")";
        return cadena;
    }
}
