package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.C6094s;
import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class U<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final P f54426a;

    /* renamed from: b, reason: collision with root package name */
    private final l0<?, ?> f54427b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f54428c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC6091o<?> f54429d;

    static <T> U<T> l(l0<?, ?> l0Var, AbstractC6091o<?> abstractC6091o, P p10) {
        return new U<>(l0Var, abstractC6091o, p10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(T t10, T t11) {
        h0.G(this.f54427b, t10, t11);
        if (this.f54428c) {
            h0.E(this.f54429d, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int b(T t10) {
        int iHashCode = this.f54427b.g(t10).hashCode();
        return this.f54428c ? (iHashCode * 53) + this.f54429d.c(t10).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean c(T t10, T t11) {
        if (!this.f54427b.g(t10).equals(this.f54427b.g(t11))) {
            return false;
        }
        if (this.f54428c) {
            return this.f54429d.c(t10).equals(this.f54429d.c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public T d() {
        P p10 = this.f54426a;
        return p10 instanceof AbstractC6098w ? (T) ((AbstractC6098w) p10).N() : (T) p10.d().h();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void e(T t10) {
        this.f54427b.j(t10);
        this.f54429d.f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean f(T t10) {
        return this.f54429d.c(t10).p();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int g(T t10) {
        int iJ = j(this.f54427b, t10);
        return this.f54428c ? iJ + this.f54429d.c(t10).j() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void h(T t10, e0 e0Var, C6090n c6090n) throws Throwable {
        k(this.f54427b, this.f54429d, t10, e0Var, c6090n);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void i(T t10, r0 r0Var) throws IOException {
        Iterator itT = this.f54429d.c(t10).t();
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            C6094s.b bVar = (C6094s.b) entry.getKey();
            if (bVar.j() != q0.c.MESSAGE || bVar.h() || bVar.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof A.b) {
                r0Var.b(bVar.g(), ((A.b) entry).a().e());
            } else {
                r0Var.b(bVar.g(), entry.getValue());
            }
        }
        n(this.f54427b, t10, r0Var);
    }

    private U(l0<?, ?> l0Var, AbstractC6091o<?> abstractC6091o, P p10) {
        this.f54427b = l0Var;
        this.f54428c = abstractC6091o.e(p10);
        this.f54429d = abstractC6091o;
        this.f54426a = p10;
    }

    private <UT, UB> int j(l0<UT, UB> l0Var, T t10) {
        return l0Var.i(l0Var.g(t10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C6094s.b<ET>> void k(l0<UT, UB> l0Var, AbstractC6091o<ET> abstractC6091o, T t10, e0 e0Var, C6090n c6090n) throws Throwable {
        l0<UT, UB> l0Var2;
        UB ubF = l0Var.f(t10);
        Object objD = abstractC6091o.d(t10);
        while (e0Var.A() != Integer.MAX_VALUE) {
            try {
                l0Var2 = l0Var;
                AbstractC6091o<ET> abstractC6091o2 = abstractC6091o;
                e0 e0Var2 = e0Var;
                C6090n c6090n2 = c6090n;
                try {
                    if (m(e0Var2, c6090n2, abstractC6091o2, objD, l0Var2, ubF)) {
                        e0Var = e0Var2;
                        c6090n = c6090n2;
                        abstractC6091o = abstractC6091o2;
                        l0Var = l0Var2;
                    } else {
                        l0Var2.o(t10, ubF);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    l0Var2.o(t10, ubF);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                l0Var2 = l0Var;
            }
        }
        l0Var.o(t10, ubF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C6094s.b<ET>> boolean m(e0 e0Var, C6090n c6090n, AbstractC6091o<ET> abstractC6091o, C6094s<ET> c6094s, l0<UT, UB> l0Var, UB ub2) throws IOException {
        int iA = e0Var.a();
        int iH = 0;
        if (iA != q0.f54569a) {
            if (q0.b(iA) == 2) {
                Object objB = abstractC6091o.b(c6090n, this.f54426a, q0.a(iA));
                if (objB != null) {
                    abstractC6091o.h(e0Var, objB, c6090n, c6094s);
                    return true;
                }
                return l0Var.m(ub2, e0Var, 0);
            }
            return e0Var.D();
        }
        Object objB2 = null;
        AbstractC6083g abstractC6083gO = null;
        while (e0Var.A() != Integer.MAX_VALUE) {
            int iA2 = e0Var.a();
            if (iA2 == q0.f54571c) {
                iH = e0Var.h();
                objB2 = abstractC6091o.b(c6090n, this.f54426a, iH);
            } else if (iA2 == q0.f54572d) {
                if (objB2 != null) {
                    abstractC6091o.h(e0Var, objB2, c6090n, c6094s);
                } else {
                    abstractC6083gO = e0Var.o();
                }
            } else if (!e0Var.D()) {
                break;
            }
        }
        if (e0Var.a() == q0.f54570b) {
            if (abstractC6083gO != null) {
                if (objB2 != null) {
                    abstractC6091o.i(abstractC6083gO, objB2, c6090n, c6094s);
                } else {
                    l0Var.d(ub2, iH, abstractC6083gO);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.b();
    }

    private <UT, UB> void n(l0<UT, UB> l0Var, T t10, r0 r0Var) throws IOException {
        l0Var.s(l0Var.g(t10), r0Var);
    }
}
