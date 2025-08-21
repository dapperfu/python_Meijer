package com.google.android.libraries.places.internal;

import De.p;
import java.util.UUID;

/* loaded from: classes6.dex */
abstract class zzqc implements zzra {
    private final UUID zza;
    private final String zzb;
    private final String zzc;
    private Thread zzd;

    @Override // com.google.android.libraries.places.internal.zzra
    public final Thread zza() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final zzra zzb() {
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final UUID zzc() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final String zzd() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final String zze() {
        return this.zzc;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = zzqj.zzb;
        p.q(this);
        zzqy zzqyVarZzd = zzqj.zzd();
        zzra zzraVar = zzqyVarZzd.zzb;
        if (zzraVar == null) {
            String strZze = zze();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZze).length() + 101);
            sb2.append("Tried to end [");
            sb2.append(strZze);
            sb2.append("], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
            throw new zzqk(sb2.toString());
        }
        if (this == zzraVar) {
            zzqj.zzc(zzqyVarZzd, null);
            this.zzd = null;
            return;
        }
        String strZze2 = zze();
        String strZze3 = zzraVar.zze();
        StringBuilder sb3 = new StringBuilder(String.valueOf(strZze2).length() + 79 + String.valueOf(strZze3).length() + 1);
        sb3.append("Tried to end span ");
        sb3.append(strZze2);
        sb3.append(", but that span is not the current span. The current span is ");
        sb3.append(strZze3);
        sb3.append(".");
        throw new zzql(sb3.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzqc.toString():java.lang.String");
    }

    zzqc(String str, String str2, String str3, int i10, UUID uuid, String str4, zzqy zzqyVar) {
        this.zzc = (String) p.q(str);
        this.zza = uuid;
        this.zzb = str4;
        zzrj zzrjVar = zzqyVar.zzc;
        this.zzd = Thread.currentThread();
    }

    public static String zzf(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }
}
