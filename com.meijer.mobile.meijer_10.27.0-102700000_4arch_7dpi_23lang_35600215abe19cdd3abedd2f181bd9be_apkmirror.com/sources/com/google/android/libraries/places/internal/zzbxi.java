package com.google.android.libraries.places.internal;

import com.medallia.digital.mobilesdk.q2;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbxi implements zzbkj {
    final /* synthetic */ zzbxk zza;

    @Override // com.google.android.libraries.places.internal.zzbkj
    public final void zza(zzbip zzbipVar, byte[] bArr) {
        int i10 = zzcba.zza;
        zzbxk zzbxkVar = this.zza;
        String strZzb = zzbxkVar.zzF().zzb();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZzb).length() + 1);
        sb2.append(q2.f92724c);
        sb2.append(strZzb);
        String string = sb2.toString();
        synchronized (zzbxkVar.zzJ().zzO()) {
            zzbxkVar.zzJ().zzN(zzbipVar, string);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkj
    public final void zzb(zzbwq zzbwqVar, boolean z10, boolean z11, int i10) {
        zzcbj zzcbjVarZze;
        int i11 = zzcba.zza;
        if (zzbwqVar == null) {
            zzcbjVarZze = zzbxk.zzb;
        } else {
            zzcbjVarZze = ((zzbyb) zzbwqVar).zze();
            int iZzb = (int) zzcbjVarZze.zzb();
            if (iZzb > 0) {
                this.zza.zzw(iZzb);
            }
        }
        zzbxk zzbxkVar = this.zza;
        synchronized (zzbxkVar.zzJ().zzO()) {
            zzbxkVar.zzJ().zzM(zzcbjVarZze, z10, z11);
            zzbxkVar.zzo().zzc(i10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbkj
    public final void zzc(zzbjv zzbjvVar) {
        int i10 = zzcba.zza;
        zzbxk zzbxkVar = this.zza;
        synchronized (zzbxkVar.zzJ().zzO()) {
            zzbxkVar.zzJ().zzL(zzbjvVar, true, null);
        }
    }

    zzbxi(zzbxk zzbxkVar) {
        Objects.requireNonNull(zzbxkVar);
        this.zza = zzbxkVar;
    }
}
