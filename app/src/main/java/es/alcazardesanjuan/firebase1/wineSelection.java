package es.alcazardesanjuan.firebase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class wineSelection extends AppCompatActivity {

    TextView usuario;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wine_selection);
        usuario = (TextView) findViewById( R.id.eti_nombreA );

        firebaseAuth=FirebaseAuth.getInstance();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user!=null) {

            usuario.setText(user.getEmail().toString());
        }

    }
    public void bInfor (View view){
        Intent activity=new Intent(getApplicationContext(),valoracionVinoUno.class);
        startActivity(activity);
    }
}
