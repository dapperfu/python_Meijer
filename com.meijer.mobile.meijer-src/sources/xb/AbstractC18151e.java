package xb;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xb.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18151e {

    /* renamed from: a, reason: collision with root package name */
    protected final Map<Class<?>, C18147a> f170671a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    protected final Map<Class<?>, AbstractC18155i> f170672b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f170673c;

    public void d(C18147a c18147a, Class<?>... clsArr) {
        if (clsArr.length == 0) {
            throw new IllegalArgumentException("Must define class(es) to apply the handler to");
        }
        for (Class<?> cls : clsArr) {
            this.f170671a.put(cls, c18147a);
        }
    }

    public void e(AbstractC18155i abstractC18155i, Class<?>... clsArr) {
        if (clsArr.length == 0) {
            this.f170672b.put(Void.class, abstractC18155i);
            return;
        }
        for (Class<?> cls : clsArr) {
            this.f170672b.put(cls, abstractC18155i);
        }
    }

    protected static List<Method> f(Class<?> cls) throws SecurityException {
        if (!Object.class.isAssignableFrom(cls)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        while (cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                arrayList.add(method);
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    protected final <X> void a(Class<X> cls) {
        if (this.f170673c) {
            Pb.b.a(cls);
        }
    }

    protected final void b(Object obj) {
        if (this.f170673c) {
            Pb.b.b(obj);
        }
    }

    protected final boolean c(Class<?> cls, String str) {
        C18147a c18147a = this.f170671a.get(cls);
        if (c18147a != null) {
            return c18147a.b(cls, str);
        }
        return false;
    }

    protected AbstractC18151e(boolean z10) {
        this.f170673c = z10;
    }
}
