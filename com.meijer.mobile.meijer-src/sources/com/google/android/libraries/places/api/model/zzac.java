package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
final class zzac extends zzep {
    private int zza;
    private int zzb;
    private byte zzc;

    zzac() {
    }

    final zzep zza(int i10) {
        this.zza = i10;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzep
    final zzep zzb(int i10) {
        this.zzb = i10;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzep
    final LocalTime zzc() {
        if (this.zzc == 3) {
            return new zzcw(this.zza, this.zzb);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" hours");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" minutes");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
