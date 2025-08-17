package bf;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bf.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6245c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f60151a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<C6241A<? super T>> f60152b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<q> f60153c;

    /* renamed from: d, reason: collision with root package name */
    private final int f60154d;

    /* renamed from: e, reason: collision with root package name */
    private final int f60155e;

    /* renamed from: f, reason: collision with root package name */
    private final g<T> f60156f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f60157g;

    /* renamed from: bf.c$b */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private String f60158a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<C6241A<? super T>> f60159b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<q> f60160c;

        /* renamed from: d, reason: collision with root package name */
        private int f60161d;

        /* renamed from: e, reason: collision with root package name */
        private int f60162e;

        /* renamed from: f, reason: collision with root package name */
        private g<T> f60163f;

        /* renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f60164g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f60162e = 1;
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public b<T> e() {
            return i(2);
        }

        private b<T> i(int i10) {
            z.d(this.f60161d == 0, "Instantiation type has already been set.");
            this.f60161d = i10;
            return this;
        }

        private void j(C6241A<?> c6241a) {
            z.a(!this.f60159b.contains(c6241a), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            z.c(qVar, "Null dependency");
            j(qVar.c());
            this.f60160c.add(qVar);
            return this;
        }

        public C6245c<T> d() {
            z.d(this.f60163f != null, "Missing required property: factory.");
            return new C6245c<>(this.f60158a, new HashSet(this.f60159b), new HashSet(this.f60160c), this.f60161d, this.f60162e, this.f60163f, this.f60164g);
        }

        public b<T> f(g<T> gVar) {
            this.f60163f = (g) z.c(gVar, "Null factory");
            return this;
        }

        public b<T> h(String str) {
            this.f60158a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f60158a = null;
            HashSet hashSet = new HashSet();
            this.f60159b = hashSet;
            this.f60160c = new HashSet();
            this.f60161d = 0;
            this.f60162e = 0;
            this.f60164g = new HashSet();
            z.c(cls, "Null interface");
            hashSet.add(C6241A.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                z.c(cls2, "Null interface");
                this.f60159b.add(C6241A.b(cls2));
            }
        }

        @SafeVarargs
        private b(C6241A<T> c6241a, C6241A<? super T>... c6241aArr) {
            this.f60158a = null;
            HashSet hashSet = new HashSet();
            this.f60159b = hashSet;
            this.f60160c = new HashSet();
            this.f60161d = 0;
            this.f60162e = 0;
            this.f60164g = new HashSet();
            z.c(c6241a, "Null interface");
            hashSet.add(c6241a);
            for (C6241A<? super T> c6241a2 : c6241aArr) {
                z.c(c6241a2, "Null interface");
            }
            Collections.addAll(this.f60159b, c6241aArr);
        }
    }

    public static /* synthetic */ Object a(Object obj, InterfaceC6246d interfaceC6246d) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC6246d interfaceC6246d) {
        return obj;
    }

    private C6245c(String str, Set<C6241A<? super T>> set, Set<q> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f60151a = str;
        this.f60152b = Collections.unmodifiableSet(set);
        this.f60153c = Collections.unmodifiableSet(set2);
        this.f60154d = i10;
        this.f60155e = i11;
        this.f60156f = gVar;
        this.f60157g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(C6241A<T> c6241a) {
        return new b<>(c6241a, new C6241A[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(C6241A<T> c6241a, C6241A<? super T>... c6241aArr) {
        return new b<>(c6241a, c6241aArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public Set<q> g() {
        return this.f60153c;
    }

    public g<T> h() {
        return this.f60156f;
    }

    public String i() {
        return this.f60151a;
    }

    public Set<C6241A<? super T>> j() {
        return this.f60152b;
    }

    public Set<Class<?>> k() {
        return this.f60157g;
    }

    public boolean n() {
        return this.f60154d == 1;
    }

    public boolean o() {
        return this.f60154d == 2;
    }

    public boolean p() {
        return this.f60155e == 0;
    }

    public C6245c<T> r(g<T> gVar) {
        return new C6245c<>(this.f60151a, this.f60152b, this.f60153c, this.f60154d, this.f60155e, gVar, this.f60157g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f60152b.toArray()) + ">{" + this.f60154d + ", type=" + this.f60155e + ", deps=" + Arrays.toString(this.f60153c.toArray()) + "}";
    }

    public static <T> C6245c<T> l(final T t10, Class<T> cls) {
        return m(cls).f(new g() { // from class: bf.a
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return C6245c.b(t10, interfaceC6246d);
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).g();
    }

    @SafeVarargs
    public static <T> C6245c<T> q(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).f(new g() { // from class: bf.b
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return C6245c.a(t10, interfaceC6246d);
            }
        }).d();
    }
}
