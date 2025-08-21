package Ub;

import xb.C18150d;
import xb.C18154h;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static C18150d f37401a;

    private static synchronized C18150d c() {
        try {
            if (f37401a == null) {
                C18150d c18150d = new C18150d();
                f37401a = c18150d;
                c18150d.b(new C18154h(), new Class[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f37401a;
    }

    public static <T> T a(String str, Class<T> cls) {
        try {
            return (T) c().c(cls, str);
        } catch (Exception e10) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_JSON_PARSE_ERROR, e10);
        }
    }

    public static <T> String b(T t10) {
        try {
            return c().h(t10);
        } catch (Exception e10) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_JSONIFY_ERROR, e10);
        }
    }
}
