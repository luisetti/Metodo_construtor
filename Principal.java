public class Principal {
    public static void main(String args){
       
        Carro car = new Carro();
        Carro carAro = new Carro(14);
        Carro carParametros= new
        Carro(14,"HB 20 2021 sense", 60000);
        Carro carQuatroParametros = 
        new Carro(14,"Hb 20 2021 sense", 60000, "branco");

        System.out.println(carAro.getAro());
        System.out.println(carQuatroParametros.getCor());
        System.out.println(carParametros.getValor());
        System.out.println(car);
    }
}
