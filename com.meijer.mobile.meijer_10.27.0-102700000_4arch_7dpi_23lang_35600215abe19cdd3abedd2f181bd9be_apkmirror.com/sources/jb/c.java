package jb;

import cb.C6382c;
import cb.C6383d;
import vb.C17536b;
import vb.C17538d;

/* loaded from: classes4.dex */
public class c<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final C6382c f139553b = C6383d.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    protected C17538d f139554a = new C17538d();

    public final String a(C14879a<T> c14879a) {
        try {
            return this.f139554a.h(c14879a);
        } catch (Exception e10) {
            f139553b.g("Problem serializing cache entry", e10);
            return null;
        }
    }

    public final C14879a<T> b(String str) {
        try {
            return (C14879a) this.f139554a.c(C14879a.class, str);
        } catch (Exception e10) {
            f139553b.g("Problem deserializing cache entry", e10);
            return null;
        }
    }

    public c(Class<T> cls) {
        this.f139554a.a(new C17536b().c("value", cls), C14879a.class);
    }
}
