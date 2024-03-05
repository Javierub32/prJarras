package Jarras;

public class Mesa {
    private Jarra jarra1;
    private Jarra jarra2;

    public Mesa(Jarra jarra1, Jarra jarra2){
        if(jarra1 == jarra2){
            throw new RuntimeException("Error: las jarras no pueden ser iguales");
        }
        this.jarra1 = jarra1;
        this.jarra2 = jarra2;    
    }

    public Mesa(int capacidad1, int capacidad2){
        this.jarra1 = new Jarra(capacidad1);
        this.jarra2 = new Jarra(capacidad2);
    }

    public int getContenido(int pos){
        if(pos == 1){
            return jarra1.getContenido();
        }
        if(pos == 2){
            return jarra2.getContenido();
        }
        throw new RuntimeException("Error: posición no válida");
    }

    public int getCapacidad(int pos){
        if(pos == 1){
            return jarra1.getCapacidad();
        }
        if(pos == 2){
            return jarra2.getCapacidad();
        }
        throw new RuntimeException("Error: posición no válida");
    }

    public void llenar(int pos){
        if(pos == 1){
            jarra1.llenar();
        }
        if(pos == 2){
            jarra2.llenar();
        }
        if(pos != 1 && pos != 2){
            throw new RuntimeException("Error: posición no válida");
        }
    }

    public void vaciar(int pos){
        if(pos == 1){
            jarra1.vaciar();
        }
        if(pos == 2){
            jarra2.vaciar();
        }
        if(pos != 1 && pos != 2){
            throw new RuntimeException("Error: posición no válida");
        }
    }

    public void llenaDesde(int pos1, int pos2){
        if(pos1 == 1 && pos2 == 2){
            jarra1.llenaDesde(jarra2);
        }
        if(pos1 == 2 && pos2 == 1){
            jarra2.llenaDesde(jarra1);
        }
        if(pos1 == pos2){
            throw new RuntimeException("Error: no puedes llenar una jarra con si misma");
        }
        if(pos1 != 1 && pos1 != 2){
            throw new RuntimeException("Error: posición no válida");
        }
        if(pos2 != 1 && pos2 != 2){
            throw new RuntimeException("Error: posición no válida");
        }
    }

    public String toString(){
        String cadena = "M(" + jarra1 + "," + jarra2 + ")";
        return cadena;
    }
}
