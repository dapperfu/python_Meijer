package com.medallia.digital.mobilesdk;

import android.text.format.DateFormat;
import java.util.Calendar;

/* loaded from: classes7.dex */
public final class l8 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f92518a = "yyyy-MM-dd";

    /* renamed from: b, reason: collision with root package name */
    private static final String f92519b = "HH:mm:ss";

    protected static class a {

        /* renamed from: a, reason: collision with root package name */
        protected static final int f92520a = 1024;

        /* renamed from: b, reason: collision with root package name */
        protected static final int f92521b = 1048576;

        /* renamed from: c, reason: collision with root package name */
        private static final double f92522c = 8.0d;

        /* renamed from: d, reason: collision with root package name */
        protected static final double f92523d = 7.62939453125E-6d;

        protected a() {
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final long f92524a = 1000;

        /* renamed from: b, reason: collision with root package name */
        public static final long f92525b = 60000;

        /* renamed from: c, reason: collision with root package name */
        public static final long f92526c = 3600000;

        /* renamed from: d, reason: collision with root package name */
        public static final long f92527d = 86400000;

        protected b() {
        }
    }

    protected static String a(long j10) {
        return a(j10, "yyyy-MM-dd HH:mm:ss");
    }

    public static String b(long j10) {
        return a(j10, f92519b);
    }

    private static String a(long j10, String str) {
        if (j10 <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        return DateFormat.format(str, calendar).toString();
    }
}
