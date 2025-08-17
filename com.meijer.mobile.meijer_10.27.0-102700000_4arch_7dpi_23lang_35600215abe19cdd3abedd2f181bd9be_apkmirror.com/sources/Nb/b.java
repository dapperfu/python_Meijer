package Nb;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vb.C17541g;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static C6382c f21520a = C6383d.a(C17541g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static C6380a f21521b = C6381b.a(C17541g.class.getName());

    /* renamed from: c, reason: collision with root package name */
    static Map<Class<?>, Boolean> f21522c = new ConcurrentHashMap();

    public static boolean a(Class<?> cls) {
        Boolean bool = f21522c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.class.isAssignableFrom(cls)) {
            f21522c.put(cls, Boolean.TRUE);
            return true;
        }
        if (cls.getName().contains(".protocol.")) {
            f21522c.put(cls, Boolean.TRUE);
            return true;
        }
        f21520a.g("-----     -----     -----     -----     -----     -----     -----     -----     -----     -----     -----", new Object[0]);
        f21520a.g("CLASS (WILL BE) OBFUSCATED: {} - MISSING PRO_GUARD RULES?", cls.getName());
        f21522c.put(cls, Boolean.FALSE);
        return false;
    }

    public static boolean b(Object obj) {
        return a(obj.getClass());
    }
}
