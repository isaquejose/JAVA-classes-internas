package exercicios;

public class FabricaLampada {

    //classes internas estaticas 
    public static class Incandescente implements Lampada{

            @Override
            public void ligar() {
                System.out.println("A lampada Incandescente esta ligada");
            }

            @Override
            public void desligar() {
                System.out.println("A lampada Incandescente esta desligada");
            }
    }
    public static class Fluorescente implements Lampada{

            @Override
            public void ligar() {
                System.out.println("A lampada Fluorescente esta ligada");
            }

            @Override
            public void desligar() {
                System.out.println("A lampada Fluorescente esta desligada");
            }
    }
    public Lampada construir(String tipo){
            if(tipo == null){
                return null;
            }
            if(tipo.equalsIgnoreCase("Incandescente")){
                return new Incandescente();
            }else{
                if(tipo.equalsIgnoreCase("Fluorescente"))
                    return new Fluorescente();
            }
            throw new IllegalArgumentException("tipo lampada descinhecido " + tipo);
        }
    
    
    //classes locais dentro do metodo construir 
    /*public Lampada construir(String tipo){
        
        class Incadescente implements Lampada{

        @Override
        public void ligar() {
            System.out.println("A lampada esta incadescente ligada");
        }

        @Override
        public void desligar() {
            System.out.println("A lampada esta incadescente desligada");
        }
        
    }
        
        class Fluorescente implements Lampada{

        @Override
        public void ligar() {
            System.out.println("A lampada fluorescente esta ligada");
        }

        @Override
        public void desligar() {
            System.out.println("A lampada fluorescente  esta desligada");
        }
        
    }
        //***retorna o objeto lampada confrome o tipo solicitado 
        if(tipo.equalsIgnoreCase("incadescente")){
            return new Lampada() {
                @Override
                public void ligar() {
                    System.out.println("A lampada esta incadescente ligada");
                }

                @Override
                public void desligar() {
                     System.out.println("A lampada esta incadescente desligada");
                }
            };
        
        }else if (tipo.equalsIgnoreCase("fluorescente")){
            return new Lampada() {
                @Override
                public void ligar() {
                    System.out.println("A lampada fluorescente esta ligada");
                }

                @Override
                public void desligar() {
                    System.out.println("A lampada fluorescente  esta desligada");
                }
            };
        }
        return null;        
    }*/
}
