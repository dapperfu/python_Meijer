package Sb;

import vb.C17538d;
import vb.C17542h;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static C17538d f33525a;

    private static synchronized C17538d c() {
        try {
            if (f33525a == null) {
                C17538d c17538d = new C17538d();
                f33525a = c17538d;
                c17538d.b(new C17542h(), new Class[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33525a;
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
