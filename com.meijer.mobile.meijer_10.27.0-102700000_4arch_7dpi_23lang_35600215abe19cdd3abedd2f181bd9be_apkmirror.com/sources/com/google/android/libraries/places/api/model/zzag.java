package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.OpeningHours;
import j$.time.Instant;
import java.util.List;

/* loaded from: classes6.dex */
final class zzag extends OpeningHours.Builder {
    private OpeningHours.HoursType zza;
    private List zzb;
    private List zzc;
    private List zzd;
    private Boolean zze;
    private Instant zzf;
    private Instant zzg;

    zzag() {
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.HoursType getHoursType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setHoursType(OpeningHours.HoursType hoursType) {
        this.zza = hoursType;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder zza(Boolean bool) {
        this.zze = bool;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder zzb(Instant instant) {
        this.zzf = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder zzc(Instant instant) {
        this.zzg = instant;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<Period> getPeriods() {
        List<Period> list = this.zzb;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"periods\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<SpecialDay> getSpecialDays() {
        List<SpecialDay> list = this.zzc;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"specialDays\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final List<String> getWeekdayText() {
        List<String> list = this.zzd;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"weekdayText\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setPeriods(List<Period> list) {
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.zzb = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setSpecialDays(List<SpecialDay> list) {
        if (list == null) {
            throw new NullPointerException("Null specialDays");
        }
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    public final OpeningHours.Builder setWeekdayText(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null weekdayText");
        }
        this.zzd = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours.Builder
    final OpeningHours zzd() {
        List list;
        List list2;
        List list3 = this.zzb;
        if (list3 != null && (list = this.zzc) != null && (list2 = this.zzd) != null) {
            return new zzda(this.zza, list3, list, list2, this.zze, this.zzf, this.zzg);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zzb == null) {
            sb2.append(" periods");
        }
        if (this.zzc == null) {
            sb2.append(" specialDays");
        }
        if (this.zzd == null) {
            sb2.append(" weekdayText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
