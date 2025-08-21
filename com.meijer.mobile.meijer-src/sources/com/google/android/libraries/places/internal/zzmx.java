package com.google.android.libraries.places.internal;

import De.p;
import Ee.M;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.maps.internal.HttpHeaders;

/* loaded from: classes6.dex */
public final class zzmx {
    private final Context zza;

    public final M zza() throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        String packageName = context.getPackageName();
        String strZza = zzmh.zza(context.getPackageManager(), packageName);
        M.a aVarA = M.a();
        if (packageName != null) {
            aVarA.f(HttpHeaders.X_ANDROID_PACKAGE, packageName);
        }
        if (strZza != null) {
            aVarA.f(HttpHeaders.X_ANDROID_CERT, strZza);
        }
        return aVarA.c();
    }

    public zzmx(Context context) {
        p.r(context, "Context must not be null.");
        this.zza = context;
    }
}
