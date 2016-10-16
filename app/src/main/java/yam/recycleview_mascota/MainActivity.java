package yam.recycleview_mascota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Mascota> lista_Mascota;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Intent mascotaFavorita = new Intent(this, Main2Activity.class);

        ImageView star = (ImageView)findViewById(R.id.stella);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent page_2 = new Intent(MainActivity.this,Main2Activity.class);
                        
                startActivity(page_2);

            }
        });

        Toolbar miActionBar=(Toolbar)findViewById(R.id.mitoolBar);

        setSupportActionBar(miActionBar);
        inizMascota();

        RecyclerView listaMascotas = (RecyclerView) findViewById(R.id.rv);
        listaMascotas.setAdapter(new Adapter(lista_Mascota));
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

    }


    public void inizMascota() {


        lista_Mascota = new ArrayList<>();

        lista_Mascota.add(new Mascota(R.drawable.perro1, "Box", R.drawable.dog_bone_104, R.drawable.dog_bone_yellow_112, "5"));
        lista_Mascota.add(new Mascota(R.drawable.perro2_resized, "Jas", R.drawable.dog_bone_104, R.drawable.dog_bone_yellow_112, "5"));
        lista_Mascota.add(new Mascota(R.drawable.perro3_resized, "Jim", R.drawable.dog_bone_104, R.drawable.dog_bone_yellow_112, "2"));
        lista_Mascota.add(new Mascota(R.drawable.perro4_resized, "Pix", R.drawable.dog_bone_104, R.drawable.dog_bone_yellow_112, "4"));
        lista_Mascota.add(new Mascota(R.drawable.perro5_resized, "Too", R.drawable.dog_bone_104, R.drawable.dog_bone_yellow_112, "1"));


    }

 //  METODO PARA ACTIVAR EL MENU DE LA APLICACION

    @Override public boolean onCreateOptionsMenu(Menu mimenu) {
        getMenuInflater().inflate(R.menu.menu_action_bar, mimenu);
        return true;
    }



    }


