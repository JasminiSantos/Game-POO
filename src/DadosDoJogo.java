import java.util.ArrayList;
import java.util.Scanner;

public class DadosDoJogo {
    private ArrayList<Defesa> defesa;
    private ArrayList<Ataque> ataque;
    private ArrayList<Monstro> monstros;
    private ArrayList<Chefe> chefe;
    private ArrayList<Fase> fase;
    private ArrayList<Classe> classe;
    private Jogador jogador;

    public DadosDoJogo(
            ArrayList<Defesa> defesa,
            ArrayList<Ataque> ataque,
            ArrayList<Monstro> monstro,
            ArrayList<Chefe> chefe,
            ArrayList<Fase> fase,
            ArrayList<Classe> classe
    ) {
        this.defesa = defesa;
        this.ataque = ataque;
        this.monstros = monstro;
        this.chefe = chefe;
        this.fase = fase;
        this.classe = classe;
    }

    public void mostrarTodosOsDados(){
        System.out.println("================");
        System.out.println("Exibindo Dados do Jogo");
        System.out.println("================");


        System.out.println("Itens de Defesa Cadastrados");
        System.out.println("=========================================");
        for (Defesa defesa : this.getDefesa()) {
            defesa.mostrarDados();
        }

        System.out.println("=========================================");
        System.out.println("Itens de Ataque Cadastrados");
        System.out.println("=========================================");
        for (Ataque ataque : this.getAtaque()) {
            ataque.mostrarDados();
        }

        System.out.println("=========================================");
        System.out.println("Monstros Cadastrados");
        System.out.println("=========================================");
        for (Monstro monstro : this.getMonstros()) {
            monstro.mostrarDados();
        }

        System.out.println("=========================================");
        System.out.println("Chefes Cadastrados");
        System.out.println("=========================================");
        for (Chefe chefe : this.getChefe()) {
            chefe.mostrarDados();
        }

        System.out.println("=========================================");
        System.out.println("Fases Cadastradas");
        System.out.println("=========================================");
        for (Fase fase : this.getFase()) {
            fase.mostrarDados();
        }

        System.out.println("=========================================");
        System.out.println("Classes Cadastradas");
        System.out.println("=========================================");
        for (Classe classe : this.getClasse()) {
            classe.mostrarDados();
        }
    }


    public void listarAtaque(){
        int i = 0;
        for (Ataque ataque : this.getAtaque()) {
            System.out.println("[" + i + "] ");
            ataque.mostrarDados();
            i++;
        }
    }
    public void editarAtaque(Ataque ataque){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Editar Item de Ataque ");
        System.out.println("======================");
        System.out.println("Informe o nome do Item de Ataque: ");
        String nome = leitor.nextLine();
        System.out.println("Informe a descrição do Item de Ataque: ");
        String descricao = leitor.nextLine();
        System.out.println("Informe o dano de ataque do Item de Ataque: ");
        int danoDeAtaque = Integer.parseInt(leitor.nextLine());

        ataque.editarDados(nome, descricao, danoDeAtaque);
    }

    public void listarDefesa(){
        int i = 0;
        for (Defesa defesa : this.getDefesa()) {
            System.out.println("[" + i + "] ");
            defesa.mostrarDados();
            i++;
        }
    }
    public void editarDefesa(Defesa defesa){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Editar Item de Defesa ");
        System.out.println("======================");
        System.out.println("Informe o nome do Item de Defesa: ");
        String nome = leitor.nextLine();
        System.out.println("Informe a descrição do Item de Defesa: ");
        String descricao = leitor.nextLine();
        System.out.println("Informe o dano de defesa do Item de Defesa: ");
        int danoDeDefesa = Integer.parseInt(leitor.nextLine());

        defesa.editarDados(nome, descricao, danoDeDefesa);
    }

