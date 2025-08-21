package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.TimeOfWeek;

/* loaded from: classes6.dex */
final class zzbl extends TimeOfWeek.Builder {
    private LocalDate zza;
    private DayOfWeek zzb;
    private LocalTime zzc;
    private boolean zzd;
    private byte zze;

    zzbl() {
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final LocalDate getDate() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final TimeOfWeek.Builder setDate(LocalDate localDate) {
        this.zza = localDate;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final TimeOfWeek.Builder setTruncated(boolean z10) {
        this.zzd = z10;
        this.zze = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final TimeOfWeek build() {
        DayOfWeek dayOfWeek;
        LocalTime localTime;
        if (this.zze == 1 && (dayOfWeek = this.zzb) != null && (localTime = this.zzc) != null) {
            return new zzei(this.zza, dayOfWeek, localTime, this.zzd);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zzb == null) {
            sb2.append(" day");
        }
        if (this.zzc == null) {
            sb2.append(" time");
        }
        if (this.zze == 0) {
            sb2.append(" truncated");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final DayOfWeek getDay() {
        DayOfWeek dayOfWeek = this.zzb;
        if (dayOfWeek != null) {
            return dayOfWeek;
        }
        throw new IllegalStateException("Property \"day\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final LocalTime getTime() {
        LocalTime localTime = this.zzc;
        if (localTime != null) {
            return localTime;
        }
        throw new IllegalStateException("Property \"time\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final boolean isTruncated() {
        if (this.zze != 0) {
            return this.zzd;
        }
        throw new IllegalStateException("Property \"truncated\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final TimeOfWeek.Builder setDay(DayOfWeek dayOfWeek) {
        if (dayOfWeek == null) {
            throw new NullPointerException("Null day");
        }
        this.zzb = dayOfWeek;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.TimeOfWeek.Builder
    public final TimeOfWeek.Builder setTime(LocalTime localTime) {
        if (localTime == null) {
            throw new NullPointerException("Null time");
        }
        this.zzc = localTime;
        return this;
    }
}
