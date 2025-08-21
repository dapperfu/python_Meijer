package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.r;

/* loaded from: classes4.dex */
public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f65566a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f65567b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f65568c;

    public static SupportErrorDialogFragment D0(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) r.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.f65566a = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f65567b = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f65567b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f65566a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f65568c == null) {
            this.f65568c = new AlertDialog.Builder((Context) r.l(getContext())).create();
        }
        return this.f65568c;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
