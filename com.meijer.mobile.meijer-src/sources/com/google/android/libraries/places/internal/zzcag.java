package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzcag extends zzcaf {
    private final zzcan zza;
    private final zzcad zzb;
    private boolean zzc;

    zzcag(zzcan zzcanVar, zzcad zzcadVar) {
        super(null);
        this.zza = zzcanVar;
        this.zzb = zzcadVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zza(zzbip zzbipVar) {
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzd() {
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzb(Object obj) {
        if (this.zzc) {
            throw new zzbjy(zzbjv.zzh.zze("More than one responses received for unary or client-streaming call"), null);
        }
        this.zzc = true;
        this.zza.zzc(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzcaf
    final void zze() {
        this.zzb.zzd(1);
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzc(zzbjv zzbjvVar, zzbip zzbipVar) {
        if (zzbjvVar.zzj()) {
            this.zza.zzb();
        } else {
            this.zza.zza(new zzbjy(zzbjvVar, zzbipVar));
        }
    }
}
