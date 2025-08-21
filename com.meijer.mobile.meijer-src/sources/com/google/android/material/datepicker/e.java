package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes4.dex */
class e {
    static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strD = d(j10);
        if (z10) {
            strD = String.format(context.getString(ce.j.f61786y), strD);
        }
        if (z11) {
            return String.format(context.getString(ce.j.f61785x), strD);
        }
        if (z12) {
            return String.format(context.getString(ce.j.f61782u), strD);
        }
        return strD;
    }

    static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    static String c(long j10, Locale locale) {
        return q.d(locale).format(new Date(j10));
    }

    static String d(long j10) {
        if (i(j10)) {
            return b(j10);
        }
        return g(j10);
    }

    static String e(Context context, int i10) {
        if (q.g().get(1) == i10) {
            return String.format(context.getString(ce.j.f61783v), Integer.valueOf(i10));
        }
        return String.format(context.getString(ce.j.f61784w), Integer.valueOf(i10));
    }

    static String f(long j10) {
        return q.k(Locale.getDefault()).format(new Date(j10));
    }

    static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    static String h(long j10, Locale locale) {
        return q.l(locale).format(new Date(j10));
    }

    private static boolean i(long j10) {
        Calendar calendarG = q.g();
        Calendar calendarI = q.i();
        calendarI.setTimeInMillis(j10);
        if (calendarG.get(1) == calendarI.get(1)) {
            return true;
        }
        return false;
    }
}
