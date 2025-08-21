package Ee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public abstract class a0<K0, V0> {

    class a extends e<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7332a;

        a(int i10) {
            this.f7332a = i10;
        }

        @Override // Ee.a0.e
        <K, V> Map<K, Collection<V>> c() {
            return i0.c(this.f7332a);
        }
    }

    class b extends e<K0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f7333a;

        b(Comparator comparator) {
            this.f7333a = comparator;
        }

        @Override // Ee.a0.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f7333a);
        }
    }

    private static final class c<V> implements De.w<List<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final int f7334a;

        @Override // De.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f7334a);
        }

        c(int i10) {
            this.f7334a = C3233w.b(i10, "expectedValuesPerKey");
        }
    }

    public static abstract class d<K0, V0> extends a0<K0, V0> {
        d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> T<K, V> e();
    }

    public static abstract class e<K0> {

        class a extends d<K0, Object> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f7335a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f7336b;

            a(e eVar, int i10) {
                this.f7335a = i10;
                this.f7336b = eVar;
            }

            @Override // Ee.a0.d
            public <K extends K0, V> T<K, V> e() {
                return b0.b(this.f7336b.c(), new c(this.f7335a));
            }
        }

        public d<K0, Object> a() {
            return b(2);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();

        public d<K0, Object> b(int i10) {
            C3233w.b(i10, "expectedValuesPerKey");
            return new a(this, i10);
        }

        e() {
        }
    }

    /* synthetic */ a0(a aVar) {
        this();
    }

    private a0() {
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i10) {
        C3233w.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e<Comparable> c() {
        return d(g0.d());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        De.p.q(comparator);
        return new b(comparator);
    }
}
