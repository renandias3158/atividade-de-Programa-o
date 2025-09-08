public class emendaIndDef extends emendaInd {
    private String proj;
    private String lict;
    private String comprov;

    public emendaIndDef(String ano, String tipo, String autor, int numero, double codigo,
                        boolean apoiador, String nomeApoiador, boolean convenio, int numConvenio,
                        String funcao, String subfuncao, String progOrc, String acaoOrc,
                        String planoOrc, float valorEmp, float valorPag, float valorLiq,
                        String localiEleitores, String planoTrab, String proj, String lict, String comprov) {
        super(ano, tipo, autor, numero, codigo, apoiador, nomeApoiador, convenio, numConvenio,
              funcao, subfuncao, progOrc, acaoOrc, planoOrc, valorEmp, valorPag, valorLiq, localiEleitores);
                    this.proj = proj;
                    this.lict = lict;
                    this.comprov= comprov;
                }
                public String getProj (){return proj;}
                public void setProj(String proj){this.proj = proj;} 

                public String getLict(){return lict;}
                public void setLict(String lict){this.lict = lict;} 

                public String getComprov(){return comprov;}
                public void setComprov(String comprov){this.comprov = comprov;} 
}
