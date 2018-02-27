package es.alcazardesanjuan.firebase1;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Movie;
import es.alcazardesanjuan.firebase1.Adaptador;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class valoracionVinoUno extends AppCompatActivity {

    private RecyclerView recyclerView;

    private ArrayList<valoraciones> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valoracion_vino_uno);
        recyclerView = (RecyclerView) findViewById(R.id.recicler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        setLisData();

        Adaptador adapter;
        adapter = new Adaptador(arrayList);



        recyclerView.setAdapter(adapter);

    }

    private AdapterView.OnItemClickListener onItemClickListener() {
        return new AdapterView.OnItemClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Dialog dialog = new Dialog(valoracionVinoUno.this);
                dialog.setContentView(R.layout.elemtorecycler);
                dialog.setTitle("Detalles de Valoracion");

                TextView valoraciones = (TextView) dialog.findViewById(R.id.txt_valoracion);
                EditText observa = (EditText) dialog.findViewById(R.id.et_valoracion);
                TextView starRate = (TextView) dialog.findViewById(R.id.MyRatingBar);

                valoraciones valor = (valoraciones) parent.getAdapter().getItem(position);
                valoraciones.setText("Valoracciones: " + valor.getValoracion());
                observa.setText("Observaciones: " + valor.getObservacion());
                starRate.setText("Rating: " + valor.getRatingStar());



                dialog.show();
            }
        };
    }

    private void setLisData() {
        arrayList = new ArrayList<valoraciones>();
        arrayList.add(new valoraciones(7, "Avenger 2: Age of Ultron", "USA", R.drawable.iconoolfatocalidadxxxhdpi));
        arrayList.add(new valoraciones(7, "Ant man", "USA", R.drawable.iconoolfatointensidadxxxhdpi));
        arrayList.add(new valoraciones(7, "Ted 2", "USA", R.drawable.iconobocaintensidadxxxhdpi));
        arrayList.add(new valoraciones(1, "Cities In Love", "China", R.drawable.iconobocacalidadxxxhdpi));
        arrayList.add(new valoraciones(1, "Attack on Titan 2: End of the World", "Japan", R.drawable.iconobocapersistenciaxxxhdpi));
        arrayList.add(new valoraciones(1, "Dragon Ball Z: The Fall of Men", "France", R.drawable.iconovistaxxxhdpi));
        arrayList.add(new valoraciones(1, "Hitman: Agent 47", "USA",R.drawable.iconovistaxxxhdpi));

    }
}



