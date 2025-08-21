package com.google.android.libraries.places.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzaqm extends zzbfi {
    private final zzbjv zza;

    public zzaqm(zzbjv error) {
        Intrinsics.j(error, "error");
        this.zza = error;
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzb(Object obj) {
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzc(int i10) {
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzd() {
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zze(String str, Throwable th2) {
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh listener, zzbip headers) {
        Intrinsics.j(listener, "listener");
        Intrinsics.j(headers, "headers");
        listener.zzc(this.zza, new zzbip());
    }
}
