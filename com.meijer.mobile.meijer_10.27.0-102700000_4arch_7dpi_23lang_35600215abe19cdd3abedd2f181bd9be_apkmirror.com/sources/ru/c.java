package ru;

import android.content.ComponentCallbacks2;
import android.content.Context;
import java.lang.annotation.Annotation;
import qu.C16607a;
import uu.C17330a;

/* loaded from: classes11.dex */
public final class c {
    public static <T> T a(Context context, Class<T> cls) {
        ComponentCallbacks2 componentCallbacks2A = C17330a.a(context);
        Au.d.d(componentCallbacks2A instanceof Au.c, "Expected application to implement GeneratedComponentManagerHolder. Check that you're passing in an application context that uses Hilt. Application class found: %s", componentCallbacks2A.getClass());
        Au.b<?> bVarComponentManager = ((Au.c) componentCallbacks2A).componentManager();
        if (bVarComponentManager instanceof Au.e) {
            Au.d.d(b(cls, InterfaceC16835b.class), "%s should be called with EntryPoints.get() rather than EarlyEntryPoints.get()", cls.getCanonicalName());
            return cls.cast(((Au.e) bVarComponentManager).p0());
        }
        return (T) C16607a.a(componentCallbacks2A, cls);
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
