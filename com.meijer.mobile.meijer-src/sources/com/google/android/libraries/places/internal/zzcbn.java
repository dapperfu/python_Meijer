package com.google.android.libraries.places.internal;

import fsimpl.C14170dq;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public class zzcbn implements Serializable, Comparable {

    @JvmField
    public static final zzcbn zza = new zzcbn(new byte[0]);
    private final byte[] zzb;
    private transient int zzc;
    private transient String zzd;

    public zzcbn(byte[] data) {
        Intrinsics.j(data, "data");
        this.zzb = data;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcbn) {
            zzcbn zzcbnVar = (zzcbn) obj;
            int iZzj = zzcbnVar.zzj();
            byte[] bArr = this.zzb;
            int length = bArr.length;
            return iZzj == length && zzcbnVar.zzo(0, bArr, 0, length);
        }
        return false;
    }

    public final byte[] zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final void zzc(int i10) {
        this.zzc = i10;
    }

    public final void zzd(String str) {
        this.zzd = str;
    }

    public zzcbn zzh() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.zzb;
            int length = bArr.length;
            if (i10 >= length) {
                return this;
            }
            int i11 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                Intrinsics.i(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                while (i11 < bArrCopyOf.length) {
                    int i12 = i11 + 1;
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                    i11 = i12;
                }
                return new zzcbn(bArrCopyOf);
            }
            i10 = i11;
        }
    }

    public byte[] zzl() {
        return this.zzb;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzcbn other = (zzcbn) obj;
        Intrinsics.j(other, "other");
        int iZzj = zzj();
        int iZzj2 = other.zzj();
        int iMin = Math.min(iZzj, iZzj2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iZzi = zzi(i10) & 255;
            int iZzi2 = other.zzi(i10) & 255;
            if (iZzi != iZzi2) {
                return iZzi >= iZzi2 ? 1 : -1;
            }
        }
        if (iZzj == iZzj2) {
            return 0;
        }
        return iZzj >= iZzj2 ? 1 : -1;
    }

    public int hashCode() {
        int i10 = this.zzc;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.zzb);
        this.zzc = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a6, code lost:
    
        r6 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzcbn.toString():java.lang.String");
    }

    public final String zze() {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        String strZza = zzccc.zza(zzl());
        this.zzd = strZza;
        return strZza;
    }

    public final String zzf() {
        return zzcbe.zza(this.zzb, null, 1, null);
    }

    public String zzg() {
        byte[] bArr = this.zzb;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            cArr[i10] = zzcce.zza()[(b10 >> 4) & 15];
            cArr[i10 + 1] = zzcce.zza()[b10 & C14170dq.MULTIPLY];
            i10 += 2;
        }
        return StringsKt.A(cArr);
    }

    public byte zzi(int i10) {
        return this.zzb[i10];
    }

    public int zzj() {
        return this.zzb.length;
    }

    public byte[] zzk() {
        byte[] bArr = this.zzb;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.i(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public void zzm(zzcbj buffer, int i10, int i11) {
        Intrinsics.j(buffer, "buffer");
        int i12 = zzcce.zza;
        Intrinsics.j(this, "<this>");
        Intrinsics.j(buffer, "buffer");
        buffer.zzz(this.zzb, 0, i11);
    }

    public boolean zzn(int i10, zzcbn other, int i11, int i12) {
        Intrinsics.j(other, "other");
        return other.zzo(0, this.zzb, 0, i12);
    }

    public boolean zzo(int i10, byte[] other, int i11, int i12) {
        Intrinsics.j(other, "other");
        if (i10 < 0) {
            return false;
        }
        byte[] bArr = this.zzb;
        return i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && zzcbf.zzb(bArr, i10, other, i11, i12);
    }

    public final boolean zzp(zzcbn prefix) {
        Intrinsics.j(prefix, "prefix");
        return zzn(0, prefix, 0, prefix.zzb.length);
    }
}
