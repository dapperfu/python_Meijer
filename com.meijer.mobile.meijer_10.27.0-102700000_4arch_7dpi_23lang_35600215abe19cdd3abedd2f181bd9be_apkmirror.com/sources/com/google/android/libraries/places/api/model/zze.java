package com.google.android.libraries.places.api.model;

import java.util.List;

/* loaded from: classes6.dex */
abstract class zze extends AddressComponents {
    private final List zza;

    @Override // com.google.android.libraries.places.api.model.AddressComponents
    public final List<AddressComponent> asList() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponents) {
            return this.zza.equals(((AddressComponents) obj).asList());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 26);
        sb2.append("AddressComponents{asList=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zze(List list) {
        if (list != null) {
            this.zza = list;
            return;
        }
        throw new NullPointerException("Null asList");
    }
}
