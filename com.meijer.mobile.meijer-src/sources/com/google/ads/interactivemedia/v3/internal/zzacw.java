package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class zzacw implements Iterable, Serializable {
    public static final zzacw zzb = new zzacv(zzaee.zzb);
    private int zza = 0;

    zzacw() {
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i10);

    abstract byte zzb(int i10);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i10, int i11, int i12);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int i10, int i11, int i12);

    public abstract zzacw zzj(int i10, int i11);

    public abstract zzada zzk();

    abstract void zzl(zzaco zzacoVar) throws IOException;

    protected final int zzn() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public zzacs iterator() {
        return new zzacp(this);
    }

    static {
        int i10 = zzack.zza;
    }

    private static zzacw zzc(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (zzacw) it.next();
        }
        int i11 = i10 >>> 1;
        zzacw zzacwVarZzc = zzc(it, i11);
        zzacw zzacwVarZzc2 = zzc(it, i10 - i11);
        if (a.e.API_PRIORITY_OTHER - zzacwVarZzc.zzd() >= zzacwVarZzc2.zzd()) {
            return zzafs.zzv(zzacwVarZzc, zzacwVarZzc2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + zzacwVarZzc.zzd() + "+" + zzacwVarZzc2.zzd());
    }

    static int zzm(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static zzacw zzp(byte[] bArr, int i10, int i11) {
        zzm(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzacv(bArr2);
    }

    public static zzacw zzq(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = inputStream.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    break;
                }
                i10 += i11;
            }
            zzacw zzacwVarZzp = i10 == 0 ? null : zzp(bArr, 0, i10);
            if (zzacwVarZzp == null) {
                break;
            }
            arrayList.add(zzacwVarZzp);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    static void zzr(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzagf.zza(this) : zzagf.zza(zzj(0, 47)).concat("..."));
    }

    @Deprecated
    public final void zzs(byte[] bArr, int i10, int i11, int i12) {
        zzm(0, i12, zzd());
        zzm(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }

    public final byte[] zzt() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzaee.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
