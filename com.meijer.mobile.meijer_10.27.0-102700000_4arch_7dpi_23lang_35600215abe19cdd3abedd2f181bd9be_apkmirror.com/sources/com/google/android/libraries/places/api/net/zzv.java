package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RoutingSummary;
import java.util.List;

/* loaded from: classes6.dex */
final class zzv extends SearchByTextResponse {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzv(List list, List list2, byte[] bArr) {
        this.zza = list;
        this.zzb = list2;
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchByTextResponse) {
            SearchByTextResponse searchByTextResponse = (SearchByTextResponse) obj;
            if (this.zza.equals(searchByTextResponse.getPlaces()) && ((list = this.zzb) != null ? list.equals(searchByTextResponse.getRoutingSummaries()) : searchByTextResponse.getRoutingSummaries() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse
    public final List<Place> getPlaces() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.SearchByTextResponse
    public final List<RoutingSummary> getRoutingSummaries() {
        return this.zzb;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        List list = this.zzb;
        return (iHashCode * 1000003) ^ (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 47 + strValueOf.length() + 1);
        sb2.append("SearchByTextResponse{places=");
        sb2.append(string);
        sb2.append(", routingSummaries=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
