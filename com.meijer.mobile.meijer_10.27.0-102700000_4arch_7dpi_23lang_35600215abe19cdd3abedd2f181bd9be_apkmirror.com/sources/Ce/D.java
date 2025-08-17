package Ce;

import com.medallia.digital.mobilesdk.q2;
import java.io.Serializable;
import java.lang.Comparable;

/* loaded from: classes6.dex */
abstract class D<C extends Comparable> implements Comparable<D<C>>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    final C f3842a;

    private static final class a extends D<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        private static final a f3843b = new a();

        @Override // Ce.D
        boolean t(Comparable<?> comparable) {
            return false;
        }

        private a() {
            super("");
        }

        @Override // Ce.D, java.lang.Comparable
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public int compareTo(D<Comparable<?>> d10) {
            return d10 == this ? 0 : 1;
        }

        @Override // Ce.D
        void o(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // Ce.D
        void p(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        public String toString() {
            return "+∞";
        }

        @Override // Ce.D
        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    private static final class b<C extends Comparable> extends D<C> {
        @Override // Ce.D, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((D) obj);
        }

        @Override // Ce.D
        public int hashCode() {
            return ~this.f3842a.hashCode();
        }

        @Override // Ce.D
        void o(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f3842a);
        }

        @Override // Ce.D
        void p(StringBuilder sb2) {
            sb2.append(this.f3842a);
            sb2.append(']');
        }

        @Override // Ce.D
        boolean t(C c10) {
            return j0.f(this.f3842a, c10) < 0;
        }

        public String toString() {
            return q2.f92724c + this.f3842a + "\\";
        }

        b(C c10) {
            super((Comparable) Be.p.q(c10));
        }
    }

    private static final class c extends D<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        private static final c f3844b = new c();

        @Override // Ce.D
        boolean t(Comparable<?> comparable) {
            return true;
        }

        private c() {
            super("");
        }

        @Override // Ce.D, java.lang.Comparable
        /* renamed from: m */
        public int compareTo(D<Comparable<?>> d10) {
            return d10 == this ? 0 : -1;
        }

        @Override // Ce.D
        void o(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // Ce.D
        void p(StringBuilder sb2) {
            throw new AssertionError();
        }

        public String toString() {
            return "-∞";
        }

        @Override // Ce.D
        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    private static final class d<C extends Comparable> extends D<C> {
        @Override // Ce.D, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((D) obj);
        }

        @Override // Ce.D
        public int hashCode() {
            return this.f3842a.hashCode();
        }

        @Override // Ce.D
        void o(StringBuilder sb2) {
            sb2.append('[');
            sb2.append(this.f3842a);
        }

        @Override // Ce.D
        void p(StringBuilder sb2) {
            sb2.append(this.f3842a);
            sb2.append(')');
        }

        @Override // Ce.D
        boolean t(C c10) {
            return j0.f(this.f3842a, c10) <= 0;
        }

        public String toString() {
            return "\\" + this.f3842a + q2.f92724c;
        }

        d(C c10) {
            super((Comparable) Be.p.q(c10));
        }
    }

    public abstract int hashCode();

    abstract void o(StringBuilder sb2);

    abstract void p(StringBuilder sb2);

    abstract boolean t(C c10);

    static <C extends Comparable> D<C> b(C c10) {
        return new b(c10);
    }

    static <C extends Comparable> D<C> l(C c10) {
        return new d(c10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof D) {
            try {
                if (compareTo((D) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    D(C c10) {
        this.f3842a = c10;
    }

    static <C extends Comparable> D<C> a() {
        return a.f3843b;
    }

    static <C extends Comparable> D<C> e() {
        return c.f3844b;
    }

    @Override // java.lang.Comparable
    /* renamed from: m */
    public int compareTo(D<C> d10) {
        if (d10 == e()) {
            return 1;
        }
        if (d10 == a()) {
            return -1;
        }
        int iF = j0.f(this.f3842a, d10.f3842a);
        if (iF != 0) {
            return iF;
        }
        return Boolean.compare(this instanceof b, d10 instanceof b);
    }
}
