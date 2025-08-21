package xb;

import java.util.HashMap;
import java.util.Map;

/* renamed from: xb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18148b extends C18147a {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Class<?>> f170665c;

    public C18148b() {
        super(new Class[0]);
        this.f170665c = new HashMap();
    }

    @Override // xb.C18147a
    final Class<?> a(Class<?> cls, String str, Object obj) {
        Class<?> cls2 = this.f170665c.get(str);
        if (cls2 != null) {
            return cls2;
        }
        C18147a c18147a = this.f170664b;
        return c18147a != null ? c18147a.a(cls, str, obj) : cls;
    }

    public C18148b c(String str, Class<?> cls) {
        this.f170665c.put(str, cls);
        return this;
    }
}
