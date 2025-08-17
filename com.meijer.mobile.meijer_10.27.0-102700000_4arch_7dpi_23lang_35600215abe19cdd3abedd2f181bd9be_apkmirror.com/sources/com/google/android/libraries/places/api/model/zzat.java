package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PlusCode;

/* loaded from: classes6.dex */
final class zzat extends PlusCode.Builder {
    private String zza;
    private String zzb;

    zzat() {
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode build() {
        return new zzdo(this.zza, this.zzb);
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final String getCompoundCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final String getGlobalCode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode.Builder setCompoundCode(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode.Builder
    public final PlusCode.Builder setGlobalCode(String str) {
        this.zzb = str;
        return this;
    }
}
