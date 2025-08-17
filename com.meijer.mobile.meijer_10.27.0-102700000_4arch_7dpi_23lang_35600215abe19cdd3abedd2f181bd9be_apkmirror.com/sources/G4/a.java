package G4;

import android.os.Build;
import android.os.Trace;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f11256a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f11257b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f11258c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f11259d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f11260e;

    public static void a(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(l(str), i10);
        } else {
            b(l(str), i10);
        }
    }

    private static void b(String str, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f11258c == null) {
                f11258c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f11258c.invoke(null, Long.valueOf(f11256a), str, Integer.valueOf(i10));
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
            if (f11259d == null) {
                f11259d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f11259d.invoke(null, Long.valueOf(f11256a), str, Integer.valueOf(i10));
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
            if (f11257b == null) {
                f11256a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f11257b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f11257b.invoke(null, Long.valueOf(f11256a))).booleanValue();
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
            if (f11260e == null) {
                f11260e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f11260e.invoke(null, Long.valueOf(f11256a), str, Integer.valueOf(i10));
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
        return str.substring(0, l3.f92485d);
    }
}
