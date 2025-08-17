package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.C5952s;
import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class U<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final P f54202a;

    /* renamed from: b, reason: collision with root package name */
    private final l0<?, ?> f54203b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f54204c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5949o<?> f54205d;

    static <T> U<T> l(l0<?, ?> l0Var, AbstractC5949o<?> abstractC5949o, P p10) {
        return new U<>(l0Var, abstractC5949o, p10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(T t10, T t11) {
        h0.G(this.f54203b, t10, t11);
        if (this.f54204c) {
            h0.E(this.f54205d, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int b(T t10) {
        int iHashCode = this.f54203b.g(t10).hashCode();
        return this.f54204c ? (iHashCode * 53) + this.f54205d.c(t10).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean c(T t10, T t11) {
        if (!this.f54203b.g(t10).equals(this.f54203b.g(t11))) {
            return false;
        }
        if (this.f54204c) {
            return this.f54205d.c(t10).equals(this.f54205d.c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public T d() {
        P p10 = this.f54202a;
        return p10 instanceof AbstractC5956w ? (T) ((AbstractC5956w) p10).N() : (T) p10.d().h();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void e(T t10) {
        this.f54203b.j(t10);
        this.f54205d.f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean f(T t10) {
        return this.f54205d.c(t10).p();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int g(T t10) {
        int iJ = j(this.f54203b, t10);
        return this.f54204c ? iJ + this.f54205d.c(t10).j() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void h(T t10, e0 e0Var, C5948n c5948n) throws Throwable {
        k(this.f54203b, this.f54205d, t10, e0Var, c5948n);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void i(T t10, r0 r0Var) throws IOException {
        Iterator itT = this.f54205d.c(t10).t();
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            C5952s.b bVar = (C5952s.b) entry.getKey();
            if (bVar.j() != q0.c.MESSAGE || bVar.h() || bVar.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof A.b) {
                r0Var.b(bVar.g(), ((A.b) entry).a().e());
            } else {
                r0Var.b(bVar.g(), entry.getValue());
            }
        }
        n(this.f54203b, t10, r0Var);
    }

    private U(l0<?, ?> l0Var, AbstractC5949o<?> abstractC5949o, P p10) {
        this.f54203b = l0Var;
        this.f54204c = abstractC5949o.e(p10);
        this.f54205d = abstractC5949o;
        this.f54202a = p10;
    }

    private <UT, UB> int j(l0<UT, UB> l0Var, T t10) {
        return l0Var.i(l0Var.g(t10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C5952s.b<ET>> void k(l0<UT, UB> l0Var, AbstractC5949o<ET> abstractC5949o, T t10, e0 e0Var, C5948n c5948n) throws Throwable {
        l0<UT, UB> l0Var2;
        UB ubF = l0Var.f(t10);
        Object objD = abstractC5949o.d(t10);
        while (e0Var.A() != Integer.MAX_VALUE) {
            try {
                l0Var2 = l0Var;
                AbstractC5949o<ET> abstractC5949o2 = abstractC5949o;
                e0 e0Var2 = e0Var;
                C5948n c5948n2 = c5948n;
                try {
                    if (m(e0Var2, c5948n2, abstractC5949o2, objD, l0Var2, ubF)) {
                        e0Var = e0Var2;
                        c5948n = c5948n2;
                        abstractC5949o = abstractC5949o2;
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
    private <UT, UB, ET extends C5952s.b<ET>> boolean m(e0 e0Var, C5948n c5948n, AbstractC5949o<ET> abstractC5949o, C5952s<ET> c5952s, l0<UT, UB> l0Var, UB ub2) throws IOException {
        int iA = e0Var.a();
        int iH = 0;
        if (iA != q0.f54345a) {
            if (q0.b(iA) == 2) {
                Object objB = abstractC5949o.b(c5948n, this.f54202a, q0.a(iA));
                if (objB != null) {
                    abstractC5949o.h(e0Var, objB, c5948n, c5952s);
                    return true;
                }
                return l0Var.m(ub2, e0Var, 0);
            }
            return e0Var.D();
        }
        Object objB2 = null;
        AbstractC5941g abstractC5941gO = null;
        while (e0Var.A() != Integer.MAX_VALUE) {
            int iA2 = e0Var.a();
            if (iA2 == q0.f54347c) {
                iH = e0Var.h();
                objB2 = abstractC5949o.b(c5948n, this.f54202a, iH);
            } else if (iA2 == q0.f54348d) {
                if (objB2 != null) {
                    abstractC5949o.h(e0Var, objB2, c5948n, c5952s);
                } else {
                    abstractC5941gO = e0Var.o();
                }
            } else if (!e0Var.D()) {
                break;
            }
        }
        if (e0Var.a() == q0.f54346b) {
            if (abstractC5941gO != null) {
                if (objB2 != null) {
                    abstractC5949o.i(abstractC5941gO, objB2, c5948n, c5952s);
                } else {
                    l0Var.d(ub2, iH, abstractC5941gO);
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
