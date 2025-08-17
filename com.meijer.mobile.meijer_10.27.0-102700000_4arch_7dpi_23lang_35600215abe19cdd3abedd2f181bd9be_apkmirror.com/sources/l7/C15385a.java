package l7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15385a {

    /* renamed from: a, reason: collision with root package name */
    private final List<C2284a<?>> f148686a = new ArrayList();

    /* renamed from: l7.a$a, reason: collision with other inner class name */
    private static final class C2284a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f148687a;

        /* renamed from: b, reason: collision with root package name */
        final V6.d<T> f148688b;

        boolean a(Class<?> cls) {
            return this.f148687a.isAssignableFrom(cls);
        }

        C2284a(Class<T> cls, V6.d<T> dVar) {
            this.f148687a = cls;
            this.f148688b = dVar;
        }
    }

    public synchronized <T> void a(Class<T> cls, V6.d<T> dVar) {
        this.f148686a.add(new C2284a<>(cls, dVar));
    }

    public synchronized <T> V6.d<T> b(Class<T> cls) {
        for (C2284a<?> c2284a : this.f148686a) {
            if (c2284a.a(cls)) {
                return (V6.d<T>) c2284a.f148688b;
            }
        }
        return null;
    }
}
