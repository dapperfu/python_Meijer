package com.google.android.libraries.places.internal;

import Be.p;
import com.fullstory.Reason;
import com.google.android.gms.common.api.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
final class zzble extends zzbot {
    private final zzbmg zza;
    private final AtomicInteger zzb;
    private volatile zzbjv zzc;
    private zzbjv zzd;

    @Override // com.google.android.libraries.places.internal.zzbot
    protected final zzbmg zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbot, com.google.android.libraries.places.internal.zzblu
    public final zzblr zzb(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbfp[] zzbfpVarArr) {
        return this.zzb.get() >= 0 ? new zzboo(this.zzc, zzbls.PROCESSED, zzbfpVarArr) : this.zza.zzb(zzbiuVar, zzbipVar, zzbfdVar, zzbfpVarArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbot, com.google.android.libraries.places.internal.zzbsj
    public final void zzd(zzbjv zzbjvVar) {
        p.r(zzbjvVar, "status");
        synchronized (this) {
            try {
                AtomicInteger atomicInteger = this.zzb;
                if (atomicInteger.get() < 0) {
                    this.zzc = zzbjvVar;
                    atomicInteger.addAndGet(a.e.API_PRIORITY_OTHER);
                    if (atomicInteger.get() != 0) {
                        return;
                    }
                    super.zzd(zzbjvVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbot, com.google.android.libraries.places.internal.zzbsj
    public final void zze(zzbjv zzbjvVar) {
        p.r(zzbjvVar, "status");
        synchronized (this) {
            try {
                AtomicInteger atomicInteger = this.zzb;
                if (atomicInteger.get() < 0) {
                    this.zzc = zzbjvVar;
                    atomicInteger.addAndGet(a.e.API_PRIORITY_OTHER);
                } else if (this.zzd != null) {
                    return;
                }
                if (atomicInteger.get() != 0) {
                    this.zzd = zzbjvVar;
                } else {
                    super.zze(zzbjvVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    zzble(zzblf zzblfVar, zzbmg zzbmgVar, String str) {
        Objects.requireNonNull(zzblfVar);
        this.zzb = new AtomicInteger(Reason.OS_VERSION_TOO_LOW);
        this.zza = (zzbmg) p.r(zzbmgVar, "delegate");
    }
}
