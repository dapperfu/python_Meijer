package hf;

import gf.C14358e;
import gf.C14359f;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public final class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static class a<T> extends AbstractC14513C<T> {

        /* renamed from: a, reason: collision with root package name */
        boolean f135367a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f135368b;

        a(Object obj) {
            this.f135368b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f135367a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f135367a) {
                throw new NoSuchElementException();
            }
            this.f135367a = true;
            return (T) this.f135368b;
        }
    }

    private static final class b<T> extends AbstractC14515a<T> {

        /* renamed from: e, reason: collision with root package name */
        static final AbstractC14514D<Object> f135369e = new b(new Object[0], 0, 0, 0);

        /* renamed from: c, reason: collision with root package name */
        private final T[] f135370c;

        /* renamed from: d, reason: collision with root package name */
        private final int f135371d;

        @Override // hf.AbstractC14515a
        protected T a(int i10) {
            return this.f135370c[this.f135371d + i10];
        }

        b(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f135370c = tArr;
            this.f135371d = i10;
        }
    }

    @SafeVarargs
    public static <T> AbstractC14513C<T> d(T... tArr) {
        return e(tArr, 0, tArr.length, 0);
    }

    static <T> AbstractC14514D<T> c() {
        return (AbstractC14514D<T>) b.f135369e;
    }

    static <T> AbstractC14514D<T> e(T[] tArr, int i10, int i11, int i12) {
        C14359f.d(i11 >= 0);
        C14359f.k(i10, i10 + i11, tArr.length);
        C14359f.i(i12, i11);
        return i11 == 0 ? c() : new b(tArr, i10, i11, i12);
    }

    public static <T> AbstractC14513C<T> f(T t10) {
        return new a(t10);
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        C14359f.h(collection);
        C14359f.h(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C14358e.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }
}
