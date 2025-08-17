package i7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: i7.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14705f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f137606a = new ArrayList();

    /* renamed from: i7.f$a */
    private static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        final Class<Z> f137607a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f137608b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC14704e<Z, R> f137609c;

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f137607a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f137608b);
        }

        a(Class<Z> cls, Class<R> cls2, InterfaceC14704e<Z, R> interfaceC14704e) {
            this.f137607a = cls;
            this.f137608b = cls2;
            this.f137609c = interfaceC14704e;
        }
    }

    public synchronized <Z, R> InterfaceC14704e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C14706g.b();
        }
        for (a<?, ?> aVar : this.f137606a) {
            if (aVar.a(cls, cls2)) {
                return (InterfaceC14704e<Z, R>) aVar.f137609c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f137606a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f137608b)) {
                arrayList.add(aVar.f137608b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, InterfaceC14704e<Z, R> interfaceC14704e) {
        this.f137606a.add(new a<>(cls, cls2, interfaceC14704e));
    }
}
