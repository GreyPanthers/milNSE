package es.alcazardesanjuan.firebase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class wineSelection extends AppCompatActivity {

    TextView usuario;
    private FirebaseAuth firebaseAuth;  
    public ImageButton bInfor;
    public ImageButton bInfor2;
    public ImageButton bInfor3;
    public ImageButton bInfor4;
    public ImageButton bInfor5;
    public ImageButton bInfor6;
    public ImageButton bInfor7;
    public ImageButton bInfor8;
    public ImageButton bInfor9;
    public ImageButton bInfor10;

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

        if (user!=null) {

            usuario.setText(user.getEmail().toString());
        }}

    //Cambiar los estados de los botones de los corchos
    public void bInfor (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoUno.class);
        startActivity(activity);

        //initialize image view object
        ImageButton im=(ImageButton) findViewById(R.id.Corcho1);
        //get clicked button id from view object
        switch(view.getId())
        {
            case R.id.Corcho1:
                //if Corcho1 is clicked than set image1
                im.setImageResource(R.drawable.corchochecked1xhdpi);
                break;
        }
    }

    public void bInfor2 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoDos.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho2);
       switch(view.getId())
        {
            case R.id.Corcho2:
                im.setImageResource(R.drawable.corchochecked2xhdpi);
                break;
        }
    }

    public void bInfor3 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoTres.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho3);
        switch(view.getId())
        {
            case R.id.Corcho3:
                im.setImageResource(R.drawable.corchochecked3xhdpi);
                break;
        }
    }

    public void bInfor4 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoCuatro.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho4);
        switch(view.getId())
        {
            case R.id.Corcho4:
                im.setImageResource(R.drawable.corchochecked4xhdpi);
                break;
        }
    }

    public void bInfor5 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoCinco.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho5);
        switch(view.getId())
        {
            case R.id.Corcho5:
                im.setImageResource(R.drawable.corchochecked5xhdpi);
                break;
        }
    }

    public void bInfor6 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoSeis.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho6);
       switch(view.getId())
        {
            case R.id.Corcho6:
                im.setImageResource(R.drawable.corchochecked6xhdpi);
                break;
        }
    }

    public void bInfor7 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoSiete.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho7);
        switch(view.getId())
        {
            case R.id.Corcho7:
                im.setImageResource(R.drawable.corchochecked7xhdpi);
                break;
        }
    }

    public void bInfor8 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoOcho.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho8);
       switch(view.getId())
        {
            case R.id.Corcho8:
                im.setImageResource(R.drawable.corchochecked8xhdpi);
                break;
        }
    }

    public void bInfor9 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoNueve.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho9);
        switch(view.getId())
        {
            case R.id.Corcho9:
                im.setImageResource(R.drawable.corchochecked9xhdpi);
                break;
        }
    }

    public void bInfor10 (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoDiez.class);
        startActivity(activity);

        ImageButton im=(ImageButton) findViewById(R.id.Corcho10);
        switch(view.getId())
        {
            case R.id.Corcho10:
                im.setImageResource(R.drawable.corchochecked10xhdpi);
                break;
        }
    }
}