public class Main {
    public static void main(String[] args) {
        emendaInd emenda1 = new emendaInd(
            "Deputado B", "Bancada", "2023", 202, 98765.00,
            false, "Nenhum", false, 0, "Educação", "Ensino Médio",
            "Prog2", "Acao2", "Plano2", 20000, 15000, 18000,"Bahia"
            
        ); 


        emendaIndSpc emenda2 = new emendaIndSpc(
            "2022", "Geral", "Deputado C", 303, 54321.00,
            true, "Deputado D", true, 77, "Infraestrutura", "Rodovias",
            "Prog3", "Acao3", "Plano3", 50000, 40000, 45000, "São Paulo", "Plano de trabalho.PDF"
        );


        emendaBanc emenda3 = new emendaBanc(
            "Deputado B", "Bancada", "2023", 202, 98765.00,
            false, "Nenhum", false, 0, "Educação", "Ensino Médio",
            "Prog2", "Acao2", "Plano2", 20000, 15000, 18000,
            "Partido Y", "http://link.com", "Deputado C"
        );

        emendaCom emenda4 = new emendaCom(
            "Deputado C", "Bancada", "2023", 202, 98765.00,
            false, "Nenhum", true, 0, "Educação", "Ensino Médio",
            "Prog1", "Acao1", "Plano1", 20000, 15000, 18000,"linkpararelatório.com","Deputado F", "Link.com", "Relator C"
        );

        emendaRela emenda5 = new emendaRela(
            "Deputado B", "Bancada", "2023", 202, 98765.00,
            false, "Um", false, 0, "Educação", "Ensino Médio",
            "Prog2", "Acao2", "Plano2", 20000, 15000, 18000,"Parlamentar K", "Relator A",
            "Indicação autor", "Indicação beneficiário"
        );


        System.out.println("Emenda 1 Individual de Transferências com finalidade definida: " + emenda1.getAutor() + '\n' + emenda1.getTipo() +'\n' +emenda1.getAno() +'\n' +emenda1.getNumero() +'\n' +emenda1.getCodigo() +'\n' +emenda1.getApoiador() +'\n' +emenda1.getNomeApoiador() +'\n' +emenda1.getConvenio() +'\n' +emenda1.getNumConvenio() +'\n' +emenda1.getFuncao() +'\n' +emenda1.getSubFuncao() +'\n' +emenda1.getAcaoOrc() +'\n' +emenda1.getPlanoOrc() +'\n' +emenda1.getProgOrc() +'\n' +emenda1.getValorEmp() +'\n' +emenda1.getValorPag() +'\n' +emenda1.getValorLiq() +'\n' +emenda1.getLocaliEleitores()+'\n');
        
        System.out.println("Emenda 2 Individual de Transferências especiais: " + emenda2.getAutor() + '\n' + emenda2.getTipo() +'\n' +emenda2.getAno() +'\n' +emenda2.getNumero() +'\n' +emenda2.getCodigo() +'\n' +emenda2.getApoiador() +'\n' +emenda2.getNomeApoiador() +'\n' +emenda2.getConvenio() +'\n' +emenda2.getNumConvenio() +'\n' +emenda2.getFuncao() +'\n' +emenda2.getSubFuncao() +'\n' +emenda2.getAcaoOrc() +'\n' +emenda2.getPlanoOrc() +'\n' +emenda2.getProgOrc() +'\n' +emenda2.getValorEmp() +'\n' +emenda2.getValorPag() +'\n' +emenda2.getValorLiq() +'\n' +emenda2.getLocaliEleitores()+'\n' +emenda2.getPlanoTrab()+'\n');
        
        System.out.println("Emenda 3 Bancada: " + emenda3.getAutor() + '\n' + emenda3.getTipo() +'\n' +emenda3.getAno() +'\n' +emenda3.getNumero() +'\n' +emenda3.getCodigo() +'\n' +emenda3.getApoiador() +'\n' +emenda3.getNomeApoiador() +'\n' +emenda3.getConvenio() +'\n' +emenda3.getNumConvenio() +'\n' +emenda3.getFuncao() +'\n' +emenda3.getSubFuncao() +'\n' +emenda3.getAcaoOrc() +'\n' +emenda3.getPlanoOrc() +'\n' +emenda3.getProgOrc() +'\n' +emenda3.getValorEmp() +'\n' +emenda3.getValorPag() +'\n' +emenda3.getValorLiq() +'\n' +emenda3.getFiliParla()+'\n'+emenda3.getLink()+'\n'+emenda3.getNomeParla()+'\n');
    
        System.out.println("Emenda 4 Comissão: " + emenda4.getAutor() + '\n' + emenda4.getTipo() +'\n' +emenda4.getAno() +'\n' +emenda4.getNumero() +'\n' +emenda4.getCodigo() +'\n' +emenda4.getApoiador() +'\n' +emenda4.getNomeApoiador() +'\n' +emenda4.getConvenio() +'\n' +emenda4.getNumConvenio() +'\n' +emenda4.getFuncao() +'\n' +emenda4.getSubFuncao() +'\n' +emenda4.getAcaoOrc() +'\n' +emenda4.getPlanoOrc() +'\n' +emenda4.getProgOrc() +'\n' +emenda4.getValorEmp() +'\n' +emenda4.getValorPag() +'\n' +emenda4.getValorLiq() +'\n' +emenda4.getLinkComTem()+'\n'+emenda4.getNomeParlas()+'\n'/*+emenda4.getlinkRela()+'\n'+emenda4.getnomeParlaSen()+'\n'*/);

        System.out.println("Emenda 5 Relator: " + emenda5.getAutor() + '\n' + emenda5.getTipo() +'\n' +emenda5.getAno() +'\n' +emenda5.getNumero() +'\n' +emenda5.getCodigo() +'\n' +emenda5.getApoiador() +'\n' +emenda5.getNomeApoiador() +'\n' +emenda5.getConvenio() +'\n' +emenda5.getNumConvenio() +'\n' +emenda5.getFuncao() +'\n' +emenda5.getSubFuncao() +'\n' +emenda5.getAcaoOrc() +'\n' +emenda5.getPlanoOrc() +'\n' +emenda5.getProgOrc() +'\n' +emenda5.getValorEmp() +'\n' +emenda5.getValorPag() +'\n' +emenda5.getValorLiq() +'\n' +emenda5.getParlaAutor() +'\n'+emenda5.getNomeRela() +'\n'+emenda5.getIndiAutor() +'\n'+emenda5.getIndiBene() +'\n');
    
    }
}