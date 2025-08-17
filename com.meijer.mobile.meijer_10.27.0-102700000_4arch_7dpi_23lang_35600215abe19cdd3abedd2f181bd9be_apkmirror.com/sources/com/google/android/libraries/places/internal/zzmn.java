package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
public abstract class zzmn {
    abstract zzmn zzb(int i10);

    public abstract zzmn zzc(zzmo zzmoVar);

    abstract zzmp zzd();

    public final zzmp zze() {
        zzmp zzmpVarZzd = zzd();
        p.e(!zzmpVarZzd.zza().isEmpty(), "Package name must not be empty.");
        return zzmpVarZzd;
    }
}
