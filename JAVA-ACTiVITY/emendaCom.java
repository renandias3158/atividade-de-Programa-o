public class emendaCom extends emenda{
    private String linkComTem;
    private String nomeParlas;
    private String linkRela;
    private String nomeParlaSen;

    public emendaCom(String ano, String tipo, String autor, int numero, double codigo,
                            boolean apoiador, String nomeApoiador, boolean convenio, int numConvenio,
                            String funcao, String subfuncao, String progOrc, String acaoOrc,
                            String planoOrc, float valorEmp, float valorPag, float valorLiq,
                            String linkComTem, String nomeParlas, String linkRela, String nomeParlaSen){
                    super(ano, tipo, autor, numero, codigo, apoiador, nomeApoiador, convenio, numConvenio, funcao,
                    subfuncao, progOrc, acaoOrc, planoOrc, valorEmp, valorPag, valorLiq);
                                this.linkComTem = linkComTem;
                                this.nomeParlas = nomeParlas;
                                this.linkRela = linkRela;
                                this.nomeParlaSen = nomeParlaSen;
                            }
        
            public String getLinkComTem(){return linkComTem;}
            public void setLinkComTem(String linkComTem){this.linkComTem = linkComTem;}

            public String getNomeParlas(){return nomeParlas;}
            public void setNomeParlas(String nomeParlas){this.nomeParlas = nomeParlas;}

            public String getLinkRela(){return linkRela;}
            public void setLinkRela(String linkRela){this.linkRela = linkRela;}

            public String getNomeParlaSen(){return nomeParlaSen;}
            public void setNomeParlaSen(String nomeParlaSen){this.nomeParlaSen = nomeParlaSen;}
}