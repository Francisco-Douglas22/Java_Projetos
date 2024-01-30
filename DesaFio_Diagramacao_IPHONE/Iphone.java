// Interface para o reprodutor de música
public interface ReprodutorMusical {
    void tocar(); // Método para iniciar a reprodução de uma música
    void pausar(); // Método para pausar a reprodução de uma música
    void selecionarMusica(String musica); // Método para selecionar uma música específica
}

// Interface para o aparelho telefônico
public interface AparelhoTelefonico {
    void ligar(String numero); // Método para realizar uma ligação para um número específico
    void atender(); // Método para atender uma chamada telefônica
    void iniciarCorreioVoz(); // Método para iniciar o correio de voz
}

// Interface para o navegador de internet
public interface NavegadorInternet {
    void exibirPagina(String url); // Método para exibir uma página da web específica
    void adicionarNovaAba(String url); // Método para adicionar uma nova aba com uma URL específica
    void atualizarPagina(); // Método para atualizar a página da web atual
}

// Classe iPhone que implementa todas as interfaces
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos do ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música..."); // Inicia a reprodução de uma música
    }

    public void pausar() {
        System.out.println("Música pausada."); // Pausa a reprodução de uma música
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica); // Seleciona uma música específica para reprodução
    }

    // Implementação dos métodos do AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero); // Realiza uma ligação para um número específico
    }

    public void atender() {
        System.out.println("Atendendo a chamada..."); // Atende uma chamada telefônica
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz..."); // Inicia o correio de voz
    }

    // Implementação dos métodos do NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url); // Exibe uma página da web específica
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba: " + url); // Adiciona uma nova aba com uma URL específica
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página..."); // Atualiza a página da web atual
    }
}

// Testando a classe iPhone
public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone(); // Cria um novo objeto iPhone

        // Testando o reprodutor de música
        iphone.selecionarMusica("Minha Música Favorita"); // Seleciona "Minha Música Favorita" para reprodução
        iphone.tocar(); // Inicia a reprodução da música selecionada
        iphone.pausar(); // Pausa a reprodução da música

        // Testando o aparelho telefônico
        iphone.ligar("123456789"); // Realiza uma ligação para o número "123456789"
        iphone.atender(); // Atende uma chamada telefônica
        iphone.iniciarCorreioVoz(); // Inicia o correio de voz

        // Testando o navegador de internet
        iphone.exibirPagina("www.google.com"); // Exibe a página da web "www.google.com"
        iphone.adicionarNovaAba("www.bing.com"); // Adiciona uma nova aba com a URL "www.bing.com"
        iphone.atualizarPagina(); // Atualiza a página da web atual
    }
}

