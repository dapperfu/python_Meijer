package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;

/* loaded from: classes4.dex */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f65561a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f65562b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f65563c;

    public static ErrorDialogFragment a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) r.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.f65561a = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f65562b = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f65562b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f65561a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f65563c == null) {
            this.f65563c = new AlertDialog.Builder((Context) r.l(getActivity())).create();
        }
        return this.f65563c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
