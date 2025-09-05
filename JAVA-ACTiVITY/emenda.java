public class emenda{

    private String ano;
    private String tipo;
    private String autor;
    private int numero;
    private double codigo;
    private boolean apoiador;
    private String nomeApoiador;
    private boolean convenio;
    private int numConvenio;
    private String funcao;
    private String subfuncao;
    private String progOrc;
    private String acaoOrc;
    private String planoOrc;
    private float valorEmp;
    private float valorPag;
    private float valorLiq;
    ////////CONSTRUTOR\\\\\\\\
    
    public emenda (String ano, String tipo, String autor, int numero, double codigo,
                  boolean apoiador, String nomeApoiador, boolean convenio, int numConvenio,
                  String funcao, String subfuncao, String progOrc, String acaoOrc,
                  String planoOrc, float valorEmp, float valorPag, float valorLiq){
                    this.ano = ano;
                    this.tipo = tipo;
                    this.autor = autor;
                    this.numero = numero;
                    this.codigo = codigo;
                    this.apoiador = apoiador;
                    this.nomeApoiador = nomeApoiador;
                    this.convenio = convenio;
                    this.numConvenio = numConvenio;
                    this.funcao = funcao;
                    this.subfuncao = subfuncao;
                    this.progOrc = progOrc;
                    this.acaoOrc = acaoOrc;
                    this.planoOrc = planoOrc;
                    this.valorEmp = valorEmp;
                    this.valorPag = valorPag;
                    this.valorLiq = valorLiq;
                  }
    ////GETTERS E SETTERS\\\\\
    
    public String getAno(){return ano;}
    public void setAno(String ano){this.ano = ano;}
    
    public String getTipo(){return tipo;}
    public void setTipo(String tipo){this.tipo = tipo;}

    public String getAutor(){return autor;}
    public void setAutor(String autor){this.autor = autor;}

    public int getNumero(){return numero;}
    public void setNumero(int numero){this.numero = numero;}

    public double getCodigo(){return codigo;}
    public void setCodigo(double codigo){this.codigo = codigo;}

    public boolean getApoiador(){return apoiador;}
    public void setApoiador(boolean apoiador){this.apoiador = apoiador;}

    public String getNomeApoiador(){return nomeApoiador;}
    public void setNomeApoiador(String nomeApoiador){this.nomeApoiador = nomeApoiador;}

    public boolean getConvenio(){return convenio;}
    public void setConvenio(boolean convenio){this.convenio = convenio;}

    public int getNumConvenio(){return numConvenio;}
    public void setNumConvenio(int numConvenio){this.numConvenio = numConvenio;}

    public String getFuncao(){return funcao;}
    public void setFuncao(String funcao){this.funcao = funcao;}

    public String getSubFuncao(){return subfuncao;}
    public void setSubFuncao(String subFuncao){this.subfuncao = subFuncao;}

    public String getProgOrc(){return progOrc;}
    public void setProgOrc(String progOrc){this.progOrc = progOrc;}

    public String getAcaoOrc(){return acaoOrc;}
    public void setAcaoOrc(String acaoOrc){this.acaoOrc = acaoOrc;}

    public String getPlanoOrc(){return planoOrc;}
    public void setPlanoOrc(String planoOrc){this.planoOrc = planoOrc;}

    public float getValorEmp(){return valorEmp;}
    public void setValorEmp(float valorEmp){this.valorEmp = valorEmp;}

    public float getValorPag(){return valorPag;}
    public void setValorPag(float valorPag){this.valorPag = valorPag;}

    public float getValorLiq(){return valorLiq;}
    public void setValorLiq(float valorLiq){this.valorLiq = valorLiq;}

}