package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class zzadf extends zzaco {
    private static final Logger zzb = Logger.getLogger(zzadf.class.getName());
    private static final boolean zzc = zzago.zzx();
    zzadg zza;

    private zzadf() {
        throw null;
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(int i10, zzacw zzacwVar) throws IOException;

    public abstract void zzf(int i10, int i11) throws IOException;

    public abstract void zzg(int i10) throws IOException;

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzi(long j10) throws IOException;

    public abstract void zzj(int i10, int i11) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    abstract void zzm(int i10, zzafb zzafbVar, zzaft zzaftVar) throws IOException;

    public abstract void zzn(int i10, zzafb zzafbVar) throws IOException;

    public abstract void zzo(int i10, zzacw zzacwVar) throws IOException;

    public abstract void zzp(int i10, String str) throws IOException;

    public abstract void zzr(int i10, int i11) throws IOException;

    public abstract void zzs(int i10, int i11) throws IOException;

    public abstract void zzt(int i10) throws IOException;

    public abstract void zzu(int i10, long j10) throws IOException;

    public abstract void zzv(long j10) throws IOException;

    /* synthetic */ zzadf(zzade zzadeVar) {
    }

    @Deprecated
    static int zzw(int i10, zzafb zzafbVar, zzaft zzaftVar) {
        int iZzz = zzz(i10 << 3);
        return iZzz + iZzz + ((zzach) zzafbVar).zzat(zzaftVar);
    }

    static int zzx(zzafb zzafbVar, zzaft zzaftVar) {
        int iZzat = ((zzach) zzafbVar).zzat(zzaftVar);
        return zzz(iZzat) + iZzat;
    }

    final void zzC(String str, zzagq zzagqVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzagqVar);
        byte[] bytes = str.getBytes(zzaee.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzadd(e10);
        }
    }

    public static int zzA(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzagr.zzc(str);
        } catch (zzagq unused) {
            length = str.getBytes(zzaee.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
