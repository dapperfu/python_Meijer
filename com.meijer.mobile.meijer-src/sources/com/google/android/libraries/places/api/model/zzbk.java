package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzbk extends SubDestination {
    private final String zza;
    private final String zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SubDestination) {
            SubDestination subDestination = (SubDestination) obj;
            if (this.zza.equals(subDestination.getId()) && this.zzb.equals(subDestination.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination
    public final String getId() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination
    public final String getName() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = str.length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 25 + str2.length() + 1);
        sb2.append("SubDestination{id=");
        sb2.append(str);
        sb2.append(", name=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }

    zzbk(String str, String str2) {
        if (str != null) {
            this.zza = str;
            if (str2 != null) {
                this.zzb = str2;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null id");
    }
}
