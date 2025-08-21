package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbze {
    int zzb;
    private final zzcbl zzf;
    private final List zze = new ArrayList();
    zzbzd[] zza = new zzbzd[8];
    int zzc = 0;
    int zzd = 0;
    private int zzg = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
    private int zzh = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;

    private final int zzh(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.zza.length;
            while (true) {
                length--;
                i11 = this.zzb;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                int i13 = this.zza[length].zzh;
                i10 -= i13;
                this.zzd -= i13;
                this.zzc--;
                i12++;
            }
            zzbzd[] zzbzdVarArr = this.zza;
            int i14 = i11 + 1;
            System.arraycopy(zzbzdVarArr, i14, zzbzdVarArr, i14 + i12, this.zzc);
            this.zzb += i12;
        }
        return i12;
    }

    private final int zzi(int i10) {
        return this.zzb + 1 + i10;
    }

    final int zzd(int i10, int i11) throws IOException {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            int iZzl = zzl();
            if ((iZzl & 128) == 0) {
                return i11 + (iZzl << i13);
            }
            i11 += (iZzl & l3.f93324d) << i13;
            i13 += 7;
        }
    }

    private final void zzf() {
        int i10 = this.zzh;
        int i11 = this.zzd;
        if (i10 < i11) {
            if (i10 == 0) {
                zzg();
            } else {
                zzh(i11 - i10);
            }
        }
    }

    private final void zzg() {
        Arrays.fill(this.zza, (Object) null);
        this.zzb = this.zza.length - 1;
        this.zzc = 0;
        this.zzd = 0;
    }

    private final void zzk(int i10, zzbzd zzbzdVar) {
        this.zze.add(zzbzdVar);
        int i11 = zzbzdVar.zzh;
        int i12 = this.zzh;
        if (i11 > i12) {
            zzg();
            return;
        }
        zzh((this.zzd + i11) - i12);
        int i13 = this.zzc + 1;
        zzbzd[] zzbzdVarArr = this.zza;
        int length = zzbzdVarArr.length;
        if (i13 > length) {
            zzbzd[] zzbzdVarArr2 = new zzbzd[length + length];
            System.arraycopy(zzbzdVarArr, 0, zzbzdVarArr2, length, length);
            this.zzb = this.zza.length - 1;
            this.zza = zzbzdVarArr2;
        }
        int i14 = this.zzb;
        this.zzb = i14 - 1;
        this.zza[i14] = zzbzdVar;
        this.zzc++;
        this.zzd += i11;
    }

    private final int zzl() throws IOException {
        return this.zzf.zzj() & 255;
    }

    private static final boolean zzm(int i10) {
        if (i10 < 0) {
            return false;
        }
        int length = zzbzg.zzb.length;
        return i10 <= 60;
    }

    final void zza(int i10) {
        this.zzg = i10;
        this.zzh = i10;
        zzf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 23);
        r3.append("Header index too large ");
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        throw new java.io.IOException(r3.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void zzb() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbze.zzb():void");
    }

    public final List zzc() {
        List list = this.zze;
        ArrayList arrayList = new ArrayList(list);
        list.clear();
        return arrayList;
    }

    zzbze(int i10, int i11, zzcbz zzcbzVar) {
        this.zzb = r1.length - 1;
        this.zzf = zzcbp.zzc(zzcbzVar);
    }

    private final zzcbn zzj(int i10) throws IOException {
        if (zzm(i10)) {
            return zzbzg.zzb[i10].zzf;
        }
        int length = zzbzg.zzb.length;
        int iZzi = zzi(i10 - 61);
        if (iZzi >= 0) {
            zzbzd[] zzbzdVarArr = this.zza;
            if (iZzi < zzbzdVarArr.length) {
                return zzbzdVarArr[iZzi].zzf;
            }
        }
        int i11 = i10 + 1;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 23);
        sb2.append("Header index too large ");
        sb2.append(i11);
        throw new IOException(sb2.toString());
    }

    final zzcbn zze() throws IOException {
        int iZzl = zzl();
        int i10 = iZzl & 128;
        long jZzd = zzd(iZzl, l3.f93324d);
        if (i10 == 128) {
            byte[] bArrZzb = zzbzn.zza().zzb(this.zzf.zzr(jZzd));
            zzcbn zzcbnVar = zzcbn.zza;
            return zzcbm.zzb(bArrZzb);
        }
        return this.zzf.zzn(jZzd);
    }
}
