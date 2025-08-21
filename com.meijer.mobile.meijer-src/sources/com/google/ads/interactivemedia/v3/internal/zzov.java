package com.google.ads.interactivemedia.v3.internal;

import java.io.File;

/* loaded from: classes4.dex */
public final class zzov {
    private final zzlf zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzov(zzlf zzlfVar, File file, File file2, File file3) {
        this.zza = zzlfVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzlf zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzc;
    }

    public final File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long j10) {
        return this.zza.zzb() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] zze() throws java.lang.Throwable {
        /*
            r3 = this;
            byte[] r0 = r3.zze
            r1 = 0
            if (r0 != 0) goto L27
            java.io.File r0 = r3.zzd
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            com.google.ads.interactivemedia.v3.internal.zzacw r0 = com.google.ads.interactivemedia.v3.internal.zzacw.zzq(r2)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            byte[] r0 = r0.zzt()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            com.google.android.gms.common.util.l.a(r2)
            goto L25
        L18:
            r0 = move-exception
            r1 = r2
            goto L1c
        L1b:
            r0 = move-exception
        L1c:
            com.google.android.gms.common.util.l.a(r1)
            throw r0
        L20:
            r2 = r1
        L21:
            com.google.android.gms.common.util.l.a(r2)
            r0 = r1
        L25:
            r3.zze = r0
        L27:
            byte[] r0 = r3.zze
            if (r0 != 0) goto L2c
            return r1
        L2c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzov.zze():byte[]");
    }
}
