package Ee;

import java.util.Comparator;

/* loaded from: classes6.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    private static final B f7149a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final B f7150b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final B f7151c = new b(1);

    class a extends B {
        a() {
            super(null);
        }

        @Override // Ee.B
        public int j() {
            return 0;
        }

        B l(int i10) {
            return i10 < 0 ? B.f7150b : i10 > 0 ? B.f7151c : B.f7149a;
        }

        @Override // Ee.B
        public B d(int i10, int i11) {
            return l(Integer.compare(i10, i11));
        }

        @Override // Ee.B
        public B e(long j10, long j11) {
            return l(Long.compare(j10, j11));
        }

        @Override // Ee.B
        public B f(Comparable<?> comparable, Comparable<?> comparable2) {
            return l(comparable.compareTo(comparable2));
        }

        @Override // Ee.B
        public <T> B g(T t10, T t11, Comparator<T> comparator) {
            return l(comparator.compare(t10, t11));
        }

        @Override // Ee.B
        public B h(boolean z10, boolean z11) {
            return l(Boolean.compare(z10, z11));
        }

        @Override // Ee.B
        public B i(boolean z10, boolean z11) {
            return l(Boolean.compare(z11, z10));
        }
    }

    private static final class b extends B {

        /* renamed from: d, reason: collision with root package name */
        final int f7152d;

        b(int i10) {
            super(null);
            this.f7152d = i10;
        }

        @Override // Ee.B
        public B d(int i10, int i11) {
            return this;
        }

        @Override // Ee.B
        public B e(long j10, long j11) {
            return this;
        }

        @Override // Ee.B
        public B f(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // Ee.B
        public <T> B g(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // Ee.B
        public B h(boolean z10, boolean z11) {
            return this;
        }

        @Override // Ee.B
        public B i(boolean z10, boolean z11) {
            return this;
        }

        @Override // Ee.B
        public int j() {
            return this.f7152d;
        }
    }

    /* synthetic */ B(a aVar) {
        this();
    }

    public abstract B d(int i10, int i11);

    public abstract B e(long j10, long j11);

    public abstract B f(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> B g(T t10, T t11, Comparator<T> comparator);

    public abstract B h(boolean z10, boolean z11);

    public abstract B i(boolean z10, boolean z11);

    public abstract int j();

    private B() {
    }

    public static B k() {
        return f7149a;
    }
}
