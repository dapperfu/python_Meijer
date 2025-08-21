package Ee;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class E<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    private final De.m<Iterable<E>> f7157a = De.m.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends E<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable[] f7158b;

        /* renamed from: Ee.E$a$a, reason: collision with other inner class name */
        class C0142a extends AbstractC3212a<Iterator<? extends T>> {
            C0142a(int i10) {
                super(i10);
            }

            @Override // Ee.AbstractC3212a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Iterator<? extends T> a(int i10) {
                return a.this.f7158b[i10].iterator();
            }
        }

        a(Iterable[] iterableArr) {
            this.f7158b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return S.f(new C0142a(this.f7158b.length));
        }
    }

    public static <T> E<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return e(iterable, iterable2);
    }

    private static <T> E<T> e(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> iterable : iterableArr) {
            De.p.q(iterable);
        }
        return new a(iterableArr);
    }

    private Iterable<E> f() {
        return this.f7157a.e(this);
    }

    protected E() {
    }

    public String toString() {
        return Q.o(f());
    }
}
