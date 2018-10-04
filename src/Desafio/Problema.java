package Desafio;

import mx.com.sintelti.desafios.oporx.Solucion;

public class Problema implements Solucion {
    private String  entrada;

    public  Problema(){
        //entrada="Desconocida";
        entrada= convertir(entrada);

    }


    @Override
    public String convertir (String entrada) {
         // entrada = entrada.replaceAll("o", "x");
        char[] cadenaPrincipal = entrada.toCharArray();
        String remplazarX= "";
        String salida = "";
        int contador = 0;
        int indexInicio = 0;
        int indexFin = 0;

        for (int i = 0; i< entrada.length(); i++){
            if (cadenaPrincipal[i] == 'o' ){
                contador++;
                remplazarX = Remplazar(contador);
                //System.out.println(i);
                indexFin = i;
                salida = salida+entrada.substring(indexInicio, indexFin)+remplazarX;
                indexInicio= i+1;
                //System.out.println(salida);
            }
        }

        return salida;



    }
    private String Remplazar(int contador){
        String nuevaCadena="";
        for (int i = 0; i<contador; i++){
            nuevaCadena=nuevaCadena + "x"; // reemplazar la o por la x
        }
        return  (nuevaCadena);
    }


        public String getEntrada () {
            return entrada;

        }
        public void setEntrada (String entrada){
            this.entrada = entrada;
        }




}
