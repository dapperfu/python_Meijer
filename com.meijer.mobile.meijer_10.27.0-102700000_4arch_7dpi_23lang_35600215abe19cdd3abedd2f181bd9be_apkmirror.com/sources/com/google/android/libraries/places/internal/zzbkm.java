package com.google.android.libraries.places.internal;

import Be.p;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class zzbkm extends zzbkq implements zzblr, zzbsq {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzbkm.class.getName());
    private final zzbwp zzc;
    private final zzbow zzd;
    private final boolean zze;
    private zzbip zzf;
    private volatile boolean zzg;

    protected abstract zzbkl zze();

    protected abstract zzbkj zzg();

    @Override // com.google.android.libraries.places.internal.zzbkq
    protected final zzbow zzh() {
        return this.zzd;
    }

    public final boolean zzi() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbsq
    public final void zzj(zzbwq zzbwqVar, boolean z10, boolean z11, int i10) {
        boolean z12 = true;
        if (zzbwqVar == null && !z10) {
            z12 = false;
        }
        p.e(z12, "null frame before EOS");
        zzg().zzb(zzbwqVar, z10, z11, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbwp zzo() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbkq
    protected /* bridge */ /* synthetic */ zzbkp zzp() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zza(zzbgg zzbggVar) {
        zzbip zzbipVar = this.zzf;
        zzbil zzbilVar = zzbpf.zza;
        zzbipVar.zzd(zzbilVar);
        this.zzf.zzc(zzbilVar, Long.valueOf(Math.max(0L, zzbggVar.zzc(TimeUnit.NANOSECONDS))));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzb(int i10) {
        this.zzd.zzf(i10);
    }

    protected zzbkm(zzbwr zzbwrVar, zzbwg zzbwgVar, zzbwp zzbwpVar, zzbip zzbipVar, zzbfd zzbfdVar, boolean z10) {
        p.r(zzbipVar, "headers");
        this.zzc = (zzbwp) p.r(zzbwpVar, "transportTracer");
        this.zze = !Boolean.TRUE.equals(zzbfdVar.zzi(zzbpf.zzl));
        this.zzd = new zzbsr(this, zzbwrVar, zzbwgVar);
        this.zzf = zzbipVar;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzc(int i10) {
        zze().zzm(i10);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzd(zzbgj zzbgjVar) {
        zze().zzi(zzbgjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzf(zzblt zzbltVar) {
        zze().zza(zzbltVar);
        zzg().zza(this.zzf, null);
        this.zzf = null;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzk() {
        if (!zze().zzc()) {
            zze().zzj();
            zzh().zzd();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzl(zzbjv zzbjvVar) {
        p.e(!zzbjvVar.zzj(), "Should not cancel with OK status");
        this.zzg = true;
        zzg().zzc(zzbjvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbkq, com.google.android.libraries.places.internal.zzbwh
    public final boolean zzm() {
        if (zzp().zzv() && !this.zzg) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzn(zzbpl zzbplVar) {
        zzbplVar.zzb("remote_addr", zzam().zza(zzbgr.zza));
    }
}
