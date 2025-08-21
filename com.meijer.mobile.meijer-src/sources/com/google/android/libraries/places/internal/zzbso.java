package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbso extends OutputStream {
    final /* synthetic */ zzbsr zza;
    private final List zzb;
    private zzbwq zzc;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        zzbwq zzbwqVar = this.zzc;
        byte b10 = (byte) i10;
        if (zzbwqVar == null || zzbwqVar.zzc() <= 0) {
            write(new byte[]{b10}, 0, 1);
        } else {
            zzbwqVar.zzb(b10);
        }
    }

    final /* synthetic */ List zzb() {
        return this.zzb;
    }

    final /* synthetic */ int zza() {
        Iterator it = this.zzb.iterator();
        int iZzd = 0;
        while (it.hasNext()) {
            iZzd += ((zzbwq) it.next()).zzd();
        }
        return iZzd;
    }

    /* synthetic */ zzbso(zzbsr zzbsrVar, byte[] bArr) {
        Objects.requireNonNull(zzbsrVar);
        this.zza = zzbsrVar;
        this.zzb = new ArrayList();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        if (this.zzc == null) {
            zzbsr zzbsrVar = this.zza;
            zzbwq zzbwqVarZza = zzbsrVar.zzh().zza(Math.max(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, i11));
            this.zzc = zzbwqVarZza;
            this.zzb.add(zzbwqVarZza);
        }
        while (i11 > 0) {
            int iMin = Math.min(i11, this.zzc.zzc());
            if (iMin == 0) {
                int iZzd = this.zzc.zzd();
                zzbwq zzbwqVarZza2 = this.zza.zzh().zza(Math.max(i11, iZzd + iZzd));
                this.zzc = zzbwqVarZza2;
                this.zzb.add(zzbwqVarZza2);
            } else {
                this.zzc.zza(bArr, i10, iMin);
                i10 += iMin;
                i11 -= iMin;
            }
        }
    }
}
