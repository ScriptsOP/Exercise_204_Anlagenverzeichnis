
public class Eintrag {
    private String Bezeichnung;
    private double ak;
    private double inbetriebnahme;
    private double nd;
    private double bishND;
    private double bishAfa;
    private double wertVorAfa;
    private double afaDj;
    private double bw;

    public Eintrag(String Bezeichnung, double ak, double inbetriebnahme, double nd, double bishND, double bishAfa, double wertVorAfa, double afaDj, double bw) {
        this.Bezeichnung = Bezeichnung;
        this.ak = ak;
        this.inbetriebnahme = inbetriebnahme;
        this.nd = nd;
        this.bishND = bishND;
        this.bishAfa = bishAfa;
        this.wertVorAfa = wertVorAfa;
        this.afaDj = afaDj;
        this.bw = bw;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public double getAk() {
        return ak;
    }

    public double getInbetriebnahme() {
        return inbetriebnahme;
    }

    public double getNd() {
        return nd;
    }

    public double getBishND() {
        return bishND;
    }

    public double getBishAfa() {
        return bishAfa;
    }

    public double getWertVorAfa() {
        return wertVorAfa;
    }

    public double getAfaDj() {
        return afaDj;
    }

    public double getBw() {
        return bw;
    }
}
