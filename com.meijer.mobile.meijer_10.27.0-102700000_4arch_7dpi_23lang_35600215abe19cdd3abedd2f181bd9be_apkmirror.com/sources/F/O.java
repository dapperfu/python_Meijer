package F;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f9913a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Object, InterfaceC3623u> f9914b = new HashMap();

    public static InterfaceC3623u a(Object obj) {
        InterfaceC3623u interfaceC3623u;
        synchronized (f9913a) {
            interfaceC3623u = f9914b.get(obj);
        }
        return interfaceC3623u == null ? InterfaceC3623u.f10042a : interfaceC3623u;
    }
}
