package fsimpl;

import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: fsimpl.ca, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14003ca implements InterfaceC14005cc {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f131901a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f131902b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f131903c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f131904d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f131905e;

    static {
        Class clsA = fT.a("androidx.collection.LruCache");
        f131901a = clsA;
        boolean z10 = false;
        Method methodA = fT.a(clsA, "snapshot", new Class[0]);
        f131902b = methodA;
        Method methodA2 = fT.a(clsA, "putCount", new Class[0]);
        f131903c = methodA2;
        if (clsA != null && methodA != null && methodA2 != null) {
            z10 = true;
        }
        f131904d = z10;
    }

    C14003ca(Object obj) {
        this.f131905e = a(obj) ? obj : null;
    }

    static boolean a(Object obj) {
        return obj != null && obj.getClass() == f131901a;
    }

    @Override // fsimpl.InterfaceC14005cc
    public Map a() {
        Object obj;
        if (f131904d && (obj = this.f131905e) != null) {
            try {
                Object objInvoke = f131902b.invoke(obj, new Object[0]);
                if (objInvoke instanceof Map) {
                    return (Map) objInvoke;
                }
            } catch (Throwable th2) {
            }
        }
        return null;
    }

    @Override // fsimpl.InterfaceC14005cc
    public int b() {
        Object obj;
        if (f131904d && (obj = this.f131905e) != null) {
            try {
                Object objInvoke = f131903c.invoke(obj, new Object[0]);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
            } catch (Throwable th2) {
            }
        }
        return -1;
    }
}
