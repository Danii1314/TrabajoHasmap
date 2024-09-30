import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

     //Creacion de Jugadores :))
     Jugador portero= new Jugador(1,"David Ospina","Atletico Nacional");
     Jugador DefensaCentral= new Jugador(3,"Mario Yepes","Atlanta");
     Jugador LateralDerecho= new Jugador(12," Daniel Muñoz","l Crystal Palace F. C");
     Jugador LateralIzquierdo= new Jugador(22,"Johan Mojica","Real Club Deportivo Mallorca");
     Jugador MedioCentroOfensivo= new Jugador(10,"James Rodriguez","Rayo Vallecano");
     Jugador MedioCentro= new Jugador(6,"Richard Ríos","SE Palmeiras");
     Jugador ExtremoIzquierdo= new Jugador(7,"Luis Dias","Liverpool FC");
     Jugador ExtremoDerecho= new Jugador(11,"Jhon Arias","Fluminense Football Club");
     Jugador DelanteroCentral= new Jugador(9,"Miguel Borja","CA River Plate");
     Jugador Pivote= new Jugador(88," Mateus Uribe","Al-Sadd SC");
     Jugador Delantero= new Jugador(19,"Rafael Borre","Sport Club Internacional");
     Jugador Delantero2= new Jugador(18,"Daniel","millonarios");

       //HashMap
          Map<Integer,String>MapaEquipo=new HashMap<>();
          MapaEquipo.put(1, "Portero"+portero+"\n");
          MapaEquipo.put(2, "Defensa"+DefensaCentral+"\n");
          MapaEquipo.put(3, "Lateral Derecho"+LateralDerecho+"\n");
          MapaEquipo.put(4, "Lateral Izquierdo"+LateralIzquierdo+"\n");
          MapaEquipo.put(5, "Medio Centro Ofensivo"+MedioCentroOfensivo+"\n");
          MapaEquipo.put(6,"Medio Centro"+MedioCentro+"\n");
          MapaEquipo.put(7,"Extremo Izquierdo"+ExtremoIzquierdo+"\n");
          MapaEquipo.put(8,"Extremo Derecho"+ExtremoDerecho+"\n");
          MapaEquipo.put(9,"Delantero Central"+DelanteroCentral+"\n");
          MapaEquipo.put(10,"Pivote"+Pivote+"\n");
          MapaEquipo.put(11,"Delantero"+Delantero+"\n");
          System.out.println(MapaEquipo.values());
    }
}