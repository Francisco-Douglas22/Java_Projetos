import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe que representa um processo seletivo e suas etapas.
 */
public class A2_Projeto_ProcessoSeletivo {

    /**
     * Gera um valor aleatório para o salário pretendido entre 1800 e 2200.
     *
     * @return Valor aleatório para o salário pretendido.
     */
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    /**
     * Função principal que executa o processo seletivo.
     *
     * @param args Argumentos da linha de comando (não utilizado).
     */
    public static void main(String[] args) {
        // Caso 1: Avaliação de um candidato
        double salarioBase = 2000.0;
        double salarioPretendido = valorPretendido();

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o Candidato com Contraproposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }

        // Caso 2: Seleção de candidatos
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        for (String candidato : candidatos) {
            double salarioCandidato = valorPretendido();
            if (salarioBase >= salarioCandidato && candidatosSelecionados < 5) {
                System.out.println("Candidato Selecionado: " + candidato);
                candidatosSelecionados++;
            }
        }

        // Caso 3: Exibição da lista de candidatos selecionados
        System.out.println("Lista de Candidatos Selecionados:");

        candidatosSelecionados = 0;
        for (String candidato : candidatos) {
            double salarioCandidato = valorPretendido();
            if (salarioBase >= salarioCandidato && candidatosSelecionados < 5) {
                System.out.println(candidato);
                candidatosSelecionados++;
            }
        }

        // Caso 4: Realização de ligações para os candidatos selecionados
        System.out.println("Realizando Ligações para os Candidatos Selecionados:");
        for (String candidato : candidatos) {
            double salarioCandidato = valorPretendido();
            if (salarioBase >= salarioCandidato && candidatosSelecionados < 5) {
                int tentativas = 0;
                boolean contato = false;

                // Simula a tentativa de ligação com um limite de 3 tentativas
                while (tentativas < 3 && !contato) {
                    contato = simularLigacao(candidato);
                    tentativas++;
                }

                if (contato) {
                    System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + tentativas + " TENTATIVA(S)");
                } else {
                    System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato);
                }

                candidatosSelecionados++;
            }
        }
    }

    /**
     * Simula a tentativa de ligação para um candidato.
     *
     * @param candidato Nome do candidato.
     * @return Verdadeiro se o contato foi estabelecido, falso caso contrário.
     */
    static boolean simularLigacao(String candidato) {
        // Simula a tentativa de ligação
        return ThreadLocalRandom.current().nextBoolean();
    }
}
