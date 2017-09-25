package com.mirrosimage.showroom;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvLogin = (TextView) findViewById(R.id.tvLogin);

        TextView tvSenha = (TextView) findViewById(R.id.tvSenha);

        EditText etLogin = (EditText) findViewById(R.id.etLogin);

        EditText etSenha = (EditText) findViewById(R.id.etSenha);

        Button btEntrar = (Button) findViewById(R.id.btEntrar);

        Button btSair = (Button) findViewById(R.id.btSair);

        Button btCadastro = (Button) findViewById(R.id.btCadastro);

        Typeface font = Typeface.createFromAsset(getAssets(), "zekton rg.ttf");
        tvLogin.setTypeface(font);
        tvSenha.setTypeface(font);
        etLogin.setTypeface(font);
        etSenha.setTypeface(font);
        btEntrar.setTypeface(font);
        btSair.setTypeface(font);
        btCadastro.setTypeface(font);
    }

    public void entrar(View v) {
        Intent intent = new Intent(MainActivity.this,SplashCardboard.class);
        startActivity(intent);
        MainActivity.this.finish();
    }

    public void cadastro(View v) {
        Intent intent = new Intent(MainActivity.this,Cadastro.class);
        startActivity(intent);
        MainActivity.this.finish();
    }

    public void sair(View v) {
        finish();
    }

}
