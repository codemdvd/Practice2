package ru.mirea.apasov.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");

    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Всё верно\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickShowTimePickerDialog(View view) {
        MyTimeDialogFragment timeDialogFragment = new MyTimeDialogFragment();
                timeDialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onClickShowDatePickerDialog(View view) {
        MyDataDialogFragment dataDialogFragment = new MyDataDialogFragment();
        dataDialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onClickShowProgressBar(View view) {
        MyProgressDialog progressDialogFragment = new MyProgressDialog();
        progressDialogFragment.show(getSupportFragmentManager(), "mirea");
    }
}