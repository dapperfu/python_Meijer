package com.google.protobuf;

import com.google.protobuf.AbstractC11661w;
import com.google.protobuf.P;
import com.google.protobuf.r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11655p extends AbstractC11654o<AbstractC11661w.d> {

    /* renamed from: com.google.protobuf.p$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91430a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f91430a = iArr;
            try {
                iArr[r0.b.f91462c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91430a[r0.b.f91463d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91430a[r0.b.f91464e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91430a[r0.b.f91465f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91430a[r0.b.f91466g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f91430a[r0.b.f91467h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f91430a[r0.b.f91468i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f91430a[r0.b.f91469j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f91430a[r0.b.f91474o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f91430a[r0.b.f91476q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f91430a[r0.b.f91477r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f91430a[r0.b.f91478s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f91430a[r0.b.f91479t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f91430a[r0.b.f91475p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f91430a[r0.b.f91473n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f91430a[r0.b.f91470k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f91430a[r0.b.f91471l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f91430a[r0.b.f91472m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.AbstractC11654o
    C11657s<AbstractC11661w.d> c(Object obj) {
        return ((AbstractC11661w.c) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC11654o
    C11657s<AbstractC11661w.d> d(Object obj) {
        return ((AbstractC11661w.c) obj).Z();
    }

    @Override // com.google.protobuf.AbstractC11654o
    boolean e(P p10) {
        return p10 instanceof AbstractC11661w.c;
    }

    @Override // com.google.protobuf.AbstractC11654o
    <UT, UB> UB g(Object obj, e0 e0Var, Object obj2, C11653n c11653n, C11657s<AbstractC11661w.d> c11657s, UB ub2, l0<UT, UB> l0Var) throws IOException {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        AbstractC11661w.e eVar = (AbstractC11661w.e) obj2;
        int iC = eVar.c();
        if (eVar.f91583b.h() && eVar.f91583b.k()) {
            switch (a.f91430a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    e0Var.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    e0Var.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    e0Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    e0Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    e0Var.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    e0Var.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    e0Var.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    e0Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    e0Var.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    e0Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    e0Var.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    e0Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    e0Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    e0Var.j(arrayList);
                    ub2 = (UB) h0.z(obj, iC, arrayList, eVar.f91583b.b(), ub2, l0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f91583b.i());
            }
            c11657s.y(eVar.f91583b, arrayList);
            return ub2;
        }
        if (eVar.a() != r0.b.f91475p) {
            switch (a.f91430a[eVar.a().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(e0Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(e0Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(e0Var.H());
                    break;
                case 4:
                    objValueOf = Long.valueOf(e0Var.s());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(e0Var.p());
                    break;
                case 6:
                    objValueOf = Long.valueOf(e0Var.b());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(e0Var.u());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(e0Var.e());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(e0Var.h());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(e0Var.E());
                    break;
                case 11:
                    objValueOf = Long.valueOf(e0Var.f());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(e0Var.l());
                    break;
                case 13:
                    objValueOf = Long.valueOf(e0Var.y());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = e0Var.o();
                    break;
                case 16:
                    objValueOf = e0Var.z();
                    break;
                case 17:
                    if (!eVar.d()) {
                        Object objI2 = c11657s.i(eVar.f91583b);
                        if (objI2 instanceof AbstractC11661w) {
                            f0 f0VarD = b0.a().d(objI2);
                            if (!((AbstractC11661w) objI2).N()) {
                                Object objD = f0VarD.d();
                                f0VarD.a(objD, objI2);
                                c11657s.y(eVar.f91583b, objD);
                                objI2 = objD;
                            }
                            e0Var.O(objI2, f0VarD, c11653n);
                            return ub2;
                        }
                    }
                    objValueOf = e0Var.L(eVar.b().getClass(), c11653n);
                    break;
                case 18:
                    if (!eVar.d()) {
                        Object objI3 = c11657s.i(eVar.f91583b);
                        if (objI3 instanceof AbstractC11661w) {
                            f0 f0VarD2 = b0.a().d(objI3);
                            if (!((AbstractC11661w) objI3).N()) {
                                Object objD2 = f0VarD2.d();
                                f0VarD2.a(objD2, objI3);
                                c11657s.y(eVar.f91583b, objD2);
                                objI3 = objD2;
                            }
                            e0Var.P(objI3, f0VarD2, c11653n);
                            return ub2;
                        }
                    }
                    objValueOf = e0Var.N(eVar.b().getClass(), c11653n);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iP = e0Var.p();
            if (eVar.f91583b.b().a(iP) == null) {
                return (UB) h0.J(obj, iC, iP, ub2, l0Var);
            }
            objValueOf = Integer.valueOf(iP);
        }
        if (eVar.d()) {
            c11657s.a(eVar.f91583b, objValueOf);
            return ub2;
        }
        int i10 = a.f91430a[eVar.a().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objI = c11657s.i(eVar.f91583b)) != null) {
            objValueOf = C11663y.h(objI, objValueOf);
        }
        c11657s.y(eVar.f91583b, objValueOf);
        return ub2;
    }

    @Override // com.google.protobuf.AbstractC11654o
    void h(e0 e0Var, Object obj, C11653n c11653n, C11657s<AbstractC11661w.d> c11657s) throws IOException {
        AbstractC11661w.e eVar = (AbstractC11661w.e) obj;
        c11657s.y(eVar.f91583b, e0Var.N(eVar.b().getClass(), c11653n));
    }

    @Override // com.google.protobuf.AbstractC11654o
    void i(AbstractC11646g abstractC11646g, Object obj, C11653n c11653n, C11657s<AbstractC11661w.d> c11657s) throws IOException {
        AbstractC11661w.e eVar = (AbstractC11661w.e) obj;
        P.a aVarD = eVar.b().d();
        AbstractC11647h abstractC11647hQ = abstractC11646g.q();
        aVarD.d1(abstractC11647hQ, c11653n);
        c11657s.y(eVar.f91583b, aVarD.h());
        abstractC11647hQ.a(0);
    }

    C11655p() {
    }

    @Override // com.google.protobuf.AbstractC11654o
    int a(Map.Entry<?, ?> entry) {
        return ((AbstractC11661w.d) entry.getKey()).g();
    }

    @Override // com.google.protobuf.AbstractC11654o
    Object b(C11653n c11653n, P p10, int i10) {
        return c11653n.a(p10, i10);
    }

    @Override // com.google.protobuf.AbstractC11654o
    void f(Object obj) {
        c(obj).u();
    }

    @Override // com.google.protobuf.AbstractC11654o
    void j(s0 s0Var, Map.Entry<?, ?> entry) throws IOException {
        AbstractC11661w.d dVar = (AbstractC11661w.d) entry.getKey();
        if (dVar.h()) {
            switch (a.f91430a[dVar.i().ordinal()]) {
                case 1:
                    h0.O(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 2:
                    h0.S(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 3:
                    h0.V(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 4:
                    h0.d0(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 5:
                    h0.U(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 6:
                    h0.R(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 7:
                    h0.Q(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 8:
                    h0.M(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 9:
                    h0.c0(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 10:
                    h0.X(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 11:
                    h0.Y(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 12:
                    h0.Z(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 13:
                    h0.a0(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 14:
                    h0.U(dVar.g(), (List) entry.getValue(), s0Var, dVar.k());
                    break;
                case 15:
                    h0.N(dVar.g(), (List) entry.getValue(), s0Var);
                    break;
                case 16:
                    h0.b0(dVar.g(), (List) entry.getValue(), s0Var);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        h0.T(dVar.g(), (List) entry.getValue(), s0Var, b0.a().c(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        h0.W(dVar.g(), (List) entry.getValue(), s0Var, b0.a().c(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (a.f91430a[dVar.i().ordinal()]) {
            case 1:
                s0Var.p(dVar.g(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                s0Var.B(dVar.g(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                s0Var.u(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                s0Var.f(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                s0Var.h(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                s0Var.s(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                s0Var.c(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                s0Var.v(dVar.g(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                s0Var.o(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                s0Var.w(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                s0Var.i(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                s0Var.H(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                s0Var.m(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                s0Var.h(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                s0Var.L(dVar.g(), (AbstractC11646g) entry.getValue());
                break;
            case 16:
                s0Var.e(dVar.g(), (String) entry.getValue());
                break;
            case 17:
                s0Var.K(dVar.g(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                break;
            case 18:
                s0Var.N(dVar.g(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                break;
        }
    }
}
