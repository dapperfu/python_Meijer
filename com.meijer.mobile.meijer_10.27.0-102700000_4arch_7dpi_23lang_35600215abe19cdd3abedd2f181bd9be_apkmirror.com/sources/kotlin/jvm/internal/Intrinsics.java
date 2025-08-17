package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes7.dex */
public class Intrinsics {
    @SinceKotlin
    public static boolean c(Double d10, Double d11) {
        return d10 == null ? d11 == null : d11 != null && d10.doubleValue() == d11.doubleValue();
    }

    @SinceKotlin
    public static boolean d(Float f10, Float f11) {
        return f10 == null ? f11 == null : f11 != null && f10.floatValue() == f11.floatValue();
    }

    public static int k(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int l(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    @SinceKotlin
    public static class Kotlin {
        private Kotlin() {
        }
    }

    @SinceKotlin
    public static boolean a(double d10, Double d11) {
        return d11 != null && d10 == d11.doubleValue();
    }

    @SinceKotlin
    public static boolean b(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) o(new IllegalStateException(str + " must not be null")));
    }

    public static void g(Object obj) {
        if (obj == null) {
            r();
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) o(new NullPointerException(str + " must not be null")));
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            u(str);
        }
    }

    private static <T extends Throwable> T o(T t10) {
        return (T) p(t10, Intrinsics.class.getName());
    }

    public static String q(String str, Object obj) {
        return str + obj;
    }

    @SinceKotlin
    public static void r() {
        throw ((NullPointerException) o(new NullPointerException()));
    }

    @SinceKotlin
    public static void s(String str) {
        throw ((NullPointerException) o(new NullPointerException(str)));
    }

    public static void t() {
        throw ((KotlinNullPointerException) o(new KotlinNullPointerException()));
    }

    private static void u(String str) {
        throw ((NullPointerException) o(new NullPointerException(m(str))));
    }

    public static void v() {
        w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void w(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void x(String str) {
        throw ((UninitializedPropertyAccessException) o(new UninitializedPropertyAccessException(str)));
    }

    public static void y(String str) {
        x("lateinit property " + str + " has not been initialized");
    }

    private Intrinsics() {
    }

    private static String m(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void n(int i10, String str) {
        v();
    }

    static <T extends Throwable> T p(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }
}
