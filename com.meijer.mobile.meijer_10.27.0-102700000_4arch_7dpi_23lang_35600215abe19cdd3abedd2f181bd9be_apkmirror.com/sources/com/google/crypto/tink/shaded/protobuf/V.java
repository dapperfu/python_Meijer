package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C11323t;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
final class V<T> implements f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Q f88306a;

    /* renamed from: b, reason: collision with root package name */
    private final l0<?, ?> f88307b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f88308c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC11320p<?> f88309d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.C11309e.b r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.V.h(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    static <T> V<T> m(l0<?, ?> l0Var, AbstractC11320p<?> abstractC11320p, Q q10) {
        return new V<>(l0Var, abstractC11320p, q10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void a(T t10, T t11) {
        h0.G(this.f88307b, t10, t11);
        if (this.f88308c) {
            h0.E(this.f88309d, t10, t11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int b(T t10) {
        int iHashCode = this.f88307b.g(t10).hashCode();
        return this.f88308c ? (iHashCode * 53) + this.f88309d.c(t10).hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public boolean c(T t10, T t11) {
        if (!this.f88307b.g(t10).equals(this.f88307b.g(t11))) {
            return false;
        }
        if (this.f88308c) {
            return this.f88309d.c(t10).equals(this.f88309d.c(t11));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public T d() {
        Q q10 = this.f88306a;
        return q10 instanceof AbstractC11327x ? (T) ((AbstractC11327x) q10).N() : (T) q10.d().h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void e(T t10) {
        this.f88307b.j(t10);
        this.f88309d.f(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final boolean f(T t10) {
        return this.f88309d.c(t10).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int g(T t10) {
        int iK = k(this.f88307b, t10);
        return this.f88308c ? iK + this.f88309d.c(t10).j() : iK;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void i(T t10, e0 e0Var, C11319o c11319o) throws Throwable {
        l(this.f88307b, this.f88309d, t10, e0Var, c11319o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void j(T t10, r0 r0Var) throws IOException {
        Iterator itS = this.f88309d.c(t10).s();
        while (itS.hasNext()) {
            Map.Entry entry = (Map.Entry) itS.next();
            C11323t.b bVar = (C11323t.b) entry.getKey();
            if (bVar.j() != q0.c.MESSAGE || bVar.h() || bVar.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof B.b) {
                r0Var.b(bVar.g(), ((B.b) entry).a().e());
            } else {
                r0Var.b(bVar.g(), entry.getValue());
            }
        }
        o(this.f88307b, t10, r0Var);
    }

    private V(l0<?, ?> l0Var, AbstractC11320p<?> abstractC11320p, Q q10) {
        this.f88307b = l0Var;
        this.f88308c = abstractC11320p.e(q10);
        this.f88309d = abstractC11320p;
        this.f88306a = q10;
    }

    private <UT, UB> int k(l0<UT, UB> l0Var, T t10) {
        return l0Var.i(l0Var.g(t10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends C11323t.b<ET>> void l(l0<UT, UB> l0Var, AbstractC11320p<ET> abstractC11320p, T t10, e0 e0Var, C11319o c11319o) throws Throwable {
        l0<UT, UB> l0Var2;
        UB ubF = l0Var.f(t10);
        Object objD = abstractC11320p.d(t10);
        while (e0Var.A() != Integer.MAX_VALUE) {
            try {
                l0Var2 = l0Var;
                AbstractC11320p<ET> abstractC11320p2 = abstractC11320p;
                e0 e0Var2 = e0Var;
                C11319o c11319o2 = c11319o;
                try {
                    if (n(e0Var2, c11319o2, abstractC11320p2, objD, l0Var2, ubF)) {
                        e0Var = e0Var2;
                        c11319o = c11319o2;
                        abstractC11320p = abstractC11320p2;
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
    private <UT, UB, ET extends C11323t.b<ET>> boolean n(e0 e0Var, C11319o c11319o, AbstractC11320p<ET> abstractC11320p, C11323t<ET> c11323t, l0<UT, UB> l0Var, UB ub2) throws IOException {
        int iA = e0Var.a();
        int iH = 0;
        if (iA != q0.f88452a) {
            if (q0.b(iA) == 2) {
                Object objB = abstractC11320p.b(c11319o, this.f88306a, q0.a(iA));
                if (objB != null) {
                    abstractC11320p.h(e0Var, objB, c11319o, c11323t);
                    return true;
                }
                return l0Var.m(ub2, e0Var, 0);
            }
            return e0Var.D();
        }
        Object objB2 = null;
        AbstractC11312h abstractC11312hO = null;
        while (e0Var.A() != Integer.MAX_VALUE) {
            int iA2 = e0Var.a();
            if (iA2 == q0.f88454c) {
                iH = e0Var.h();
                objB2 = abstractC11320p.b(c11319o, this.f88306a, iH);
            } else if (iA2 == q0.f88455d) {
                if (objB2 != null) {
                    abstractC11320p.h(e0Var, objB2, c11319o, c11323t);
                } else {
                    abstractC11312hO = e0Var.o();
                }
            } else if (!e0Var.D()) {
                break;
            }
        }
        if (e0Var.a() == q0.f88453b) {
            if (abstractC11312hO != null) {
                if (objB2 != null) {
                    abstractC11320p.i(abstractC11312hO, objB2, c11319o, c11323t);
                } else {
                    l0Var.d(ub2, iH, abstractC11312hO);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.b();
    }

    private <UT, UB> void o(l0<UT, UB> l0Var, T t10, r0 r0Var) throws IOException {
        l0Var.s(l0Var.g(t10), r0Var);
    }
}
