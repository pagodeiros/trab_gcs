import java.util.Date;

public class Chamado {
    private final int IDCHAMADO; // atributo final por ser o atributo identificador e nao devera ser mudado
    private Equipamento equipamentoSuporte; // o Equipamento(objeto) que precisa de suporte
    private Funcionario funcionarioQueAbriu; // o Funcionario(objeto) que pediu o de suporte
    private String descricao; // a descricao do problema do equipamento
    private Date dataAberto; // a data que o suporte foi aberta
    private String status; // o status do suporte do equipamento(aberto -> em andamento ->concluído)
    private String resolucao; // texto descrevendo a resolucao do chamado

    /**
     * metodo construtor
     * @param IDCHAMADO identificador do chamado
     * @param equipamentoSuporte equipamento que o suporte sera feito
     * @param funcionarioQueAbriu o funcionario que abriu o chamado
     * @param descricao a descricao do problema
     * @param dataAberto a data que foi aberto
     * @param resolucao texto escrito pelo funcionario do suporte que atendeu o chamado
     */
    
    public Chamado(int IDCHAMADO, Equipamento equipamentoSuporte, Funcionario funcionarioQueAbriu, String descricao, Date dataAberto) {
        this.IDCHAMADO = IDCHAMADO;
        this.equipamentoSuporte = equipamentoSuporte;
        this.funcionarioQueAbriu = funcionarioQueAbriu;
        this.descricao = descricao;
        this.dataAberto = dataAberto;
        this.status = "ativo";
    }

    // getters-------
    public int getIDCHAMADO() {
        return IDCHAMADO;
    }

    public Equipamento getEquipamentoSuporte() {
        return equipamentoSuporte;
    }

    public Funcionario getFuncionarioQueAbriu() {
        return funcionarioQueAbriu;
    }

    public String getDesc() {
        return descricao;
    }

    public Date getDataAberto() {
        return dataAberto;
    }

    public String getStatus() {
        return status;
    }

    public String getResolucao(){
        return resolucao;
    }

    // setters-----
    public void setDesc(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResolucao(String resolucao){
        this.resolucao = resolucao;
    }
    
    public String toString(){
        String aux = "id do chamado: " + IDCHAMADO + " equipamento: " + equipamentoSuporte.toString() + " funcionario: " + funcionarioQueAbriu.toString() + " descricao do chamado: " + descricao + " data: " + dataAberto.toString() + " status: " + status;
        return aux;
    }
}
