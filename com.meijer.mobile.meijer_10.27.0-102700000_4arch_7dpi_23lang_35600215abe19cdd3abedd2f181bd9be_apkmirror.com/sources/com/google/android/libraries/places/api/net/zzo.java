package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PlaceLikelihood;
import java.util.List;

/* loaded from: classes6.dex */
final class zzo extends FindCurrentPlaceResponse {
    private final List zza;

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceResponse
    public final List<PlaceLikelihood> getPlaceLikelihoods() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceResponse) {
            return this.zza.equals(((FindCurrentPlaceResponse) obj).getPlaceLikelihoods());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 43);
        sb2.append("FindCurrentPlaceResponse{placeLikelihoods=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zzo(List list) {
        if (list != null) {
            this.zza = list;
            return;
        }
        throw new NullPointerException("Null placeLikelihoods");
    }
}
