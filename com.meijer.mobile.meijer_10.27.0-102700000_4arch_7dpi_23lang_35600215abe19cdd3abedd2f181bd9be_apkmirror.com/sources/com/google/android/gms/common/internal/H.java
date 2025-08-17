package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.fullstory.FS;
import hd.InterfaceC14408i;

/* loaded from: classes4.dex */
public abstract class H implements DialogInterface.OnClickListener {
    public static H b(Activity activity, Intent intent, int i10) {
        return new F(intent, activity, i10);
    }

    protected abstract void a();

    public static H c(InterfaceC14408i interfaceC14408i, Intent intent, int i10) {
        return new G(intent, interfaceC14408i, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                FS.log_e("DialogRedirect", str, e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
