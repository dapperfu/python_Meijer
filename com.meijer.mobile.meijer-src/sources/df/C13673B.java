package df;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: df.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C13673B implements InterfaceC13677d {

    /* renamed from: a, reason: collision with root package name */
    private final Set<C13672A<?>> f128375a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<C13672A<?>> f128376b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<C13672A<?>> f128377c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<C13672A<?>> f128378d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<C13672A<?>> f128379e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f128380f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC13677d f128381g;

    /* renamed from: df.B$a */
    private static class a implements Hf.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f128382a;

        /* renamed from: b, reason: collision with root package name */
        private final Hf.c f128383b;

        public a(Set<Class<?>> set, Hf.c cVar) {
            this.f128382a = set;
            this.f128383b = cVar;
        }
    }

    @Override // df.InterfaceC13677d
    public <T> T a(Class<T> cls) {
        if (!this.f128375a.contains(C13672A.b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f128381g.a(cls);
        return !cls.equals(Hf.c.class) ? t10 : (T) new a(this.f128380f, (Hf.c) t10);
    }

    @Override // df.InterfaceC13677d
    public <T> T c(C13672A<T> c13672a) {
        if (this.f128375a.contains(c13672a)) {
            return (T) this.f128381g.c(c13672a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", c13672a));
    }

    @Override // df.InterfaceC13677d
    public <T> Kf.b<Set<T>> d(C13672A<T> c13672a) {
        if (this.f128379e.contains(c13672a)) {
            return this.f128381g.d(c13672a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c13672a));
    }

    @Override // df.InterfaceC13677d
    public <T> Set<T> e(C13672A<T> c13672a) {
        if (this.f128378d.contains(c13672a)) {
            return this.f128381g.e(c13672a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", c13672a));
    }

    @Override // df.InterfaceC13677d
    public <T> Kf.b<T> f(C13672A<T> c13672a) {
        if (this.f128376b.contains(c13672a)) {
            return this.f128381g.f(c13672a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", c13672a));
    }

    @Override // df.InterfaceC13677d
    public <T> Kf.a<T> h(C13672A<T> c13672a) {
        if (this.f128377c.contains(c13672a)) {
            return this.f128381g.h(c13672a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c13672a));
    }

    C13673B(C13676c<?> c13676c, InterfaceC13677d interfaceC13677d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c13676c.g()) {
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
        if (!c13676c.k().isEmpty()) {
            hashSet.add(C13672A.b(Hf.c.class));
        }
        this.f128375a = Collections.unmodifiableSet(hashSet);
        this.f128376b = Collections.unmodifiableSet(hashSet2);
        this.f128377c = Collections.unmodifiableSet(hashSet3);
        this.f128378d = Collections.unmodifiableSet(hashSet4);
        this.f128379e = Collections.unmodifiableSet(hashSet5);
        this.f128380f = c13676c.k();
        this.f128381g = interfaceC13677d;
    }

    @Override // df.InterfaceC13677d
    public <T> Kf.b<T> g(Class<T> cls) {
        return f(C13672A.b(cls));
    }

    @Override // df.InterfaceC13677d
    public <T> Kf.a<T> i(Class<T> cls) {
        return h(C13672A.b(cls));
    }
}
