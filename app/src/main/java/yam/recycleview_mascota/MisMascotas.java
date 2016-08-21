package yam.recycleview_mascota;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yam on 11/08/2016.
 *
 *
 */

                           /* Recycler.ViewAdapter*/
public class MisMascotas extends RecyclerView.Adapter<MisMascotas.MascotaViewHolder> {

    List<Mascota>lista_Mascota;

    public MisMascotas(List<Mascota> lista_Mascota) {



        this.lista_Mascota = lista_Mascota;
    }

    /*En el método VH onCreateViewHolder (ViewGroup parent, int viewType)
      se devuelve una instancia de nuestro ViewHolder para la View que recibimos.
      En esta View tendremos que “inflar” el layout de la fila.*/

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View row_mascota= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_mascota,parent,false);

        return new MascotaViewHolder(row_mascota);

    }

    /*public void onBindViewHolder (VH holder, int position) establece
      en el ViewHolder que recibe los datos correspondientes al elemento
      de la posición position.*/

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {

         Mascota mascota=lista_Mascota.get(position);


        mascotaViewHolder.getImgMascota().setImageResource(mascota.getFoto());
        mascotaViewHolder.getWhiteBone().setImageResource(mascota.getWhite_bone());
        mascotaViewHolder.getYellowBone().setImageResource(mascota.getYellow_bone());
        mascotaViewHolder.getRaiting().setText(mascota.getRainting());
        mascotaViewHolder.getNomeMascota().setText(mascota.getNombre());

    }

    @Override
    public int getItemCount() {

        return lista_Mascota.size();
            }


    /*Implementar un RecyclerView.ViewHolder adecuado al
    layout de la fila que contendrá los atributos que permitan
    guardar las referencias a los distintos widgets del layout.*/

   public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgMascota;
        private ImageView whiteBone;
        private ImageView yellowBone;
        private TextView raiting;
        private TextView  nomeMascota;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            imgMascota= (ImageView) itemView.findViewById(R.id.perro1);
            whiteBone= (ImageView) itemView.findViewById(R.id.img_white_bone_perro1);
            yellowBone= (ImageView) itemView.findViewById(R.id.img_bone_yellow_perro1);
            raiting= (TextView) itemView.findViewById(R.id.text_raiting);
            nomeMascota= (TextView) itemView.findViewById(R.id.text_Perro1);
        }

       public ImageView getImgMascota() {
           return imgMascota;
       }

       public ImageView getWhiteBone() {
           return whiteBone;
       }

       public ImageView getYellowBone() {
           return yellowBone;
       }

       public TextView getRaiting() {
           return raiting;
       }

       public TextView getNomeMascota() {
           return nomeMascota;
       }

   }
}
