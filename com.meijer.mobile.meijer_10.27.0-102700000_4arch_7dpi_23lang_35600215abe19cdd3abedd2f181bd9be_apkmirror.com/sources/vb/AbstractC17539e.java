package vb;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vb.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17539e {

    /* renamed from: a, reason: collision with root package name */
    protected final Map<Class<?>, C17535a> f164635a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    protected final Map<Class<?>, AbstractC17543i> f164636b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f164637c;

    public void d(C17535a c17535a, Class<?>... clsArr) {
        if (clsArr.length == 0) {
            throw new IllegalArgumentException("Must define class(es) to apply the handler to");
        }
        for (Class<?> cls : clsArr) {
            this.f164635a.put(cls, c17535a);
        }
    }

    public void e(AbstractC17543i abstractC17543i, Class<?>... clsArr) {
        if (clsArr.length == 0) {
            this.f164636b.put(Void.class, abstractC17543i);
            return;
        }
        for (Class<?> cls : clsArr) {
            this.f164636b.put(cls, abstractC17543i);
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
        if (this.f164637c) {
            Nb.b.a(cls);
        }
    }

    protected final void b(Object obj) {
        if (this.f164637c) {
            Nb.b.b(obj);
        }
    }

    protected final boolean c(Class<?> cls, String str) {
        C17535a c17535a = this.f164635a.get(cls);
        if (c17535a != null) {
            return c17535a.b(cls, str);
        }
        return false;
    }

    protected AbstractC17539e(boolean z10) {
        this.f164637c = z10;
    }
}
