package De;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6186a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f6187b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f6188c;

    private static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodC = c("getStackTraceDepth", Throwable.class);
            if (methodC == null) {
                return null;
            }
            methodC.invoke(obj, new Throwable());
            return methodC;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method a() {
        return c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    public static String e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    static {
        Method methodA;
        Object objB = b();
        f6186a = objB;
        Method methodD = null;
        if (objB == null) {
            methodA = null;
        } else {
            methodA = a();
        }
        f6187b = methodA;
        if (objB != null) {
            methodD = d(objB);
        }
        f6188c = methodD;
    }

    public static void f(Throwable th2) {
        p.q(th2);
        if (!(th2 instanceof RuntimeException)) {
            if (!(th2 instanceof Error)) {
                return;
            } else {
                throw ((Error) th2);
            }
        }
        throw ((RuntimeException) th2);
    }
}
