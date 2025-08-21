package Eu;

import java.util.ServiceConfigurationError;

/* loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Class<?> cls, Class<T> cls2) {
        try {
            return (T) cls.asSubclass(cls2).getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new ServiceConfigurationError("Provider " + cls.getName() + " could not be instantiated.", e10);
        }
    }
}
