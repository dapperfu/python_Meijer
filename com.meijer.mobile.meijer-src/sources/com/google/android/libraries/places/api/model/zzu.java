package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzu extends EncodedPolyline {
    private final String zza;

    @Override // com.google.android.libraries.places.api.model.EncodedPolyline
    public final String getEncodedPolyline() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EncodedPolyline) {
            return this.zza.equals(((EncodedPolyline) obj).getEncodedPolyline());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 33);
        sb2.append("EncodedPolyline{encodedPolyline=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    zzu(String str) {
        if (str != null) {
            this.zza = str;
            return;
        }
        throw new NullPointerException("Null encodedPolyline");
    }
}
