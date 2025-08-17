package Ce;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class E<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    private final Be.m<Iterable<E>> f3845a = Be.m.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends E<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable[] f3846b;

        /* renamed from: Ce.E$a$a, reason: collision with other inner class name */
        class C0067a extends AbstractC3009a<Iterator<? extends T>> {
            C0067a(int i10) {
                super(i10);
            }

            @Override // Ce.AbstractC3009a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> a(int i10) {
                return a.this.f3846b[i10].iterator();
            }
        }

        a(Iterable[] iterableArr) {
            this.f3846b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return S.f(new C0067a(this.f3846b.length));
        }
    }

    public static <T> E<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return e(iterable, iterable2);
    }

    private static <T> E<T> e(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            Be.p.q(iterable);
        }
        return new a(iterableArr);
    }

    private Iterable<E> f() {
        return this.f3845a.e(this);
    }

    protected E() {
    }

    public String toString() {
        return Q.o(f());
    }
}
