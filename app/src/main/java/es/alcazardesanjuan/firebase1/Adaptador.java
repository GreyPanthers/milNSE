package es.alcazardesanjuan.firebase1;

import android.app.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.support.v7.widget.RecyclerView;

import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderDatos> {

    Context context;
    private List<valoraciones> listavaloracion;

    public Adaptador( List<valoraciones> listavaloracion) {


        this.listavaloracion = listavaloracion;
        if (this.listavaloracion==null){
            this.listavaloracion=new ArrayList<>();
        }
        this.context= context;
    }

    @Override
    public Adaptador.ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elemtorecycler,null,false);
        return new ViewHolderDatos(view);
    }
    @Override
    public void onBindViewHolder(Adaptador.ViewHolderDatos holder, int position) {


        holder.Rating.setOnRatingBarChangeListener(onRatingChangedListener(holder, position));

        holder.Rating.setTag(position);
        holder.Rating.setRating(listavaloracion.get(position).getRatingStar());
        holder.Votacion.setText(listavaloracion.get(position).getValoracion());
        holder.imagen.setImageResource(listavaloracion.get(position).getImagen());
        holder.Valoracion.setText(listavaloracion.get(position).getObservacion());

    }

    private RatingBar.OnRatingBarChangeListener onRatingChangedListener(final RecyclerView.ViewHolder holder, final int position) {
        return new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                valoraciones item = listavaloracion.get(position);
                item.setRatingStar(v);
                Log.i("Adapter", "star: " + v);
            }
        };
    }

    public int getItemCount(){
        return listavaloracion.size();
    }


    public class ViewHolderDatos extends RecyclerView.ViewHolder{

        TextView Votacion;
        TextView Valoracion;
        ImageView imagen;
        RatingBar Rating;

        public ViewHolderDatos(View itemView) {

            super(itemView);

            Votacion=(TextView) itemView.findViewById(R.id.txt_valoracion);
            Valoracion=(TextView)itemView.findViewById(R.id.et_valoracion);
            imagen=(ImageView)itemView.findViewById(R.id.image_lista);
            Rating=(RatingBar)itemView.findViewById(R.id.MyRatingBar);


        }




    }
}

