package com.google.android.libraries.places.api.model;

import java.util.List;

/* loaded from: classes6.dex */
abstract class zzbf extends RoutingSummary {
    private final List zza;

    @Override // com.google.android.libraries.places.api.model.RoutingSummary
    public final List<Leg> getLegs() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RoutingSummary) {
            return this.zza.equals(((RoutingSummary) obj).getLegs());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 21);
        sb2.append("RoutingSummary{legs=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zzbf(List list) {
        if (list != null) {
            this.zza = list;
            return;
        }
        throw new NullPointerException("Null legs");
    }
}
