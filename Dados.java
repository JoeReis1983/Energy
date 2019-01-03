package reis.joe.energy;

import java.util.ArrayList;
import java.util.Arrays;

public class Dados {


    ArrayList<Estados> Organizando() {

        String a ="AmE	AM	1,255\r\n" +
                "CEA	AP	1,235\r\n" +
                "Celpa	PA	1,361\r\n" +
                "Cemar	MA	1,403\r\n" +
                "Sulgipe	SE	1,358\r\n" +
                "Eletroacre	AC	1,293\r\n" +
                "Enel_RJ	RJ	1,176\r\n" +
                "Forcel	PR	1,154\r\n" +
                "Chesp	GO	1,262\r\n" +
                "Cepisa	PI	1,322\r\n" +
                "ETO	TO	1,314\r\n" +
                "Boa_Vista	RR	1,255\r\n" +
                "Eflul	SC	1,309\r\n" +
                "Uhenpal	RS	1,086\r\n" +
                "EFLJC	SC	1,324\r\n" +
                "Ceal	AL	1,151\r\n" +
                "ENF	RJ	1,164\r\n" +
                "Cemig-D	MG	1,136\r\n" +
                "Ceron	RO	1,143\r\n" +
                "ELFSM	ES	1,257\r\n" +
                "Light	RJ	1,07\r\n" +
                "EMT	MT	1,153\r\n" +
                "EPB	PB	1,214\r\n" +
                "EMS	MS	1,045\r\n" +
                "Coelba	BA	1,134\r\n" +
                "Eletrocar	RS	1,422\r\n" +
                "Demei	RS	1,148\r\n" +
                "MuxEnergia	RS	0,954\r\n" +
                "EMG	MG	1,089\r\n" +
                "Hidropan	RS	1,241\r\n" +
                "Cocel	PR	1,345\r\n" +
                "Celpe	PE	1,098\r\n" +
                "ESE	SE	1,077\r\n" +
                "Cooperaliança	SC	0,819\r\n" +
                "Celg-D	GO	0,991\r\n" +
                "RGE	RS	0,932\r\n" +
                "Elektro	SP	1,126\r\n" +
                "CPFL_Santa_Cruz	SP	0,862\r\n" +
                "EDP_ES	ES	1,024\r\n" +
                "RGE_SUL	RS	0,958\r\n" +
                "EDP_SP	SP	0,946\r\n" +
                "DMED	MG	0,901\r\n" +
                "Enel_CE	CE	0,97\r\n" +
                "Cosern	RN	1,026\r\n" +
                "CEB-DIS	DF	0,967\r\n" +
                "EBO	PB	1,005\r\n" +
                "CEEE-D	RS	0,987\r\n" +
                "Sul_Sudeste	SP	0,883\r\n" +
                "CPFL_Piratininga	SP	0,865\r\n" +
                "Ienergia	SC	0,92\r\n" +
                "Copel-DIS	PR	0,92\r\n" +
                "Eletropaulo	SP	0,865\r\n" +
                "Celesc-DIS	SC	0,883\r\n" +
                "CPFL_Paulista	SP	0,828\r\n" +
                "CERAL_ARARUAMA	RJ	1,833\r\n" +
                "CERCI	RJ	1,71\r\n" +
                "Cedri	SP	1,769\r\n" +
                "Ceres	RJ	1,736\r\n" +
                "Certrel	SC	1,288\r\n" +
                "Cercos	SE	1,597\r\n" +
                "Ceprag	SC	1,228\r\n" +
                "Cergal	SC	1,26\r\n" +
                "Cerpalo	SC	1,231\r\n" +
                "Ceral_Anitápolis	SC	1,224\r\n" +
                "Cerej	SC	1,159\r\n" +
                "Cetril	SP	1,145\r\n" +
                "Creral	RS	1,044\r\n" +
                "Cermoful	SC	1,093\r\n" +
                "Cerim	SP	1,018\r\n" +
                "Cergral	SC	1,038\r\n" +
                "Ceris	SP	1,02\r\n" +
                "Cejama	SC	1,07\r\n" +
                "Creluz-D	RS	0,965\r\n" +
                "Certaja	RS	1,042\r\n" +
                "Ceraça	SC	0,98\r\n" +
                "CERMC	SP	1,106\r\n" +
                "Cedrap	SP	1,018\r\n" +
                "CERRP	SP	0,955\r\n" +
                "COOPERZEM	SC	0,931\r\n" +
                "CERSAD	SC	0,957\r\n" +
                "Cermissões	RS	0,942\r\n" +
                "Coorsel	SC	1,005\r\n" +
                "Cergapa	SC	0,917\r\n" +
                "Coprel	RS	0,899\r\n" +
                "Coopercocal	SC	0,856\r\n" +
                "CERTHIL	RS	0,83\r\n" +
                "CERFOX	RS	0,834\r\n" +
                "Certel	RS	0,773\r\n" +
                "Cerbranorte	SC	0,867\r\n" +
                "Coopermila	SC	0,819\r\n" +
                "Ceral_DIS	PR	0,83\r\n" +
                "Ceriluz	RS	0,747\r\n" +
                "Cersul	SC	0,672\r\n" +
                "Cerpro	SP	0,83\r\n" +
                "Ceripa	SP	0,682\r\n" +
                "Cernhe	SP	0,676\r\n" +
                "Coopera	SC	0,579\r\n" +
                "Cooperluz	RS	0,611\r\n" +
                "CEGERO	SC	0,525\r\n" +
                "CASTRO-DIS	PR	0,537\r\n";

        a = "AmE AM 1,255\r\n" +
                "CEA AP 1,235\r\n" +
                "Celpa PA 1,361\r\n" +
                "Cemar MA 1,403\r\n" +
                "Sulgipe SE 1,358\r\n" +
                "Eletroacre AC 1,293\r\n" +
                "Enel_RJ RJ 1,176\r\n" +
                "Forcel PR 1,154\r\n" +
                "Chesp GO 1,262\r\n" +
                "Cepisa PI 1,322\r\n" +
                "ETO TO 1,314\r\n" +
                "Boa_Vista RR 1,255\r\n" +
                "Eflul SC 1,309\r\n" +
                "Uhenpal RS 1,086\r\n" +
                "EFLJC SC 1,324\r\n" +
                "Ceal AL 1,151\r\n" +
                "ENF RJ 1,164\r\n" +
                "Cemig-D MG 1,136\r\n" +
                "Ceron RO 1,143\r\n" +
                "ELFSM ES 1,257\r\n" +
                "Light RJ 1,07\r\n" +
                "EMT MT 1,153\r\n" +
                "EPB PB 1,214\r\n" +
                "EMS MS 1,045\r\n" +
                "Coelba BA 1,134\r\n" +
                "Eletrocar RS 1,422\r\n" +
                "Demei RS 1,148\r\n" +
                "MuxEnergia RS 0,954\r\n" +
                "EMG MG 1,089\r\n" +
                "Hidropan RS 1,241\r\n" +
                "Cocel PR 1,345\r\n" +
                "Celpe PE 1,098\r\n" +
                "ESE SE 1,077\r\n" +
                "Cooperaliança SC 0,819\r\n" +
                "Celg-D GO 0,991\r\n" +
                "RGE RS 0,932\r\n" +
                "Elektro SP 1,126\r\n" +
                "CPFL_Santa_Cruz SP 0,862\r\n" +
                "EDP_ES ES 1,024\r\n" +
                "RGE_SUL RS 0,958\r\n" +
                "EDP_SP SP 0,946\r\n" +
                "DMED MG 0,901\r\n" +
                "Enel_CE CE 0,97\r\n" +
                "Cosern RN 1,026\r\n" +
                "CEB-DIS DF 0,967\r\n" +
                "EBO PB 1,005\r\n" +
                "CEEE-D RS 0,987\r\n" +
                "Sul_Sudeste SP 0,883\r\n" +
                "CPFL_Piratininga SP 0,865\r\n" +
                "Ienergia SC 0,92\r\n" +
                "Copel-DIS PR 0,92\r\n" +
                "Eletropaulo SP 0,865\r\n" +
                "Celesc-DIS SC 0,883\r\n" +
                "CPFL_Paulista SP 0,828\r\n" +
                "CERAL_ARARUAMA RJ 1,833\r\n" +
                "CERCI RJ 1,71\r\n" +
                "Cedri SP 1,769\r\n" +
                "Ceres RJ 1,736\r\n" +
                "Certrel SC 1,288\r\n" +
                "Ceprag SC 1,349\r\n" +
                "Cercos SE 1,597\r\n" +
                "Cergal SC 1,26\r\n" +
                "Cerpalo SC 1,231\r\n" +
                "Ceral_Anitápolis SC 1,224\r\n" +
                "Cerej SC 1,159\r\n" +
                "Cetril SP 1,145\r\n" +
                "Creral RS 1,044\r\n" +
                "Cermoful SC 1,093\r\n" +
                "Cerim SP 1,018\r\n" +
                "Cergral SC 1,038\r\n" +
                "Ceris SP 1,02\r\n" +
                "Cejama SC 1,07\r\n" +
                "Creluz-D RS 0,965\r\n" +
                "Certaja RS 1,042\r\n" +
                "Ceraça SC 0,98\r\n" +
                "CERMC SP 1,106\r\n" +
                "Cedrap SP 1,018\r\n" +
                "CERRP SP 0,955\r\n" +
                "COOPERZEM SC 0,931\r\n" +
                "CERSAD SC 0,957\r\n" +
                "Cermissões RS 0,942\r\n" +
                "Coorsel SC 1,005\r\n" +
                "Cergapa SC 0,917\r\n" +
                "Coprel RS 0,899\r\n" +
                "Coopercocal SC 0,856\r\n" +
                "CERTHIL RS 0,83\r\n" +
                "CERFOX RS 0,834\r\n" +
                "Certel RS 0,773\r\n" +
                "Cerbranorte SC 0,867\r\n" +
                "Coopermila SC 0,819\r\n" +
                "Ceral_DIS PR 0,83\r\n" +
                "Ceriluz RS 0,747\r\n" +
                "Cersul SC 0,672\r\n" +
                "Cerpro SP 0,83\r\n" +
                "Ceripa SP 0,682\r\n" +
                "Cernhe SP 0,676\r\n" +
                "Coopera SC 0,579\r\n" +
                "Cooperluz RS 0,611\r\n" +
                "CEGERO SC 0,525\r\n" +
                "CASTRO-DIS PR 0,537\r\n"
        ;

        a = a.replace("\n", " ");
        a = a.replace("\r", "");
        a = a.replace("	", " ");
        String b[] = a.split(" ");


        ArrayList<Estados> TodosEstadosFull = new ArrayList<>();
        int i = 0;

        while(i<b.length) {
            Estados z = new Estados();
            z.fornecedora= b[i];
            i++;
            z.sigla = b[i];
            i++;
            z.preco = b[i].replace(",",".");
            i++;

            TodosEstadosFull.add(z);
        }

        return TodosEstadosFull;}


