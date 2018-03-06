package com.lucaslimeira.aulaactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PrimeiraActivity extends Activity {

    private static final String TAG = "MeuApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        Log.i(TAG, "Mensagem de informação");
        Log.d(TAG, "Mensagem de debug");
        Log.w(TAG, "Mensagem de warning");
        Log.e(TAG, "Mensagem de erro");
        Log.v(TAG, "Mensagem de verbose");
    }

    public void next(View v) {
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("texto", "Deu certo!");
        startActivityForResult(intent, 5);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 5) {
            String mens = data.getStringExtra("mensagem");
            Toast.makeText(this, mens, Toast.LENGTH_LONG).show();
            Button button = findViewById(R.id.button);
            button.setEnabled(false);
        }
    }
}
