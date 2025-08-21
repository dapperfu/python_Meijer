package com.google.android.libraries.places.internal;

import De.p;
import U.d;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class zzaqd extends zzbgn {
    private final AtomicReference zza;

    @Override // com.google.android.libraries.places.internal.zzbgo, com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, zzbip zzbipVar) {
        AtomicReference atomicReference;
        zzaqc zzaqcVar;
        do {
            atomicReference = this.zza;
            zzaqcVar = (zzaqc) atomicReference.get();
        } while (!d.a(atomicReference, zzaqcVar, zzaqcVar.zzd() == 1 ? zzaqc.zzb(2) : zzaqcVar));
        if (zzaqcVar.zzd() == 1) {
            zzf().zza(zzbfhVar, zzbipVar);
        } else if (zzaqcVar.zzd() == 4) {
            zzbfhVar.zzc(zzaqcVar.zza(), new zzbip());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            zzf().zze("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgo, com.google.android.libraries.places.internal.zzbfi
    public final void zzb(Object obj) {
        p.r(obj, "Message must be non-null");
        int iZzd = ((zzaqc) this.zza.get()).zzd();
        if (iZzd == 2) {
            zzf().zzb(obj);
        } else if (iZzd != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbjk, com.google.android.libraries.places.internal.zzbfi
    public final void zzc(int i10) {
        zzaqc zzaqcVar = (zzaqc) this.zza.get();
        if (zzaqcVar.zzd() == 1 || zzaqcVar.zzd() == 4) {
            throw new IllegalStateException("Not started");
        }
        p.e(true, "Number requested must be non-negative");
        zzf().zzc(i10);
    }

    @Override // com.google.android.libraries.places.internal.zzbjk, com.google.android.libraries.places.internal.zzbfi
    public final void zzd() {
        AtomicReference atomicReference;
        zzaqc zzaqcVar;
        do {
            atomicReference = this.zza;
            zzaqcVar = (zzaqc) atomicReference.get();
            if (zzaqcVar.zzd() != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!d.a(atomicReference, zzaqcVar, zzaqc.zzb(3)));
        zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbjk, com.google.android.libraries.places.internal.zzbfi
    public final void zze(String str, Throwable th2) {
        AtomicReference atomicReference;
        zzaqc zzaqcVar;
        zzbjv zzbjvVarZzd = zzbjv.zzb;
        if (str != null) {
            zzbjvVarZzd = zzbjvVarZzd.zze(str);
        }
        if (th2 != null) {
            zzbjvVarZzd = zzbjvVarZzd.zzd(th2);
        }
        do {
            atomicReference = this.zza;
            zzaqcVar = (zzaqc) atomicReference.get();
        } while (!d.a(atomicReference, zzaqcVar, zzaqcVar.zzd() == 4 ? zzaqcVar : zzaqcVar.zzd() == 1 ? zzaqc.zzc(4, zzbjvVarZzd) : zzaqc.zzc(5, zzbjvVarZzd)));
        zzf().zze(str, th2);
    }

    public zzaqd(zzbfi zzbfiVar) {
        super(zzbfiVar);
        this.zza = new AtomicReference(zzaqc.zzb(1));
    }
}
