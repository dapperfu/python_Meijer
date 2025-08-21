package Pb;

import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xb.C18153g;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static C13786c f25755a = C13787d.a(C18153g.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static C13784a f25756b = C13785b.a(C18153g.class.getName());

    /* renamed from: c, reason: collision with root package name */
    static Map<Class<?>, Boolean> f25757c = new ConcurrentHashMap();

    public static boolean a(Class<?> cls) {
        Boolean bool = f25757c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.class.isAssignableFrom(cls)) {
            f25757c.put(cls, Boolean.TRUE);
            return true;
        }
        if (cls.getName().contains(".protocol.")) {
            f25757c.put(cls, Boolean.TRUE);
            return true;
        }
        f25755a.g("-----     -----     -----     -----     -----     -----     -----     -----     -----     -----     -----", new Object[0]);
        f25755a.g("CLASS (WILL BE) OBFUSCATED: {} - MISSING PRO_GUARD RULES?", cls.getName());
        f25757c.put(cls, Boolean.FALSE);
        return false;
    }

    public static boolean b(Object obj) {
        return a(obj.getClass());
    }
}
