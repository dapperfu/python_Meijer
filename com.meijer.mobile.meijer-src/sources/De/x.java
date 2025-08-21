package De;

import De.x;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class x {

    static class a<T> implements w<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private transient Object f6177a = new Object();

        /* renamed from: b, reason: collision with root package name */
        final w<T> f6178b;

        /* renamed from: c, reason: collision with root package name */
        volatile transient boolean f6179c;

        /* renamed from: d, reason: collision with root package name */
        transient T f6180d;

        @Override // De.w
        public T get() {
            if (!this.f6179c) {
                synchronized (this.f6177a) {
                    try {
                        if (!this.f6179c) {
                            T t10 = this.f6178b.get();
                            this.f6180d = t10;
                            this.f6179c = true;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) k.a(this.f6180d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f6179c) {
                obj = "<supplier that returned " + this.f6180d + ">";
            } else {
                obj = this.f6178b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }

        a(w<T> wVar) {
            this.f6178b = (w) p.q(wVar);
        }
    }

    static class b<T> implements w<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final w<Void> f6181d = new w() { // from class: De.y
            @Override // De.w
            public final Object get() {
                return x.b.a();
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Object f6182a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private volatile w<T> f6183b;

        /* renamed from: c, reason: collision with root package name */
        private T f6184c;

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // De.w
        public T get() {
            w<T> wVar = this.f6183b;
            w<T> wVar2 = (w<T>) f6181d;
            if (wVar != wVar2) {
                synchronized (this.f6182a) {
                    try {
                        if (this.f6183b != wVar2) {
                            T t10 = this.f6183b.get();
                            this.f6184c = t10;
                            this.f6183b = wVar2;
                            return t10;
                        }
                    } finally {
                    }
                }
            }
            return (T) k.a(this.f6184c);
        }

        public String toString() {
            Object obj = this.f6183b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f6181d) {
                obj = "<supplier that returned " + this.f6184c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }

        b(w<T> wVar) {
            this.f6183b = (w) p.q(wVar);
        }
    }

    private static class c<T> implements w<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final T f6185a;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return l.a(this.f6185a, ((c) obj).f6185a);
            }
            return false;
        }

        @Override // De.w
        public T get() {
            return this.f6185a;
        }

        public int hashCode() {
            return l.b(this.f6185a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f6185a + ")";
        }

        c(T t10) {
            this.f6185a = t10;
        }
    }

    public static <T> w<T> a(w<T> wVar) {
        return ((wVar instanceof b) || (wVar instanceof a)) ? wVar : wVar instanceof Serializable ? new a(wVar) : new b(wVar);
    }

    public static <T> w<T> b(T t10) {
        return new c(t10);
    }
}
