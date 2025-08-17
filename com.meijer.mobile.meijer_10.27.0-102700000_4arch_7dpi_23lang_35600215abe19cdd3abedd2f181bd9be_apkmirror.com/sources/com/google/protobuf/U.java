package com.google.protobuf;

import com.google.protobuf.B;
import com.google.protobuf.C11532s;
import com.google.protobuf.r0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
final class U<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final P f90475a;

    /* renamed from: b, reason: collision with root package name */
    private final l0<?, ?> f90476b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f90477c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC11529o<?> f90478d;

    static <T> U<T> l(l0<?, ?> l0Var, AbstractC11529o<?> abstractC11529o, P p10) {
        return new U<>(l0Var, abstractC11529o, p10);
    }

    @Override // com.google.protobuf.f0
    public void a(T t10, T t11) {
        h0.G(this.f90476b, t10, t11);
        if (this.f90477c) {
            h0.E(this.f90478d, t10, t11);
        }
    }

    @Override // com.google.protobuf.f0
    public int b(T t10) {
        int iHashCode = this.f90476b.g(t10).hashCode();
        return this.f90477c ? (iHashCode * 53) + this.f90478d.c(t10).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.f0
    public boolean c(T t10, T t11) {
        if (!this.f90476b.g(t10).equals(this.f90476b.g(t11))) {
            return false;
        }
        if (this.f90477c) {
            return this.f90478d.c(t10).equals(this.f90478d.c(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.f0
    public T d() {
        P p10 = this.f90475a;
        return p10 instanceof AbstractC11536w ? (T) ((AbstractC11536w) p10).U() : (T) p10.d().h();
    }

    @Override // com.google.protobuf.f0
    public void e(T t10) {
        this.f90476b.j(t10);
        this.f90478d.f(t10);
    }

    @Override // com.google.protobuf.f0
    public final boolean f(T t10) {
        return this.f90478d.c(t10).p();
    }

    @Override // com.google.protobuf.f0
    public int g(T t10) {
        int iJ = j(this.f90476b, t10);
        return this.f90477c ? iJ + this.f90478d.c(t10).j() : iJ;
    }

    @Override // com.google.protobuf.f0
    public void h(T t10, s0 s0Var) throws IOException {
        Iterator itT = this.f90478d.c(t10).t();
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            C11532s.b bVar = (C11532s.b) entry.getKey();
            if (bVar.j() != r0.c.MESSAGE || bVar.h() || bVar.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof B.b) {
                s0Var.b(bVar.g(), ((B.b) entry).a().e());
            } else {
                s0Var.b(bVar.g(), entry.getValue());
            }
        }
        n(this.f90476b, t10, s0Var);
    }

    @Override // com.google.protobuf.f0
    public void i(T t10, e0 e0Var, C11528n c11528n) throws Throwable {
        k(this.f90476b, this.f90478d, t10, e0Var, c11528n);
    }

    private U(l0<?, ?> l0Var, AbstractC11529o<?> abstractC11529o, P p10) {
        this.f90476b = l0Var;
        this.f90477c = abstractC11529o.e(p10);
        this.f90478d = abstractC11529o;
        this.f90475a = p10;
    }

    private <UT, UB> int j(l0<UT, UB> l0Var, T t10) {
        return l0Var.i(l0Var.g(t10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C11532s.b<ET>> void k(l0<UT, UB> l0Var, AbstractC11529o<ET> abstractC11529o, T t10, e0 e0Var, C11528n c11528n) throws Throwable {
        l0<UT, UB> l0Var2;
        UB ubF = l0Var.f(t10);
        Object objD = abstractC11529o.d(t10);
        while (e0Var.A() != Integer.MAX_VALUE) {
            try {
                l0Var2 = l0Var;
                AbstractC11529o<ET> abstractC11529o2 = abstractC11529o;
                e0 e0Var2 = e0Var;
                C11528n c11528n2 = c11528n;
                try {
                    if (m(e0Var2, c11528n2, abstractC11529o2, objD, l0Var2, ubF)) {
                        e0Var = e0Var2;
                        c11528n = c11528n2;
                        abstractC11529o = abstractC11529o2;
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
    private <UT, UB, ET extends C11532s.b<ET>> boolean m(e0 e0Var, C11528n c11528n, AbstractC11529o<ET> abstractC11529o, C11532s<ET> c11532s, l0<UT, UB> l0Var, UB ub2) throws IOException {
        int iA = e0Var.a();
        int iH = 0;
        if (iA != r0.f90619a) {
            if (r0.b(iA) == 2) {
                Object objB = abstractC11529o.b(c11528n, this.f90475a, r0.a(iA));
                if (objB != null) {
                    abstractC11529o.h(e0Var, objB, c11528n, c11532s);
                    return true;
                }
                return l0Var.m(ub2, e0Var, 0);
            }
            return e0Var.D();
        }
        Object objB2 = null;
        AbstractC11521g abstractC11521gO = null;
        while (e0Var.A() != Integer.MAX_VALUE) {
            int iA2 = e0Var.a();
            if (iA2 == r0.f90621c) {
                iH = e0Var.h();
                objB2 = abstractC11529o.b(c11528n, this.f90475a, iH);
            } else if (iA2 == r0.f90622d) {
                if (objB2 != null) {
                    abstractC11529o.h(e0Var, objB2, c11528n, c11532s);
                } else {
                    abstractC11521gO = e0Var.o();
                }
            } else if (!e0Var.D()) {
                break;
            }
        }
        if (e0Var.a() == r0.f90620b) {
            if (abstractC11521gO != null) {
                if (objB2 != null) {
                    abstractC11529o.i(abstractC11521gO, objB2, c11528n, c11532s);
                } else {
                    l0Var.d(ub2, iH, abstractC11521gO);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.b();
    }

    private <UT, UB> void n(l0<UT, UB> l0Var, T t10, s0 s0Var) throws IOException {
        l0Var.s(l0Var.g(t10), s0Var);
    }
}
