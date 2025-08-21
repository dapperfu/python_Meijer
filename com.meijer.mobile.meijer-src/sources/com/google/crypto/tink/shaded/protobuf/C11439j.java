package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.J;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11439j implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC11438i f89238a;

    /* renamed from: b, reason: collision with root package name */
    private int f89239b;

    /* renamed from: c, reason: collision with root package name */
    private int f89240c;

    /* renamed from: d, reason: collision with root package name */
    private int f89241d = 0;

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void B(List<String> list) throws IOException {
        V(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int E() throws IOException {
        X(5);
        return this.f89238a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long H() throws IOException {
        X(0);
        return this.f89238a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public String I() throws IOException {
        X(2);
        return this.f89238a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> void J(T t10, f0<T> f0Var, C11444o c11444o) throws IOException {
        X(3);
        R(t10, f0Var, c11444o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    @Deprecated
    public <T> T K(Class<T> cls, C11444o c11444o) throws IOException {
        X(3);
        return (T) T(b0.a().c(cls), c11444o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <K, V> void L(Map<K, V> map, J.a<K, V> aVar, C11444o c11444o) throws IOException {
        X(2);
        this.f89238a.m(this.f89238a.D());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> void M(T t10, f0<T> f0Var, C11444o c11444o) throws IOException {
        X(2);
        S(t10, f0Var, c11444o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> T O(Class<T> cls, C11444o c11444o) throws IOException {
        X(2);
        return (T) U(b0.a().c(cls), c11444o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long b() throws IOException {
        X(1);
        return this.f89238a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean e() throws IOException {
        X(0);
        return this.f89238a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long f() throws IOException {
        X(1);
        return this.f89238a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int h() throws IOException {
        X(0);
        return this.f89238a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int k() throws IOException {
        X(0);
        return this.f89238a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int l() throws IOException {
        X(0);
        return this.f89238a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void n(List<String> list) throws IOException {
        V(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public AbstractC11437h o() throws IOException {
        X(2);
        return this.f89238a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int p() throws IOException {
        X(0);
        return this.f89238a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public double readDouble() throws IOException {
        X(1);
        return this.f89238a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public float readFloat() throws IOException {
        X(5);
        return this.f89238a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long s() throws IOException {
        X(0);
        return this.f89238a.E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int u() throws IOException {
        X(5);
        return this.f89238a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long y() throws IOException {
        X(0);
        return this.f89238a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public String z() throws IOException {
        X(2);
        return this.f89238a.A();
    }

    public static C11439j Q(AbstractC11438i abstractC11438i) {
        C11439j c11439j = abstractC11438i.f89201d;
        return c11439j != null ? c11439j : new C11439j(abstractC11438i);
    }

    private <T> void R(T t10, f0<T> f0Var, C11444o c11444o) throws IOException {
        int i10 = this.f89240c;
        this.f89240c = q0.c(q0.a(this.f89239b), 4);
        try {
            f0Var.i(t10, this, c11444o);
            if (this.f89239b == this.f89240c) {
            } else {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.f89240c = i10;
        }
    }

    private <T> void S(T t10, f0<T> f0Var, C11444o c11444o) throws IOException {
        int iD = this.f89238a.D();
        AbstractC11438i abstractC11438i = this.f89238a;
        if (abstractC11438i.f89198a >= abstractC11438i.f89199b) {
            throw InvalidProtocolBufferException.i();
        }
        int iM = abstractC11438i.m(iD);
        this.f89238a.f89198a++;
        f0Var.i(t10, this, c11444o);
        this.f89238a.a(0);
        r5.f89198a--;
        this.f89238a.l(iM);
    }

    private void W(int i10) throws IOException {
        if (this.f89238a.e() != i10) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void X(int i10) throws IOException {
        if (q0.b(this.f89239b) != i10) {
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
        int i10 = this.f89241d;
        if (i10 != 0) {
            this.f89239b = i10;
            this.f89241d = 0;
        } else {
            this.f89239b = this.f89238a.C();
        }
        int i11 = this.f89239b;
        return (i11 == 0 || i11 == this.f89240c) ? a.e.API_PRIORITY_OTHER : q0.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void C(List<Float> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11450v)) {
            int iB = q0.b(this.f89239b);
            if (iB == 2) {
                int iD = this.f89238a.D();
                Y(iD);
                int iE = this.f89238a.e() + iD;
                do {
                    list.add(Float.valueOf(this.f89238a.t()));
                } while (this.f89238a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f89238a.t()));
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC = this.f89238a.C();
                }
            } while (iC == this.f89239b);
            this.f89241d = iC;
            return;
        }
        C11450v c11450v = (C11450v) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 2) {
            int iD2 = this.f89238a.D();
            Y(iD2);
            int iE2 = this.f89238a.e() + iD2;
            do {
                c11450v.h(this.f89238a.t());
            } while (this.f89238a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c11450v.h(this.f89238a.t());
            if (this.f89238a.f()) {
                return;
            } else {
                iC2 = this.f89238a.C();
            }
        } while (iC2 == this.f89239b);
        this.f89241d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean D() throws IOException {
        int i10;
        if (this.f89238a.f() || (i10 = this.f89239b) == this.f89240c) {
            return false;
        }
        return this.f89238a.F(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void F(List<AbstractC11437h> list) throws IOException {
        int iC;
        if (q0.b(this.f89239b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(o());
            if (this.f89238a.f()) {
                return;
            } else {
                iC = this.f89238a.C();
            }
        } while (iC == this.f89239b);
        this.f89241d = iC;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void G(List<Double> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11441l)) {
            int iB = q0.b(this.f89239b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f89238a.p()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f89238a.D();
            Z(iD);
            int iE = this.f89238a.e() + iD;
            do {
                list.add(Double.valueOf(this.f89238a.p()));
            } while (this.f89238a.e() < iE);
            return;
        }
        C11441l c11441l = (C11441l) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 1) {
            do {
                c11441l.h(this.f89238a.p());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f89238a.D();
        Z(iD2);
        int iE2 = this.f89238a.e() + iD2;
        do {
            c11441l.h(this.f89238a.p());
        } while (this.f89238a.e() < iE2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> void N(List<T> list, f0<T> f0Var, C11444o c11444o) throws IOException {
        int iC;
        if (q0.b(this.f89239b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f89239b;
        do {
            list.add(U(f0Var, c11444o));
            if (this.f89238a.f() || this.f89241d != 0) {
                return;
            } else {
                iC = this.f89238a.C();
            }
        } while (iC == i10);
        this.f89241d = iC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.e0
    @Deprecated
    public <T> void P(List<T> list, f0<T> f0Var, C11444o c11444o) throws IOException {
        int iC;
        if (q0.b(this.f89239b) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f89239b;
        do {
            list.add(T(f0Var, c11444o));
            if (this.f89238a.f() || this.f89241d != 0) {
                return;
            } else {
                iC = this.f89238a.C();
            }
        } while (iC == i10);
        this.f89241d = iC;
    }

    public void V(List<String> list, boolean z10) throws IOException {
        int iC;
        int iC2;
        if (q0.b(this.f89239b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof D) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC = this.f89238a.C();
                }
            } while (iC == this.f89239b);
            this.f89241d = iC;
            return;
        }
        D d10 = (D) list;
        do {
            d10.l3(o());
            if (this.f89238a.f()) {
                return;
            } else {
                iC2 = this.f89238a.C();
            }
        } while (iC2 == this.f89239b);
        this.f89241d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int a() {
        return this.f89239b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void c(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11453y)) {
            int iB = q0.b(this.f89239b);
            if (iB == 2) {
                int iD = this.f89238a.D();
                Y(iD);
                int iE = this.f89238a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f89238a.w()));
                } while (this.f89238a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f89238a.w()));
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC = this.f89238a.C();
                }
            } while (iC == this.f89239b);
            this.f89241d = iC;
            return;
        }
        C11453y c11453y = (C11453y) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 2) {
            int iD2 = this.f89238a.D();
            Y(iD2);
            int iE2 = this.f89238a.e() + iD2;
            do {
                c11453y.b2(this.f89238a.w());
            } while (this.f89238a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c11453y.b2(this.f89238a.w());
            if (this.f89238a.f()) {
                return;
            } else {
                iC2 = this.f89238a.C();
            }
        } while (iC2 == this.f89239b);
        this.f89241d = iC2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void d(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f89239b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f89238a.z()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f89238a.e() + this.f89238a.D();
            do {
                list.add(Long.valueOf(this.f89238a.z()));
            } while (this.f89238a.e() < iE);
            W(iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 0) {
            do {
                h10.k(this.f89238a.z());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f89238a.e() + this.f89238a.D();
        do {
            h10.k(this.f89238a.z());
        } while (this.f89238a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void g(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f89239b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f89238a.E()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f89238a.e() + this.f89238a.D();
            do {
                list.add(Long.valueOf(this.f89238a.E()));
            } while (this.f89238a.e() < iE);
            W(iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 0) {
            do {
                h10.k(this.f89238a.E());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f89238a.e() + this.f89238a.D();
        do {
            h10.k(this.f89238a.E());
        } while (this.f89238a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void i(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f89239b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f89238a.v()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f89238a.e() + this.f89238a.D();
            do {
                list.add(Long.valueOf(this.f89238a.v()));
            } while (this.f89238a.e() < iE);
            W(iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 0) {
            do {
                h10.k(this.f89238a.v());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f89238a.e() + this.f89238a.D();
        do {
            h10.k(this.f89238a.v());
        } while (this.f89238a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void j(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11453y)) {
            int iB = q0.b(this.f89239b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f89238a.q()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f89238a.e() + this.f89238a.D();
            do {
                list.add(Integer.valueOf(this.f89238a.q()));
            } while (this.f89238a.e() < iE);
            W(iE);
            return;
        }
        C11453y c11453y = (C11453y) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 0) {
            do {
                c11453y.b2(this.f89238a.q());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f89238a.e() + this.f89238a.D();
        do {
            c11453y.b2(this.f89238a.q());
        } while (this.f89238a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void m(List<Boolean> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11435f)) {
            int iB = q0.b(this.f89239b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f89238a.n()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f89238a.e() + this.f89238a.D();
            do {
                list.add(Boolean.valueOf(this.f89238a.n()));
            } while (this.f89238a.e() < iE);
            W(iE);
            return;
        }
        C11435f c11435f = (C11435f) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 0) {
            do {
                c11435f.k(this.f89238a.n());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f89238a.e() + this.f89238a.D();
        do {
            c11435f.k(this.f89238a.n());
        } while (this.f89238a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void q(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f89239b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f89238a.s()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f89238a.D();
            Z(iD);
            int iE = this.f89238a.e() + iD;
            do {
                list.add(Long.valueOf(this.f89238a.s()));
            } while (this.f89238a.e() < iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 1) {
            do {
                h10.k(this.f89238a.s());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f89238a.D();
        Z(iD2);
        int iE2 = this.f89238a.e() + iD2;
        do {
            h10.k(this.f89238a.s());
        } while (this.f89238a.e() < iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void r(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11453y)) {
            int iB = q0.b(this.f89239b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f89238a.y()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f89238a.e() + this.f89238a.D();
            do {
                list.add(Integer.valueOf(this.f89238a.y()));
            } while (this.f89238a.e() < iE);
            W(iE);
            return;
        }
        C11453y c11453y = (C11453y) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 0) {
            do {
                c11453y.b2(this.f89238a.y());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f89238a.e() + this.f89238a.D();
        do {
            c11453y.b2(this.f89238a.y());
        } while (this.f89238a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void t(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11453y)) {
            int iB = q0.b(this.f89239b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f89238a.D()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f89238a.e() + this.f89238a.D();
            do {
                list.add(Integer.valueOf(this.f89238a.D()));
            } while (this.f89238a.e() < iE);
            W(iE);
            return;
        }
        C11453y c11453y = (C11453y) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 0) {
            do {
                c11453y.b2(this.f89238a.D());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f89238a.e() + this.f89238a.D();
        do {
            c11453y.b2(this.f89238a.D());
        } while (this.f89238a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void v(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof H)) {
            int iB = q0.b(this.f89239b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f89238a.x()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f89238a.D();
            Z(iD);
            int iE = this.f89238a.e() + iD;
            do {
                list.add(Long.valueOf(this.f89238a.x()));
            } while (this.f89238a.e() < iE);
            return;
        }
        H h10 = (H) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 1) {
            do {
                h10.k(this.f89238a.x());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f89238a.D();
        Z(iD2);
        int iE2 = this.f89238a.e() + iD2;
        do {
            h10.k(this.f89238a.x());
        } while (this.f89238a.e() < iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void w(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11453y)) {
            int iB = q0.b(this.f89239b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f89238a.u()));
                    if (this.f89238a.f()) {
                        return;
                    } else {
                        iC = this.f89238a.C();
                    }
                } while (iC == this.f89239b);
                this.f89241d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f89238a.e() + this.f89238a.D();
            do {
                list.add(Integer.valueOf(this.f89238a.u()));
            } while (this.f89238a.e() < iE);
            W(iE);
            return;
        }
        C11453y c11453y = (C11453y) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 0) {
            do {
                c11453y.b2(this.f89238a.u());
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC2 = this.f89238a.C();
                }
            } while (iC2 == this.f89239b);
            this.f89241d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f89238a.e() + this.f89238a.D();
        do {
            c11453y.b2(this.f89238a.u());
        } while (this.f89238a.e() < iE2);
        W(iE2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void x(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C11453y)) {
            int iB = q0.b(this.f89239b);
            if (iB == 2) {
                int iD = this.f89238a.D();
                Y(iD);
                int iE = this.f89238a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f89238a.r()));
                } while (this.f89238a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f89238a.r()));
                if (this.f89238a.f()) {
                    return;
                } else {
                    iC = this.f89238a.C();
                }
            } while (iC == this.f89239b);
            this.f89241d = iC;
            return;
        }
        C11453y c11453y = (C11453y) list;
        int iB2 = q0.b(this.f89239b);
        if (iB2 == 2) {
            int iD2 = this.f89238a.D();
            Y(iD2);
            int iE2 = this.f89238a.e() + iD2;
            do {
                c11453y.b2(this.f89238a.r());
            } while (this.f89238a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c11453y.b2(this.f89238a.r());
            if (this.f89238a.f()) {
                return;
            } else {
                iC2 = this.f89238a.C();
            }
        } while (iC2 == this.f89239b);
        this.f89241d = iC2;
    }

    private C11439j(AbstractC11438i abstractC11438i) {
        AbstractC11438i abstractC11438i2 = (AbstractC11438i) C11454z.b(abstractC11438i, "input");
        this.f89238a = abstractC11438i2;
        abstractC11438i2.f89201d = this;
    }

    private <T> T T(f0<T> f0Var, C11444o c11444o) throws IOException {
        T tD = f0Var.d();
        R(tD, f0Var, c11444o);
        f0Var.e(tD);
        return tD;
    }

    private <T> T U(f0<T> f0Var, C11444o c11444o) throws IOException {
        T tD = f0Var.d();
        S(tD, f0Var, c11444o);
        f0Var.e(tD);
        return tD;
    }
}
