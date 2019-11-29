class Aapning extends HvitRute{

  public Aapning(int r, int k, Labyrint l){
    super(r, k, l);
  }

  public void gaa(String s){
    s += "(" + rad + ", " + kolonne + ")";

    Liste<String> liste = lab.hentListe();
    liste.leggTil(s);
  }
  
}
