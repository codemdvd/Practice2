package ru.mirea.apasov.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

import androidx.annotation.NonNull;

public class MyTimeDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(R.layout.time_picker);
        return builder.create();
    }
}