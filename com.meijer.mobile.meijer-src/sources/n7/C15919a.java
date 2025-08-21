package n7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: n7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15919a {

    /* renamed from: a, reason: collision with root package name */
    private final List<C2351a<?>> f152083a = new ArrayList();

    /* renamed from: n7.a$a, reason: collision with other inner class name */
    private static final class C2351a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f152084a;

        /* renamed from: b, reason: collision with root package name */
        final X6.d<T> f152085b;

        boolean a(Class<?> cls) {
            return this.f152084a.isAssignableFrom(cls);
        }

        C2351a(Class<T> cls, X6.d<T> dVar) {
            this.f152084a = cls;
            this.f152085b = dVar;
        }
    }

    public synchronized <T> void a(Class<T> cls, X6.d<T> dVar) {
        this.f152083a.add(new C2351a<>(cls, dVar));
    }

    public synchronized <T> X6.d<T> b(Class<T> cls) {
        for (C2351a<?> c2351a : this.f152083a) {
            if (c2351a.a(cls)) {
                return (X6.d<T>) c2351a.f152085b;
            }
        }
        return null;
    }
}
