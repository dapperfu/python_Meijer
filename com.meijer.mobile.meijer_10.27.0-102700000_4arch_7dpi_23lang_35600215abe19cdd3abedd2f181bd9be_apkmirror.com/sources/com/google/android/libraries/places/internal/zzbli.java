package com.google.android.libraries.places.internal;

import Be.p;
import java.text.MessageFormat;
import java.util.logging.Level;

/* loaded from: classes6.dex */
final class zzbli extends zzbfg {
    private final zzblj zza;

    static void zzd(zzbhf zzbhfVar, int i10, String str, Object... objArr) {
        Level levelZzf = zzf(2);
        if (zzblj.zza.isLoggable(levelZzf)) {
            zzblj.zzc(zzbhfVar, levelZzf, MessageFormat.format(str, objArr));
        }
    }

    private final boolean zze(int i10) {
        if (i10 == 1) {
            return false;
        }
        this.zza.zzb();
        return false;
    }

    private static Level zzf(int i10) {
        int i11 = i10 - 1;
        return i11 != 1 ? (i11 == 2 || i11 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // com.google.android.libraries.places.internal.zzbfg
    public final void zza(int i10, String str) {
        zzc(this.zza.zzd(), i10, str);
        zze(i10);
    }

    zzbli(zzblj zzbljVar, zzbwk zzbwkVar) {
        this.zza = (zzblj) p.r(zzbljVar, "tracer");
    }

    static void zzc(zzbhf zzbhfVar, int i10, String str) {
        Level levelZzf = zzf(i10);
        if (zzblj.zza.isLoggable(levelZzf)) {
            zzblj.zzc(zzbhfVar, levelZzf, str);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfg
    public final void zzb(int i10, String str, Object... objArr) {
        String str2;
        Level levelZzf = zzf(i10);
        zze(i10);
        if (zzblj.zza.isLoggable(levelZzf)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        zza(i10, str2);
    }
}
