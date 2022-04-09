import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("BEM VINDO AO POO GAME");
        System.out.println(
                """
                Desenvolvedores:
                    Jasmini Rebecca Gomes dos Santos
                    Lucas Fernando Assun��o Cavalherie
                """
        );

        // Iniciar Objetos
        DadosDoJogo dadosDoJogo = iniciarObjetos();
        // Cadastrar Jogador
        Jogador jogador = cadastrarJogador(dadosDoJogo);
        dadosDoJogo.setJogador(jogador);

        // Menu
        Scanner leitor = new Scanner(System.in);
        while (true){
            System.out.println("\nMenu");
            System.out.println("======");
            System.out.println(
                    """
                        O que você deseja fazer?
                            [1] Configurar Dados do Jogo
                            [2] Mostrar Dados do Jogador
                            [3] Iniciar Jogo
                            [4] Sair
                    """
            );

            // Opcao:
            System.out.println("Sua opção: ");
            String opcao = leitor.nextLine();

            if (Objects.equals(opcao, "1")) {
                new ConfigurarJogo(dadosDoJogo).configuracao();
            } else if (Objects.equals(opcao, "2")) {
                dadosDoJogo.getJogador().mostrarDados();
            } else if (Objects.equals(opcao, "3")) {
                new Jogo(dadosDoJogo).iniciarJogo();
            } else if (Objects.equals(opcao, "4")) {
                break;
            } else {
                System.out.println("Opção Inválida");
            }
        }
    }

    public static DadosDoJogo iniciarObjetos(){

        // Aqui iniciaremos todos as classes com valores padrões
        // O jogador pode editar ou apagar futuramente qualquer uma delas, caso deseje


        // ITEM DE DEFESA
        Defesa armaduraDeFerro = new Defesa("Armadura de Ferro", "A Armadura de Ferro é a prova de balas e quase inquebrável.", 150);
        Defesa exoesqueleto = new Defesa("Exoesqueleto", "O Exoesqueleto é capaz de proteger o seu usuario de diversos tipos de ataques.", 100);
        Defesa colete = new Defesa("Colete", "O Colete é feito de lã e protege o seu usuario do frio de Curitiba.", 50);
        Defesa mantoMagico = new Defesa("Manto Magico", "O Manto Mágico concede habilidades misticas ao seu usuario.", 50);
        // Todos os items de defesa
        ArrayList<Defesa> defesas = new ArrayList<>();
        defesas.add(armaduraDeFerro);
        defesas.add(exoesqueleto);
        defesas.add(colete);
        defesas.add(mantoMagico);


        // ITEM DE ATAQUE
        Ataque bazuca = new Ataque("Bazuca", "A Bazuca explode os monstros em pedacinhos.", 200);
        Ataque pistola = new Ataque("Pistola", "A Pistola possui munição limitada, mas é capaz de dar muito dano.", 100);
        Ataque adaga = new Ataque("Adaga", "A Adaga é capaz de ferir os monstros, mas somente a curta distância.", 50);
        Ataque cajado = new Ataque("Cajado", "O Cajado lanças pulsos de energia para dar dano ao seus inimigos.", 75);
        Ataque arco = new Ataque("Arco", "O Arco lanças flechas poderosas contra os mosntros.", 50);
        // Todos os items de ataque
        ArrayList<Ataque> ataques = new ArrayList<>();
        ataques.add(bazuca);
        ataques.add(pistola);
        ataques.add(adaga);
        ataques.add(cajado);
        ataques.add(arco);


        // MONSTROS
        ArrayList<Item> mikeWazowskiItem = new ArrayList<>();
        mikeWazowskiItem.add(colete);
        mikeWazowskiItem.add(pistola);
        Monstro mikeWazowski = new Monstro("Mike Wazowski", "O Mike Wazowski parece ser muito fofinho, mas não julgue o livro pela capa.", 250, 100, mikeWazowskiItem);

        ArrayList<Item> predadorItem = new ArrayList<>();
        predadorItem.add(exoesqueleto);
        predadorItem.add(pistola);
        Monstro predador = new Monstro("Predador", "O Predador saiu diretamente das telas do cinema e caiu no jogo para aniquilar os seus adversários.", 150, 150, predadorItem);

        ArrayList<Item> draculaItem = new ArrayList<>();
        draculaItem.add(colete);
        draculaItem.add(adaga);
        Monstro dracula = new Monstro("Dracula", "O Dracula parece ser assasino violento, mas não morre de medo de alho e sol.", 100, 50, draculaItem);

        // Todos os monstros
        ArrayList<Monstro> monstros = new ArrayList<>();
        monstros.add(mikeWazowski);
        monstros.add(predador);
        monstros.add(dracula);


        // CHEFE
        ArrayList<Item> godzillaItem = new ArrayList<>();
        godzillaItem.add(bazuca);
        godzillaItem.add(armaduraDeFerro);
        Chefe godzilla = new Chefe("Godzilla", "O Godzilla é um lagarto gigante que mata geral.", 300, 500, godzillaItem, "Irritado com as provas e trabalhos da puc surge ele, o Godzilla, para aniquilar com todos.");
        // Todos os chefes
        ArrayList<Chefe> chefes = new ArrayList<>();
        chefes.add(godzilla);

        // CLASSES
        ArrayList<Item> assassinoItem = new ArrayList<>();
        assassinoItem.add(pistola);
        assassinoItem.add(colete);
        Classe assassino = new Classe("Assassino","Nascido para matar, desde pequeno foi treinado para decepar cabeças", 100, 50, 200, assassinoItem);

        ArrayList<Item> magoItem = new ArrayList<>();
        magoItem.add(mantoMagico);
        magoItem.add(cajado);
        Classe mago = new Classe("Mago","Um idoso com problemas nas juntas, mas com muita experiência e poder de fogo", 150, 50, 150, magoItem);

        ArrayList<Item> arqueiroItem = new ArrayList<>();
        arqueiroItem.add(colete);
        arqueiroItem.add(arco);
        Classe arqueiro = new Classe("Arqueiro","O cara das flechas", 125, 75, 175, arqueiroItem);

        ArrayList<Classe> classes = new ArrayList<>();
        classes.add(assassino);
        classes.add(mago);
        classes.add(arqueiro);



        // FASE
        Fase fase1 = new Fase("Fase 1","Você irá enfrentar 3 monstros e um grande chefe!", 1, godzilla, monstros);
        ArrayList<Fase> fases = new ArrayList<>();
        fases.add(fase1);


        // Salvando os objetos
        return new DadosDoJogo(defesas, ataques, monstros, chefes, fases, classes);
    }

    public static Jogador cadastrarJogador(DadosDoJogo dadosDoJogo){
        System.out.println("==============================");
        System.out.println("Para iniciar o Jogo deve-se informar os dados do Jogador!");
        System.out.println("==============================");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do jogador: ");
        String nome = leitor.nextLine();
        System.out.println("Informe a idade do jogador: ");
        String idade = leitor.nextLine();
        System.out.println("Escolha o personagem do jogador: ");

        while (true){
            dadosDoJogo.listarClasses();
            System.out.println("Opção: ");
            int classeEscolhida = Integer.parseInt(leitor.nextLine());

            if (classeEscolhida < 0 || (classeEscolhida > dadosDoJogo.getClasse().size() - 1)){
                System.out.println("Opção inválida");
                continue;
            }

            Classe classe = dadosDoJogo.getClasse().get(classeEscolhida);
            System.out.println("Jogador cadastrado!");
            System.out.println("==============================");
            return new Jogador(nome, idade, classe);
        }
    }
}