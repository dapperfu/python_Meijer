package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.k;
import java.io.File;

/* loaded from: classes4.dex */
public final class zzow {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    final zzlf zzb(int i10) throws IllegalArgumentException {
        String string = i10 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrC = k.c(string);
            zzacw zzacwVar = zzacw.zzb;
            zzlf zzlfVarZzg = zzlf.zzg(zzacw.zzp(bArrC, 0, bArrC.length));
            String strZzj = zzlfVarZzg.zzj();
            File fileZzb = zzox.zzb(strZzj, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzox.zzb(strZzj, "pcam", zzd());
            }
            File fileZzb2 = zzox.zzb(strZzj, "pcbc", zzd());
            if (fileZzb.exists()) {
                if (fileZzb2.exists()) {
                    return zzlfVarZzg;
                }
            }
        } catch (zzaeg unused) {
        }
        return null;
    }

    public final zzov zzc(int i10) throws IllegalArgumentException {
        zzlf zzlfVarZzb = zzb(1);
        if (zzlfVarZzb == null) {
            return null;
        }
        String strZzj = zzlfVarZzb.zzj();
        File fileZzb = zzox.zzb(strZzj, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzox.zzb(strZzj, "pcam", zzd());
        }
        return new zzov(zzlfVarZzb, fileZzb, zzox.zzb(strZzj, "pcbc", zzd()), zzox.zzb(strZzj, "pcopt", zzd()));
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FBAMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    private final String zzf() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LATMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    public zzow(Context context, int i10) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzox.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzox.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.ads.interactivemedia.v3.internal.zzlc r8, com.google.ads.interactivemedia.v3.internal.zzpc r9) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzow.zza(com.google.ads.interactivemedia.v3.internal.zzlc, com.google.ads.interactivemedia.v3.internal.zzpc):boolean");
    }
}
