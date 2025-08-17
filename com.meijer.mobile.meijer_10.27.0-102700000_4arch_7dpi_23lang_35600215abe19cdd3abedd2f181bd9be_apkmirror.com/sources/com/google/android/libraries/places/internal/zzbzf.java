package com.google.android.libraries.places.internal;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class zzbzf {
    zzbzd[] zza = new zzbzd[8];
    int zzb;
    private final zzcbj zzc;
    private int zzd;
    private int zze;

    private final void zzd(zzbzd zzbzdVar) {
        int i10;
        int i11 = zzbzdVar.zzh;
        if (i11 > 4096) {
            Arrays.fill(this.zza, (Object) null);
            this.zzd = this.zza.length - 1;
            this.zzb = 0;
            this.zze = 0;
            return;
        }
        int i12 = (this.zze + i11) - 4096;
        if (i12 > 0) {
            int length = this.zza.length - 1;
            int i13 = 0;
            while (true) {
                i10 = this.zzd;
                if (length < i10 || i12 <= 0) {
                    break;
                }
                int i14 = this.zza[length].zzh;
                i12 -= i14;
                this.zze -= i14;
                this.zzb--;
                i13++;
                length--;
            }
            zzbzd[] zzbzdVarArr = this.zza;
            int i15 = i10 + 1;
            System.arraycopy(zzbzdVarArr, i15, zzbzdVarArr, i15 + i13, this.zzb);
            this.zzd += i13;
        }
        int i16 = this.zzb + 1;
        zzbzd[] zzbzdVarArr2 = this.zza;
        int length2 = zzbzdVarArr2.length;
        if (i16 > length2) {
            zzbzd[] zzbzdVarArr3 = new zzbzd[length2 + length2];
            System.arraycopy(zzbzdVarArr2, 0, zzbzdVarArr3, length2, length2);
            this.zzd = this.zza.length - 1;
            this.zza = zzbzdVarArr3;
        }
        int i17 = this.zzd;
        this.zzd = i17 - 1;
        this.zza[i17] = zzbzdVar;
        this.zzb++;
        this.zze += i11;
    }

    final void zzb(int i10, int i11, int i12) throws IOException {
        if (i10 < i11) {
            this.zzc.zzA(i10 | i12);
            return;
        }
        zzcbj zzcbjVar = this.zzc;
        zzcbjVar.zzA(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            zzcbjVar.zzA(128 | (i13 & l3.f92485d));
            i13 >>>= 7;
        }
        zzcbjVar.zzA(i13);
    }

    zzbzf(int i10, boolean z10, zzcbj zzcbjVar) {
        this.zzd = r1.length - 1;
        this.zzc = zzcbjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void zza(java.util.List r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbzf.zza(java.util.List):void");
    }

    final void zzc(zzcbn zzcbnVar) throws IOException {
        zzb(zzcbnVar.zzj(), l3.f92485d, 0);
        this.zzc.zzu(zzcbnVar);
    }
}
