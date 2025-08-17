package ff;

import ef.C13654e;
import ef.C13655f;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public final class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static class a<T> extends AbstractC13883C<T> {

        /* renamed from: a, reason: collision with root package name */
        boolean f131021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f131022b;

        a(Object obj) {
            this.f131022b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f131021a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f131021a) {
                throw new NoSuchElementException();
            }
            this.f131021a = true;
            return (T) this.f131022b;
        }
    }

    private static final class b<T> extends AbstractC13885a<T> {

        /* renamed from: e, reason: collision with root package name */
        static final AbstractC13884D<Object> f131023e = new b(new Object[0], 0, 0, 0);

        /* renamed from: c, reason: collision with root package name */
        private final T[] f131024c;

        /* renamed from: d, reason: collision with root package name */
        private final int f131025d;

        @Override // ff.AbstractC13885a
        protected T a(int i10) {
            return this.f131024c[this.f131025d + i10];
        }

        b(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f131024c = tArr;
            this.f131025d = i10;
        }
    }

    @SafeVarargs
    public static <T> AbstractC13883C<T> d(T... tArr) {
        return e(tArr, 0, tArr.length, 0);
    }

    static <T> AbstractC13884D<T> c() {
        return (AbstractC13884D<T>) b.f131023e;
    }

    static <T> AbstractC13884D<T> e(T[] tArr, int i10, int i11, int i12) {
        C13655f.d(i11 >= 0);
        C13655f.k(i10, i10 + i11, tArr.length);
        C13655f.i(i12, i11);
        return i11 == 0 ? c() : new b(tArr, i10, i11, i12);
    }

    public static <T> AbstractC13883C<T> f(T t10) {
        return new a(t10);
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        C13655f.h(collection);
        C13655f.h(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C13654e.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }
}
