package com.google.android.libraries.places.api.model;

import java.util.List;

/* loaded from: classes6.dex */
abstract class zzd extends AddressComponent {
    private final String zza;
    private final String zzb;
    private final List zzc;

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponent) {
            AddressComponent addressComponent = (AddressComponent) obj;
            if (this.zza.equals(addressComponent.getName()) && ((str = this.zzb) != null ? str.equals(addressComponent.getShortName()) : addressComponent.getShortName() == null) && this.zzc.equals(addressComponent.getTypes())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final String getName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final List<String> getTypes() {
        return this.zzc;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        return (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String string = this.zzc.toString();
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = string.length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(str2.length() + 34 + length + 8 + length2 + 1);
        sb2.append("AddressComponent{name=");
        sb2.append(str2);
        sb2.append(", shortName=");
        sb2.append(str);
        sb2.append(", types=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zzd(String str, String str2, List list) {
        if (str != null) {
            this.zza = str;
            this.zzb = str2;
            if (list != null) {
                this.zzc = list;
                return;
            }
            throw new NullPointerException("Null types");
        }
        throw new NullPointerException("Null name");
    }
}
