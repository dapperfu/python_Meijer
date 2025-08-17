package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
public final class zzbgz {
    private Object zza;

    private zzbgz() {
        throw null;
    }

    /* synthetic */ zzbgz(byte[] bArr) {
    }

    public final zzbgz zza(Object obj) {
        this.zza = p.r(obj, "config");
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbha zzb() {
        p.x(this.zza != null, "config is not set");
        return new zzbha(zzbjv.zza, this.zza, null, 0 == true ? 1 : 0);
    }
}
