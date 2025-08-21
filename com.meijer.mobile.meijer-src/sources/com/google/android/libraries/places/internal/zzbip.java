package com.google.android.libraries.places.internal;

import De.p;
import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbip {
    private Object[] zzd;
    private int zze;
    private static final Logger zzc = Logger.getLogger(zzbip.class.getName());
    public static final zzbik zza = new zzbii();
    static final BaseEncoding zzb = BaseEncoding.b().l();

    public zzbip() {
    }

    private final Object zzi(int i10) {
        return this.zzd[i10 + i10 + 1];
    }

    private final int zzk() {
        Object[] objArr = this.zzd;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final boolean zzl() {
        return this.zze == 0;
    }

    final int zza() {
        return this.zze;
    }

    zzbip(int i10, Object[] objArr) {
        this.zze = i10;
        this.zzd = objArr;
    }

    private final byte[] zzh(int i10) {
        return (byte[]) this.zzd[i10 + i10];
    }

    private final void zzm(int i10) {
        Object[] objArr = new Object[i10];
        if (!zzl()) {
            Object[] objArr2 = this.zzd;
            int i11 = this.zze;
            System.arraycopy(objArr2, 0, objArr, 0, i11 + i11);
        }
        this.zzd = objArr;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.zze; i10++) {
            if (i10 != 0) {
                sb2.append(',');
            }
            byte[] bArrZzh = zzh(i10);
            Charset charset = StandardCharsets.US_ASCII;
            String str = new String(bArrZzh, charset);
            sb2.append(str);
            sb2.append('=');
            if (str.endsWith("-bin")) {
                sb2.append(zzb.f(zzj(i10)));
            } else {
                sb2.append(new String(zzj(i10), charset));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public final Object zzb(zzbil zzbilVar) {
        int i10 = this.zze;
        do {
            i10--;
            if (i10 < 0) {
                return null;
            }
        } while (!Arrays.equals(zzbilVar.zze(), zzh(i10)));
        Object objZzi = zzi(i10);
        if (objZzi instanceof byte[]) {
            return zzbilVar.zzb((byte[]) objZzi);
        }
        throw null;
    }

    public final void zzc(zzbil zzbilVar, Object obj) {
        p.r(zzbilVar, "key");
        p.r(obj, "value");
        int i10 = this.zze;
        int i11 = i10 + i10;
        if (i11 == 0 || i11 == zzk()) {
            zzm(Math.max(i11 + i11, 8));
        }
        int i12 = this.zze;
        this.zzd[i12 + i12] = zzbilVar.zze();
        int i13 = this.zze;
        this.zzd[i13 + i13 + 1] = zzbilVar.zza(obj);
        this.zze++;
    }

    final byte[][] zze() {
        int i10 = this.zze;
        int i11 = i10 + i10;
        byte[][] bArr = new byte[i11][];
        Object[] objArr = this.zzd;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i11);
            return bArr;
        }
        for (int i12 = 0; i12 < this.zze; i12++) {
            int i13 = i12 + i12;
            bArr[i13] = zzh(i12);
            bArr[i13 + 1] = zzj(i12);
        }
        return bArr;
    }

    private final byte[] zzj(int i10) {
        Object objZzi = zzi(i10);
        if (objZzi instanceof byte[]) {
            return (byte[]) objZzi;
        }
        throw null;
    }

    public final void zzd(zzbil zzbilVar) {
        if (!zzl()) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.zze;
                if (i10 < i12) {
                    if (!Arrays.equals(zzbilVar.zze(), zzh(i10))) {
                        int i13 = i11 + i11;
                        this.zzd[i13] = zzh(i10);
                        Object objZzi = zzi(i10);
                        if (this.zzd instanceof byte[][]) {
                            zzm(zzk());
                        }
                        this.zzd[i13 + 1] = objZzi;
                        i11++;
                    }
                    i10++;
                } else {
                    Arrays.fill(this.zzd, i11 + i11, i12 + i12, (Object) null);
                    this.zze = i11;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(com.google.android.libraries.places.internal.zzbip r6) {
        /*
            r5 = this;
            boolean r0 = r6.zzl()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r5.zzk()
            int r1 = r5.zze
            int r1 = r1 + r1
            int r0 = r0 - r1
            boolean r2 = r5.zzl()
            if (r2 != 0) goto L1a
            int r2 = r6.zze
            int r2 = r2 + r2
            if (r0 >= r2) goto L21
        L1a:
            int r0 = r6.zze
            int r0 = r0 + r0
            int r1 = r1 + r0
            r5.zzm(r1)
        L21:
            java.lang.Object[] r0 = r6.zzd
            java.lang.Object[] r1 = r5.zzd
            int r2 = r5.zze
            int r2 = r2 + r2
            int r3 = r6.zze
            int r3 = r3 + r3
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r1, r2, r3)
            int r0 = r5.zze
            int r6 = r6.zze
            int r0 = r0 + r6
            r5.zze = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbip.zzf(com.google.android.libraries.places.internal.zzbip):void");
    }
}
