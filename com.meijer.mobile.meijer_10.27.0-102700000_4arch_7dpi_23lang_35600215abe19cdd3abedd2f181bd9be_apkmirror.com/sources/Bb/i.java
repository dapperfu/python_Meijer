package Bb;

import cb.C6382c;
import cb.C6383d;
import com.gimbal.internal.json.JsonWriteException;
import vb.C17538d;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static final C6382c f2147b = C6383d.a(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final C17538d f2148a;

    public final <T> T a(String str, Class<T> cls) {
        try {
            return (T) this.f2148a.c(cls, str);
        } catch (Exception e10) {
            f2147b.g(e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public final String b(Object obj) throws JsonWriteException {
        return this.f2148a.h(obj);
    }

    public i(C17538d c17538d) {
        this.f2148a = c17538d;
    }
}
