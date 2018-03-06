package com.lucaslimeira.aulaactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        Bundle param = intent.getExtras();
        String mensagem = param.getString("texto");

        TextView textView = findViewById(R.id.textView);
        textView.setText(mensagem);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("mensagem", "Valor Retornado");
        setResult(RESULT_OK, intent);
        finish();
    }
}
