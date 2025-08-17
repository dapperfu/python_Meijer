package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzbm extends TimeOfWeek {
    private final LocalDate zza;
    private final DayOfWeek zzb;
    private final LocalTime zzc;
    private final boolean zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeOfWeek) {
            TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
            LocalDate localDate = this.zza;
            if (localDate != null ? localDate.equals(timeOfWeek.getDate()) : timeOfWeek.getDate() == null) {
                if (this.zzb.equals(timeOfWeek.getDay()) && this.zzc.equals(timeOfWeek.getTime()) && this.zzd == timeOfWeek.isTruncated()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final LocalDate getDate() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final DayOfWeek getDay() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final LocalTime getTime() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek
    public final boolean isTruncated() {
        return this.zzd;
    }

    public final int hashCode() {
        LocalDate localDate = this.zza;
        return (((((((localDate == null ? 0 : localDate.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    public final String toString() {
        LocalTime localTime = this.zzc;
        DayOfWeek dayOfWeek = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String string = dayOfWeek.toString();
        String string2 = localTime.toString();
        int length = strValueOf.length();
        int length2 = string.length();
        int length3 = string2.length();
        boolean z10 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 22 + length2 + 7 + length3 + 12 + String.valueOf(z10).length() + 1);
        sb2.append("TimeOfWeek{date=");
        sb2.append(strValueOf);
        sb2.append(", day=");
        sb2.append(string);
        sb2.append(", time=");
        sb2.append(string2);
        sb2.append(", truncated=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    zzbm(LocalDate localDate, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10) {
        this.zza = localDate;
        if (dayOfWeek != null) {
            this.zzb = dayOfWeek;
            if (localTime != null) {
                this.zzc = localTime;
                this.zzd = z10;
                return;
            }
            throw new NullPointerException("Null time");
        }
        throw new NullPointerException("Null day");
    }
}
