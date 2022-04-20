package ru.mirea.apasov.dialog;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LinearLayout baseLayout = new LinearLayout(getActivity());
        baseLayout.setPadding(20,20,20,20);
        baseLayout.setOrientation(LinearLayout.HORIZONTAL);
        ProgressBar progressBar = new ProgressBar(getActivity());

        TextView text = new TextView(getActivity());
        text.setPadding(20,20,20,20);
        text.setGravity(Gravity.CENTER);
        text.setText("Подождите...");

        baseLayout.addView(progressBar);
        baseLayout.addView(text);

        builder.setView(baseLayout);
        return builder.create();
    }
}
