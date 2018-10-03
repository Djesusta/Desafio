package Desafio;

import mx.com.sintelti.desafios.oporx.Solucion;

public class Problema implements Solucion {
    private String  entrada;
    public Problema(){
        entrada="Desconocida";
        entrada= convertir(entrada);

    }

    @Override
    public String convertir (String entrada) {

        entrada = entrada.replaceAll("o", "x");
       return entrada;

    }


        public String getEntrada () {
            return entrada;

        }
        public void setEntrada (String entrada){
            this.entrada = entrada;
        }


}
