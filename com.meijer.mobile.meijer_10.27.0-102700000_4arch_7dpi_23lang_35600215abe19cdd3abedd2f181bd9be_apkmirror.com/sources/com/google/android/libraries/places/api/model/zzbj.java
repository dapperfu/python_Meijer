package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.SubDestination;

/* loaded from: classes6.dex */
final class zzbj extends SubDestination.Builder {
    private String zza;
    private String zzb;

    zzbj() {
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final SubDestination build() {
        String str;
        String str2 = this.zza;
        if (str2 != null && (str = this.zzb) != null) {
            return new zzeg(str2, str);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" id");
        }
        if (this.zzb == null) {
            sb2.append(" name");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final SubDestination.Builder setId(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final SubDestination.Builder setName(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.zzb = str;
        return this;
    }
}
