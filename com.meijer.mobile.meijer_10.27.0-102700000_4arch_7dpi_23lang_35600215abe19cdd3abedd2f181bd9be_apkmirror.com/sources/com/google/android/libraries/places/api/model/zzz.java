package com.google.android.libraries.places.api.model;

import j$.time.Duration;

/* loaded from: classes6.dex */
abstract class zzz extends Leg {
    private final Duration zza;
    private final int zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Leg) {
            Leg leg = (Leg) obj;
            if (this.zza.equals(leg.getDuration()) && this.zzb == leg.getDistanceMeters()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Leg
    public final int getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Leg
    public final Duration getDuration() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 30 + String.valueOf(i10).length() + 1);
        sb2.append("Leg{duration=");
        sb2.append(string);
        sb2.append(", distanceMeters=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }

    zzz(Duration duration, int i10) {
        if (duration != null) {
            this.zza = duration;
            this.zzb = i10;
            return;
        }
        throw new NullPointerException("Null duration");
    }
}
