package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5956w;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5950p extends AbstractC5949o<AbstractC5956w.d> {

    /* renamed from: androidx.datastore.preferences.protobuf.p$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54341a;

        static {
            int[] iArr = new int[q0.b.values().length];
            f54341a = iArr;
            try {
                iArr[q0.b.f54349c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54341a[q0.b.f54350d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54341a[q0.b.f54351e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54341a[q0.b.f54352f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54341a[q0.b.f54353g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54341a[q0.b.f54354h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54341a[q0.b.f54355i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54341a[q0.b.f54356j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f54341a[q0.b.f54361o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f54341a[q0.b.f54363q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f54341a[q0.b.f54364r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f54341a[q0.b.f54365s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f54341a[q0.b.f54366t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f54341a[q0.b.f54362p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f54341a[q0.b.f54360n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f54341a[q0.b.f54357k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f54341a[q0.b.f54358l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f54341a[q0.b.f54359m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    C5952s<AbstractC5956w.d> c(Object obj) {
        return ((AbstractC5956w.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    C5952s<AbstractC5956w.d> d(Object obj) {
        return ((AbstractC5956w.c) obj).U();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    boolean e(P p10) {
        return p10 instanceof AbstractC5956w.c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    <UT, UB> UB g(Object obj, e0 e0Var, Object obj2, C5948n c5948n, C5952s<AbstractC5956w.d> c5952s, UB ub2, l0<UT, UB> l0Var) throws IOException {
        Object objI;
        ArrayList arrayList;
        AbstractC5956w.e eVar = (AbstractC5956w.e) obj2;
        int iC = eVar.c();
        if (eVar.f54469b.h() && eVar.f54469b.k()) {
            switch (a.f54341a[eVar.a().ordinal()]) {
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
                    eVar.f54469b.b();
                    ub2 = (UB) h0.z(obj, iC, arrayList, null, ub2, l0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f54469b.i());
            }
            c5952s.y(eVar.f54469b, arrayList);
            return ub2;
        }
        Object objG = null;
        if (eVar.a() == q0.b.f54362p) {
            e0Var.p();
            eVar.f54469b.b();
            throw null;
        }
        int[] iArr = a.f54341a;
        switch (iArr[eVar.a().ordinal()]) {
            case 1:
                objG = Double.valueOf(e0Var.readDouble());
                break;
            case 2:
                objG = Float.valueOf(e0Var.readFloat());
                break;
            case 3:
                objG = Long.valueOf(e0Var.H());
                break;
            case 4:
                objG = Long.valueOf(e0Var.s());
                break;
            case 5:
                objG = Integer.valueOf(e0Var.p());
                break;
            case 6:
                objG = Long.valueOf(e0Var.b());
                break;
            case 7:
                objG = Integer.valueOf(e0Var.u());
                break;
            case 8:
                objG = Boolean.valueOf(e0Var.e());
                break;
            case 9:
                objG = Integer.valueOf(e0Var.h());
                break;
            case 10:
                objG = Integer.valueOf(e0Var.E());
                break;
            case 11:
                objG = Long.valueOf(e0Var.f());
                break;
            case 12:
                objG = Integer.valueOf(e0Var.l());
                break;
            case 13:
                objG = Long.valueOf(e0Var.y());
                break;
            case 14:
                throw new IllegalStateException("Shouldn't reach here.");
            case 15:
                objG = e0Var.o();
                break;
            case 16:
                objG = e0Var.z();
                break;
            case 17:
                if (!eVar.d()) {
                    Object objI2 = c5952s.i(eVar.f54469b);
                    if (objI2 instanceof AbstractC5956w) {
                        f0 f0VarD = b0.a().d(objI2);
                        if (!((AbstractC5956w) objI2).H()) {
                            Object objD = f0VarD.d();
                            f0VarD.a(objD, objI2);
                            c5952s.y(eVar.f54469b, objD);
                            objI2 = objD;
                        }
                        e0Var.O(objI2, f0VarD, c5948n);
                        return ub2;
                    }
                }
                objG = e0Var.M(eVar.b().getClass(), c5948n);
                break;
            case 18:
                if (!eVar.d()) {
                    Object objI3 = c5952s.i(eVar.f54469b);
                    if (objI3 instanceof AbstractC5956w) {
                        f0 f0VarD2 = b0.a().d(objI3);
                        if (!((AbstractC5956w) objI3).H()) {
                            Object objD2 = f0VarD2.d();
                            f0VarD2.a(objD2, objI3);
                            c5952s.y(eVar.f54469b, objD2);
                            objI3 = objD2;
                        }
                        e0Var.J(objI3, f0VarD2, c5948n);
                        return ub2;
                    }
                }
                objG = e0Var.L(eVar.b().getClass(), c5948n);
                break;
        }
        if (eVar.d()) {
            c5952s.a(eVar.f54469b, objG);
            return ub2;
        }
        int i10 = iArr[eVar.a().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objI = c5952s.i(eVar.f54469b)) != null) {
            objG = C5958y.g(objI, objG);
        }
        c5952s.y(eVar.f54469b, objG);
        return ub2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    void h(e0 e0Var, Object obj, C5948n c5948n, C5952s<AbstractC5956w.d> c5952s) throws IOException {
        AbstractC5956w.e eVar = (AbstractC5956w.e) obj;
        c5952s.y(eVar.f54469b, e0Var.L(eVar.b().getClass(), c5948n));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    void i(AbstractC5941g abstractC5941g, Object obj, C5948n c5948n, C5952s<AbstractC5956w.d> c5952s) throws IOException {
        AbstractC5956w.e eVar = (AbstractC5956w.e) obj;
        P.a aVarD = eVar.b().d();
        AbstractC5942h abstractC5942hR = abstractC5941g.r();
        aVarD.i1(abstractC5942hR, c5948n);
        c5952s.y(eVar.f54469b, aVarD.h());
        abstractC5942hR.a(0);
    }

    C5950p() {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    int a(Map.Entry<?, ?> entry) {
        return ((AbstractC5956w.d) entry.getKey()).g();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    Object b(C5948n c5948n, P p10, int i10) {
        return c5948n.a(p10, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    void f(Object obj) {
        c(obj).u();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5949o
    void j(r0 r0Var, Map.Entry<?, ?> entry) throws IOException {
        AbstractC5956w.d dVar = (AbstractC5956w.d) entry.getKey();
        if (dVar.h()) {
            switch (a.f54341a[dVar.i().ordinal()]) {
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
        switch (a.f54341a[dVar.i().ordinal()]) {
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
                r0Var.K(dVar.g(), (AbstractC5941g) entry.getValue());
                break;
            case 16:
                r0Var.e(dVar.g(), (String) entry.getValue());
                break;
            case 17:
                r0Var.N(dVar.g(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                break;
            case 18:
                r0Var.L(dVar.g(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                break;
        }
    }
}
