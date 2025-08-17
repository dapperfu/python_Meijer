package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    static AtomicReference<p> f86935a = new AtomicReference<>();

    static Calendar i() {
        return j(null);
    }

    @TargetApi(24)
    static DateFormat d(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    static p e() {
        p pVar = f86935a.get();
        return pVar == null ? p.c() : pVar;
    }

    private static TimeZone f() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    @TargetApi(24)
    static DateFormat k(Locale locale) {
        return b("yMMMM", locale);
    }

    @TargetApi(24)
    static DateFormat l(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }

    static long a(long j10) {
        Calendar calendarI = i();
        calendarI.setTimeInMillis(j10);
        return c(calendarI).getTimeInMillis();
    }

    @TargetApi(24)
    private static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static Calendar c(Calendar calendar) {
        Calendar calendarJ = j(calendar);
        Calendar calendarI = i();
        calendarI.set(calendarJ.get(1), calendarJ.get(2), calendarJ.get(5));
        return calendarI;
    }

    static Calendar g() {
        Calendar calendarA = e().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(f());
        return calendarA;
    }

    static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
