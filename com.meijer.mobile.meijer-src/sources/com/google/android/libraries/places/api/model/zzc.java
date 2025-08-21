package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AddressComponent;
import java.util.List;

/* loaded from: classes6.dex */
final class zzc extends AddressComponent.Builder {
    private String zza;
    private String zzb;
    private List zzc;

    zzc() {
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder setShortName(String str) {
        this.zzb = str;
        return this;
    }

    final AddressComponent.Builder zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    final AddressComponent.Builder zzb(List list) {
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    final AddressComponent zzc() {
        List list;
        String str = this.zza;
        if (str != null && (list = this.zzc) != null) {
            return new zzbq(str, this.zzb, list);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" name");
        }
        if (this.zzc == null) {
            sb2.append(" types");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
