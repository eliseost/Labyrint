class HvitRute extends Rute{

  public HvitRute(int r, int k, Labyrint l){
    super(r, k, l);
  }

  //Ruten må være hvit for å kunne gå. Dersom den er svart hopper den tilbake igjen.
  public void gaa(String s){
    if(besokt){
      return;
    }
    besokt = true;

    if(nord != null){
      nord.gaa(s + "(" + rad + ", " + kolonne + ") --> ");
    }
    if(oest != null){
      oest.gaa(s + "(" + rad + ", " + kolonne + ") --> ");
    }
    if(soer != null){
      soer.gaa(s + "(" + rad + ", " + kolonne + ") --> ");
    }
    if(vest != null){
      vest.gaa(s + "(" + rad + ", " + kolonne + ") --> ");
    }

  }
  public void resettBesokt(){
    besokt = false;
  }

  @Override
  public char charTilTegn(){
    return '.';
  }
}
