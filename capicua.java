package basic;

public class capicua {
    public static void main(String[] args) {
        System.out.println(isCapicua("abanaba"));
    }

    /* El objetivo es crear un contador que cuente las veces en las que un caracter de una cadena coincide con
    el contrario en posición, y si coincide todas las veces, es capicúa, y si falla tan solo una, se descarta
    y devuelve false; */

    public static boolean isCapicua(String cadena1){

        int contador = 0;

        for(int i = 0; i < cadena1.length(); i++){

            if(cadena1.charAt(i) == cadena1.charAt(cadena1.length()-i-1)){

                /* en el caso de que llegué al punto de inflexión, rompe el bucle => no es necesario, 
                esto sirve si te interesa saber el numero EXACTO de coincidencias; */
                if(i == cadena1.length()-i-1){
                    break;
                }

                // el contador aumenta según el número de coincidencias;
                contador++;
            }else{
                
                // en el caso de que solo una letra no coincida, el contador se vuelve 0 y rompe el bucle;
                contador = 0;
                break;
            }
        }

        return contador > 0;
    }


}
