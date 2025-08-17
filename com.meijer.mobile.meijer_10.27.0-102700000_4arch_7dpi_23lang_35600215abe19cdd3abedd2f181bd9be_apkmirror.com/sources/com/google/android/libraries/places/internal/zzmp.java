package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes6.dex */
public abstract class zzmp {
    public abstract String zza();

    public abstract int zzb();

    public abstract zzmo zzc();

    public static zzmn zzd(Context context) {
        String packageName = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zzml zzmlVar = new zzml();
        zzmlVar.zza(packageName);
        zzmlVar.zzb(i10);
        zzmlVar.zzc(zzmo.PROGRAMMATIC_API);
        return zzmlVar;
    }
}
