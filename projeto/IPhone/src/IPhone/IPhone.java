package IPhone;
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, AcessoInternet {
    
	private String modelo;
    private String numero;
    private boolean conectadoInternet;
    private String musicaAtual;

    public IPhone(String modelo, String numero) {
        
    	this.modelo = modelo;
        this.numero = numero;
        this.conectadoInternet = false;
        this.musicaAtual = "";
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        
    	System.out.println("Reproduzindo: " + musicaAtual);
    }

    @Override
    public void pausar() {
        
    	System.out.println("Música pausada");
    }

    @Override
    public void parar() {
        
    	System.out.println("Reprodução parada");
    }

    @Override
    public void selecionarMusica(String musica) {
        
    	this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void fazerLigacao(String numero) {
      
    	System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atenderLigacao() {
       
    	System.out.println("Atendendo ligação");
    }

    @Override
    public void desligar() {
       
    	System.out.println("Ligação encerrada");
    }

    // Métodos de AcessoInternet
    @Override
    public void conectar() {
      
    	conectadoInternet = true;
        System.out.println("Conectado à internet");
    }

    @Override
    public void desconectar() {
        
    	conectadoInternet = false;
        System.out.println("Desconectado da internet");
    }

    @Override
    public void navegar(String site) {
     
    	if (conectadoInternet) {
            System.out.println("Navegando no site: " + site);
        } else {
            System.out.println("Por favor, conecte-se à internet primeiro");
        }
    }
}

