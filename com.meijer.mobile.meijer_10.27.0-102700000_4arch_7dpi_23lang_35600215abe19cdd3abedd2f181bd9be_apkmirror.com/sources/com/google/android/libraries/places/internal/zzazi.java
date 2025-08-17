package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class zzazi extends zzays {
    private static final Logger zza = Logger.getLogger(zzazi.class.getName());
    private static final boolean zzb = zzbct.zza();
    public static final /* synthetic */ int zzf = 0;
    zzazj zze;

    private zzazi() {
        throw null;
    }

    public abstract void zzK(int i10, int i11) throws IOException;

    public abstract void zzL(int i10, int i11) throws IOException;

    public abstract void zzM(int i10, int i11) throws IOException;

    public abstract void zzN(int i10, int i11) throws IOException;

    public abstract void zzO(int i10, long j10) throws IOException;

    @Override // com.google.android.libraries.places.internal.zzays
    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzc();

    public abstract void zzi(int i10, long j10) throws IOException;

    public abstract void zzj(int i10, boolean z10) throws IOException;

    public abstract void zzk(int i10, String str) throws IOException;

    public abstract void zzl(int i10, zzayz zzayzVar) throws IOException;

    abstract void zzm(int i10, zzbbl zzbblVar, zzbbz zzbbzVar) throws IOException;

    public abstract void zzn(int i10, zzbbl zzbblVar) throws IOException;

    public abstract void zzo(int i10, zzayz zzayzVar) throws IOException;

    public abstract void zzp(byte b10) throws IOException;

    public abstract void zzq(int i10) throws IOException;

    public abstract void zzr(int i10) throws IOException;

    public abstract void zzs(int i10) throws IOException;

    public abstract void zzt(long j10) throws IOException;

    public abstract void zzu(long j10) throws IOException;

    public abstract void zzx() throws IOException;

    /* synthetic */ zzazi(byte[] bArr) {
    }

    static int zzD(zzbbl zzbblVar, zzbbz zzbbzVar) {
        int iZzbb = ((zzaym) zzbblVar).zzbb(zzbbzVar);
        return zzz(iZzbb) + iZzbb;
    }

    @Deprecated
    static int zzG(int i10, zzbbl zzbblVar, zzbbz zzbbzVar) {
        int iZzz = zzz(i10 << 3);
        return iZzz + iZzz + ((zzaym) zzbblVar).zzbb(zzbbzVar);
    }

    public static zzazi zzy(byte[] bArr, int i10, int i11) {
        return new zzazf(bArr, i10, i11);
    }

    final void zzF(String str, zzbcv zzbcvVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzbcvVar);
        byte[] bytes = str.getBytes(zzbap.zza);
        try {
            int length = bytes.length;
            zzr(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzazg(e10);
        }
    }

    public static int zzA(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzbcw.zza(str);
        } catch (zzbcv unused) {
            length = str.getBytes(zzbap.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzC(zzbbl zzbblVar) {
        int iZzbl = zzbblVar.zzbl();
        return zzz(iZzbl) + iZzbl;
    }

    public static int zzz(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzE() {
        if (zzc() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
