import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public Scanner leitor = new Scanner(System.in);
    public DadosDoJogo dadosDoJogo;

    public Jogo(DadosDoJogo dadosDoJogo) {
        this.dadosDoJogo = dadosDoJogo;
    }

    public void iniciarJogo(){
        System.out.println("================");
        System.out.println("Iniciando Jogo");
        System.out.println("================");

        // Iniciando em uma fase 1
        this.jogarFase(dadosDoJogo.pegarFasePorLevel(1));
    }

    public void jogarFase(Fase fase){
        System.out.println("Bem vindo a fase " + fase.getNome() + " de level " + fase.getLevel());
        System.out.println(fase.getDescricao());
        System.out.println("================");

        System.out.println("Aqui você encontrará " + fase.getMonstros().size() + " monstros");

        while (true) {
            System.out.println("Qual monstro você deseja enfrentar? ");
            int i = 0;
            for (Monstro monstro : fase.getMonstros()) {
                System.out.println(
                                "[" + i + "] " +
                                "\nNome: " + monstro.getNome() +
                                "\nDescricao: " + monstro.getDescricao() +
                                "\nForca: " + monstro.getForca() +
                                "\nSaude: " + monstro.getSaude()
                );
                i++;
            }
            System.out.println("Opção: ");
            int monstroEscolhido = Integer.parseInt(leitor.nextLine());

            if (monstroEscolhido < 0 || (monstroEscolhido > fase.getMonstros().size() - 1)){
                System.out.println("Opção inválida");
                continue;
            }

            Monstro monstro = fase.getMonstros().get(monstroEscolhido);
            this.atacarMonstro(monstro);
            fase.getMonstros().remove(monstro);

            if (fase.getMonstros().size() == 0){
                System.out.println("Parabéns! Você derrotou todos os monstros!!!");
                break;
            }
        }

        this.atacarChefe(fase.getChefe());
        System.out.println("Parabéns! Você derrotou o chefe!!!");
        dadosDoJogo.getJogador().subirDeLevel();
        dadosDoJogo.getJogador().recuperarSaude();
        this.jogarFase(dadosDoJogo.pegarFasePorLevel(dadosDoJogo.getJogador().getLevel()));
    }

    public void atacarMonstro(Monstro monstro){
        int forcaDeAtaqueJogador = dadosDoJogo.getJogador().getPersonagem().getForca();
        int forcaDeAtaqueMonstro = monstro.getForca();

        System.out.println("\n================");
        System.out.println("Monstro escolhido para enfrentar: ");
        System.out.println(
                        "\nNome: " + monstro.getNome() +
                        "\nDescricao: " + monstro.getDescricao() +
                        "\nForca: " + monstro.getForca() +
                        "\nSaude: " + monstro.getSaude()
        );

        // Atacando pela primeira vez
        System.out.println("Assim que você encontrou o monstro, já correu para ataca-lo!!!");
        monstro.tirarVida(forcaDeAtaqueJogador);
        System.out.println("\nO seu ataque causou " + forcaDeAtaqueJogador + " de dano");

        Random gerador = new Random();
        while (monstro.getSaude() > 0){
            int contraGolpe = gerador.nextInt(2);

            if (contraGolpe == 1){
                System.out.println("E com um contragolpe surpresa você foi pego!");
                dadosDoJogo.getJogador().tirarVida(forcaDeAtaqueMonstro);
            } else {
                System.out.println("Essa foi por pouco! O monstro deu um contragolpe, mas você foi capaz de desvia-lo");
            }

            System.out.println("Você agora dispara mais um golpe certeiro");
            monstro.tirarVida(forcaDeAtaqueJogador);
            System.out.println("\nO seu ataque causou " + forcaDeAtaqueJogador + " de dano");
        }

        System.out.println("E com esse golpe você derrotou o monstro!");
        this.droparItens(monstro);
        monstro.apagarDados();
    }

    public void atacarChefe(Chefe chefe){
        int forcaDeAtaqueJogador = dadosDoJogo.getJogador().getPersonagem().getForca();
        int forcaDeAtaqueMonstro = chefe.getForca();

        System.out.println("\n================");
        System.out.println("Chefe escolhido para enfrentar: ");
        System.out.println(
                "\nNome: " + chefe.getNome() +
                "\nDescricao: " + chefe.getDescricao() +
                "\nForca: " + chefe.getForca() +
                "\nSaude: " + chefe.getSaude() +
                "\nLore: " + chefe.getLore()
        );

        // Atacando pela primeira vez
        System.out.println("Assim que você encontrou o chefe, já correu para ataca-lo!!!");
        chefe.tirarVida(forcaDeAtaqueJogador);
        System.out.println("\nO seu ataque causou " + forcaDeAtaqueJogador + " de dano");

        Random gerador = new Random();
        while (chefe.getSaude() > 0){
            int contraGolpe = gerador.nextInt(2);

            if (contraGolpe == 1){
                System.out.println("E com um contragolpe surpresa você foi pego!");
                dadosDoJogo.getJogador().tirarVida(forcaDeAtaqueMonstro);
            } else {
                System.out.println("Essa foi por pouco! O chefe deu um contragolpe, mas você foi capaz de desvia-lo");
            }

            System.out.println("Você agora dispara mais um golpe certeiro");
            chefe.tirarVida(forcaDeAtaqueJogador);
            System.out.println("\nO seu ataque causou " + forcaDeAtaqueJogador + " de dano");
        }

        System.out.println("E com esse golpe você derrotou o monstro!");
        this.droparItens(chefe);
        chefe.apagarDados();
    }

    public void droparItens(Monstro monstro) {
        System.out.println("Após essa vitoria o monstro derrotado dropou alguns itens: ");
        System.out.println(
                "\nVocê deseja pegar algum item? " +
                    "\n[0] Não" +
                    "\n[1] Sim "
        );
        System.out.println("Opção: ");
        int opcao = Integer.parseInt(leitor.nextLine());

        while (opcao == 1) {
                System.out.println("Qual desses itens você deseja pegar?");
                monstro.listarItems();
                System.out.println("Opção: ");
                int itemEscolhido = Integer.parseInt(leitor.nextLine());

                if (itemEscolhido < 0 || (itemEscolhido > monstro.getItems().size() - 1)) {
                    System.out.println("Opção inválida");
                    continue;
                }
                Item item = monstro.getItems().get(itemEscolhido);
                dadosDoJogo.getJogador().getPersonagem().addItem(item);

                System.out.println(
                        "\nVocê deseja pegar algum item? " +
                                "\n[0] Não" +
                                "\n[1] Sim "
                );
                System.out.println("Opção: ");
                opcao = Integer.parseInt(leitor.nextLine());
        }
    }
}
