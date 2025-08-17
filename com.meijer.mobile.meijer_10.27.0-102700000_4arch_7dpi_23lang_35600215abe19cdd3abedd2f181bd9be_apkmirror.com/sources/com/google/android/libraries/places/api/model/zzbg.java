package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzbg extends SearchAlongRouteParameters {
    private final Polyline zza;

    @Override // com.google.android.libraries.places.api.model.SearchAlongRouteParameters
    public final Polyline getPolyline() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchAlongRouteParameters) {
            return this.zza.equals(((SearchAlongRouteParameters) obj).getPolyline());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 37);
        sb2.append("SearchAlongRouteParameters{polyline=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zzbg(Polyline polyline) {
        if (polyline != null) {
            this.zza = polyline;
            return;
        }
        throw new NullPointerException("Null polyline");
    }
}
