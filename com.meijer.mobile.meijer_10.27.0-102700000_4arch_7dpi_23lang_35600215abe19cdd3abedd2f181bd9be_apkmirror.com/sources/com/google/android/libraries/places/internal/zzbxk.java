package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
final class zzbxk extends zzbkm {
    private static final zzcbj zzb = new zzcbj();
    private final zzbiu zzc;
    private final String zzd;
    private final zzbwg zze;
    private final String zzf;
    private final zzbxj zzg;
    private final zzbxi zzh;
    private final zzbez zzi;
    private final boolean zzj;

    final boolean zzA() {
        return false;
    }

    final /* synthetic */ zzbiu zzF() {
        return this.zzc;
    }

    final /* synthetic */ String zzG() {
        return this.zzd;
    }

    final /* synthetic */ zzbwg zzH() {
        return this.zze;
    }

    final /* synthetic */ String zzI() {
        return this.zzf;
    }

    final /* synthetic */ zzbxj zzJ() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final zzbez zzam() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzbkm
    protected final /* synthetic */ zzbkl zze() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbkm
    protected final /* synthetic */ zzbkj zzg() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzbkm, com.google.android.libraries.places.internal.zzbkq
    protected final /* synthetic */ zzbkp zzp() {
        return this.zzg;
    }

    protected final zzbxj zzy() {
        return this.zzg;
    }

    zzbxk(zzbiu zzbiuVar, zzbip zzbipVar, zzbwz zzbwzVar, zzbxt zzbxtVar, zzbyh zzbyhVar, Object obj, int i10, int i11, String str, String str2, zzbwg zzbwgVar, zzbwp zzbwpVar, zzbfd zzbfdVar, boolean z10) {
        super(new zzbyc(), zzbwgVar, zzbwpVar, zzbipVar, zzbfdVar, false);
        this.zzh = new zzbxi(this);
        this.zzj = false;
        this.zze = (zzbwg) p.r(zzbwgVar, "statsTraceCtx");
        this.zzc = zzbiuVar;
        this.zzf = str;
        this.zzd = str2;
        this.zzi = zzbxtVar.zzf();
        this.zzg = new zzbxj(this, i10, zzbwgVar, obj, zzbwzVar, zzbyhVar, zzbxtVar, i11, zzbiuVar.zzb(), zzbfdVar);
    }

    public final zzbis zzz() {
        return this.zzc.zza();
    }
}
