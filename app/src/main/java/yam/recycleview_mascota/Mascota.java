package yam.recycleview_mascota;

/**
 * Created by Yam on 11/08/2016.
 */
public class Mascota {

    private String nombre;
    private int foto;
    private int white_bone;
    private int yellow_bone;
    private String rainting;

    public Mascota(int foto,String nombre,int white_bone,int yellow_bone,String rainting){

        this.nombre=nombre;
        this.foto=foto;
        this.white_bone=white_bone;
        this.yellow_bone=yellow_bone;
        this.rainting=rainting;


    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getWhite_bone() {
        return white_bone;
    }

    public void setWhite_bone(int white_bone) {
        this.white_bone = white_bone;
    }

    public int getYellow_bone() {
        return yellow_bone;
    }

    public void setYellow_bone(int yellow_bone) {
        this.yellow_bone = yellow_bone;
    }

    public String getRainting() {
        return rainting;
    }

    public void setRainting(String rainting) {
        this.rainting = rainting;
    }




}
