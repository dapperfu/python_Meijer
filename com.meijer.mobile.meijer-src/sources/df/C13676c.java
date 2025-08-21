package df;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: df.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13676c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f128386a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<C13672A<? super T>> f128387b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<q> f128388c;

    /* renamed from: d, reason: collision with root package name */
    private final int f128389d;

    /* renamed from: e, reason: collision with root package name */
    private final int f128390e;

    /* renamed from: f, reason: collision with root package name */
    private final g<T> f128391f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f128392g;

    /* renamed from: df.c$b */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private String f128393a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<C13672A<? super T>> f128394b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<q> f128395c;

        /* renamed from: d, reason: collision with root package name */
        private int f128396d;

        /* renamed from: e, reason: collision with root package name */
        private int f128397e;

        /* renamed from: f, reason: collision with root package name */
        private g<T> f128398f;

        /* renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f128399g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f128397e = 1;
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public b<T> e() {
            return i(2);
        }

        private b<T> i(int i10) {
            z.d(this.f128396d == 0, "Instantiation type has already been set.");
            this.f128396d = i10;
            return this;
        }

        private void j(C13672A<?> c13672a) {
            z.a(!this.f128394b.contains(c13672a), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(q qVar) {
            z.c(qVar, "Null dependency");
            j(qVar.c());
            this.f128395c.add(qVar);
            return this;
        }

        public C13676c<T> d() {
            z.d(this.f128398f != null, "Missing required property: factory.");
            return new C13676c<>(this.f128393a, new HashSet(this.f128394b), new HashSet(this.f128395c), this.f128396d, this.f128397e, this.f128398f, this.f128399g);
        }

        public b<T> f(g<T> gVar) {
            this.f128398f = (g) z.c(gVar, "Null factory");
            return this;
        }

        public b<T> h(String str) {
            this.f128393a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f128393a = null;
            HashSet hashSet = new HashSet();
            this.f128394b = hashSet;
            this.f128395c = new HashSet();
            this.f128396d = 0;
            this.f128397e = 0;
            this.f128399g = new HashSet();
            z.c(cls, "Null interface");
            hashSet.add(C13672A.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                z.c(cls2, "Null interface");
                this.f128394b.add(C13672A.b(cls2));
            }
        }

        @SafeVarargs
        private b(C13672A<T> c13672a, C13672A<? super T>... c13672aArr) {
            this.f128393a = null;
            HashSet hashSet = new HashSet();
            this.f128394b = hashSet;
            this.f128395c = new HashSet();
            this.f128396d = 0;
            this.f128397e = 0;
            this.f128399g = new HashSet();
            z.c(c13672a, "Null interface");
            hashSet.add(c13672a);
            for (C13672A<? super T> c13672a2 : c13672aArr) {
                z.c(c13672a2, "Null interface");
            }
            Collections.addAll(this.f128394b, c13672aArr);
        }
    }

    public static /* synthetic */ Object a(Object obj, InterfaceC13677d interfaceC13677d) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC13677d interfaceC13677d) {
        return obj;
    }

    private C13676c(String str, Set<C13672A<? super T>> set, Set<q> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f128386a = str;
        this.f128387b = Collections.unmodifiableSet(set);
        this.f128388c = Collections.unmodifiableSet(set2);
        this.f128389d = i10;
        this.f128390e = i11;
        this.f128391f = gVar;
        this.f128392g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(C13672A<T> c13672a) {
        return new b<>(c13672a, new C13672A[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(C13672A<T> c13672a, C13672A<? super T>... c13672aArr) {
        return new b<>(c13672a, c13672aArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public Set<q> g() {
        return this.f128388c;
    }

    public g<T> h() {
        return this.f128391f;
    }

    public String i() {
        return this.f128386a;
    }

    public Set<C13672A<? super T>> j() {
        return this.f128387b;
    }

    public Set<Class<?>> k() {
        return this.f128392g;
    }

    public boolean n() {
        return this.f128389d == 1;
    }

    public boolean o() {
        return this.f128389d == 2;
    }

    public boolean p() {
        return this.f128390e == 0;
    }

    public C13676c<T> r(g<T> gVar) {
        return new C13676c<>(this.f128386a, this.f128387b, this.f128388c, this.f128389d, this.f128390e, gVar, this.f128392g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f128387b.toArray()) + ">{" + this.f128389d + ", type=" + this.f128390e + ", deps=" + Arrays.toString(this.f128388c.toArray()) + "}";
    }

    public static <T> C13676c<T> l(final T t10, Class<T> cls) {
        return m(cls).f(new g() { // from class: df.a
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return C13676c.b(t10, interfaceC13677d);
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).g();
    }

    @SafeVarargs
    public static <T> C13676c<T> q(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).f(new g() { // from class: df.b
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return C13676c.a(t10, interfaceC13677d);
            }
        }).d();
    }
}
