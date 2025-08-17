package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.J;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11314j implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC11313i f88398a;

    /* renamed from: b, reason: collision with root package name */
    private int f88399b;

    /* renamed from: c, reason: collision with root package name */
    private int f88400c;

    /* renamed from: d, reason: collision with root package name */
    private int f88401d = 0;

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void B(List<String> list) throws IOException {
        V(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int E() throws IOException {
        X(5);
        return this.f88398a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long H() throws IOException {
        X(0);
        return this.f88398a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public String I() throws IOException {
        X(2);
        return this.f88398a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> void J(T t10, f0<T> f0Var, C11319o c11319o) throws IOException {
        X(3);
        R(t10, f0Var, c11319o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    @Deprecated
    public <T> T K(Class<T> cls, C11319o c11319o) throws IOException {
        X(3);
        return (T) T(b0.a().c(cls), c11319o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <K, V> void L(Map<K, V> map, J.a<K, V> aVar, C11319o c11319o) throws IOException {
        X(2);
        this.f88398a.m(this.f88398a.D());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> void M(T t10, f0<T> f0Var, C11319o c11319o) throws IOException {
        X(2);
        S(t10, f0Var, c11319o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> T O(Class<T> cls, C11319o c11319o) throws IOException {
        X(2);
        return (T) U(b0.a().c(cls), c11319o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long b() throws IOException {
        X(1);
        return this.f88398a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean e() throws IOException {
        X(0);
        return this.f88398a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long f() throws IOException {
        X(1);
        return this.f88398a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int h() throws IOException {
        X(0);
        return this.f88398a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int k() throws IOException {
        X(0);
        return this.f88398a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int l() throws IOException {
        X(0);
        return this.f88398a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void n(List<String> list) throws IOException {
        V(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public AbstractC11312h o() throws IOException {
        X(2);
        return this.f88398a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int p() throws IOException {
        X(0);
        return this.f88398a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public double readDouble() throws IOException {
        X(1);
        return this.f88398a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public float readFloat() throws IOException {
        X(5);
        return this.f88398a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long s() throws IOException {
        X(0);
        return this.f88398a.E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int u() throws IOException {
        X(5);
        return this.f88398a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long y() throws IOException {
        X(0);
        return this.f88398a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public String z() throws IOException {
        X(2);
        return this.f88398a.A();
    }

    public static C11314j Q(AbstractC11313i abstractC11313i) {
        C11314j c11314j = abstractC11313i.f88361d;
        return c11314j != null ? c11314j : new C11314j(abstractC11313i);
    }

    private <T> void R(T t10, f0<T> f0Var, C11319o c11319o) throws IOException {
        int i10 = this.f88400c;
        this.f88400c = q0.c(q0.a(this.f88399b), 4);
        try {
            f0Var.i(t10, this, c11319o);
            if (this.f88399b == this.f88400c) {
            } else {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.f88400c = i10;
        }
    }

    private <T> void S(T t10, f0<T> f0Var, C11319o c11319o) throws IOException {
        int iD = this.f88398a.D();
        AbstractC11313i abstractC11313i = this.f88398a;
        if (abstractC11313i.f88358a >= abstractC11313i.f88359b) {
            throw InvalidProtocolBufferException.i();
        }
        int iM = abstractC11313i.m(iD);
        this.f88398a.f88358a++;
        f0Var.i(t10, this, c11319o);
        this.f88398a.a(0);
        r5.f88358a--;
        this.f88398a.l(iM);
    }

    private void W(int i10) throws IOException {
        if (this.f88398a.e() != i10) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void X(int i10) throws IOException {
        if (q0.b(this.f88399b) != i10) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void Y(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void Z(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int A() throws IOException {
        int i10 = this.f88401d;
        if (i10 != 0) {
            this.f88399b = i10;
            this.f88401d = 0;
        } else {
            this.f88399b = this.f88398a.C();
        }
        int i11 = this.f88399b;
        return (i11 == 0 || i11 == this.f88400c) ? a.e.API_PRIORITY_OTHER : q0.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void C(List<Float> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11325v)) {
            int iB = q0.b(this.f88399b);
            if (iB == 2) {
                int iD = this.f88398a.D();
                Y(iD);
                int iE = this.f88398a.e() + iD;
                do {
                    list.add(Float.valueOf(this.f88398a.t()));
                } while (this.f88398a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f88398a.t()));
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC = this.f88398a.C();
                }
            } while (iC == this.f88399b);
            this.f88401d = iC;
            return;
        }
        C11325v c11325v = (C11325v) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 2) {
            int iD2 = this.f88398a.D();
            Y(iD2);
            int iE2 = this.f88398a.e() + iD2;
            do {
                c11325v.h(this.f88398a.t());
            } while (this.f88398a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c11325v.h(this.f88398a.t());
            if (this.f88398a.f()) {
                return;
            } else {
                iC2 = this.f88398a.C();
            }
        } while (iC2 == this.f88399b);
        this.f88401d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean D() throws IOException {
        int i10;
        if (this.f88398a.f() || (i10 = this.f88399b) == this.f88400c) {
            return false;
        }
        return this.f88398a.F(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void F(List<AbstractC11312h> list) throws IOException {
        int iC;
        if (q0.b(this.f88399b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(o());
            if (this.f88398a.f()) {
                return;
            } else {
                iC = this.f88398a.C();
            }
        } while (iC == this.f88399b);
        this.f88401d = iC;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void G(List<Double> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11316l)) {
            int iB = q0.b(this.f88399b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f88398a.p()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f88398a.D();
            Z(iD);
            int iE = this.f88398a.e() + iD;
            do {
                list.add(Double.valueOf(this.f88398a.p()));
            } while (this.f88398a.e() < iE);
            return;
        }
        C11316l c11316l = (C11316l) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 1) {
            do {
                c11316l.h(this.f88398a.p());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f88398a.D();
        Z(iD2);
        int iE2 = this.f88398a.e() + iD2;
        do {
            c11316l.h(this.f88398a.p());
        } while (this.f88398a.e() < iE2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> void N(List<T> list, f0<T> f0Var, C11319o c11319o) throws IOException {
        int iC;
        if (q0.b(this.f88399b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f88399b;
        do {
            list.add(U(f0Var, c11319o));
            if (this.f88398a.f() || this.f88401d != 0) {
                return;
            } else {
                iC = this.f88398a.C();
            }
        } while (iC == i10);
        this.f88401d = iC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.e0
    @Deprecated
    public <T> void P(List<T> list, f0<T> f0Var, C11319o c11319o) throws IOException {
        int iC;
        if (q0.b(this.f88399b) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f88399b;
        do {
            list.add(T(f0Var, c11319o));
            if (this.f88398a.f() || this.f88401d != 0) {
                return;
            } else {
                iC = this.f88398a.C();
            }
        } while (iC == i10);
        this.f88401d = iC;
    }

    public void V(List<String> list, boolean z10) throws IOException {
        int iC;
        int iC2;
        if (q0.b(this.f88399b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof D) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC = this.f88398a.C();
                }
            } while (iC == this.f88399b);
            this.f88401d = iC;
            return;
        }
        D d10 = (D) list;
        do {
            d10.l3(o());
            if (this.f88398a.f()) {
                return;
            } else {
                iC2 = this.f88398a.C();
            }
        } while (iC2 == this.f88399b);
        this.f88401d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int a() {
        return this.f88399b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void c(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11328y)) {
            int iB = q0.b(this.f88399b);
            if (iB == 2) {
                int iD = this.f88398a.D();
                Y(iD);
                int iE = this.f88398a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f88398a.w()));
                } while (this.f88398a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f88398a.w()));
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC = this.f88398a.C();
                }
            } while (iC == this.f88399b);
            this.f88401d = iC;
            return;
        }
        C11328y c11328y = (C11328y) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 2) {
            int iD2 = this.f88398a.D();
            Y(iD2);
            int iE2 = this.f88398a.e() + iD2;
            do {
                c11328y.c2(this.f88398a.w());
            } while (this.f88398a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c11328y.c2(this.f88398a.w());
            if (this.f88398a.f()) {
                return;
            } else {
                iC2 = this.f88398a.C();
            }
        } while (iC2 == this.f88399b);
        this.f88401d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void d(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f88399b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f88398a.z()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f88398a.e() + this.f88398a.D();
            do {
                list.add(Long.valueOf(this.f88398a.z()));
            } while (this.f88398a.e() < iE);
            W(iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 0) {
            do {
                h10.k(this.f88398a.z());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f88398a.e() + this.f88398a.D();
        do {
            h10.k(this.f88398a.z());
        } while (this.f88398a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void g(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f88399b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f88398a.E()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f88398a.e() + this.f88398a.D();
            do {
                list.add(Long.valueOf(this.f88398a.E()));
            } while (this.f88398a.e() < iE);
            W(iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 0) {
            do {
                h10.k(this.f88398a.E());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f88398a.e() + this.f88398a.D();
        do {
            h10.k(this.f88398a.E());
        } while (this.f88398a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void i(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f88399b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f88398a.v()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f88398a.e() + this.f88398a.D();
            do {
                list.add(Long.valueOf(this.f88398a.v()));
            } while (this.f88398a.e() < iE);
            W(iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 0) {
            do {
                h10.k(this.f88398a.v());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f88398a.e() + this.f88398a.D();
        do {
            h10.k(this.f88398a.v());
        } while (this.f88398a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void j(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11328y)) {
            int iB = q0.b(this.f88399b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f88398a.q()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f88398a.e() + this.f88398a.D();
            do {
                list.add(Integer.valueOf(this.f88398a.q()));
            } while (this.f88398a.e() < iE);
            W(iE);
            return;
        }
        C11328y c11328y = (C11328y) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 0) {
            do {
                c11328y.c2(this.f88398a.q());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f88398a.e() + this.f88398a.D();
        do {
            c11328y.c2(this.f88398a.q());
        } while (this.f88398a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void m(List<Boolean> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11310f)) {
            int iB = q0.b(this.f88399b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f88398a.n()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f88398a.e() + this.f88398a.D();
            do {
                list.add(Boolean.valueOf(this.f88398a.n()));
            } while (this.f88398a.e() < iE);
            W(iE);
            return;
        }
        C11310f c11310f = (C11310f) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 0) {
            do {
                c11310f.k(this.f88398a.n());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f88398a.e() + this.f88398a.D();
        do {
            c11310f.k(this.f88398a.n());
        } while (this.f88398a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void q(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f88399b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f88398a.s()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f88398a.D();
            Z(iD);
            int iE = this.f88398a.e() + iD;
            do {
                list.add(Long.valueOf(this.f88398a.s()));
            } while (this.f88398a.e() < iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 1) {
            do {
                h10.k(this.f88398a.s());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f88398a.D();
        Z(iD2);
        int iE2 = this.f88398a.e() + iD2;
        do {
            h10.k(this.f88398a.s());
        } while (this.f88398a.e() < iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void r(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11328y)) {
            int iB = q0.b(this.f88399b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f88398a.y()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f88398a.e() + this.f88398a.D();
            do {
                list.add(Integer.valueOf(this.f88398a.y()));
            } while (this.f88398a.e() < iE);
            W(iE);
            return;
        }
        C11328y c11328y = (C11328y) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 0) {
            do {
                c11328y.c2(this.f88398a.y());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f88398a.e() + this.f88398a.D();
        do {
            c11328y.c2(this.f88398a.y());
        } while (this.f88398a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void t(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11328y)) {
            int iB = q0.b(this.f88399b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f88398a.D()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f88398a.e() + this.f88398a.D();
            do {
                list.add(Integer.valueOf(this.f88398a.D()));
            } while (this.f88398a.e() < iE);
            W(iE);
            return;
        }
        C11328y c11328y = (C11328y) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 0) {
            do {
                c11328y.c2(this.f88398a.D());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f88398a.e() + this.f88398a.D();
        do {
            c11328y.c2(this.f88398a.D());
        } while (this.f88398a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void v(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f88399b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f88398a.x()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f88398a.D();
            Z(iD);
            int iE = this.f88398a.e() + iD;
            do {
                list.add(Long.valueOf(this.f88398a.x()));
            } while (this.f88398a.e() < iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 1) {
            do {
                h10.k(this.f88398a.x());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f88398a.D();
        Z(iD2);
        int iE2 = this.f88398a.e() + iD2;
        do {
            h10.k(this.f88398a.x());
        } while (this.f88398a.e() < iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void w(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11328y)) {
            int iB = q0.b(this.f88399b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f88398a.u()));
                    if (this.f88398a.f()) {
                        return;
                    } else {
                        iC = this.f88398a.C();
                    }
                } while (iC == this.f88399b);
                this.f88401d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f88398a.e() + this.f88398a.D();
            do {
                list.add(Integer.valueOf(this.f88398a.u()));
            } while (this.f88398a.e() < iE);
            W(iE);
            return;
        }
        C11328y c11328y = (C11328y) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 0) {
            do {
                c11328y.c2(this.f88398a.u());
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC2 = this.f88398a.C();
                }
            } while (iC2 == this.f88399b);
            this.f88401d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f88398a.e() + this.f88398a.D();
        do {
            c11328y.c2(this.f88398a.u());
        } while (this.f88398a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void x(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11328y)) {
            int iB = q0.b(this.f88399b);
            if (iB == 2) {
                int iD = this.f88398a.D();
                Y(iD);
                int iE = this.f88398a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f88398a.r()));
                } while (this.f88398a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f88398a.r()));
                if (this.f88398a.f()) {
                    return;
                } else {
                    iC = this.f88398a.C();
                }
            } while (iC == this.f88399b);
            this.f88401d = iC;
            return;
        }
        C11328y c11328y = (C11328y) list;
        int iB2 = q0.b(this.f88399b);
        if (iB2 == 2) {
            int iD2 = this.f88398a.D();
            Y(iD2);
            int iE2 = this.f88398a.e() + iD2;
            do {
                c11328y.c2(this.f88398a.r());
            } while (this.f88398a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c11328y.c2(this.f88398a.r());
            if (this.f88398a.f()) {
                return;
            } else {
                iC2 = this.f88398a.C();
            }
        } while (iC2 == this.f88399b);
        this.f88401d = iC2;
    }

    private C11314j(AbstractC11313i abstractC11313i) {
        AbstractC11313i abstractC11313i2 = (AbstractC11313i) C11329z.b(abstractC11313i, "input");
        this.f88398a = abstractC11313i2;
        abstractC11313i2.f88361d = this;
    }

    private <T> T T(f0<T> f0Var, C11319o c11319o) throws IOException {
        T tD = f0Var.d();
        R(tD, f0Var, c11319o);
        f0Var.e(tD);
        return tD;
    }

    private <T> T U(f0<T> f0Var, C11319o c11319o) throws IOException {
        T tD = f0Var.d();
        S(tD, f0Var, c11319o);
        f0Var.e(tD);
        return tD;
    }
}
