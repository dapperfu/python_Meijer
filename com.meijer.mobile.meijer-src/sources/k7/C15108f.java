package k7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: k7.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15108f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f141695a = new ArrayList();

    /* renamed from: k7.f$a */
    private static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        final Class<Z> f141696a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f141697b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC15107e<Z, R> f141698c;

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f141696a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f141697b);
        }

        a(Class<Z> cls, Class<R> cls2, InterfaceC15107e<Z, R> interfaceC15107e) {
            this.f141696a = cls;
            this.f141697b = cls2;
            this.f141698c = interfaceC15107e;
        }
    }

    public synchronized <Z, R> InterfaceC15107e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C15109g.b();
        }
        for (a<?, ?> aVar : this.f141695a) {
            if (aVar.a(cls, cls2)) {
                return (InterfaceC15107e<Z, R>) aVar.f141698c;
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
        for (a<?, ?> aVar : this.f141695a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f141697b)) {
                arrayList.add(aVar.f141697b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, InterfaceC15107e<Z, R> interfaceC15107e) {
        this.f141695a.add(new a<>(cls, cls2, interfaceC15107e));
    }
}
