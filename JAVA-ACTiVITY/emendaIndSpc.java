
public class emendaIndSpc extends emendaInd {
    private String planoTrab;

    public emendaIndSpc(String ano, String tipo, String autor, int numero, double codigo,
                        boolean apoiador, String nomeApoiador, boolean convenio, int numConvenio,
                        String funcao, String subfuncao, String progOrc, String acaoOrc,
                        String planoOrc, float valorEmp, float valorPag, float valorLiq,
                        String localiEleitores, String planoTrab) {
        super(ano, tipo, autor, numero, codigo, apoiador, nomeApoiador, convenio, numConvenio,
              funcao, subfuncao, progOrc, acaoOrc, planoOrc, valorEmp, valorPag, valorLiq, localiEleitores);
        this.planoTrab = planoTrab; 
    }

    public String getPlanoTrab() { return planoTrab; }
    public void setPlanoTrab(String planoTrab) { this.planoTrab = planoTrab; }
}