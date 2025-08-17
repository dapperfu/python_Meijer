package Ce;

import Ce.L;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class N<C extends Comparable> extends AbstractC3015g<C> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final N<Comparable<?>> f3905b = new N<>(L.x());

    /* renamed from: c, reason: collision with root package name */
    private static final N<Comparable<?>> f3906c = new N<>(L.y(j0.a()));

    /* renamed from: a, reason: collision with root package name */
    private final transient L<j0<C>> f3907a;

    public static class a<C extends Comparable<?>> {

        /* renamed from: a, reason: collision with root package name */
        private final List<j0<C>> f3908a = U.g();

        public N<C> c() {
            L.a aVar = new L.a(this.f3908a.size());
            Collections.sort(this.f3908a, j0.l());
            h0 h0VarT = S.t(this.f3908a.iterator());
            while (h0VarT.hasNext()) {
                j0 j0VarM = (j0) h0VarT.next();
                while (h0VarT.hasNext()) {
                    j0<C> j0Var = (j0) h0VarT.peek();
                    if (j0VarM.j(j0Var)) {
                        Be.p.m(j0VarM.i(j0Var).k(), "Overlapping ranges not permitted but found %s overlapping %s", j0VarM, j0Var);
                        j0VarM = j0VarM.m((j0) h0VarT.next());
                    }
                }
                aVar.a(j0VarM);
            }
            L lK = aVar.k();
            return lK.isEmpty() ? N.e() : (lK.size() == 1 && ((j0) Q.h(lK)).equals(j0.a())) ? N.b() : new N<>(lK);
        }

        a<C> d(a<C> aVar) {
            b(aVar.f3908a);
            return this;
        }

        public a<C> a(j0<C> j0Var) {
            Be.p.l(!j0Var.k(), "range must not be empty, but was %s", j0Var);
            this.f3908a.add(j0Var);
            return this;
        }

        public a<C> b(Iterable<j0<C>> iterable) {
            Iterator<j0<C>> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    static <C extends Comparable> N<C> b() {
        return f3906c;
    }

    public static <C extends Comparable<?>> a<C> d() {
        return new a<>();
    }

    public static <C extends Comparable> N<C> e() {
        return f3905b;
    }

    @Override // Ce.l0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public O<j0<C>> a() {
        return this.f3907a.isEmpty() ? O.x() : new p0(this.f3907a, j0.l());
    }

    N(L<j0<C>> l10) {
        this.f3907a = l10;
    }

    @Override // Ce.AbstractC3015g
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }
}
