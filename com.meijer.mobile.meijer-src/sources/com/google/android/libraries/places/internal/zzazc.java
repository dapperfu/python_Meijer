package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public abstract class zzazc {
    public static final /* synthetic */ int zzf = 0;
    private static volatile int zzg = 100;
    int zza;
    int zzb;
    final int zzc = zzg;
    int zzd = a.e.API_PRIORITY_OTHER;
    zzazd zze;

    private zzazc() {
    }

    public static zzazc zzG(byte[] bArr, int i10, int i11) {
        return zzH(bArr, 0, i11, false);
    }

    public static int zzM(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzN(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public abstract void zzA(int i10);

    public abstract boolean zzB() throws IOException;

    public abstract int zzC();

    public final int zzL(int i10) {
        int i11 = this.zzd;
        this.zzd = a.e.API_PRIORITY_OTHER;
        return i11;
    }

    public abstract int zza() throws IOException;

    public abstract void zzb(int i10) throws zzbar;

    public abstract boolean zzc(int i10) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzayz zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract int zzz(int i10) throws zzbar;

    /* synthetic */ zzazc(byte[] bArr) {
    }

    public static zzazc zzF(InputStream inputStream, int i10) {
        return new zzazb(inputStream, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, null);
    }

    static zzazc zzH(byte[] bArr, int i10, int i11, boolean z10) {
        zzaza zzazaVar = new zzaza(bArr, 0, i11, z10, null);
        try {
            zzazaVar.zzz(i11);
            return zzazaVar;
        } catch (zzbar e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final void zzI() throws zzbar {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzbar("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzJ() throws zzbar {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzK() throws IOException {
        int iZza;
        do {
            iZza = zza();
            if (iZza != 0) {
                zzI();
                this.zzb++;
                this.zzb--;
            } else {
                return;
            }
        } while (zzc(iZza));
    }
}
