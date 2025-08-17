package com.google.android.libraries.places.api.model;

import Ce.M;
import Ce.j0;
import com.fullstory.FS;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.Place;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzes {
    public static final /* synthetic */ int zza = 0;
    private static final M zzb = M.a().f(j$.time.DayOfWeek.SUNDAY, DayOfWeek.SUNDAY).f(j$.time.DayOfWeek.MONDAY, DayOfWeek.MONDAY).f(j$.time.DayOfWeek.TUESDAY, DayOfWeek.TUESDAY).f(j$.time.DayOfWeek.WEDNESDAY, DayOfWeek.WEDNESDAY).f(j$.time.DayOfWeek.THURSDAY, DayOfWeek.THURSDAY).f(j$.time.DayOfWeek.FRIDAY, DayOfWeek.FRIDAY).f(j$.time.DayOfWeek.SATURDAY, DayOfWeek.SATURDAY).c();
    private static final LocalTime zzc = LocalTime.newInstance(23, 59);

    private static Map zze(List list) {
        EnumMap enumMap = new EnumMap(DayOfWeek.class);
        if (!list.isEmpty()) {
            Period periodBuild = (Period) list.get(0);
            int i10 = 0;
            while (periodBuild != null) {
                TimeOfWeek open = periodBuild.getOpen();
                TimeOfWeek close = periodBuild.getClose();
                if (open == null || close == null) {
                    i10++;
                    periodBuild = i10 >= list.size() ? null : (Period) list.get(i10);
                } else {
                    DayOfWeek day = open.getDay();
                    LocalTime time = open.getTime();
                    if (open.getDay() != close.getDay()) {
                        LocalTime localTime = zzc;
                        List list2 = (List) enumMap.getOrDefault(day, new ArrayList());
                        list2.add(j0.d(time, localTime));
                        enumMap.put((EnumMap) day, (DayOfWeek) list2);
                        TimeOfWeek timeOfWeekNewInstance = TimeOfWeek.newInstance(DayOfWeek.values()[(day.ordinal() + 1) % 7], LocalTime.newInstance(0, 0));
                        TimeOfWeek close2 = periodBuild.getClose();
                        Period.Builder builder = Period.builder();
                        builder.setOpen(timeOfWeekNewInstance);
                        builder.setClose(close2);
                        periodBuild = builder.build();
                    } else {
                        i10++;
                        LocalTime time2 = close.getTime();
                        List list3 = (List) enumMap.getOrDefault(day, new ArrayList());
                        list3.add(j0.e(time, time2));
                        enumMap.put((EnumMap) day, (DayOfWeek) list3);
                        if (i10 < list.size()) {
                            periodBuild = (Period) list.get(i10);
                        }
                    }
                }
            }
        }
        return enumMap;
    }

    private static ZoneOffset zzf(int i10) {
        try {
            return ZoneOffset.ofTotalSeconds(i10 * 60);
        } catch (DateTimeException unused) {
            FS.log_w("Places OpeningHoursUtil", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", Integer.valueOf(i10)));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean zza(com.google.android.libraries.places.api.model.Place r7, long r8) {
        /*
            com.google.android.libraries.places.api.model.Place$BusinessStatus r0 = r7.getBusinessStatus()
            java.lang.Integer r1 = r7.getUtcOffsetMinutes()
            if (r0 == 0) goto L12
            com.google.android.libraries.places.api.model.Place$BusinessStatus r2 = com.google.android.libraries.places.api.model.Place.BusinessStatus.OPERATIONAL
            if (r0 != r2) goto Lf
            goto L12
        Lf:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L12:
            if (r1 != 0) goto L16
            goto L10f
        L16:
            int r0 = r1.intValue()
            j$.time.ZoneOffset r0 = zzf(r0)
            if (r0 == 0) goto L10f
            com.google.android.libraries.places.api.model.OpeningHours r1 = r7.getCurrentOpeningHours()
            if (r1 != 0) goto L27
            goto L8b
        L27:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r3 = r1.getPeriods()
            r2.<init>(r3)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L8b
            com.google.android.libraries.places.api.model.zzer r3 = com.google.android.libraries.places.api.model.zzer.zza     // Catch: java.lang.NullPointerException -> L8b
            java.util.Collections.sort(r2, r3)     // Catch: java.lang.NullPointerException -> L8b
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.NullPointerException -> L8b
            com.google.android.libraries.places.api.model.Period r4 = (com.google.android.libraries.places.api.model.Period) r4     // Catch: java.lang.NullPointerException -> L8b
            com.google.android.libraries.places.api.model.TimeOfWeek r4 = r4.getOpen()     // Catch: java.lang.NullPointerException -> L8b
            java.lang.Object r4 = Be.p.q(r4)     // Catch: java.lang.NullPointerException -> L8b
            com.google.android.libraries.places.api.model.TimeOfWeek r4 = (com.google.android.libraries.places.api.model.TimeOfWeek) r4     // Catch: java.lang.NullPointerException -> L8b
            com.google.android.libraries.places.api.model.LocalDate r4 = r4.getDate()     // Catch: java.lang.NullPointerException -> L8b
            java.lang.Object r2 = Ce.Q.f(r2)     // Catch: java.lang.NullPointerException -> L8b
            com.google.android.libraries.places.api.model.Period r2 = (com.google.android.libraries.places.api.model.Period) r2     // Catch: java.lang.NullPointerException -> L8b
            com.google.android.libraries.places.api.model.TimeOfWeek r2 = r2.getClose()     // Catch: java.lang.NullPointerException -> L8b
            java.lang.Object r2 = Be.p.q(r2)     // Catch: java.lang.NullPointerException -> L8b
            com.google.android.libraries.places.api.model.TimeOfWeek r2 = (com.google.android.libraries.places.api.model.TimeOfWeek) r2     // Catch: java.lang.NullPointerException -> L8b
            com.google.android.libraries.places.api.model.LocalDate r2 = r2.getDate()     // Catch: java.lang.NullPointerException -> L8b
            if (r4 == 0) goto L8b
            if (r2 == 0) goto L8b
            long r3 = zzc(r0, r4, r3, r3)     // Catch: java.lang.NullPointerException -> L8b
            r5 = 23
            r6 = 59
            long r5 = zzc(r0, r2, r5, r6)     // Catch: java.lang.NullPointerException -> L8b
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch: java.lang.NullPointerException -> L8b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.NullPointerException -> L8b
            Ce.j0 r2 = Ce.j0.d(r2, r3)     // Catch: java.lang.NullPointerException -> L8b
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch: java.lang.NullPointerException -> L8b
            boolean r2 = r2.g(r3)     // Catch: java.lang.NullPointerException -> L8b
            if (r2 == 0) goto L8b
            goto L8f
        L8b:
            com.google.android.libraries.places.api.model.OpeningHours r1 = r7.getOpeningHours()
        L8f:
            if (r1 == 0) goto L10f
            java.util.List r7 = r1.getPeriods()
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L9e
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L9e:
            boolean r1 = zzd(r7)
            if (r1 == 0) goto La7
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        La7:
            java.util.Iterator r1 = r7.iterator()
        Lab:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r1.next()
            com.google.android.libraries.places.api.model.Period r2 = (com.google.android.libraries.places.api.model.Period) r2
            com.google.android.libraries.places.api.model.TimeOfWeek r3 = r2.getOpen()
            if (r3 == 0) goto L10f
            com.google.android.libraries.places.api.model.TimeOfWeek r2 = r2.getClose()
            if (r2 != 0) goto Lab
            goto L10f
        Lc4:
            j$.time.Instant r8 = j$.time.Instant.ofEpochMilli(r8)
            j$.time.OffsetDateTime r8 = r8.atOffset(r0)
            Ce.M r9 = com.google.android.libraries.places.api.model.zzes.zzb
            j$.time.DayOfWeek r0 = r8.getDayOfWeek()
            java.lang.Object r9 = r9.get(r0)
            com.google.android.libraries.places.api.model.DayOfWeek r9 = (com.google.android.libraries.places.api.model.DayOfWeek) r9
            int r0 = r8.getHour()
            int r8 = r8.getMinute()
            com.google.android.libraries.places.api.model.LocalTime r8 = com.google.android.libraries.places.api.model.LocalTime.newInstance(r0, r8)
            java.util.Map r7 = zze(r7)
            java.lang.Object r7 = r7.get(r9)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto Lf3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        Lf3:
            java.util.Iterator r7 = r7.iterator()
        Lf7:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L10c
            java.lang.Object r9 = r7.next()
            Ce.j0 r9 = (Ce.j0) r9
            boolean r9 = r9.g(r8)
            if (r9 == 0) goto Lf7
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L10c:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L10f:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzes.zza(com.google.android.libraries.places.api.model.Place, long):java.lang.Boolean");
    }

    @Deprecated
    static Boolean zzb(Place place, long j10) {
        ZoneOffset zoneOffsetZzf;
        Place.BusinessStatus businessStatus = place.getBusinessStatus();
        OpeningHours openingHours = place.getOpeningHours();
        Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
        if (businessStatus != null && businessStatus != Place.BusinessStatus.OPERATIONAL) {
            return Boolean.FALSE;
        }
        if (openingHours != null && utcOffsetMinutes != null && (zoneOffsetZzf = zzf(utcOffsetMinutes.intValue())) != null) {
            List<Period> periods = openingHours.getPeriods();
            if (periods.isEmpty()) {
                return Boolean.FALSE;
            }
            if (zzd(periods)) {
                return Boolean.TRUE;
            }
            for (Period period : periods) {
                if (period.getOpen() == null || period.getClose() == null) {
                    return null;
                }
            }
            OffsetDateTime offsetDateTimeAtOffset = Instant.ofEpochMilli(j10).atOffset(zoneOffsetZzf);
            DayOfWeek dayOfWeek = (DayOfWeek) zzb.get(offsetDateTimeAtOffset.getDayOfWeek());
            LocalTime localTimeNewInstance = LocalTime.newInstance(offsetDateTimeAtOffset.getHour(), offsetDateTimeAtOffset.getMinute());
            List list = (List) zze(periods).get(dayOfWeek);
            if (list == null) {
                return Boolean.FALSE;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((j0) it.next()).g(localTimeNewInstance)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        return null;
    }

    static long zzc(ZoneOffset zoneOffset, LocalDate localDate, int i10, int i11) {
        return OffsetDateTime.of(j$.time.LocalDate.of(localDate.getYear(), localDate.getMonth(), localDate.getDay()), j$.time.LocalTime.of(i10, i11), zoneOffset).toInstant().toEpochMilli();
    }

    private static boolean zzd(List list) {
        if (list.size() != 1) {
            return false;
        }
        Period period = (Period) list.get(0);
        TimeOfWeek open = period.getOpen();
        if (period.getClose() != null || open == null || open.getDay() != DayOfWeek.SUNDAY || open.getTime().getHours() != 0 || open.getTime().getMinutes() != 0) {
            return false;
        }
        return true;
    }
}
