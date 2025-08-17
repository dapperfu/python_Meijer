package com.google.android.libraries.places.internal;

import android.content.Context;

/* loaded from: classes6.dex */
final class zzls implements zzmc {
    private Context zza;
    private zzmf zzb;
    private zzmp zzc;

    private zzls() {
        throw null;
    }

    /* synthetic */ zzls(byte[] bArr) {
    }

    @Override // com.google.android.libraries.places.internal.zzmc
    public final zzmd zza() {
        zzber.zzb(this.zza, Context.class);
        zzber.zzb(this.zzb, zzmf.class);
        zzber.zzb(this.zzc, zzmp.class);
        return new zzlt(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.libraries.places.internal.zzmc
    public final /* bridge */ /* synthetic */ zzmc zzb(zzmp zzmpVar) {
        this.zzc = zzmpVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmc
    public final /* bridge */ /* synthetic */ zzmc zzc(zzmf zzmfVar) {
        this.zzb = zzmfVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmc
    public final /* bridge */ /* synthetic */ zzmc zzd(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }
}
