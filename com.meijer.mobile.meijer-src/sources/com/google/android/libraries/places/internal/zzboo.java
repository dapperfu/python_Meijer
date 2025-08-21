package com.google.android.libraries.places.internal;

import De.p;

/* loaded from: classes6.dex */
public final class zzboo extends zzbst {
    private boolean zzb;
    private final zzbjv zzc;
    private final zzbls zzd;
    private final zzbfp[] zze;

    @Override // com.google.android.libraries.places.internal.zzbst, com.google.android.libraries.places.internal.zzblr
    public final void zzf(zzblt zzbltVar) {
        p.x(!this.zzb, "already started");
        this.zzb = true;
        int i10 = 0;
        while (true) {
            zzbfp[] zzbfpVarArr = this.zze;
            if (i10 >= zzbfpVarArr.length) {
                zzbltVar.zzc(this.zzc, this.zzd, new zzbip());
                return;
            } else {
                zzbfp zzbfpVar = zzbfpVarArr[i10];
                i10++;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbst, com.google.android.libraries.places.internal.zzblr
    public final void zzn(zzbpl zzbplVar) {
        zzbplVar.zzb("error", this.zzc);
        zzbplVar.zzb("progress", this.zzd);
    }

    public zzboo(zzbjv zzbjvVar, zzbls zzblsVar, zzbfp[] zzbfpVarArr) {
        p.e(!zzbjvVar.zzj(), "error must not be OK");
        this.zzc = zzbjvVar;
        this.zzd = zzblsVar;
        this.zze = zzbfpVarArr;
    }
}
