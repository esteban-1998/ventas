import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        metodos m=new metodos();
        int o;
        System.out.println("digite el numero de vendedores:");
        o=sc.nextInt();
        o=o+1;
        objventas[][] Matris= new objventas[o][14];
        
        Matris[0][0]=new objventas("nombre de vendedor",00);
        Matris[0][1]=new objventas("ENERO",00);
        Matris[0][2]=new objventas("FEBRERO",00);
        Matris[0][3]=new objventas("MARZO",00);
        Matris[0][4]=new objventas("ABRIL",00);
        Matris[0][5]=new objventas("MAYO",00);
        Matris[0][6]=new objventas("JUNIO",00);
        Matris[0][7]=new objventas("JULIO",00);
        Matris[0][8]=new objventas("AGOSTO",00);
        Matris[0][9]=new objventas("SEPTIEMBRE",00);
        Matris[0][10]=new objventas("OCTUBRE",00);
        Matris[0][11]=new objventas("NOVIEMBRE",00);
        Matris[0][12]=new objventas("DICIEMBRE",00);
        Matris[0][13]=new objventas("TOTAL",00);
        
        Matris= m.registro(Matris,o);


    }
    
}
