package Ee;

import com.medallia.digital.mobilesdk.q2;
import java.io.Serializable;
import java.lang.Comparable;

/* loaded from: classes6.dex */
abstract class D<C extends Comparable> implements Comparable<D<C>>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    final C f7154a;

    private static final class a extends D<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        private static final a f7155b = new a();

        @Override // Ee.D
        boolean t(Comparable<?> comparable) {
            return false;
        }

        private a() {
            super("");
        }

        @Override // Ee.D, java.lang.Comparable
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public int compareTo(D<Comparable<?>> d10) {
            return d10 == this ? 0 : 1;
        }

        @Override // Ee.D
        void o(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // Ee.D
        void p(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        public String toString() {
            return "+∞";
        }

        @Override // Ee.D
        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    private static final class b<C extends Comparable> extends D<C> {
        @Override // Ee.D, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((D) obj);
        }

        @Override // Ee.D
        public int hashCode() {
            return ~this.f7154a.hashCode();
        }

        @Override // Ee.D
        void o(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f7154a);
        }

        @Override // Ee.D
        void p(StringBuilder sb2) {
            sb2.append(this.f7154a);
            sb2.append(']');
        }

        @Override // Ee.D
        boolean t(C c10) {
            return j0.f(this.f7154a, c10) < 0;
        }

        public String toString() {
            return q2.f93563c + this.f7154a + "\\";
        }

        b(C c10) {
            super((Comparable) De.p.q(c10));
        }
    }

    private static final class c extends D<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        private static final c f7156b = new c();

        @Override // Ee.D
        boolean t(Comparable<?> comparable) {
            return true;
        }

        private c() {
            super("");
        }

        @Override // Ee.D, java.lang.Comparable
        /* renamed from: m */
        public int compareTo(D<Comparable<?>> d10) {
            return d10 == this ? 0 : -1;
        }

        @Override // Ee.D
        void o(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // Ee.D
        void p(StringBuilder sb2) {
            throw new AssertionError();
        }

        public String toString() {
            return "-∞";
        }

        @Override // Ee.D
        public int hashCode() {
            return System.identityHashCode(this);
        }
    }

    private static final class d<C extends Comparable> extends D<C> {
        @Override // Ee.D, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((D) obj);
        }

        @Override // Ee.D
        public int hashCode() {
            return this.f7154a.hashCode();
        }

        @Override // Ee.D
        void o(StringBuilder sb2) {
            sb2.append('[');
            sb2.append(this.f7154a);
        }

        @Override // Ee.D
        void p(StringBuilder sb2) {
            sb2.append(this.f7154a);
            sb2.append(')');
        }

        @Override // Ee.D
        boolean t(C c10) {
            return j0.f(this.f7154a, c10) <= 0;
        }

        public String toString() {
            return "\\" + this.f7154a + q2.f93563c;
        }

        d(C c10) {
            super((Comparable) De.p.q(c10));
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
        this.f7154a = c10;
    }

    static <C extends Comparable> D<C> a() {
        return a.f7155b;
    }

    static <C extends Comparable> D<C> e() {
        return c.f7156b;
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
        int iF = j0.f(this.f7154a, d10.f7154a);
        if (iF != 0) {
            return iF;
        }
        return Boolean.compare(this instanceof b, d10 instanceof b);
    }
}
