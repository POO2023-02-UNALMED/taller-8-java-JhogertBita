package futbol;
public abstract class Futbolista implements Comparable<Object> {
  private String nombre;
  private int edad;
  private final String posicion;
  
  public Futbolista() {
    this("Maradona", 30, "delantero");
  }
  public Futbolista(String nombre, int edad, String posicion) {
    this.nombre=nombre;
    this.edad=edad;
    this.posicion=posicion;
  }
  
  public boolean equals(Futbolista f) {
    if(this==f) {
      return true;
    }
    return false;
  }
  public abstract boolean jugarConLasManos();

  public String getNombre() {
    return this.nombre;
  }
  public void setNombre(String nombre) {
    this.nombre=nombre;
  }
  public int getEdad() {
    return this.edad;
  }
  public void setEdad(int edad) {
    this.edad=edad;
  }
  public String getPosicion() {
    return this.posicion;
  }
  public String toString() {
    return "El futbolista "+this.nombre+" tiene "+this.edad+", y juega de "+this.posicion;
  }
  public int compareTo(Object o) {
    return 0;
  }
}