import java.util.Objects;
import java.util.Scanner;

public class ConfigurarJogo {
    public Scanner leitor = new Scanner(System.in);
    public DadosDoJogo dadosDoJogo;

    public ConfigurarJogo(DadosDoJogo dadosDoJogo) {
        this.dadosDoJogo = dadosDoJogo;
    }

    public void configuracao(){

        while (true) {
            System.out.println("\nConfiguração do Jogo");
            System.out.println("======");

            System.out.println(
                    """
                    Escolha uma das opções para ver mais detalhes
                        [1] Item de Ataque
                        [2] Item de Defesa
                        [3] Chefe
                        [4] Fases
                        [5] Monstros
                        [6] Personagens
                    """
            );

            // Opcao:
            System.out.println("Sua opção: ");
            String opcaoEscolhida = leitor.nextLine();

            if (Objects.equals(opcaoEscolhida, "1")) {
                dadosDoJogo.listarAtaque();
            } else if (Objects.equals(opcaoEscolhida, "2")) {
                dadosDoJogo.listarDefesa();
            } else if (Objects.equals(opcaoEscolhida, "3")) {
                dadosDoJogo.listarChefe();
            } else if (Objects.equals(opcaoEscolhida, "4")) {
                dadosDoJogo.listarFases();
            } else if (Objects.equals(opcaoEscolhida, "5")) {
                dadosDoJogo.listarMonstros();
            } else if (Objects.equals(opcaoEscolhida, "6")) {
                dadosDoJogo.listarClasses();
            }

            System.out.println(
                    """
                    Qual operação você deseja executar?
                        [1] Apagar dados
                        [2] Editar dados
                        [3] Listar opções novamente
                        [4] Voltar para o menu iniciar
                    """
            );

            // Opcao:
            System.out.println("Sua opção: ");
            String operacaoEscolhida = leitor.nextLine();

            if (Objects.equals(operacaoEscolhida, "1")) {

                System.out.println("Qual dos items listados você deseja apagar? ");
                int apagarEscolhido = Integer.parseInt(leitor.nextLine());

                if (Objects.equals(opcaoEscolhida, "1")) {
                    dadosDoJogo.getAtaque().remove(apagarEscolhido);
                } else if (Objects.equals(opcaoEscolhida, "2")) {
                    dadosDoJogo.getDefesa().remove(apagarEscolhido);
                } else if (Objects.equals(opcaoEscolhida, "3")) {
                    dadosDoJogo.getChefe().remove(apagarEscolhido);
                } else if (Objects.equals(opcaoEscolhida, "4")) {
                    dadosDoJogo.getFase().remove(apagarEscolhido);
                } else if (Objects.equals(opcaoEscolhida, "5")) {
                    dadosDoJogo.getMonstros().remove(apagarEscolhido);
                } else if (Objects.equals(opcaoEscolhida, "6")) {
                    dadosDoJogo.getClasse().remove(apagarEscolhido);
                }

            } else if (Objects.equals(operacaoEscolhida, "2")) {

                System.out.println("Qual dos items listados você deseja editar? ");
                int editarEscolhido = Integer.parseInt(leitor.nextLine());

                if (Objects.equals(opcaoEscolhida, "1")) {
                    Ataque ataque = dadosDoJogo.getAtaque().get(editarEscolhido);
                    dadosDoJogo.editarAtaque(ataque);
                } else if (Objects.equals(opcaoEscolhida, "2")) {
                    Defesa defesa = dadosDoJogo.getDefesa().get(editarEscolhido);
                    dadosDoJogo.editarDefesa(defesa);
                } else if (Objects.equals(opcaoEscolhida, "3")) {
                    Chefe chefe = dadosDoJogo.getChefe().get(editarEscolhido);
                    dadosDoJogo.editarChefe(chefe);
                } else if (Objects.equals(opcaoEscolhida, "4")) {
                    Fase fase = dadosDoJogo.getFase().get(editarEscolhido);
                    dadosDoJogo.editarFase(fase);
                } else if (Objects.equals(opcaoEscolhida, "5")) {
                    Monstro monstro = dadosDoJogo.getMonstros().get(editarEscolhido);
                    dadosDoJogo.editarMonstro(monstro);
                } else if (Objects.equals(opcaoEscolhida, "6")) {
                    Classe classe = dadosDoJogo.getClasse().get(editarEscolhido);
                    dadosDoJogo.editarClasse(classe);
                }

            } else if (Objects.equals(operacaoEscolhida, "3")){
                continue;
            } else {
                break;
            }
        }
    }
}
