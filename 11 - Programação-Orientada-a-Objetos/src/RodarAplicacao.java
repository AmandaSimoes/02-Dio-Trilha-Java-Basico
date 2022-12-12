class RodarAplicacao {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.settanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getmodelo());
        System.out.println(carro1.gettanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro( );

        System.out.println(carro2.getCor());
        System.out.println(carro2.getmodelo());
        System.out.println(carro2.gettanque());
        System.out.println(carro2.totalValorTanque(6.39));



    }
    
}
