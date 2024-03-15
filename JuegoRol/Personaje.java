class Personaje{
    protected String nombre;
    protected String raza;
    protected String clase;
    protected int nivel;
    protected int vida;
    protected int ar; // armadura
    protected int mr; // resistencia magica
    protected int at; // daño de ataque
    protected int dm; // daño magico
    
    public Personaje(String nombre, String raza, String clase, int nivel, int vida, int ar, int mr, int at, int dm) {
        this.nombre = nombre;
        this.raza = raza;
        this.clase = clase;
        this.nivel = nivel;
        this.vida = vida;
        this.ar = ar;
        this.mr = mr;
        this.at = at;
        this.dm = dm;
    }

    public void atacar() {
        System.out.println("El personaje " + nombre + " está atacando...");
    }
}
         