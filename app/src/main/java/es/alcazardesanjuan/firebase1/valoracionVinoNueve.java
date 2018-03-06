package es.alcazardesanjuan.firebase1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;

public class valoracionVinoNueve extends AppCompatActivity {

private TextView mensajeVista, mensajeOlfatoIntensidad,mensajeOlfatoCalidad,mensajeBocaIntensidad,mensajeBocaPersistencia,mensajeBocaCalidad,mensajeArmonia;
private RatingBar ratingVista,ratingOlfatoIntensidad,ratingOlfatoCalidad,ratingBocaIntensidad,ratingBocaPersistencia,ratingBocaCalidad,ratingArmonia;
private double dato, mensaje, valor1,valor2,valor3,valor4,valor5,valor6,valor7;
private double value1,value2,value3,value4,value5,value6,value7;
private String observacion;
private String testea = "puede";
public int siDeje=0;


        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        DatabaseReference insertVista = ref.child("ValVino9").child("Vista");
        DatabaseReference insertOlfatoIntensidad = ref.child("ValVino9").child("OlfatoInt");
        DatabaseReference insertOlfatoCalidad = ref.child("ValVino9").child("OlfatoCal");
        DatabaseReference insertBocaIntensidad = ref.child("ValVino9").child("BocaInt");
        DatabaseReference insertBocaPersistencia = ref.child("ValVino9").child("BocaPer");
        DatabaseReference insertBocaCalidad = ref.child("ValVino9").child("BocaCal");
        DatabaseReference insertArmonia = ref.child("ValVino9").child("Armonia");
        DatabaseReference total = ref.child("ValVino9").child("Total");



@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valoracion_vino_nueve);

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

        //Botón Leyenda
        Button b = (Button) findViewById(R.id.bLeyendaId);
        b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        startActivity(new Intent (valoracionVinoNueve.this,PopLeyenda.class));
                }
        });

        }




public void modificarVista (){
        mensaje = ratingVista.getRating();
        if (mensaje == 1 || mensaje==0){
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
        if (mensaje == 1 || mensaje==0){
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
        if (mensaje == 1 || mensaje==0){
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
        if (mensaje == 1 || mensaje==0){
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
        if (mensaje == 1 || mensaje==0){
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
        if (mensaje == 1 || mensaje==0){
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



public void enviar (final View view){

        DatabaseReference upVista = insertVista;
        DatabaseReference upOlfatoIntensidad = insertOlfatoIntensidad;
        DatabaseReference upOlfatoCalidad = insertOlfatoCalidad;
        DatabaseReference upBocaIntensidad = insertBocaIntensidad;
        DatabaseReference upBocaPeristencia = insertBocaPersistencia;
        DatabaseReference upBocaCalidad = insertBocaCalidad;
        DatabaseReference upArmonia = insertArmonia;
        DatabaseReference upTotal = total;


                upVista.runTransaction(new Transaction.Handler() {
                        @Override
                        public Transaction.Result doTransaction(MutableData mutableData) {
                                Double value1 = mutableData.getValue(double.class);
                                if (value1 == null) {
                                        mutableData.setValue(valor1);
                                } else {
                                        mutableData.setValue(value1 + valor1);
                                }

                                return Transaction.success(mutableData);
                        }

                        @Override
                        public void onComplete(DatabaseError databaseError, boolean committed, DataSnapshot dataSnapshot) {
                                System.out.println("Transaction completed");
                        }
                });
        upOlfatoIntensidad.runTransaction(new Transaction.Handler() {
                @Override
                public Transaction.Result doTransaction(MutableData mutableData) {
                        Double value2 = mutableData.getValue(double.class);
                        if (value2 == null) {
                                mutableData.setValue(valor2);
                        } else {
                                mutableData.setValue(value2 + valor2);
                        }

                        return Transaction.success(mutableData);
                }

                @Override
                public void onComplete(DatabaseError databaseError, boolean committed, DataSnapshot dataSnapshot) {
                        System.out.println("Transaction completed");
                }
        });
        upOlfatoCalidad.runTransaction(new Transaction.Handler() {
                @Override
                public Transaction.Result doTransaction(MutableData mutableData) {
                        Double value3 = mutableData.getValue(double.class);
                        if (value3 == null) {
                                mutableData.setValue(valor3);
                        } else {
                                mutableData.setValue(value3 + valor3);
                        }

                        return Transaction.success(mutableData);
                }

                @Override
                public void onComplete(DatabaseError databaseError, boolean committed, DataSnapshot dataSnapshot) {
                        System.out.println("Transaction completed");
                }
        });
        upBocaIntensidad.runTransaction(new Transaction.Handler() {
                @Override
                public Transaction.Result doTransaction(MutableData mutableData) {
                        Double value4 = mutableData.getValue(double.class);
                        if (value4 == null) {
                                mutableData.setValue(valor4);
                        } else {
                                mutableData.setValue(value4 + valor4);
                        }

                        return Transaction.success(mutableData);
                }

                @Override
                public void onComplete(DatabaseError databaseError, boolean committed, DataSnapshot dataSnapshot) {
                        System.out.println("Transaction completed");
                }
        });
        upBocaPeristencia.runTransaction(new Transaction.Handler() {
                @Override
                public Transaction.Result doTransaction(MutableData mutableData) {
                        Double value5 = mutableData.getValue(double.class);
                        if (value5 == null) {
                                mutableData.setValue(valor5);
                        } else {
                                mutableData.setValue(value5 + valor5);
                        }

                        return Transaction.success(mutableData);
                }

                @Override
                public void onComplete(DatabaseError databaseError, boolean committed, DataSnapshot dataSnapshot) {
                        System.out.println("Transaction completed");
                }
        });
        upBocaCalidad.runTransaction(new Transaction.Handler() {
                @Override
                public Transaction.Result doTransaction(MutableData mutableData) {
                        Double value6 = mutableData.getValue(double.class);
                        if (value6 == null) {
                                mutableData.setValue(valor6);
                        } else {
                                mutableData.setValue(value6 + valor6);
                        }

                        return Transaction.success(mutableData);
                }

                @Override
                public void onComplete(DatabaseError databaseError, boolean committed, DataSnapshot dataSnapshot) {
                        System.out.println("Transaction completed");
                }
        });
        upArmonia.runTransaction(new Transaction.Handler() {
                @Override
                public Transaction.Result doTransaction(MutableData mutableData) {
                        Double value7 = mutableData.getValue(double.class);
                        if (value7 == null) {
                                mutableData.setValue(valor7);
                        } else {
                                mutableData.setValue(value7 + valor7);
                        }

                        return Transaction.success(mutableData);
                }

                @Override
                public void onComplete(DatabaseError databaseError, boolean committed, DataSnapshot dataSnapshot) {
                        System.out.println("Transaction completed");
                }
        });

        if (testea =="puede") {
        //double total1 = (valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7);
        //total.setValue(total1);

            Intent activity = new Intent(getApplicationContext(), wineSelection.class);
            activity.putExtra("siDeje9",1 );
            startActivity(activity);

        testea="ya no";
        Toast.makeText(this, "Encuesta realizada correctamente", Toast.LENGTH_LONG).show();
        }
        else {
        Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }
        }
        }



