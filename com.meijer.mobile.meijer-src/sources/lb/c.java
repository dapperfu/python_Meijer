package lb;

import eb.C13786c;
import eb.C13787d;
import xb.C18148b;
import xb.C18150d;

/* loaded from: classes4.dex */
public class c<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final C13786c f149567b = C13787d.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    protected C18150d f149568a = new C18150d();

    public final String a(C15478a<T> c15478a) {
        try {
            return this.f149568a.h(c15478a);
        } catch (Exception e10) {
            f149567b.g("Problem serializing cache entry", e10);
            return null;
        }
    }

    public final C15478a<T> b(String str) {
        try {
            return (C15478a) this.f149568a.c(C15478a.class, str);
        } catch (Exception e10) {
            f149567b.g("Problem deserializing cache entry", e10);
            return null;
        }
    }

    public c(Class<T> cls) {
        this.f149568a.a(new C18148b().c("value", cls), C15478a.class);
    }
}
