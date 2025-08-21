package H4;

import android.os.Build;
import android.os.Trace;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f13414a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f13415b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f13416c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f13417d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f13418e;

    public static void a(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(l(str), i10);
        } else {
            b(l(str), i10);
        }
    }

    private static void b(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f13416c == null) {
                f13416c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f13416c.invoke(null, Long.valueOf(f13414a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void d(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(l(str), i10);
        } else {
            e(l(str), i10);
        }
    }

    private static void e(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f13417d == null) {
                f13417d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f13417d.invoke(null, Long.valueOf(f13414a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        FS.log_v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    private static boolean i() {
        try {
            if (f13415b == null) {
                f13414a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f13415b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f13415b.invoke(null, Long.valueOf(f13414a))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    public static void j(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            c.d(l(str), i10);
        } else {
            k(l(str), i10);
        }
    }

    private static void k(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f13418e == null) {
                f13418e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f13418e.invoke(null, Long.valueOf(f13414a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }

    public static void c(String str) {
        b.a(l(str));
    }

    public static void f() {
        b.b();
    }

    private static String l(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, l3.f93324d);
    }
}
