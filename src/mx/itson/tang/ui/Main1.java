
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 * Nos ayuda a aseoarar y contar los numeros de cada region.
 * @author Jose Abelardo Reyes Galaz
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese los nuemeros de telefono: ");
        Scanner leer = new Scanner (System.in);
        
        String telefonos = leer.nextLine();
        
        //66-462-71-880,(664) 973 6631,664-473-57-64,664-328-8160 ,(664)95 570 89,(66)21 02 40 39,6649103647,664 899 53 53,(664)3042220,664-7514440,62 27266011,(662)7805272,3641284215,664-839-23-17,(66)414-87-576,6645677339,6221306978,333 698 7520,(664)8216081,6647766719,(662)1053790,6225703933,664 2892482,66 43143975,6646097012,6637809908, (664)8216081,6642768587,6647685767,(66)414-87-576,66 44666998,6641528281,6627053684,(662)1836543,662251-71-34,662 16 18 228,6625875393,(662)8789468,6624255192,(622) 178 9630,66 21 76 63 48,(66) 22-51- 71-34,(66)21 02 40 39,6622047144,6624371045,(622)8409539,6629307931,664 3942040,(664) 839 23 17,6646271880,664 2249512,(664)4315536,6646273721,6649103647, (664)6817442,662 2955871,6628364751,6321851302,622 896 32-00,(680) 896 30-15,6627022237,66-217-15-935,66 25983408,6621362934,66-288-083-40,6625655793, (662)947 5546,(66)21485032,(564)8392317,664-985-1864, (66)23779306
        
        String numero = telefonos.replace("(", "").replace(")", "").replace(" ", "").replace("-", "");
        
        System.out.println("");
        
        /**
         * contador de numeros de Tijuana.
         */
        int Tijuana = 0; 
        
        /**
         * Contador de numeros de Guaymas
         */
        int Guaymas = 0; 
        
        /**
         * Contador de numeros de Hermosillo
         */
        int Hermosillo = 0; 
        
        /**
         * Contador de numeros no identificados.
         */
        int Desconocido = 0; 
        
        
        
        /**
         * Separa los numero telefonicos.
         */
        String[] numero2 = numero.split(","); 
        
        /**
         * Si el numero coincide suma uno al contadro de Tijuana.
         */
        for (String t : numero2){ 
            if(t.startsWith("664")){
                Tijuana++;
                
            }else 
                /**
                 * Si el numero coincide suma uno al contadro de Tijuana.
                 */
                if (t.startsWith("622")){ 
                    Guaymas++;
                    }else 
                    /**
                     * Si el numero coincide suma uno al contadro de Hermosillo.
                     */
                    if (t.startsWith("662")){
                    Hermosillo++;
                    } else{
                        /**
                         * Si el numero no coincide en ninguno suma uno al contadro de Desconocido.
                         */
                        
                        Desconocido++;
                    }
            
        }
        
        /**
         * Imprime los valores totales.
         */
        System.out.println("Sen encontraron..."); 
        System.out.println("Tijuana: "+Tijuana);
        System.out.println("Guaymas: "+Guaymas);
        System.out.println("Hermosillo: "+Hermosillo);
        
        System.out.println("Y "+Desconocido+" no pudieron ser identificados");
        
        
        
    }
    
}
