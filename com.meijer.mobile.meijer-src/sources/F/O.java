package F;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8680a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Object, InterfaceC3285u> f8681b = new HashMap();

    public static InterfaceC3285u a(Object obj) {
        InterfaceC3285u interfaceC3285u;
        synchronized (f8680a) {
            interfaceC3285u = f8681b.get(obj);
        }
        return interfaceC3285u == null ? InterfaceC3285u.f8809a : interfaceC3285u;
    }
}
