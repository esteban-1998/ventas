import java.util.Scanner;

public class metodos {
    public objventas[][] registro(objventas[][] m,int o){
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i < o; i++) {
            for (int j = 0; j < 13; j++) {
                objventas v=new objventas();

                if (j==0) {
                    System.out.println("ingrese el nombre el verdedor:");
                    v.setNombre(sc.next());
                    System.out.println("ingrese id del vendedor:");
                    v.setValor(sc.nextDouble());
                    m[i][j]=v;
                   
                }
                else{
                    System.out.println("ingrese el nombre de la venta");
                v.setNombre(sc.next());
                System.out.println("ingrese el valor de la venta");
                v.setValor(sc.nextDouble());
                m[i][j]=v;}

            }
            
        }
        
Suma(m, o);
return m;
    }
    public objventas[][] Suma(objventas[][] m, int o){
        double suma= 0;
        for (int i = 1; i < o; i++) {
            for (int j = 1; j < 13; j++) {
                suma = suma + m[i][j].getValor();

                
            }
            objventas ob = new objventas();
            ob.setValor(suma);
            ob.setNombre(m[i][0].getNombre());
            m[i][13] = ob;
          

        }
        orden(m, o);
        return m;
    }
    public static void orden(objventas[][] m, int o) {
        objventas mayor = m[1][13];
        for (int i = 2; i < o; i++) {
            if (mayor.getValor() < m[i][13].getValor()) {
                mayor= m[i][13];
                
            }

            
        }
       
        System.out.println("el vendedor del año fue:" + mayor.getNombre() +"con una valor total de:"+ mayor.getValor());
         
        
    }
    
}
