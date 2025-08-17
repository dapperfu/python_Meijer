package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import java.util.List;

/* loaded from: classes6.dex */
final class zzl extends FindAutocompletePredictionsResponse {
    private final List zza;

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse
    public final List<AutocompletePrediction> getAutocompletePredictions() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindAutocompletePredictionsResponse) {
            return this.zza.equals(((FindAutocompletePredictionsResponse) obj).getAutocompletePredictions());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 61);
        sb2.append("FindAutocompletePredictionsResponse{autocompletePredictions=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zzl(List list) {
        if (list != null) {
            this.zza = list;
            return;
        }
        throw new NullPointerException("Null autocompletePredictions");
    }
}
