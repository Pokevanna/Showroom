package com.mirrosimage.showroom;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        TextView tvLogin = (TextView) findViewById(R.id.tvLogin);

        TextView tvSenha = (TextView) findViewById(R.id.tvSenha);

        TextView tvEmail = (TextView) findViewById(R.id.tvEmail);

        EditText etLogin = (EditText) findViewById(R.id.etLogin);

        EditText etSenha = (EditText) findViewById(R.id.etSenha);

        EditText etEmail = (EditText) findViewById(R.id.etEmail);

        Button btEntrar = (Button) findViewById(R.id.btEntrar);


        Typeface font = Typeface.createFromAsset(getAssets(), "zekton rg.ttf");
        tvLogin.setTypeface(font);
        tvSenha.setTypeface(font);
        tvEmail.setTypeface(font);
        etLogin.setTypeface(font);
        etSenha.setTypeface(font);
        etEmail.setTypeface(font);
        btEntrar.setTypeface(font);


    }

    public void cadastrar(View v) {
        Intent intent = new Intent(Cadastro.this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Cadastro efetuado com sucesso!", Toast.LENGTH_SHORT).show();
        Cadastro.this.finish();
    }
}
