package Ce;

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
        final /* synthetic */ int f4020a;

        a(int i10) {
            this.f4020a = i10;
        }

        @Override // Ce.a0.e
        <K, V> Map<K, Collection<V>> c() {
            return i0.c(this.f4020a);
        }
    }

    class b extends e<K0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f4021a;

        b(Comparator comparator) {
            this.f4021a = comparator;
        }

        @Override // Ce.a0.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f4021a);
        }
    }

    private static final class c<V> implements Be.w<List<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final int f4022a;

        @Override // Be.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f4022a);
        }

        c(int i10) {
            this.f4022a = C3030w.b(i10, "expectedValuesPerKey");
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
            final /* synthetic */ int f4023a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f4024b;

            a(e eVar, int i10) {
                this.f4023a = i10;
                this.f4024b = eVar;
            }

            @Override // Ce.a0.d
            public <K extends K0, V> T<K, V> e() {
                return b0.b(this.f4024b.c(), new c(this.f4023a));
            }
        }

        public d<K0, Object> a() {
            return b(2);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();

        public d<K0, Object> b(int i10) {
            C3030w.b(i10, "expectedValuesPerKey");
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
        C3030w.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e<Comparable> c() {
        return d(g0.d());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        Be.p.q(comparator);
        return new b(comparator);
    }
}
