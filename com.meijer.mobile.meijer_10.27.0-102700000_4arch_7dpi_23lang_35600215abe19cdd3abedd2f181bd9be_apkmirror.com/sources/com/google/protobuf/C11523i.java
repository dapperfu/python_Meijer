package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.r0;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11523i implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC11522h f90534a;

    /* renamed from: b, reason: collision with root package name */
    private int f90535b;

    /* renamed from: c, reason: collision with root package name */
    private int f90536c;

    /* renamed from: d, reason: collision with root package name */
    private int f90537d = 0;

    @Override // com.google.protobuf.e0
    public void B(List<String> list) throws IOException {
        W(list, false);
    }

    @Override // com.google.protobuf.e0
    public int E() throws IOException {
        Y(5);
        return this.f90534a.u();
    }

    @Override // com.google.protobuf.e0
    public long H() throws IOException {
        Y(0);
        return this.f90534a.t();
    }

    @Override // com.google.protobuf.e0
    public String I() throws IOException {
        Y(2);
        return this.f90534a.z();
    }

    @Override // com.google.protobuf.e0
    @Deprecated
    public <T> T L(Class<T> cls, C11528n c11528n) throws IOException {
        Y(3);
        return (T) U(b0.a().c(cls), c11528n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f90534a.j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void M(java.util.Map<K, V> r8, com.google.protobuf.I.a<K, V> r9, com.google.protobuf.C11528n r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.h r1 = r7.f90534a
            int r1 = r1.B()
            com.google.protobuf.h r2 = r7.f90534a
            int r1 = r2.k(r1)
            K r2 = r9.f90446b
            V r3 = r9.f90448d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.h r5 = r7.f90534a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.r0$b r4 = r9.f90447c     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            V r5 = r9.f90448d     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            com.google.protobuf.r0$b r4 = r9.f90445a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.h r8 = r7.f90534a
            r8.j(r1)
            return
        L67:
            com.google.protobuf.h r9 = r7.f90534a
            r9.j(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C11523i.M(java.util.Map, com.google.protobuf.I$a, com.google.protobuf.n):void");
    }

    @Override // com.google.protobuf.e0
    public <T> T N(Class<T> cls, C11528n c11528n) throws IOException {
        Y(2);
        return (T) V(b0.a().c(cls), c11528n);
    }

    @Override // com.google.protobuf.e0
    public <T> void O(T t10, f0<T> f0Var, C11528n c11528n) throws IOException {
        Y(3);
        R(t10, f0Var, c11528n);
    }

    @Override // com.google.protobuf.e0
    public <T> void P(T t10, f0<T> f0Var, C11528n c11528n) throws IOException {
        Y(2);
        S(t10, f0Var, c11528n);
    }

    @Override // com.google.protobuf.e0
    public long b() throws IOException {
        Y(1);
        return this.f90534a.q();
    }

    @Override // com.google.protobuf.e0
    public boolean e() throws IOException {
        Y(0);
        return this.f90534a.l();
    }

    @Override // com.google.protobuf.e0
    public long f() throws IOException {
        Y(1);
        return this.f90534a.v();
    }

    @Override // com.google.protobuf.e0
    public int h() throws IOException {
        Y(0);
        return this.f90534a.B();
    }

    @Override // com.google.protobuf.e0
    public int k() throws IOException {
        Y(0);
        return this.f90534a.o();
    }

    @Override // com.google.protobuf.e0
    public int l() throws IOException {
        Y(0);
        return this.f90534a.w();
    }

    @Override // com.google.protobuf.e0
    public void n(List<String> list) throws IOException {
        W(list, true);
    }

    @Override // com.google.protobuf.e0
    public AbstractC11521g o() throws IOException {
        Y(2);
        return this.f90534a.m();
    }

    @Override // com.google.protobuf.e0
    public int p() throws IOException {
        Y(0);
        return this.f90534a.s();
    }

    @Override // com.google.protobuf.e0
    public double readDouble() throws IOException {
        Y(1);
        return this.f90534a.n();
    }

    @Override // com.google.protobuf.e0
    public float readFloat() throws IOException {
        Y(5);
        return this.f90534a.r();
    }

    @Override // com.google.protobuf.e0
    public long s() throws IOException {
        Y(0);
        return this.f90534a.C();
    }

    @Override // com.google.protobuf.e0
    public int u() throws IOException {
        Y(5);
        return this.f90534a.p();
    }

    @Override // com.google.protobuf.e0
    public long y() throws IOException {
        Y(0);
        return this.f90534a.x();
    }

    @Override // com.google.protobuf.e0
    public String z() throws IOException {
        Y(2);
        return this.f90534a.y();
    }

    /* renamed from: com.google.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90538a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f90538a = iArr;
            try {
                iArr[r0.b.f90630j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90538a[r0.b.f90634n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90538a[r0.b.f90623c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90538a[r0.b.f90636p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90538a[r0.b.f90629i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90538a[r0.b.f90628h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f90538a[r0.b.f90624d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f90538a[r0.b.f90627g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f90538a[r0.b.f90625e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f90538a[r0.b.f90633m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f90538a[r0.b.f90637q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f90538a[r0.b.f90638r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f90538a[r0.b.f90639s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f90538a[r0.b.f90640t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f90538a[r0.b.f90631k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f90538a[r0.b.f90635o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f90538a[r0.b.f90626f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static C11523i Q(AbstractC11522h abstractC11522h) {
        C11523i c11523i = abstractC11522h.f90520d;
        return c11523i != null ? c11523i : new C11523i(abstractC11522h);
    }

    private <T> void R(T t10, f0<T> f0Var, C11528n c11528n) throws IOException {
        int i10 = this.f90536c;
        this.f90536c = r0.c(r0.a(this.f90535b), 4);
        try {
            f0Var.i(t10, this, c11528n);
            if (this.f90535b == this.f90536c) {
            } else {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.f90536c = i10;
        }
    }

    private <T> void S(T t10, f0<T> f0Var, C11528n c11528n) throws IOException {
        int iB = this.f90534a.B();
        AbstractC11522h abstractC11522h = this.f90534a;
        if (abstractC11522h.f90517a >= abstractC11522h.f90518b) {
            throw InvalidProtocolBufferException.i();
        }
        int iK = abstractC11522h.k(iB);
        this.f90534a.f90517a++;
        f0Var.i(t10, this, c11528n);
        this.f90534a.a(0);
        r5.f90517a--;
        this.f90534a.j(iK);
    }

    private Object T(r0.b bVar, Class<?> cls, C11528n c11528n) throws IOException {
        switch (a.f90538a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(k());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(H());
            case 10:
                return N(cls, c11528n);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private void X(int i10) throws IOException {
        if (this.f90534a.e() != i10) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void Y(int i10) throws IOException {
        if (r0.b(this.f90535b) != i10) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void Z(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void a0(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // com.google.protobuf.e0
    public int A() throws IOException {
        int i10 = this.f90537d;
        if (i10 != 0) {
            this.f90535b = i10;
            this.f90537d = 0;
        } else {
            this.f90535b = this.f90534a.A();
        }
        int i11 = this.f90535b;
        return (i11 == 0 || i11 == this.f90536c) ? a.e.API_PRIORITY_OTHER : r0.a(i11);
    }

    @Override // com.google.protobuf.e0
    public void C(List<Float> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof C11534u)) {
            int iB = r0.b(this.f90535b);
            if (iB == 2) {
                int iB2 = this.f90534a.B();
                Z(iB2);
                int iE = this.f90534a.e() + iB2;
                do {
                    list.add(Float.valueOf(this.f90534a.r()));
                } while (this.f90534a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f90534a.r()));
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA = this.f90534a.A();
                }
            } while (iA == this.f90535b);
            this.f90537d = iA;
            return;
        }
        C11534u c11534u = (C11534u) list;
        int iB3 = r0.b(this.f90535b);
        if (iB3 == 2) {
            int iB4 = this.f90534a.B();
            Z(iB4);
            int iE2 = this.f90534a.e() + iB4;
            do {
                c11534u.h(this.f90534a.r());
            } while (this.f90534a.e() < iE2);
            return;
        }
        if (iB3 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c11534u.h(this.f90534a.r());
            if (this.f90534a.f()) {
                return;
            } else {
                iA2 = this.f90534a.A();
            }
        } while (iA2 == this.f90535b);
        this.f90537d = iA2;
    }

    @Override // com.google.protobuf.e0
    public boolean D() throws IOException {
        int i10;
        if (this.f90534a.f() || (i10 = this.f90535b) == this.f90536c) {
            return false;
        }
        return this.f90534a.D(i10);
    }

    @Override // com.google.protobuf.e0
    public void F(List<AbstractC11521g> list) throws IOException {
        int iA;
        if (r0.b(this.f90535b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(o());
            if (this.f90534a.f()) {
                return;
            } else {
                iA = this.f90534a.A();
            }
        } while (iA == this.f90535b);
        this.f90537d = iA;
    }

    @Override // com.google.protobuf.e0
    public void G(List<Double> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof C11525k)) {
            int iB = r0.b(this.f90535b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f90534a.n()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iB2 = this.f90534a.B();
            a0(iB2);
            int iE = this.f90534a.e() + iB2;
            do {
                list.add(Double.valueOf(this.f90534a.n()));
            } while (this.f90534a.e() < iE);
            return;
        }
        C11525k c11525k = (C11525k) list;
        int iB3 = r0.b(this.f90535b);
        if (iB3 == 1) {
            do {
                c11525k.h(this.f90534a.n());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iB4 = this.f90534a.B();
        a0(iB4);
        int iE2 = this.f90534a.e() + iB4;
        do {
            c11525k.h(this.f90534a.n());
        } while (this.f90534a.e() < iE2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e0
    @Deprecated
    public <T> void J(List<T> list, f0<T> f0Var, C11528n c11528n) throws IOException {
        int iA;
        if (r0.b(this.f90535b) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f90535b;
        do {
            list.add(U(f0Var, c11528n));
            if (this.f90534a.f() || this.f90537d != 0) {
                return;
            } else {
                iA = this.f90534a.A();
            }
        } while (iA == i10);
        this.f90537d = iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e0
    public <T> void K(List<T> list, f0<T> f0Var, C11528n c11528n) throws IOException {
        int iA;
        if (r0.b(this.f90535b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f90535b;
        do {
            list.add(V(f0Var, c11528n));
            if (this.f90534a.f() || this.f90537d != 0) {
                return;
            } else {
                iA = this.f90534a.A();
            }
        } while (iA == i10);
        this.f90537d = iA;
    }

    public void W(List<String> list, boolean z10) throws IOException {
        int iA;
        int iA2;
        if (r0.b(this.f90535b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof E) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA = this.f90534a.A();
                }
            } while (iA == this.f90535b);
            this.f90537d = iA;
            return;
        }
        E e10 = (E) list;
        do {
            e10.h0(o());
            if (this.f90534a.f()) {
                return;
            } else {
                iA2 = this.f90534a.A();
            }
        } while (iA2 == this.f90535b);
        this.f90537d = iA2;
    }

    @Override // com.google.protobuf.e0
    public int a() {
        return this.f90535b;
    }

    @Override // com.google.protobuf.e0
    public void c(List<Integer> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof C11537x)) {
            int iB = r0.b(this.f90535b);
            if (iB == 2) {
                int iB2 = this.f90534a.B();
                Z(iB2);
                int iE = this.f90534a.e() + iB2;
                do {
                    list.add(Integer.valueOf(this.f90534a.u()));
                } while (this.f90534a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f90534a.u()));
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA = this.f90534a.A();
                }
            } while (iA == this.f90535b);
            this.f90537d = iA;
            return;
        }
        C11537x c11537x = (C11537x) list;
        int iB3 = r0.b(this.f90535b);
        if (iB3 == 2) {
            int iB4 = this.f90534a.B();
            Z(iB4);
            int iE2 = this.f90534a.e() + iB4;
            do {
                c11537x.c2(this.f90534a.u());
            } while (this.f90534a.e() < iE2);
            return;
        }
        if (iB3 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c11537x.c2(this.f90534a.u());
            if (this.f90534a.f()) {
                return;
            } else {
                iA2 = this.f90534a.A();
            }
        } while (iA2 == this.f90535b);
        this.f90537d = iA2;
    }

    @Override // com.google.protobuf.e0
    public void d(List<Long> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f90535b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f90534a.x()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f90534a.e() + this.f90534a.B();
            do {
                list.add(Long.valueOf(this.f90534a.x()));
            } while (this.f90534a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = r0.b(this.f90535b);
        if (iB2 == 0) {
            do {
                g10.k(this.f90534a.x());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f90534a.e() + this.f90534a.B();
        do {
            g10.k(this.f90534a.x());
        } while (this.f90534a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void g(List<Long> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f90535b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f90534a.C()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f90534a.e() + this.f90534a.B();
            do {
                list.add(Long.valueOf(this.f90534a.C()));
            } while (this.f90534a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = r0.b(this.f90535b);
        if (iB2 == 0) {
            do {
                g10.k(this.f90534a.C());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f90534a.e() + this.f90534a.B();
        do {
            g10.k(this.f90534a.C());
        } while (this.f90534a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void i(List<Long> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f90535b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f90534a.t()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f90534a.e() + this.f90534a.B();
            do {
                list.add(Long.valueOf(this.f90534a.t()));
            } while (this.f90534a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = r0.b(this.f90535b);
        if (iB2 == 0) {
            do {
                g10.k(this.f90534a.t());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f90534a.e() + this.f90534a.B();
        do {
            g10.k(this.f90534a.t());
        } while (this.f90534a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void j(List<Integer> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof C11537x)) {
            int iB = r0.b(this.f90535b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f90534a.o()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f90534a.e() + this.f90534a.B();
            do {
                list.add(Integer.valueOf(this.f90534a.o()));
            } while (this.f90534a.e() < iE);
            X(iE);
            return;
        }
        C11537x c11537x = (C11537x) list;
        int iB2 = r0.b(this.f90535b);
        if (iB2 == 0) {
            do {
                c11537x.c2(this.f90534a.o());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f90534a.e() + this.f90534a.B();
        do {
            c11537x.c2(this.f90534a.o());
        } while (this.f90534a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void m(List<Boolean> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof C11519e)) {
            int iB = r0.b(this.f90535b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f90534a.l()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f90534a.e() + this.f90534a.B();
            do {
                list.add(Boolean.valueOf(this.f90534a.l()));
            } while (this.f90534a.e() < iE);
            X(iE);
            return;
        }
        C11519e c11519e = (C11519e) list;
        int iB2 = r0.b(this.f90535b);
        if (iB2 == 0) {
            do {
                c11519e.k(this.f90534a.l());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f90534a.e() + this.f90534a.B();
        do {
            c11519e.k(this.f90534a.l());
        } while (this.f90534a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void q(List<Long> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f90535b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f90534a.q()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iB2 = this.f90534a.B();
            a0(iB2);
            int iE = this.f90534a.e() + iB2;
            do {
                list.add(Long.valueOf(this.f90534a.q()));
            } while (this.f90534a.e() < iE);
            return;
        }
        G g10 = (G) list;
        int iB3 = r0.b(this.f90535b);
        if (iB3 == 1) {
            do {
                g10.k(this.f90534a.q());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iB4 = this.f90534a.B();
        a0(iB4);
        int iE2 = this.f90534a.e() + iB4;
        do {
            g10.k(this.f90534a.q());
        } while (this.f90534a.e() < iE2);
    }

    @Override // com.google.protobuf.e0
    public void r(List<Integer> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof C11537x)) {
            int iB = r0.b(this.f90535b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f90534a.w()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f90534a.e() + this.f90534a.B();
            do {
                list.add(Integer.valueOf(this.f90534a.w()));
            } while (this.f90534a.e() < iE);
            X(iE);
            return;
        }
        C11537x c11537x = (C11537x) list;
        int iB2 = r0.b(this.f90535b);
        if (iB2 == 0) {
            do {
                c11537x.c2(this.f90534a.w());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f90534a.e() + this.f90534a.B();
        do {
            c11537x.c2(this.f90534a.w());
        } while (this.f90534a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void t(List<Integer> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof C11537x)) {
            int iB = r0.b(this.f90535b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f90534a.B()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f90534a.e() + this.f90534a.B();
            do {
                list.add(Integer.valueOf(this.f90534a.B()));
            } while (this.f90534a.e() < iE);
            X(iE);
            return;
        }
        C11537x c11537x = (C11537x) list;
        int iB2 = r0.b(this.f90535b);
        if (iB2 == 0) {
            do {
                c11537x.c2(this.f90534a.B());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f90534a.e() + this.f90534a.B();
        do {
            c11537x.c2(this.f90534a.B());
        } while (this.f90534a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void v(List<Long> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f90535b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f90534a.v()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iB2 = this.f90534a.B();
            a0(iB2);
            int iE = this.f90534a.e() + iB2;
            do {
                list.add(Long.valueOf(this.f90534a.v()));
            } while (this.f90534a.e() < iE);
            return;
        }
        G g10 = (G) list;
        int iB3 = r0.b(this.f90535b);
        if (iB3 == 1) {
            do {
                g10.k(this.f90534a.v());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iB4 = this.f90534a.B();
        a0(iB4);
        int iE2 = this.f90534a.e() + iB4;
        do {
            g10.k(this.f90534a.v());
        } while (this.f90534a.e() < iE2);
    }

    @Override // com.google.protobuf.e0
    public void w(List<Integer> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof C11537x)) {
            int iB = r0.b(this.f90535b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f90534a.s()));
                    if (this.f90534a.f()) {
                        return;
                    } else {
                        iA = this.f90534a.A();
                    }
                } while (iA == this.f90535b);
                this.f90537d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f90534a.e() + this.f90534a.B();
            do {
                list.add(Integer.valueOf(this.f90534a.s()));
            } while (this.f90534a.e() < iE);
            X(iE);
            return;
        }
        C11537x c11537x = (C11537x) list;
        int iB2 = r0.b(this.f90535b);
        if (iB2 == 0) {
            do {
                c11537x.c2(this.f90534a.s());
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA2 = this.f90534a.A();
                }
            } while (iA2 == this.f90535b);
            this.f90537d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f90534a.e() + this.f90534a.B();
        do {
            c11537x.c2(this.f90534a.s());
        } while (this.f90534a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void x(List<Integer> list) throws IOException {
        int iA;
        int iA2;
        if (!(list instanceof C11537x)) {
            int iB = r0.b(this.f90535b);
            if (iB == 2) {
                int iB2 = this.f90534a.B();
                Z(iB2);
                int iE = this.f90534a.e() + iB2;
                do {
                    list.add(Integer.valueOf(this.f90534a.p()));
                } while (this.f90534a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f90534a.p()));
                if (this.f90534a.f()) {
                    return;
                } else {
                    iA = this.f90534a.A();
                }
            } while (iA == this.f90535b);
            this.f90537d = iA;
            return;
        }
        C11537x c11537x = (C11537x) list;
        int iB3 = r0.b(this.f90535b);
        if (iB3 == 2) {
            int iB4 = this.f90534a.B();
            Z(iB4);
            int iE2 = this.f90534a.e() + iB4;
            do {
                c11537x.c2(this.f90534a.p());
            } while (this.f90534a.e() < iE2);
            return;
        }
        if (iB3 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c11537x.c2(this.f90534a.p());
            if (this.f90534a.f()) {
                return;
            } else {
                iA2 = this.f90534a.A();
            }
        } while (iA2 == this.f90535b);
        this.f90537d = iA2;
    }

    private C11523i(AbstractC11522h abstractC11522h) {
        AbstractC11522h abstractC11522h2 = (AbstractC11522h) C11538y.b(abstractC11522h, "input");
        this.f90534a = abstractC11522h2;
        abstractC11522h2.f90520d = this;
    }

    private <T> T U(f0<T> f0Var, C11528n c11528n) throws IOException {
        T tD = f0Var.d();
        R(tD, f0Var, c11528n);
        f0Var.e(tD);
        return tD;
    }

    private <T> T V(f0<T> f0Var, C11528n c11528n) throws IOException {
        T tD = f0Var.d();
        S(tD, f0Var, c11528n);
        f0Var.e(tD);
        return tD;
    }
}
