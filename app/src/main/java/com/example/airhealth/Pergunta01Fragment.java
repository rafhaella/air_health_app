package com.example.airhealth;

import androidx.fragment.app.DialogFragment;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;


public class Pergunta01Fragment extends DialogFragment{

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.txtDialog)
                .setPositiveButton(R.string.txtSim, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent it = new Intent(getActivity(), MainActivity4.class);
                        startActivity(it);
                    }
                })
                .setNegativeButton(R.string.txtNao, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            NegativeResp01 alert = new NegativeResp01();
                            alert.show(getParentFragmentManager(), "misseles");
                        }
                });
        // Create the AlertDialog object and return it
        return builder.create();

    }
}