package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.OpeningHours;
import j$.time.Instant;
import java.util.List;

/* loaded from: classes6.dex */
abstract class zzah extends OpeningHours {
    private final OpeningHours.HoursType zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;
    private final Boolean zze;
    private final Instant zzf;
    private final Instant zzg;

    public final boolean equals(Object obj) {
        Boolean bool;
        Instant instant;
        Instant instant2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpeningHours) {
            OpeningHours openingHours = (OpeningHours) obj;
            OpeningHours.HoursType hoursType = this.zza;
            if (hoursType != null ? hoursType.equals(openingHours.getHoursType()) : openingHours.getHoursType() == null) {
                if (this.zzb.equals(openingHours.getPeriods()) && this.zzc.equals(openingHours.getSpecialDays()) && this.zzd.equals(openingHours.getWeekdayText()) && ((bool = this.zze) != null ? bool.equals(openingHours.zza()) : openingHours.zza() == null) && ((instant = this.zzf) != null ? instant.equals(openingHours.zzb()) : openingHours.zzb() == null) && ((instant2 = this.zzg) != null ? instant2.equals(openingHours.zzc()) : openingHours.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public OpeningHours.HoursType getHoursType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public List<Period> getPeriods() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public List<SpecialDay> getSpecialDays() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public List<String> getWeekdayText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final Boolean zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final Instant zzb() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.OpeningHours
    public final Instant zzc() {
        return this.zzg;
    }

    public final int hashCode() {
        OpeningHours.HoursType hoursType = this.zza;
        int iHashCode = (((((((hoursType == null ? 0 : hoursType.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
        Boolean bool = this.zze;
        int iHashCode2 = ((iHashCode * 1000003) ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Instant instant = this.zzf;
        int iHashCode3 = (iHashCode2 ^ (instant == null ? 0 : instant.hashCode())) * 1000003;
        Instant instant2 = this.zzg;
        return iHashCode3 ^ (instant2 != null ? instant2.hashCode() : 0);
    }

    public final String toString() {
        Instant instant = this.zzg;
        Instant instant2 = this.zzf;
        List list = this.zzd;
        List list2 = this.zzc;
        List list3 = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String string = list3.toString();
        String string2 = list2.toString();
        String string3 = list.toString();
        String strValueOf2 = String.valueOf(instant2);
        String strValueOf3 = String.valueOf(instant);
        int length = strValueOf.length();
        int length2 = string.length();
        int length3 = string2.length();
        int length4 = string3.length();
        Boolean bool = this.zze;
        int length5 = String.valueOf(bool).length();
        StringBuilder sb2 = new StringBuilder(length + 33 + length2 + 14 + length3 + 14 + length4 + 10 + length5 + 11 + strValueOf2.length() + 12 + strValueOf3.length() + 1);
        sb2.append("OpeningHours{hoursType=");
        sb2.append(strValueOf);
        sb2.append(", periods=");
        sb2.append(string);
        sb2.append(", specialDays=");
        sb2.append(string2);
        sb2.append(", weekdayText=");
        sb2.append(string3);
        sb2.append(", openNow=");
        sb2.append(bool);
        sb2.append(", nextOpen=");
        sb2.append(strValueOf2);
        sb2.append(", nextClose=");
        sb2.append(strValueOf3);
        sb2.append("}");
        return sb2.toString();
    }

    zzah(OpeningHours.HoursType hoursType, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        this.zza = hoursType;
        if (list != null) {
            this.zzb = list;
            if (list2 != null) {
                this.zzc = list2;
                if (list3 != null) {
                    this.zzd = list3;
                    this.zze = bool;
                    this.zzf = instant;
                    this.zzg = instant2;
                    return;
                }
                throw new NullPointerException("Null weekdayText");
            }
            throw new NullPointerException("Null specialDays");
        }
        throw new NullPointerException("Null periods");
    }
}
