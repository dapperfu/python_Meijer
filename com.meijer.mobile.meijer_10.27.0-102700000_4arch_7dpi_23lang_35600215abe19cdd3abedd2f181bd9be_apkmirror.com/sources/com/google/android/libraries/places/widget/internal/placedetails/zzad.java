package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocalTime;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzad {
    public static final zzad zza = new zzad();

    private zzad() {
    }

    public static final int zza(Place place, Context context, int i10) throws Resources.NotFoundException {
        int i11;
        Intrinsics.j(place, "<this>");
        Intrinsics.j(context, "context");
        int color = context.getResources().getColor(R.color.places_color_on_surface_variant, context.getTheme());
        int[] PlacesMaterialThemeAttrs = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.i(PlacesMaterialThemeAttrs, "PlacesMaterialThemeAttrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, PlacesMaterialThemeAttrs);
        switch (zzac.zza[zzi(place).ordinal()]) {
            case 1:
            case 3:
                i11 = R.styleable.PlacesMaterialThemeAttrs_placesColorPositive;
                break;
            case 2:
            case 4:
            case 5:
                i11 = R.styleable.PlacesMaterialThemeAttrs_placesColorNegative;
                break;
            case 6:
                i11 = R.styleable.PlacesMaterialThemeAttrs_placesColorOnSurfaceVariant;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(i11, color);
        typedArrayObtainStyledAttributes.recycle();
        return color2;
    }

    public static final String zzb(Place place, Instant instant, Context context) {
        Intrinsics.j(place, "<this>");
        Intrinsics.j(context, "context");
        OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        Instant instantZzc = currentOpeningHours != null ? currentOpeningHours.zzc() : null;
        OpeningHours currentOpeningHours2 = place.getCurrentOpeningHours();
        Instant instantZzb = currentOpeningHours2 != null ? currentOpeningHours2.zzb() : null;
        if (place.getUtcOffsetMinutes() == null || instant == null) {
            return null;
        }
        if (zzi(place) == zzab.zzb && instantZzc != null) {
            Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
            Intrinsics.g(utcOffsetMinutes);
            String strZzg = zzg(instantZzc, utcOffsetMinutes.intValue(), instant, context);
            if (strZzg == null) {
                int i10 = R.string.place_details_next_close_time;
                Integer utcOffsetMinutes2 = place.getUtcOffsetMinutes();
                Intrinsics.g(utcOffsetMinutes2);
                return context.getString(i10, zzh(instantZzc, utcOffsetMinutes2.intValue(), context));
            }
            int i11 = R.string.place_details_next_close_time_and_day;
            Integer utcOffsetMinutes3 = place.getUtcOffsetMinutes();
            Intrinsics.g(utcOffsetMinutes3);
            return context.getString(i11, zzh(instantZzc, utcOffsetMinutes3.intValue(), context), strZzg);
        }
        if (zzi(place) == zzab.zzd && instantZzb != null) {
            Integer utcOffsetMinutes4 = place.getUtcOffsetMinutes();
            Intrinsics.g(utcOffsetMinutes4);
            String strZzg2 = zzg(instantZzb, utcOffsetMinutes4.intValue(), instant, context);
            if (strZzg2 == null) {
                int i12 = R.string.place_details_next_open_time;
                Integer utcOffsetMinutes5 = place.getUtcOffsetMinutes();
                Intrinsics.g(utcOffsetMinutes5);
                return context.getString(i12, zzh(instantZzb, utcOffsetMinutes5.intValue(), context));
            }
            int i13 = R.string.place_details_next_open_time_and_day;
            Integer utcOffsetMinutes6 = place.getUtcOffsetMinutes();
            Intrinsics.g(utcOffsetMinutes6);
            return context.getString(i13, zzh(instantZzb, utcOffsetMinutes6.intValue(), context), strZzg2);
        }
        return null;
    }

    public static final String zzc(Place place, Context context) {
        Intrinsics.j(place, "<this>");
        Intrinsics.j(context, "context");
        int i10 = zzac.zza[zzi(place).ordinal()];
        if (i10 == 1) {
            return context.getString(R.string.place_details_opening_status_open);
        }
        if (i10 == 2) {
            return context.getString(R.string.place_details_opening_status_closed);
        }
        if (i10 == 3) {
            return context.getString(R.string.place_details_opening_status_open_24_hours);
        }
        if (i10 == 4) {
            return context.getString(R.string.place_details_opening_status_open_temporarily_closed);
        }
        if (i10 != 5) {
            return null;
        }
        return context.getString(R.string.place_details_opening_status_open_permanently_closed);
    }

    private static final OffsetDateTime zzf(Instant instant, int i10) {
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i10 * 60);
        Intrinsics.i(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
        OffsetDateTime offsetDateTimeAtOffset = instant.atOffset(zoneOffsetOfTotalSeconds);
        Intrinsics.i(offsetDateTimeAtOffset, "atOffset(...)");
        return offsetDateTimeAtOffset;
    }

    private static final boolean zzd(Place place) {
        List<Period> periods;
        Period period;
        boolean z10;
        boolean z11;
        TimeOfWeek close;
        LocalTime time;
        TimeOfWeek close2;
        LocalTime time2;
        TimeOfWeek open;
        LocalTime time3;
        TimeOfWeek open2;
        LocalTime time4;
        OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        TimeOfWeek close3 = null;
        if (currentOpeningHours != null) {
            periods = currentOpeningHours.getPeriods();
        } else {
            periods = null;
        }
        if (periods != null) {
            period = (Period) CollectionsKt.W0(periods);
        } else {
            period = null;
        }
        if (period != null && (open = period.getOpen()) != null && (time3 = open.getTime()) != null && time3.getHours() == 0 && (open2 = period.getOpen()) != null && (time4 = open2.getTime()) != null && time4.getMinutes() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (period != null) {
            close3 = period.getClose();
        }
        if (close3 == null || ((close = period.getClose()) != null && (time = close.getTime()) != null && time.getHours() == 23 && (close2 = period.getClose()) != null && (time2 = close2.getTime()) != null && time2.getMinutes() == 59)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            return true;
        }
        return false;
    }

    private static final boolean zze(OffsetDateTime offsetDateTime) {
        if (offsetDateTime.getHour() == 0 && offsetDateTime.getMinute() == 0) {
            return true;
        }
        return false;
    }

    private static final String zzg(Instant instant, int i10, Instant instant2, Context context) {
        OffsetDateTime offsetDateTimeZzf = zzf(instant, i10);
        OffsetDateTime offsetDateTimeZzf2 = zzf(instant2, i10);
        long hours = Duration.between(instant, instant2).abs().toHours();
        if (offsetDateTimeZzf.getYear() == offsetDateTimeZzf2.getYear() && offsetDateTimeZzf.getDayOfYear() == offsetDateTimeZzf2.getDayOfYear()) {
            return null;
        }
        if (zze(offsetDateTimeZzf) && hours < 24) {
            return null;
        }
        switch (zzac.zzb[offsetDateTimeZzf.getDayOfWeek().ordinal()]) {
            case 1:
                return context.getString(R.string.place_details_day_of_week_monday);
            case 2:
                return context.getString(R.string.place_details_day_of_week_tuesday);
            case 3:
                return context.getString(R.string.place_details_day_of_week_wednesday);
            case 4:
                return context.getString(R.string.place_details_day_of_week_thursday);
            case 5:
                return context.getString(R.string.place_details_day_of_week_friday);
            case 6:
                return context.getString(R.string.place_details_day_of_week_saturday);
            case 7:
                return context.getString(R.string.place_details_day_of_week_sunday);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final String zzh(Instant instant, int i10, Context context) {
        String bestDateTimePattern;
        OffsetDateTime offsetDateTimeZzf = zzf(instant, i10);
        Locale locale = context.getResources().getConfiguration().locale;
        if (zze(offsetDateTimeZzf)) {
            String string = context.getString(R.string.place_details_time_midnight);
            Intrinsics.g(string);
            return string;
        }
        if (offsetDateTimeZzf.getHour() == 12 && offsetDateTimeZzf.getMinute() == 0) {
            String string2 = context.getString(R.string.place_details_time_noon);
            Intrinsics.g(string2);
            return string2;
        }
        if (DateFormat.is24HourFormat(context)) {
            String str = offsetDateTimeZzf.format(DateTimeFormatter.ofPattern(DateFormat.getBestDateTimePattern(locale, "H:mm")));
            Intrinsics.g(str);
            return str;
        }
        if (offsetDateTimeZzf.getMinute() == 0) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "h a");
        } else {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "h:mm a");
        }
        String str2 = offsetDateTimeZzf.format(DateTimeFormatter.ofPattern(bestDateTimePattern));
        Intrinsics.g(str2);
        return str2;
    }

    private static final zzab zzi(Place place) {
        if (place.getBusinessStatus() == Place.BusinessStatus.CLOSED_PERMANENTLY) {
            return zzab.zzf;
        }
        if (place.getBusinessStatus() == Place.BusinessStatus.CLOSED_TEMPORARILY) {
            return zzab.zze;
        }
        if (zzd(place)) {
            return zzab.zzc;
        }
        OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        if (currentOpeningHours != null && Intrinsics.e(currentOpeningHours.zza(), Boolean.TRUE)) {
            return zzab.zzb;
        }
        OpeningHours currentOpeningHours2 = place.getCurrentOpeningHours();
        if (currentOpeningHours2 != null && Intrinsics.e(currentOpeningHours2.zza(), Boolean.FALSE)) {
            return zzab.zzd;
        }
        return zzab.zza;
    }
}
