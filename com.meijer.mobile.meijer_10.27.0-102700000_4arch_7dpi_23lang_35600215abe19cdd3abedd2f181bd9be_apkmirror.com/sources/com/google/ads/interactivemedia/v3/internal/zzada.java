package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class zzada {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzadb zzc;

    private zzada() {
    }

    public static int zzC(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzD(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public abstract boolean zzA() throws IOException;

    public abstract boolean zzB() throws IOException;

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzc();

    public abstract int zzd(int i10) throws zzaeg;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract zzacw zzv() throws IOException;

    public abstract String zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract void zzy(int i10) throws zzaeg;

    public abstract void zzz(int i10);

    /* synthetic */ zzada(zzacz zzaczVar) {
    }

    static zzada zzE(byte[] bArr, int i10, int i11, boolean z10) {
        zzacy zzacyVar = new zzacy(bArr, i10, i11, z10, null);
        try {
            zzacyVar.zzd(i11);
            return zzacyVar;
        } catch (zzaeg e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
