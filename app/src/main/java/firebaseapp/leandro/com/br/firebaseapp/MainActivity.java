package firebaseapp.leandro.com.br.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usuarioReferencia = databaseReferencia.child("usuarios");
    private DatabaseReference produtoReferencia = databaseReferencia.child("produtos");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario usuario = new Usuario();
        usuario.setNome("Ana Helena");
        usuario.setSobrenome("Silva");
        usuario.setSexo("Feminino");
        usuario.setIdade(25);

        Produto produto = new Produto();
        produto.setDescricao("Galaxy Note Ultra Mega Power");
        produto.setCor("Preto");
        produto.setFabricante("Samsung");

        usuarioReferencia.child("003").setValue( usuario );
        produtoReferencia.child("001").setValue( produto );

    }
}
