public class emendaRela extends ementa {
    private String parlaAutor;
    private String nomeRela;
    private String indiAutor;
    private String indiBene;

    public emendaRela(String ano, String tipo, String autor, int numero, double codigo,
                        boolean apoiador, String nomeApoiador, boolean convenio, int numConvenio,
                        String funcao, String subfuncao, String progOrc, String acaoOrc,
                        String planoOrc, float valorEmp, float valorPag, float valorLiq,
                        String parlaAutor, String nomeRela, String indiAutor, String indiBene){
            super(ano, tipo, autor, numero, codigo, apoiador, nomeApoiador, convenio, numConvenio, funcao,
                subfuncao, progOrc, acaoOrc, planoOrc, valorEmp, valorPag, valorLiq);
                    this.parlaAutor = parlaAutor;
                    this.nomeRela = nomeRela;
                    this.indiAutor = indiAutor;
                    this.indiBene = indiBene;
                    }
                    
                    public String getParlaAutor(){return parlaAutor;}
                    public void setParlaAutor(String parlaAutor){this.parlaAutor = parlaAutor;}

                    public String getNomeRela(){return nomeRela;}
                    public void setNomeRela(String nomeRela){this.nomeRela = nomeRela;}

                    public String getIndiAutor(){return indiAutor;}
                    public void setIndiAutor(String indiiAutor){this.indiAutor = indiiAutor;}

                    public String getIndiBene(){return indiBene;}
                    public void setIndiBene(String indiBene){this.indiBene = indiBene;}
}
