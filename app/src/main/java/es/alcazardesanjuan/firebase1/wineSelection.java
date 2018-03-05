package es.alcazardesanjuan.firebase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class wineSelection extends AppCompatActivity {

    TextView usuario;
    private FirebaseAuth firebaseAuth;
    private ImageButton bInfor;
    private ImageButton bInfor2;
    private ImageButton bInfor3;
    private ImageButton bInfor4;
    private ImageButton bInfor5;
    private ImageButton bInfor6;
    private ImageButton bInfor7;
    private ImageButton bInfor8;
    private ImageButton bInfor9;
    private ImageButton bInfor10;
    public  int siDeje=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine_selection);
        usuario = (TextView) findViewById( R.id.eti_nombreA );
        bInfor = (ImageButton) findViewById(R.id.Corcho1);
        bInfor2 = (ImageButton) findViewById(R.id.Corcho2);
        bInfor3 = (ImageButton) findViewById(R.id.Corcho3);
        bInfor4 = (ImageButton) findViewById(R.id.Corcho4);
        bInfor5 = (ImageButton) findViewById(R.id.Corcho5);
        bInfor6 = (ImageButton) findViewById(R.id.Corcho6);
        bInfor7 = (ImageButton) findViewById(R.id.Corcho7);
        bInfor8 = (ImageButton) findViewById(R.id.Corcho8);
        bInfor9 = (ImageButton) findViewById(R.id.Corcho9);
        bInfor10 = (ImageButton) findViewById(R.id.Corcho10);

        firebaseAuth=FirebaseAuth.getInstance();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {
           int deja = (Integer) extras.get("siDeje");
            siDeje = deja;
            bInfor.setImageResource(R.drawable.corchochecked1xhdpi);
        }

        if (user!=null) {

            usuario.setText(user.getEmail().toString());
        }}

    //Cambiar los estados de los botones de los corchos
    public void bInfor (View view){

        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoUno.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho1);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked1xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }

    public void bInfor2 (View view){
        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoDos.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho2);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked2xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }

    public void bInfor3 (View view){
        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoTres.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho3);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked3xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }


    public void bInfor4 (View view){
        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoCuatro.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho4);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked4xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }


    public void bInfor5 (View view){
        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoCinco.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho5);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked5xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }


    public void bInfor6 (View view){
        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoSeis.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho6);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked6xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }


    public void bInfor7 (View view){
        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoSiete.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho7);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked7xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }


    public void bInfor8 (View view){
        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoOcho.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho8);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked8xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }


    public void bInfor9 (View view){
        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoNueve.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho9);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked9xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }


    public void bInfor10 (View view){
        if (siDeje==0) {
            Intent activity = new Intent(getApplicationContext(), valoracionVinoDiez.class);
            startActivity(activity);
            ImageButton im = (ImageButton) findViewById(R.id.Corcho10);
            siDeje=1;
            bInfor.setImageResource(R.drawable.corchochecked10xhdpi);
            //initialize image view object

        }else {

            Toast.makeText(this, "ya ha insertado un dato no puede insertar mas", Toast.LENGTH_LONG).show();
        }

    }

    public void aboutus(View v){
        Intent activity= new Intent(getApplicationContext(), aboutUs.class);
        startActivity(activity);
    }
}