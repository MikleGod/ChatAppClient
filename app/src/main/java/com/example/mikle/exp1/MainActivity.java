package com.example.mikle.exp1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    private static final int MIN_TEXT_LENGTH = 4;
    private static final String EMPTY_STRING = "";

    private TextInputLayout mTextInputLayout;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mTextInputLayout = (TextInputLayout) findViewById(R.id.textInputLayout);
        mEditText = (EditText) findViewById(R.id.hui);
    }
}
