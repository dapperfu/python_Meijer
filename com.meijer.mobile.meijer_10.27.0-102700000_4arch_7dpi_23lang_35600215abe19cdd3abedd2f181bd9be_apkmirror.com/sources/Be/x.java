package Be;

import Be.x;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class x {

    static class a<T> implements w<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private transient Object f2232a = new Object();

        /* renamed from: b, reason: collision with root package name */
        final w<T> f2233b;

        /* renamed from: c, reason: collision with root package name */
        volatile transient boolean f2234c;

        /* renamed from: d, reason: collision with root package name */
        transient T f2235d;

        @Override // Be.w
        public T get() {
            if (!this.f2234c) {
                synchronized (this.f2232a) {
                    try {
                        if (!this.f2234c) {
                            T t10 = this.f2233b.get();
                            this.f2235d = t10;
                            this.f2234c = true;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) k.a(this.f2235d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f2234c) {
                obj = "<supplier that returned " + this.f2235d + ">";
            } else {
                obj = this.f2233b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }

        a(w<T> wVar) {
            this.f2233b = (w) p.q(wVar);
        }
    }

    static class b<T> implements w<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final w<Void> f2236d = new w() { // from class: Be.y
            @Override // Be.w
            public final Object get() {
                return x.b.a();
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Object f2237a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private volatile w<T> f2238b;

        /* renamed from: c, reason: collision with root package name */
        private T f2239c;

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // Be.w
        public T get() {
            w<T> wVar = this.f2238b;
            w<T> wVar2 = (w<T>) f2236d;
            if (wVar != wVar2) {
                synchronized (this.f2237a) {
                    try {
                        if (this.f2238b != wVar2) {
                            T t10 = this.f2238b.get();
                            this.f2239c = t10;
                            this.f2238b = wVar2;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) k.a(this.f2239c);
        }

        public String toString() {
            Object obj = this.f2238b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f2236d) {
                obj = "<supplier that returned " + this.f2239c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }

        b(w<T> wVar) {
            this.f2238b = (w) p.q(wVar);
        }
    }

    private static class c<T> implements w<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final T f2240a;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return l.a(this.f2240a, ((c) obj).f2240a);
            }
            return false;
        }

        @Override // Be.w
        public T get() {
            return this.f2240a;
        }

        public int hashCode() {
            return l.b(this.f2240a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f2240a + ")";
        }

        c(T t10) {
            this.f2240a = t10;
        }
    }

    public static <T> w<T> a(w<T> wVar) {
        return ((wVar instanceof b) || (wVar instanceof a)) ? wVar : wVar instanceof Serializable ? new a(wVar) : new b(wVar);
    }

    public static <T> w<T> b(T t10) {
        return new c(t10);
    }
}