    String[] TodosEstado() {
        ArrayList<Estados> TodosEstadosFull = Organizando();


        int i=0;

        ArrayList<String> SiglasEstado = new ArrayList<>();
        while(i<TodosEstadosFull.size()) {
            if(SiglasEstado.contains(TodosEstadosFull.get(i).sigla) == false) {
                SiglasEstado.add(TodosEstadosFull.get(i).sigla);
                i++;
            }
            else {
                i++;
            }
        }
        i=0;


        String EstadosOrganizado [] = new String[SiglasEstado.size()];
        while (i<SiglasEstado.size()) {

            EstadosOrganizado[i] = SiglasEstado.get(i);
            i++;
        }
        Arrays.sort(EstadosOrganizado);
        return EstadosOrganizado;

    }
    public String[] FornEstados(String op) {
        // TODO Auto-generated method stub
        ArrayList<Estados> TodosEstadosFull= Organizando();
        String fornecedores="";
        int i=0,x=0;
        while (i<TodosEstadosFull.size()) {
            if(TodosEstadosFull.get(i).sigla.equals(op)) {
                fornecedores=TodosEstadosFull.get(i).fornecedora+"corta"+fornecedores;
                x++;
                i++;
            }
            else {
                i++;
            }
        }
        String retornavel[]= fornecedores.split("corta");
        Arrays.sort(retornavel);
        return retornavel;
    }

    public Double precoKwh(String x, String y){
        ArrayList<Estados> TodosEstadosFull= Organizando();
        int i=0;
        Double preco=0.0;
        while (i<TodosEstadosFull.size()){
            if(TodosEstadosFull.get(i).sigla.equals(x) && TodosEstadosFull.get(i).fornecedora.equals(y)){
                preco = Double.parseDouble(TodosEstadosFull.get(i).preco);
                i++;
            }
            else {
                i++;
            }
        }

        return preco;
    }

}
