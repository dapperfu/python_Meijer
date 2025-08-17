package com.google.android.libraries.places.api.model;

import Be.p;
import Ce.L;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class OpeningHours implements Parcelable {
    @RecentlyNullable
    public abstract HoursType getHoursType();

    @RecentlyNonNull
    public abstract List<Period> getPeriods();

    @RecentlyNonNull
    public abstract List<SpecialDay> getSpecialDays();

    @RecentlyNonNull
    public abstract List<String> getWeekdayText();

    @RecentlyNullable
    public abstract Boolean zza();

    @RecentlyNullable
    public abstract Instant zzb();

    @RecentlyNullable
    public abstract Instant zzc();

    public static abstract class Builder {
        @RecentlyNullable
        public abstract HoursType getHoursType();

        @RecentlyNonNull
        public abstract List<Period> getPeriods();

        @RecentlyNonNull
        public abstract List<SpecialDay> getSpecialDays();

        @RecentlyNonNull
        public abstract List<String> getWeekdayText();

        @RecentlyNonNull
        public abstract Builder setHoursType(HoursType hoursType);

        @RecentlyNonNull
        public abstract Builder setPeriods(@RecentlyNonNull List<Period> list);

        @RecentlyNonNull
        public abstract Builder setSpecialDays(@RecentlyNonNull List<SpecialDay> list);

        @RecentlyNonNull
        public abstract Builder setWeekdayText(@RecentlyNonNull List<String> list);

        @RecentlyNonNull
        public abstract Builder zza(Boolean bool);

        @RecentlyNonNull
        public abstract Builder zzb(Instant instant);

        @RecentlyNonNull
        public abstract Builder zzc(Instant instant);

        abstract OpeningHours zzd();

        @RecentlyNonNull
        public OpeningHours build() {
            OpeningHours openingHoursZzd = zzd();
            Iterator<String> it = openingHoursZzd.getWeekdayText().iterator();
            while (it.hasNext()) {
                p.e(!TextUtils.isEmpty(it.next()), "WeekdayText must not contain null or empty values.");
            }
            setPeriods(L.s(openingHoursZzd.getPeriods()));
            setWeekdayText(L.s(openingHoursZzd.getWeekdayText()));
            setSpecialDays(L.s(openingHoursZzd.getSpecialDays()));
            return zzd();
        }
    }

    public enum HoursType implements Parcelable {
        ACCESS,
        BREAKFAST,
        BRUNCH,
        DELIVERY,
        DINNER,
        DRIVE_THROUGH,
        HAPPY_HOUR,
        KITCHEN,
        LUNCH,
        ONLINE_SERVICE_HOURS,
        PICKUP,
        SENIOR_HOURS,
        TAKEOUT;


        @RecentlyNonNull
        public static final Parcelable.Creator<HoursType> CREATOR = new zzeq();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            parcel.writeString(name());
        }
    }

    @RecentlyNonNull
    public static Builder builder() {
        zzag zzagVar = new zzag();
        zzagVar.setPeriods(new ArrayList());
        zzagVar.setSpecialDays(new ArrayList());
        zzagVar.setWeekdayText(new ArrayList());
        return zzagVar;
    }
}
