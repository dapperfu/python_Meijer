package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
final class zzk extends zzej {
    private int zza;
    private int zzb;
    private byte zzc;

    zzk() {
    }

    @Override // com.google.android.libraries.places.api.model.zzej
    public final zzej zza(int i10) {
        this.zza = i10;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzej
    public final zzej zzb(int i10) {
        this.zzb = i10;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzej
    public final zzek zzc() {
        if (this.zzc == 3) {
            return new zzca(this.zza, this.zzb);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" offset");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" length");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
