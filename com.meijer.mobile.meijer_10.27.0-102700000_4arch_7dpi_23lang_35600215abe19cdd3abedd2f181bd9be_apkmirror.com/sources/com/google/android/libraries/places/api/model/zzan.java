package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzan extends Period {
    private final TimeOfWeek zza;
    private final TimeOfWeek zzb;

    zzan(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        this.zza = timeOfWeek;
        this.zzb = timeOfWeek2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            TimeOfWeek timeOfWeek = this.zza;
            if (timeOfWeek != null ? timeOfWeek.equals(period.getOpen()) : period.getOpen() == null) {
                TimeOfWeek timeOfWeek2 = this.zzb;
                if (timeOfWeek2 != null ? timeOfWeek2.equals(period.getClose()) : period.getClose() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final TimeOfWeek getClose() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Period
    public final TimeOfWeek getOpen() {
        return this.zza;
    }

    public final int hashCode() {
        TimeOfWeek timeOfWeek = this.zza;
        int iHashCode = timeOfWeek == null ? 0 : timeOfWeek.hashCode();
        TimeOfWeek timeOfWeek2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (timeOfWeek2 != null ? timeOfWeek2.hashCode() : 0);
    }

    public final String toString() {
        TimeOfWeek timeOfWeek = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(timeOfWeek);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20 + strValueOf2.length() + 1);
        sb2.append("Period{open=");
        sb2.append(strValueOf);
        sb2.append(", close=");
        sb2.append(strValueOf2);
        sb2.append("}");
        return sb2.toString();
    }
}
