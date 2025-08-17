package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzml extends zzmn {
    private String zza;
    private int zzb;
    private zzmo zzc;
    private byte zzd;

    zzml() {
    }

    @Override // com.google.android.libraries.places.internal.zzmn
    final zzmn zzb(int i10) {
        this.zzb = i10;
        this.zzd = (byte) 1;
        return this;
    }

    final zzmn zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmn
    public final zzmn zzc(zzmo zzmoVar) {
        if (zzmoVar == null) {
            throw new NullPointerException("Null requestSource");
        }
        this.zzc = zzmoVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmn
    final zzmp zzd() {
        String str;
        zzmo zzmoVar;
        if (this.zzd == 1 && (str = this.zza) != null && (zzmoVar = this.zzc) != null) {
            return new zzmm(str, this.zzb, zzmoVar, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" packageName");
        }
        if (this.zzd == 0) {
            sb2.append(" versionCode");
        }
        if (this.zzc == null) {
            sb2.append(" requestSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
