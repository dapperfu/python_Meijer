package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzlk extends zzln {
    private final zzia zza;
    private final zzii zzb;

    @Deprecated
    private final com.google.android.gms.dynamic.b zzt(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, boolean z10) {
        try {
            Uri uri = (Uri) com.google.android.gms.dynamic.d.b2(bVar);
            Context context = (Context) com.google.android.gms.dynamic.d.b2(bVar2);
            return com.google.android.gms.dynamic.d.F2(z10 ? this.zzb.zzb(uri, context) : this.zzb.zza(uri, context, null, null));
        } catch (zzij unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    @Deprecated
    public final com.google.android.gms.dynamic.b zzc(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        return zzt(bVar, bVar2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    @Deprecated
    public final com.google.android.gms.dynamic.b zzd(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2) {
        return zzt(bVar, bVar2, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    @Deprecated
    public final String zzf(com.google.android.gms.dynamic.b bVar) {
        return zzg(bVar, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    public final String zzj() {
        return "ms";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    public final int zzb() {
        zzia zziaVar = this.zza;
        if (zziaVar instanceof zzie) {
            zzia zziaVarZza = ((zzie) zziaVar).zza();
            if (zziaVarZza instanceof zzih) {
                return 1;
            }
            if (zziaVarZza instanceof zzhx) {
                return 2;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    @Deprecated
    public final void zzn(String str, String str2) {
        this.zzb.zzd(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    @Deprecated
    public final void zzo(String str) {
        this.zzb.zze(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    public final boolean zzr() {
        return this.zza.zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    public final boolean zzs() {
        return this.zza.zzs();
    }

    public zzlk(Context context, Executor executor, zzm zzmVar) {
        zzie zzieVar = new zzie(context, executor, zzmVar);
        this.zza = zzieVar;
        this.zzb = new zzii(zzieVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    @Deprecated
    public final String zze(com.google.android.gms.dynamic.b bVar, String str) {
        return ((zzie) this.zza).zze((Context) com.google.android.gms.dynamic.d.b2(bVar), str, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    @Deprecated
    public final String zzg(com.google.android.gms.dynamic.b bVar, byte[] bArr) {
        return this.zza.zzg((Context) com.google.android.gms.dynamic.d.b2(bVar), bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    public final String zzh(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3, com.google.android.gms.dynamic.b bVar4) {
        return this.zza.zze((Context) com.google.android.gms.dynamic.d.b2(bVar), (String) com.google.android.gms.dynamic.d.b2(bVar2), (View) com.google.android.gms.dynamic.d.b2(bVar3), (Activity) com.google.android.gms.dynamic.d.b2(bVar4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    public final String zzi(com.google.android.gms.dynamic.b bVar) {
        return ((zzie) this.zza).zzg((Context) com.google.android.gms.dynamic.d.b2(bVar), null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    public final String zzk(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        return this.zza.zzh((Context) com.google.android.gms.dynamic.d.b2(bVar), (View) com.google.android.gms.dynamic.d.b2(bVar2), (Activity) com.google.android.gms.dynamic.d.b2(bVar3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    public final void zzl(com.google.android.gms.dynamic.b bVar) {
        this.zzb.zzc((MotionEvent) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    public final void zzm(com.google.android.gms.dynamic.b bVar) {
        this.zza.zzn((View) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    @Deprecated
    public final boolean zzp(com.google.android.gms.dynamic.b bVar) {
        return this.zzb.zzg((Uri) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzlo
    @Deprecated
    public final boolean zzq(com.google.android.gms.dynamic.b bVar) {
        return this.zzb.zzf((Uri) com.google.android.gms.dynamic.d.b2(bVar));
    }
}
