package fsimpl;

import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: fsimpl.ca, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14128ca implements InterfaceC14130cc {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f133151a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f133152b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f133153c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f133154d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f133155e;

    static {
        Class clsA = fT.a("androidx.collection.LruCache");
        f133151a = clsA;
        boolean z10 = false;
        Method methodA = fT.a(clsA, "snapshot", new Class[0]);
        f133152b = methodA;
        Method methodA2 = fT.a(clsA, "putCount", new Class[0]);
        f133153c = methodA2;
        if (clsA != null && methodA != null && methodA2 != null) {
            z10 = true;
        }
        f133154d = z10;
    }

    C14128ca(Object obj) {
        this.f133155e = a(obj) ? obj : null;
    }

    static boolean a(Object obj) {
        return obj != null && obj.getClass() == f133151a;
    }

    @Override // fsimpl.InterfaceC14130cc
    public Map a() {
        Object obj;
        if (f133154d && (obj = this.f133155e) != null) {
            try {
                Object objInvoke = f133152b.invoke(obj, new Object[0]);
                if (objInvoke instanceof Map) {
                    return (Map) objInvoke;
                }
            } catch (Throwable th2) {
            }
        }
        return null;
    }

    @Override // fsimpl.InterfaceC14130cc
    public int b() {
        Object obj;
        if (f133154d && (obj = this.f133155e) != null) {
            try {
                Object objInvoke = f133153c.invoke(obj, new Object[0]);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
            } catch (Throwable th2) {
            }
        }
        return -1;
    }
}
