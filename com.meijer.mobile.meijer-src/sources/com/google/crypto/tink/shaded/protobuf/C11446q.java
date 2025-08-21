package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC11452x;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11446q extends AbstractC11445p<AbstractC11452x.d> {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.q$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89291a;

        static {
            int[] iArr = new int[q0.b.values().length];
            f89291a = iArr;
            try {
                iArr[q0.b.f89296c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89291a[q0.b.f89297d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89291a[q0.b.f89298e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89291a[q0.b.f89299f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89291a[q0.b.f89300g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f89291a[q0.b.f89301h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f89291a[q0.b.f89302i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f89291a[q0.b.f89303j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f89291a[q0.b.f89308o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f89291a[q0.b.f89310q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f89291a[q0.b.f89311r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f89291a[q0.b.f89312s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f89291a[q0.b.f89313t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f89291a[q0.b.f89309p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f89291a[q0.b.f89307n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f89291a[q0.b.f89304k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f89291a[q0.b.f89305l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f89291a[q0.b.f89306m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    C11448t<AbstractC11452x.d> c(Object obj) {
        return ((AbstractC11452x.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    C11448t<AbstractC11452x.d> d(Object obj) {
        return ((AbstractC11452x.c) obj).X();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    boolean e(Q q10) {
        return q10 instanceof AbstractC11452x.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    <UT, UB> UB g(Object obj, e0 e0Var, Object obj2, C11444o c11444o, C11448t<AbstractC11452x.d> c11448t, UB ub2, l0<UT, UB> l0Var) throws IOException {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        AbstractC11452x.e eVar = (AbstractC11452x.e) obj2;
        int iC = eVar.c();
        if (eVar.f89419b.h() && eVar.f89419b.k()) {
            switch (a.f89291a[eVar.a().ordinal()]) {
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
                    ub2 = (UB) h0.z(obj, iC, arrayList, eVar.f89419b.b(), ub2, l0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f89419b.i());
            }
            c11448t.x(eVar.f89419b, arrayList);
            return ub2;
        }
        if (eVar.a() != q0.b.f89309p) {
            switch (a.f89291a[eVar.a().ordinal()]) {
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
                        Object objI2 = c11448t.i(eVar.f89419b);
                        if (objI2 instanceof AbstractC11452x) {
                            f0 f0VarD = b0.a().d(objI2);
                            if (!((AbstractC11452x) objI2).H()) {
                                Object objD = f0VarD.d();
                                f0VarD.a(objD, objI2);
                                c11448t.x(eVar.f89419b, objD);
                                objI2 = objD;
                            }
                            e0Var.J(objI2, f0VarD, c11444o);
                            return ub2;
                        }
                    }
                    objValueOf = e0Var.K(eVar.b().getClass(), c11444o);
                    break;
                case 18:
                    if (!eVar.d()) {
                        Object objI3 = c11448t.i(eVar.f89419b);
                        if (objI3 instanceof AbstractC11452x) {
                            f0 f0VarD2 = b0.a().d(objI3);
                            if (!((AbstractC11452x) objI3).H()) {
                                Object objD2 = f0VarD2.d();
                                f0VarD2.a(objD2, objI3);
                                c11448t.x(eVar.f89419b, objD2);
                                objI3 = objD2;
                            }
                            e0Var.M(objI3, f0VarD2, c11444o);
                            return ub2;
                        }
                    }
                    objValueOf = e0Var.O(eVar.b().getClass(), c11444o);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iP = e0Var.p();
            if (eVar.f89419b.b().a(iP) == null) {
                return (UB) h0.J(obj, iC, iP, ub2, l0Var);
            }
            objValueOf = Integer.valueOf(iP);
        }
        if (eVar.d()) {
            c11448t.a(eVar.f89419b, objValueOf);
            return ub2;
        }
        int i10 = a.f89291a[eVar.a().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objI = c11448t.i(eVar.f89419b)) != null) {
            objValueOf = C11454z.g(objI, objValueOf);
        }
        c11448t.x(eVar.f89419b, objValueOf);
        return ub2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    void h(e0 e0Var, Object obj, C11444o c11444o, C11448t<AbstractC11452x.d> c11448t) throws IOException {
        AbstractC11452x.e eVar = (AbstractC11452x.e) obj;
        c11448t.x(eVar.f89419b, e0Var.O(eVar.b().getClass(), c11444o));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    void i(AbstractC11437h abstractC11437h, Object obj, C11444o c11444o, C11448t<AbstractC11452x.d> c11448t) throws IOException {
        AbstractC11452x.e eVar = (AbstractC11452x.e) obj;
        Q.a aVarD = eVar.b().d();
        AbstractC11438i abstractC11438iR = abstractC11437h.r();
        aVarD.j2(abstractC11438iR, c11444o);
        c11448t.x(eVar.f89419b, aVarD.h());
        abstractC11438iR.a(0);
    }

    C11446q() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    int a(Map.Entry<?, ?> entry) {
        return ((AbstractC11452x.d) entry.getKey()).g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    Object b(C11444o c11444o, Q q10, int i10) {
        return c11444o.a(q10, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    void f(Object obj) {
        c(obj).t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11445p
    void j(r0 r0Var, Map.Entry<?, ?> entry) throws IOException {
        AbstractC11452x.d dVar = (AbstractC11452x.d) entry.getKey();
        if (dVar.h()) {
            switch (a.f89291a[dVar.i().ordinal()]) {
                case 1:
                    h0.O(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 2:
                    h0.S(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 3:
                    h0.V(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 4:
                    h0.d0(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 5:
                    h0.U(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 6:
                    h0.R(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 7:
                    h0.Q(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 8:
                    h0.M(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 9:
                    h0.c0(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 10:
                    h0.X(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 11:
                    h0.Y(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 12:
                    h0.Z(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 13:
                    h0.a0(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 14:
                    h0.U(dVar.g(), (List) entry.getValue(), r0Var, dVar.k());
                    break;
                case 15:
                    h0.N(dVar.g(), (List) entry.getValue(), r0Var);
                    break;
                case 16:
                    h0.b0(dVar.g(), (List) entry.getValue(), r0Var);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        h0.T(dVar.g(), (List) entry.getValue(), r0Var, b0.a().c(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        h0.W(dVar.g(), (List) entry.getValue(), r0Var, b0.a().c(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (a.f89291a[dVar.i().ordinal()]) {
            case 1:
                r0Var.p(dVar.g(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                r0Var.B(dVar.g(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                r0Var.u(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                r0Var.f(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                r0Var.h(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                r0Var.s(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                r0Var.c(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                r0Var.v(dVar.g(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                r0Var.o(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                r0Var.w(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                r0Var.i(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                r0Var.H(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                r0Var.m(dVar.g(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                r0Var.h(dVar.g(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                r0Var.M(dVar.g(), (AbstractC11437h) entry.getValue());
                break;
            case 16:
                r0Var.e(dVar.g(), (String) entry.getValue());
                break;
            case 17:
                r0Var.K(dVar.g(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                break;
            case 18:
                r0Var.N(dVar.g(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                break;
        }
    }
}
