package vb;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17536b extends C17535a {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Class<?>> f164629c;

    public C17536b() {
        super(new Class[0]);
        this.f164629c = new HashMap();
    }

    @Override // vb.C17535a
    final Class<?> a(Class<?> cls, String str, Object obj) {
        Class<?> cls2 = this.f164629c.get(str);
        if (cls2 != null) {
            return cls2;
        }
        C17535a c17535a = this.f164628b;
        return c17535a != null ? c17535a.a(cls, str, obj) : cls;
    }

    public C17536b c(String str, Class<?> cls) {
        this.f164629c.put(str, cls);
        return this;
    }
}
