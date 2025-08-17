package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static String f62942a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f62943b = Log.isLoggable("Volley", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f62944c = n.class.getName();

    static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f62945c = n.f62943b;

        /* renamed from: a, reason: collision with root package name */
        private final List<C1241a> f62946a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f62947b = false;

        public synchronized void a(String str, long j10) {
            if (this.f62947b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f62946a.add(new C1241a(str, j10, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.f62947b = true;
            long jC = c();
            if (jC <= 0) {
                return;
            }
            long j10 = this.f62946a.get(0).f62950c;
            n.b("(%-4d ms) %s", Long.valueOf(jC), str);
            for (C1241a c1241a : this.f62946a) {
                long j11 = c1241a.f62950c;
                n.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c1241a.f62949b), c1241a.f62948a);
                j10 = j11;
            }
        }

        /* renamed from: com.android.volley.n$a$a, reason: collision with other inner class name */
        private static class C1241a {

            /* renamed from: a, reason: collision with root package name */
            public final String f62948a;

            /* renamed from: b, reason: collision with root package name */
            public final long f62949b;

            /* renamed from: c, reason: collision with root package name */
            public final long f62950c;

            public C1241a(String str, long j10, long j11) {
                this.f62948a = str;
                this.f62949b = j10;
                this.f62950c = j11;
            }
        }

        private long c() {
            if (this.f62946a.size() == 0) {
                return 0L;
            }
            return this.f62946a.get(r2.size() - 1).f62950c - this.f62946a.get(0).f62950c;
        }

        protected void finalize() throws Throwable {
            if (this.f62947b) {
                return;
            }
            b("Request on the loose");
            n.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        a() {
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(f62944c)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                break;
            }
            i10++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        FS.log_d(f62942a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        FS.log_e(f62942a, a(str, objArr));
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        FS.log_e(f62942a, a(str, objArr), th2);
    }

    public static void e(String str, Object... objArr) {
        if (f62943b) {
            FS.log_v(f62942a, a(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        Log.wtf(f62942a, a(str, objArr));
    }
}