    public void listarMonstros(){
        int i = 0;
        for (Monstro monstro : this.getMonstros()) {
            System.out.println("[" + i + "] ");
            monstro.mostrarDados();
            i++;
        }
    }
    public void editarMonstro(Monstro monstros){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Editar Monstro");
        System.out.println("======================");
        System.out.println("Informe o nome do Monstro: ");
        String nome = leitor.nextLine();
        System.out.println("Informe a descrição do Monstro: ");
        String descricao = leitor.nextLine();
        System.out.println("Informe a força do Monstro: ");
        int forca = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe a saude do Monstro: ");
        int saude = Integer.parseInt(leitor.nextLine());

        monstros.editarDados(nome, descricao, forca, saude);
    }

    public void listarChefe(){
        int i = 0;
        for (Chefe chefe : this.getChefe()) {
            System.out.println("[" + i + "] ");
            chefe.mostrarDados();
            i++;
        }
    }
    public void editarChefe(Chefe chefe){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Editar Chefe");
        System.out.println("======================");
        System.out.println("Informe o nome do Chefe: ");
        String nome = leitor.nextLine();
        System.out.println("Informe a descrição do Chefe: ");
        String descricao = leitor.nextLine();
        System.out.println("Informe a força do Chefe: ");
        int forca = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe a saude do Chefe: ");
        int saude = Integer.parseInt(leitor.nextLine());

        chefe.editarDados(nome, descricao, forca, saude);
    }

    public void listarFases(){
        int i = 0;
        for (Fase fase : this.getFase()) {
            System.out.println("[" + i + "] ");
            fase.mostrarDados();
            i++;
        }
    }
    public void editarFase(Fase fase){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Editar Fase");
        System.out.println("======================");
        System.out.println("Informe o nome da Fase: ");
        String nome = leitor.nextLine();
        System.out.println("Informe a descrição da Fase: ");
        String descricao = leitor.nextLine();
        System.out.println("Informe o level da Fase: ");
        int level = Integer.parseInt(leitor.nextLine());

        fase.editarDados(nome, descricao, level);
    }

    public void listarClasses(){
        int i = 0;
        for (Classe classe : this.getClasse()) {
            System.out.println("[" + i + "] ");
            classe.mostrarDados();
            i++;
        }
    }
    public void editarClasse(Classe classe){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Editar Classe");
        System.out.println("======================");
        System.out.println("Informe o nome da Classe: ");
        String nome = leitor.nextLine();
        System.out.println("Informe a descrição da Classe: ");
        String descricao = leitor.nextLine();
        System.out.println("Informe a força da Classe: ");
        int forca = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe o level da Classe: ");
        int defesa = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe a saude inicial da Classe: ");
        int saude = Integer.parseInt(leitor.nextLine());

        classe.editarDados(nome, descricao, forca, defesa, saude);
    }


    public Fase pegarFasePorLevel(int level){
        for (Fase fase : this.getFase()) {
            if (fase.getLevel() == level){
                return fase;
            }
        }

        System.out.println("Nenhuma fase cadastrada para o level " + level);
        System.out.println("Foi bom enquanto durou, mas agora você já zerou!");
        System.out.println("Encerrando sistema...");
        System.exit(0);
        return null;
    }


    public ArrayList<Defesa> getDefesa() {
        return defesa;
    }

    public void setDefesa(ArrayList<Defesa> defesa) {
        this.defesa = defesa;
    }

    public ArrayList<Ataque> getAtaque() {
        return ataque;
    }

    public void setAtaque(ArrayList<Ataque> ataque) {
        this.ataque = ataque;
    }

    public ArrayList<Monstro> getMonstros() {
        return monstros;
    }

    public void setMonstros(ArrayList<Monstro> monstros) {
        this.monstros = monstros;
    }

    public ArrayList<Chefe> getChefe() {
        return chefe;
    }

    public void setChefe(ArrayList<Chefe> chefe) {
        this.chefe = chefe;
    }

    public ArrayList<Fase> getFase() {
        return fase;
    }

    public void setFase(ArrayList<Fase> fase) {
        this.fase = fase;
    }

    public ArrayList<Classe> getClasse() {
        return classe;
    }

    public void setClasse(ArrayList<Classe> classe) {
        this.classe = classe;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
}
