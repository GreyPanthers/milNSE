package es.alcazardesanjuan.firebase1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText TxtEmail;
    private EditText TxtPassword;
    private Button Registrar;
    private Button Inicio;



    private FirebaseAuth firebaseAuth;


    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();


        TxtEmail=(EditText)findViewById(R.id.et_email);
        TxtPassword=(EditText)findViewById(R.id.et_pass);


        Registrar=(Button)findViewById(R.id.crear_cuenta);
        Inicio= (Button)findViewById(R.id.boton_entrar);

        progressDialog=new ProgressDialog(this);





        //attaching listener to button
        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                registrarUsuario();
            }
        });
        Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogearUsuario();
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser CurrentUser = firebaseAuth.getCurrentUser();
        LogearUsuario();

    }

    private void registrarUsuario() {


        //Obtenemos el email y la contraseña desde las cajas de texto
        String email = TxtEmail.getText().toString().trim();
        String password = TxtPassword.getText().toString().trim();

        //Verificamos que las cajas de texto no esten vacías
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Se debe escribir un email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Falta escribir la contraseña", Toast.LENGTH_LONG).show();
            return;
        }


        progressDialog.setMessage("Realizando registro en linea...");
        progressDialog.show();

        //creating a new user
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if (task.isSuccessful()) {

                            Toast.makeText(MainActivity.this, "Se ha registrado el usuario con el email: " +  TxtEmail.getText(), Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(MainActivity.this, "No se pudo registrar el usuario ", Toast.LENGTH_LONG).show();
                        }
                        progressDialog.dismiss();
                    }
                });
    }

    private void LogearUsuario() {


        //Obtenemos el email y la contraseña desde las cajas de texto
        String email = TxtEmail.getText().toString().trim();
        String password = TxtPassword.getText().toString().trim();
        //Verificamos que las cajas de texto no esten vacías
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Se debe escribir un email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Falta escribir la contraseña", Toast.LENGTH_LONG).show();
            return;
        }



        progressDialog.setMessage("Realizando Loggin...");
        progressDialog.show();

        //Logeando a user
        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if (task.isSuccessful()) {
                            startActivity(new Intent(MainActivity.this, wineSelection.class));

                            Toast.makeText(MainActivity.this, "Se ha logeado el usuario con el email: " +  TxtEmail.getText(), Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(MainActivity.this, "No se pudo logear el usuario ", Toast.LENGTH_LONG).show();
                        }
                        progressDialog.dismiss();
                    }
                });
    }


    public void aboutus (View view){
        Intent activity=new Intent(getApplicationContext(),aboutUs.class);
        startActivity(activity);
    }
    public void verificarCampos(){
        //Obtenemos el email y la contraseña desde las cajas de texto
        String email = TxtEmail.getText().toString().trim();
        String password = TxtPassword.getText().toString().trim();

        //Verificamos que las cajas de texto no esten vacías
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Se debe escribir un email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Falta escribir la contraseña", Toast.LENGTH_LONG).show();
            return;
        }

    }
}

