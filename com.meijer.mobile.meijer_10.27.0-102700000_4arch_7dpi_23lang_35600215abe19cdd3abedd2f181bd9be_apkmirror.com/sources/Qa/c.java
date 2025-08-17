package Qa;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static c f29918b;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<Class, d> f29919a;

    protected static c b() {
        if (f29918b == null) {
            f29918b = new c();
        }
        return f29918b;
    }

    protected c() {
        if (getClass() == c.class) {
            this.f29919a = new HashMap<>();
            return;
        }
        throw new RuntimeException("Unable to instantiate anything but a base HelperManager");
    }

    private static void a(Exception exc, Class cls) {
        exc.printStackTrace();
        throw new IllegalStateException("unable to create injectable service of type " + cls, exc.getCause());
    }

    public static <T extends d> T c(Class<T> cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        T t10 = (T) b().f29919a.get(cls);
        if (t10 == null) {
            try {
                T tNewInstance = cls.getConstructor(null).newInstance(null);
                b().f29919a.put(cls, tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                a(e10, cls);
            } catch (InstantiationException e11) {
                a(e11, cls);
            } catch (NoSuchMethodException e12) {
                a(e12, cls);
            } catch (InvocationTargetException e13) {
                a(e13, cls);
            }
        }
        return t10;
    }
}
