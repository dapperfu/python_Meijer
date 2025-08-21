package iw;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: iw.a$a, reason: collision with other inner class name */
    private static class C2211a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final Object f139125a;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return a.d(method, this.f139125a.getClass().getClassLoader()).invoke(this.f139125a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }

        public C2211a(Object obj) {
            this.f139125a = obj;
        }
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static InvocationHandler c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C2211a(obj);
    }

    private static boolean e() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    public static boolean b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (e()) {
                if (!collection.contains(str + ":dev")) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static Method d(Method method, ClassLoader classLoader) throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }
}
