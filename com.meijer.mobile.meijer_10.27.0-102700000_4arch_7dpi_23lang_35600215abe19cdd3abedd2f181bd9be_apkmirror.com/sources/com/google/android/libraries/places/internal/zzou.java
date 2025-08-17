package com.google.android.libraries.places.internal;

import android.content.Context;

/* loaded from: classes6.dex */
final class zzou implements zzox {
    private Context zza;
    private zzmo zzb;

    private zzou() {
        throw null;
    }

    /* synthetic */ zzou(byte[] bArr) {
    }

    @Override // com.google.android.libraries.places.internal.zzox
    public final zzoy zza() {
        zzber.zzb(this.zza, Context.class);
        zzber.zzb(this.zzb, zzmo.class);
        return new zzov(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzox
    public final /* bridge */ /* synthetic */ zzox zzb(zzmo zzmoVar) {
        zzmoVar.getClass();
        this.zzb = zzmoVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzox
    public final /* bridge */ /* synthetic */ zzox zzc(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }
}
