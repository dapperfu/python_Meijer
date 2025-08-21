package nu;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.lang.annotation.Annotation;
import mu.C15768a;
import qu.C16766a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes4.dex */
public final class c {
    public static <T> T a(Context context, Class<T> cls) {
        ComponentCallbacks2 componentCallbacks2A = C16766a.a(context);
        wu.d.d(componentCallbacks2A instanceof InterfaceC17928c, "Expected application to implement GeneratedComponentManagerHolder. Check that you're passing in an application context that uses Hilt. Application class found: %s", componentCallbacks2A.getClass());
        InterfaceC17927b<?> interfaceC17927bComponentManager = ((InterfaceC17928c) componentCallbacks2A).componentManager();
        if (interfaceC17927bComponentManager instanceof wu.e) {
            wu.d.d(b(cls, InterfaceC16023b.class), "%s should be called with EntryPoints.get() rather than EarlyEntryPoints.get()", cls.getCanonicalName());
            return cls.cast(((wu.e) interfaceC17927bComponentManager).s0());
        }
        return (T) C15768a.a(componentCallbacks2A, cls);
    }

    private static boolean b(Class<?> cls, Class<? extends Annotation> cls2) {
        for (Annotation annotation : cls.getAnnotations()) {
            if (annotation.annotationType().equals(cls2)) {
                return true;
            }
        }
        return false;
    }
}
