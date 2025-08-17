package com.google.android.libraries.places.internal;

import Be.p;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class zzbrr extends zzbfe {
    final /* synthetic */ zzbrx zza;
    private final AtomicReference zzb;
    private final String zzc;
    private final zzbfe zzd;

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final String zzb() {
        return this.zzc;
    }

    final /* synthetic */ AtomicReference zzf() {
        return this.zzb;
    }

    final /* synthetic */ String zzg() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzbfi zze(zzbiu zzbiuVar, zzbfd zzbfdVar) {
        zzbhb zzbhbVar = (zzbhb) this.zzb.get();
        if (zzbhbVar == null) {
            return this.zzd.zza(zzbiuVar, zzbfdVar);
        }
        if (!(zzbhbVar instanceof zzbsg)) {
            return new zzbqz(zzbhbVar, this.zzd, this.zza.zzw(), zzbiuVar, zzbfdVar);
        }
        zzbsf zzbsfVarZze = ((zzbsg) zzbhbVar).zzb.zze(zzbiuVar);
        if (zzbsfVarZze != null) {
            zzbfdVar = zzbfdVar.zzh(zzbsf.zza, zzbsfVarZze);
        }
        return this.zzd.zza(zzbiuVar, zzbfdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar) {
        AtomicReference atomicReference = this.zzb;
        if (atomicReference.get() != zzbrx.zzh) {
            return zze(zzbiuVar, zzbfdVar);
        }
        zzbrx zzbrxVar = this.zza;
        zzbrl zzbrlVar = new zzbrl(this);
        zzbkd zzbkdVar = zzbrxVar.zze;
        zzbkdVar.zzb(zzbrlVar);
        zzbkdVar.zza();
        if (atomicReference.get() != zzbrx.zzh) {
            return zze(zzbiuVar, zzbfdVar);
        }
        if (zzbrxVar.zzM().get()) {
            return new zzbrm(this);
        }
        zzbrq zzbrqVar = new zzbrq(this, zzbgd.zza(), zzbiuVar, zzbfdVar);
        zzbkdVar.zzb(new zzbrn(this, zzbrqVar));
        zzbkdVar.zza();
        return zzbrqVar;
    }

    final void zzc(zzbhb zzbhbVar) {
        AtomicReference atomicReference = this.zzb;
        zzbhb zzbhbVar2 = (zzbhb) atomicReference.get();
        atomicReference.set(zzbhbVar);
        if (zzbhbVar2 == zzbrx.zzh) {
            zzbrx zzbrxVar = this.zza;
            if (zzbrxVar.zzH() != null) {
                Iterator it = zzbrxVar.zzH().iterator();
                while (it.hasNext()) {
                    ((zzbrq) it.next()).zzl();
                }
            }
        }
    }

    final void zzd() {
        if (this.zzb.get() == zzbrx.zzh) {
            zzc(null);
        }
    }

    /* synthetic */ zzbrr(zzbrx zzbrxVar, String str, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
        this.zzb = new AtomicReference(zzbrx.zzh);
        this.zzd = new zzbri(this);
        this.zzc = (String) p.r(str, "authority");
    }
}
