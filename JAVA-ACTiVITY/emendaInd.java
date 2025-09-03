public class emendaInd extends ementa {
    private String localiEleitores;

    public emendaInd(String ano, String tipo, String autor, int numero, double codigo,
                            boolean apoiador, String nomeApoiador, boolean convenio, int numConvenio,
                            String funcao, String subfuncao, String progOrc, String acaoOrc,
                            String planoOrc, float valorEmp, float valorPag, float valorLiq,
                            String localiEleitores) {
            super(ano, tipo, autor, numero, codigo, apoiador, nomeApoiador, convenio, numConvenio, funcao,
                    subfuncao, progOrc, acaoOrc, planoOrc, valorEmp, valorPag, valorLiq);
                    this.localiEleitores = localiEleitores;
                }
                public String getLocaliEleitores(){return localiEleitores;}
                public void setLocaliEleitores(String localiEleitores){this.localiEleitores = localiEleitores;}
}
