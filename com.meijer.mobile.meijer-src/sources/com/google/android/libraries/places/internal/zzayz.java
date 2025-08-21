package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class zzayz implements Iterable, Serializable {
    public static final zzayz zzb = new zzayy(zzbap.zzb);
    private int zza = 0;

    zzayz() {
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i10);

    abstract byte zzb(int i10);

    public abstract int zzc();

    public abstract zzayz zze(int i10, int i11);

    abstract void zzf(zzays zzaysVar) throws IOException;

    protected abstract int zzg(int i10, int i11, int i12);

    protected final int zzi() {
        return this.zza;
    }

    static {
        int i10 = zzayq.zza;
    }

    public static zzayz zzh(byte[] bArr, int i10, int i11) {
        zzj(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzayy(bArr2);
    }

    static int zzj(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public final int hashCode() {
        int iZzg = this.zza;
        if (iZzg == 0) {
            int iZzc = zzc();
            iZzg = zzg(iZzc, 0, iZzc);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zza = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzayt(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzc()), zzc() <= 50 ? zzbci.zza(this) : zzbci.zza(zze(0, 47)).concat("..."));
    }
}
