package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.maps.internal.HttpHeaders;

/* loaded from: classes6.dex */
public final class zzir {
    private final Context zza;

    public zzir(Context context) {
        this.zza = context;
    }

    private final void zzc(zzbip zzbipVar) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        String strZza = zzmh.zza(context.getPackageManager(), context.getPackageName());
        if (TextUtils.isEmpty(strZza)) {
            return;
        }
        zzbik zzbikVar = zzbip.zza;
        zzbipVar.zzc(zzbil.zzc(HttpHeaders.X_ANDROID_PACKAGE, zzbikVar), context.getPackageName());
        zzbipVar.zzc(zzbil.zzc("X-Places-Android-Sdk", zzbikVar), "4.4.1");
        zzbipVar.zzc(zzbil.zzc(HttpHeaders.X_ANDROID_CERT, zzbikVar), strZza);
    }

    public final zzbip zza(String str, String str2) throws PackageManager.NameNotFoundException {
        zzbip zzbipVar = new zzbip();
        zzbipVar.zzc(zzbil.zzc("X-Goog-Api-Key", zzbip.zza), str);
        zzc(zzbipVar);
        zzd(zzbipVar, str2);
        return zzbipVar;
    }

    public final zzbip zzb(String str, String str2) throws PackageManager.NameNotFoundException {
        zzbip zzbipVar = new zzbip();
        zzbipVar.zzc(zzbil.zzc("Authorization", zzbip.zza), "Bearer ".concat(String.valueOf(str)));
        zzd(zzbipVar, str2);
        zzc(zzbipVar);
        return zzbipVar;
    }

    private static final void zzd(zzbip zzbipVar, String str) {
        if (!str.isEmpty()) {
            zzbipVar.zzc(zzbil.zzc("X-Goog-FieldMask", zzbip.zza), str);
        }
    }
}
