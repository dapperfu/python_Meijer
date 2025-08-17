package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzf extends FetchPlaceResponse {
    private final Place zza;

    @Override // com.google.android.libraries.places.api.net.FetchPlaceResponse
    public final Place getPlace() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPlaceResponse) {
            return this.zza.equals(((FetchPlaceResponse) obj).getPlace());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 26);
        sb2.append("FetchPlaceResponse{place=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zzf(Place place) {
        if (place != null) {
            this.zza = place;
            return;
        }
        throw new NullPointerException("Null place");
    }
}
