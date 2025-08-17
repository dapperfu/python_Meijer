package bf;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bf.B, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6242B implements InterfaceC6246d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<C6241A<?>> f60140a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<C6241A<?>> f60141b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<C6241A<?>> f60142c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<C6241A<?>> f60143d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<C6241A<?>> f60144e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f60145f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6246d f60146g;

    /* renamed from: bf.B$a */
    private static class a implements Ff.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f60147a;

        /* renamed from: b, reason: collision with root package name */
        private final Ff.c f60148b;

        public a(Set<Class<?>> set, Ff.c cVar) {
            this.f60147a = set;
            this.f60148b = cVar;
        }
    }

    @Override // bf.InterfaceC6246d
    public <T> T a(Class<T> cls) {
        if (!this.f60140a.contains(C6241A.b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f60146g.a(cls);
        return !cls.equals(Ff.c.class) ? t10 : (T) new a(this.f60145f, (Ff.c) t10);
    }

    @Override // bf.InterfaceC6246d
    public <T> If.b<Set<T>> b(C6241A<T> c6241a) {
        if (this.f60144e.contains(c6241a)) {
            return this.f60146g.b(c6241a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c6241a));
    }

    @Override // bf.InterfaceC6246d
    public <T> T c(C6241A<T> c6241a) {
        if (this.f60140a.contains(c6241a)) {
            return (T) this.f60146g.c(c6241a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", c6241a));
    }

    @Override // bf.InterfaceC6246d
    public <T> If.a<T> e(C6241A<T> c6241a) {
        if (this.f60142c.contains(c6241a)) {
            return this.f60146g.e(c6241a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c6241a));
    }

    @Override // bf.InterfaceC6246d
    public <T> If.b<T> g(C6241A<T> c6241a) {
        if (this.f60141b.contains(c6241a)) {
            return this.f60146g.g(c6241a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", c6241a));
    }

    @Override // bf.InterfaceC6246d
    public <T> Set<T> h(C6241A<T> c6241a) {
        if (this.f60143d.contains(c6241a)) {
            return this.f60146g.h(c6241a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", c6241a));
    }

    C6242B(C6245c<?> c6245c, InterfaceC6246d interfaceC6246d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c6245c.g()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!c6245c.k().isEmpty()) {
            hashSet.add(C6241A.b(Ff.c.class));
        }
        this.f60140a = Collections.unmodifiableSet(hashSet);
        this.f60141b = Collections.unmodifiableSet(hashSet2);
        this.f60142c = Collections.unmodifiableSet(hashSet3);
        this.f60143d = Collections.unmodifiableSet(hashSet4);
        this.f60144e = Collections.unmodifiableSet(hashSet5);
        this.f60145f = c6245c.k();
        this.f60146g = interfaceC6246d;
    }

    @Override // bf.InterfaceC6246d
    public <T> If.b<T> f(Class<T> cls) {
        return g(C6241A.b(cls));
    }

    @Override // bf.InterfaceC6246d
    public <T> If.a<T> i(Class<T> cls) {
        return e(C6241A.b(cls));
    }
}
