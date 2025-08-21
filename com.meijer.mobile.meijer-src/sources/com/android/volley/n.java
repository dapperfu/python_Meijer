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
    public static String f63781a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f63782b = Log.isLoggable("Volley", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f63783c = n.class.getName();

    static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f63784c = n.f63782b;

        /* renamed from: a, reason: collision with root package name */
        private final List<C1251a> f63785a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f63786b = false;

        public synchronized void a(String str, long j10) {
            if (this.f63786b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f63785a.add(new C1251a(str, j10, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.f63786b = true;
            long jC = c();
            if (jC <= 0) {
                return;
            }
            long j10 = this.f63785a.get(0).f63789c;
            n.b("(%-4d ms) %s", Long.valueOf(jC), str);
            for (C1251a c1251a : this.f63785a) {
                long j11 = c1251a.f63789c;
                n.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c1251a.f63788b), c1251a.f63787a);
                j10 = j11;
            }
        }

        /* renamed from: com.android.volley.n$a$a, reason: collision with other inner class name */
        private static class C1251a {

            /* renamed from: a, reason: collision with root package name */
            public final String f63787a;

            /* renamed from: b, reason: collision with root package name */
            public final long f63788b;

            /* renamed from: c, reason: collision with root package name */
            public final long f63789c;

            public C1251a(String str, long j10, long j11) {
                this.f63787a = str;
                this.f63788b = j10;
                this.f63789c = j11;
            }
        }

        private long c() {
            if (this.f63785a.size() == 0) {
                return 0L;
            }
            return this.f63785a.get(r2.size() - 1).f63789c - this.f63785a.get(0).f63789c;
        }

        protected void finalize() throws Throwable {
            if (this.f63786b) {
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
            if (!stackTrace[i10].getClassName().equals(f63783c)) {
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
        FS.log_d(f63781a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        FS.log_e(f63781a, a(str, objArr));
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        FS.log_e(f63781a, a(str, objArr), th2);
    }

    public static void e(String str, Object... objArr) {
        if (f63782b) {
            FS.log_v(f63781a, a(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        Log.wtf(f63781a, a(str, objArr));
    }
}
