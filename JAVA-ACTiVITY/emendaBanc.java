public class emendaBanc extends ementa {
    private String filiParla;
    private String link;
    private String nomeParla;

    public emendaBanc(String ano, String tipo, String autor, int numero, double codigo,
                            boolean apoiador, String nomeApoiador, boolean convenio, int numConvenio,
                            String funcao, String subfuncao, String progOrc, String acaoOrc,
                            String planoOrc, float valorEmp, float valorPag, float valorLiq,
                            String filiParla, String link, String nomeParla){
                    super(ano, tipo, autor, numero, codigo, apoiador, nomeApoiador, convenio, numConvenio, funcao,
                    subfuncao, progOrc, acaoOrc, planoOrc, valorEmp, valorPag, valorLiq);
                        this.filiParla = filiParla;
                        this.link = link;
                        this.nomeParla = nomeParla;
                    }
            public String getFiliParla(){return filiParla;}
            public void setFiliParla(String filiParla){this.filiParla = filiParla;}

            public String getLink(){return link;}
            public void setLink(String link){this.link = link;}

            public String getNomeParla(){return nomeParla;}
            public void setNomeParla(String nomeParla){this.nomeParla = nomeParla;}
    
}
