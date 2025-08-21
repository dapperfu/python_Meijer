package mu;

import wu.InterfaceC17926a;
import wu.InterfaceC17927b;

/* renamed from: mu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15768a {
    public static <T> T a(Object obj, Class<T> cls) {
        if (obj instanceof InterfaceC17926a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC17927b) {
            return (T) a(((InterfaceC17927b) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), InterfaceC17926a.class, InterfaceC17927b.class));
    }
}
