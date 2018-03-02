package es.alcazardesanjuan.firebase1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class valoracionVinoDos extends AppCompatActivity {

    private TextView mensajeVista, mensajeOlfatoIntensidad,mensajeOlfatoCalidad,mensajeBocaIntensidad,mensajeBocaPersistencia,mensajeBocaCalidad,mensajeArmonia;
    private RatingBar ratingVista,ratingOlfatoIntensidad,ratingOlfatoCalidad,ratingBocaIntensidad,ratingBocaPersistencia,ratingBocaCalidad,ratingArmonia;
    private double dato, mensaje, valor1,valor2,valor3,valor4,valor5,valor6,valor7;
    private double value1,value2,value3,value4,value5,value6,value7;
    private String observacion;
    private String testea = "puede";



    DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference insertVista = ref.child("ValVino1").child("Vista");
    DatabaseReference insertOlfatoIntensidad = ref.child("ValVino1").child("OlfatoInt");
    DatabaseReference insertOlfatoCalidad = ref.child("ValVino1").child("OlfatoCal");
    DatabaseReference insertBocaIntensidad = ref.child("ValVino1").child("BocaInt");
    DatabaseReference insertBocaPersistencia = ref.child("ValVino1").child("BocaPer");
    DatabaseReference insertBocaCalidad = ref.child("ValVino1").child("BocaCal");
    DatabaseReference insertArmonia = ref.child("ValVino1").child("Armonia");
    DatabaseReference total = ref.child("ValVino1").child("Total");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valoracion_vino_dos);

        mensajeVista = (TextView) findViewById(R.id.mensajeVista);
        ratingVista = (RatingBar) findViewById(R.id.ratingVista);
        mensajeOlfatoIntensidad = (TextView) findViewById(R.id.mensajeOlfatoIntensidad);
        ratingOlfatoIntensidad = (RatingBar) findViewById(R.id.ratingOlfatoIntensidad);
        mensajeOlfatoCalidad = (TextView) findViewById(R.id.mensajeOlfatoCalidad);
        ratingOlfatoCalidad = (RatingBar) findViewById(R.id.ratingOlfatoCalidad);
        mensajeBocaIntensidad = (TextView) findViewById(R.id.mensajeBocaIntensidad);
        ratingBocaIntensidad = (RatingBar) findViewById(R.id.ratingBocaIntensidad);
        mensajeBocaPersistencia = (TextView) findViewById(R.id.mensajeBocaPersistencia);
        ratingBocaPersistencia = (RatingBar) findViewById(R.id.ratingBocaPersistencia);
        mensajeBocaCalidad = (TextView) findViewById(R.id.mensajeBocaCalidad);
        ratingBocaCalidad = (RatingBar) findViewById(R.id.ratingBocaCalidad);
        mensajeArmonia = (TextView) findViewById(R.id.mensajeArmonia);
        ratingArmonia = (RatingBar) findViewById(R.id.ratingArmonia);


        ratingVista.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                modificarVista();
            }
        });
        ratingOlfatoIntensidad.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                modificarOlfatoIntensidad();
            }
        });
        ratingOlfatoCalidad.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                modificarOlfatoCalidad();
            }
        });
        ratingBocaIntensidad.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                modificarBocaIntensidad();
            }
        });
        ratingBocaPersistencia.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                modificarBocaPersistencia();
            }
        });
        ratingBocaCalidad.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                modificarBocaCalidad();
            }
        });
        ratingArmonia.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                modificarArmonia();
            }
        });

    }
    @Override
    protected void onStart(){
        super.onStart();

        insertVista.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value1 = dataSnapshot.getValue(double.class);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        insertOlfatoIntensidad.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value2 = dataSnapshot.getValue(double.class);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        insertOlfatoCalidad.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value3 = dataSnapshot.getValue(double.class);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        insertBocaIntensidad.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value4 = dataSnapshot.getValue(double.class);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        insertBocaPersistencia.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value5 = dataSnapshot.getValue(double.class);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        insertBocaCalidad.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value6 = dataSnapshot.getValue(double.class);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        insertArmonia.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value7 = dataSnapshot.getValue(double.class);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });


    }


    public void modificarVista (){
        mensaje = ratingVista.getRating();
        if (mensaje == 1){
            dato = 0;
            valor1= dato+value1;
            observacion = "Eliminado";
            mensajeVista.setText(observacion);
        }
        else if (mensaje == 2){
            dato = 2;
            valor1= dato+value1;
            observacion ="Insuficiente";
            mensajeVista.setText(observacion);
        }
        else if (mensaje == 3){
            dato = 5;
            valor1= dato+value1;
            observacion ="Regular";
            mensajeVista.setText(observacion);
        }
        else if (mensaje == 4){
            dato = 7;
            valor1= dato+value1;
            observacion ="Correcto";
            mensajeVista.setText(observacion);
        }
        else if (mensaje == 5){
            dato = 10;
            valor1= dato+value1;
            observacion ="Bueno";
            mensajeVista.setText(observacion);
        }
        else if (mensaje == 6){
            dato = 14;
            valor1= dato+value1;
            observacion ="Muy bueno";
            mensajeVista.setText(observacion);
        }
        else {
            dato = 16;
            valor1= dato+value1;
            observacion ="Excelente";
            mensajeVista.setText(observacion);
        }
    }
    public void modificarOlfatoIntensidad (){
        mensaje = ratingOlfatoIntensidad.getRating();
        if (mensaje == 1){
            dato = 0;
            valor2= dato+value2;
            observacion = "Eliminado";
            mensajeOlfatoIntensidad.setText(observacion);
        }
        else if (mensaje == 2){
            dato = 2;
            valor2= dato+value2;
            observacion ="Insuficiente";
            mensajeOlfatoIntensidad.setText(observacion);
        }
        else if (mensaje == 3){
            dato = 4;
            valor2= dato+value2;
            observacion ="Regular";
            mensajeOlfatoIntensidad.setText(observacion);
        }
        else if (mensaje == 4){
            dato = 6;
            valor2= dato+value2;
            observacion ="Correcto";
            mensajeOlfatoIntensidad.setText(observacion);
        }
        else if (mensaje == 5){
            dato = 8;
            valor2= dato+value2;
            observacion ="Bueno";
            mensajeOlfatoIntensidad.setText(observacion);
        }
        else if (mensaje == 6){
            dato = 10;
            valor2= dato+value2;
            observacion ="Muy bueno";
            mensajeOlfatoIntensidad.setText(observacion);
        }
        else {
            dato = 12;
            valor2= dato+value2;
            observacion ="Excelente";
            mensajeOlfatoIntensidad.setText(observacion);
        }
    }
    public void modificarOlfatoCalidad (){
        mensaje = ratingOlfatoCalidad.getRating();
        if (mensaje == 1){
            dato = 0;
            valor3= dato+value3;
            observacion = "Eliminado";
            mensajeOlfatoCalidad.setText(observacion);
        }
        else if (mensaje == 2){
            dato = 5;
            valor3= dato+value3;
            observacion ="Insuficiente";
            mensajeOlfatoCalidad.setText(observacion);
        }
        else if (mensaje == 3){
            dato = 8;
            valor3= dato+value3;
            observacion ="Regular";
            mensajeOlfatoCalidad.setText(observacion);
        }
        else if (mensaje == 4){
            dato = 11;
            valor3= dato+value3;
            observacion ="Correcto";
            mensajeOlfatoCalidad.setText(observacion);
        }
        else if (mensaje == 5){
            dato = 14;
            valor3= dato+value3;
            observacion ="Bueno";
            mensajeOlfatoCalidad.setText(observacion);
        }
        else if (mensaje == 6){
            dato = 17;
            valor3= dato+value3;
            observacion ="Muy bueno";
            mensajeOlfatoCalidad.setText(observacion);
        }
        else {
            dato = 20;
            valor3= dato+value3;
            observacion ="Excelente";
            mensajeOlfatoCalidad.setText(observacion);
        }
    }
    public void modificarBocaIntensidad(){
        mensaje = ratingBocaIntensidad.getRating();
        if (mensaje == 1){
            dato = 0;
            valor4= dato+value4;
            observacion = "Eliminado";
            mensajeBocaIntensidad.setText(observacion);
        }
        else if (mensaje == 2){
            dato = 2;
            valor4= dato+value4;
            observacion ="Insuficiente";
            mensajeBocaIntensidad.setText(observacion);
        }
        else if (mensaje == 3){
            dato = 3;
            valor4= dato+value4;
            observacion ="Regular";
            mensajeBocaIntensidad.setText(observacion);
        }
        else if (mensaje == 4){
            dato = 5;
            valor4= dato+value4;
            observacion ="Correcto";
            mensajeBocaIntensidad.setText(observacion);
        }
        else if (mensaje == 5){
            dato = 7;
            valor4= dato+value4;
            observacion ="Bueno";
            mensajeBocaIntensidad.setText(observacion);
        }
        else if (mensaje == 6){
            dato = 9;
            valor4= dato+value4;
            observacion ="Muy bueno";
            mensajeBocaIntensidad.setText(observacion);
        }
        else {
            dato = 11;
            valor4= dato+value4;
            observacion ="Excelente";
            mensajeBocaIntensidad.setText(observacion);
        }
    }
    public void modificarBocaPersistencia(){
        mensaje = ratingBocaPersistencia.getRating();
        if (mensaje == 1){
            dato = 0;
            valor5= dato+value5;
            observacion = "Eliminado";
            mensajeBocaPersistencia.setText(observacion);
        }
        else if (mensaje == 2){
            dato = 2;
            valor5= dato+value5;
            observacion ="Insuficiente";
            mensajeBocaPersistencia.setText(observacion);
        }
        else if (mensaje == 3){
            dato = 3;
            valor5= dato+value5;
            observacion ="Regular";
            mensajeBocaPersistencia.setText(observacion);
        }
        else if (mensaje == 4){
            dato = 5;
            valor5= dato+value5;
            observacion ="Correcto";
            mensajeBocaPersistencia.setText(observacion);
        }
        else if (mensaje == 5){
            dato = 7;
            valor5= dato+value5;
            observacion ="Bueno";
            mensajeBocaPersistencia.setText(observacion);
        }
        else if (mensaje == 6){
            dato = 9;
            valor5= dato+value5;
            observacion ="Muy bueno";
            mensajeBocaPersistencia.setText(observacion);
        }
        else {
            dato = 11;
            valor5= dato+value5;
            observacion ="Excelente";
            mensajeBocaPersistencia.setText(observacion);
        }
    }
    public void modificarBocaCalidad(){
        mensaje = ratingBocaCalidad.getRating();
        if (mensaje == 1){
            dato = 0;
            valor6= dato+value6;
            observacion = "Eliminado";
            mensajeBocaCalidad.setText(observacion);
        }
        else if (mensaje == 2){
            dato = 5;
            valor6= dato+value6;
            observacion ="Insuficiente";
            mensajeBocaCalidad.setText(observacion);
        }
        else if (mensaje == 3){
            dato = 8;
            valor6= dato+value6;
            observacion ="Regular";
            mensajeBocaCalidad.setText(observacion);
        }
        else if (mensaje == 4){
            dato = 11;
            valor6= dato+value6;
            observacion ="Correcto";
            mensajeBocaCalidad.setText(observacion);
        }
        else if (mensaje == 5){
            dato = 14;
            valor6= dato+value6;
            observacion ="Bueno";
            mensajeBocaCalidad.setText(observacion);
        }
        else if (mensaje == 6){
            dato = 17;
            valor6= dato+value6;
            observacion ="Muy bueno";
            mensajeBocaCalidad.setText(observacion);
        }
        else {
            dato = 20;
            valor6= dato+value6;
            observacion ="Excelente";
            mensajeBocaCalidad.setText(observacion);
        }
    }
    public void modificarArmonia(){
        mensaje = ratingArmonia.getRating();
        if (mensaje == 1){
            dato = 0;
            valor7= dato+value7;
            observacion = "Eliminado";
            mensajeArmonia.setText(observacion);
        }
        else if (mensaje == 2){
            dato = 2;
            valor7= dato+value7;
            observacion ="Insuficiente";
            mensajeArmonia.setText(observacion);
        }
        else if (mensaje == 3){
            dato = 4;
            valor7= dato+value7;
            observacion ="Regular";
            mensajeArmonia.setText(observacion);
        }
        else if (mensaje == 4){
            dato = 5;
            valor7= dato+value7;
            observacion ="Correcto";
            mensajeArmonia.setText(observacion);
        }
        else if (mensaje == 5){
            dato = 7;
            valor7= dato+value7;
            observacion ="Bueno";
            mensajeArmonia.setText(observacion);
        }
        else if (mensaje == 6){
            dato = 9;
            valor7= dato+value7;
            observacion ="Muy bueno";
            mensajeArmonia.setText(observacion);
        }
        else {
            dato = 10;
            valor7= dato+value7;
            observacion ="Excelente";
            mensajeArmonia.setText(observacion);
        }
    }
    public void enviar (View view){
        if (testea =="puede") {
            insertVista.setValue(valor1);
            insertOlfatoIntensidad.setValue(valor2);
            insertOlfatoCalidad.setValue(valor3);
            insertBocaIntensidad.setValue(valor4);
            insertBocaPersistencia.setValue(valor5);
            insertBocaCalidad.setValue(valor6);
            insertArmonia.setValue(valor7);
            double total1 = (valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7);
            total.setValue(total1);

            testea="ya no";
            Toast.makeText(this, "Encuesta realizada correctamente", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }
    }
}



