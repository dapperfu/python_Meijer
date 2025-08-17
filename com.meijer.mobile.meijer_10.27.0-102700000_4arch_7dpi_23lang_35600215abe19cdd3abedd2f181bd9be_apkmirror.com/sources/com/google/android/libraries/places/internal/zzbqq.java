package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqq implements zzblg {
    final /* synthetic */ zzbwk zza;

    zzbqq(zzbrx zzbrxVar, zzbwk zzbwkVar) {
        this.zza = zzbwkVar;
        Objects.requireNonNull(zzbrxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final zzblh zza() {
        return new zzblh(this.zza);
    }
}
