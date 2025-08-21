package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6085i implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6084h f54494a;

    /* renamed from: b, reason: collision with root package name */
    private int f54495b;

    /* renamed from: c, reason: collision with root package name */
    private int f54496c;

    /* renamed from: d, reason: collision with root package name */
    private int f54497d = 0;

    @Override // androidx.datastore.preferences.protobuf.e0
    public void B(List<String> list) throws IOException {
        W(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int E() throws IOException {
        Y(5);
        return this.f54494a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long H() throws IOException {
        Y(0);
        return this.f54494a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String I() throws IOException {
        Y(2);
        return this.f54494a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> void J(T t10, f0<T> f0Var, C6090n c6090n) throws IOException {
        Y(2);
        S(t10, f0Var, c6090n);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> T L(Class<T> cls, C6090n c6090n) throws IOException {
        Y(2);
        return (T) V(b0.a().c(cls), c6090n);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    @Deprecated
    public <T> T M(Class<T> cls, C6090n c6090n) throws IOException {
        Y(3);
        return (T) U(b0.a().c(cls), c6090n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f54494a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void N(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.I.a<K, V> r9, androidx.datastore.preferences.protobuf.C6090n r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f54494a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.h r2 = r7.f54494a
            int r1 = r2.m(r1)
            K r2 = r9.f54397b
            V r3 = r9.f54399d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.h r5 = r7.f54494a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.q0$b r4 = r9.f54398c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            V r5 = r9.f54399d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.q0$b r4 = r9.f54396a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.h r8 = r7.f54494a
            r8.l(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.h r9 = r7.f54494a
            r9.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C6085i.N(java.util.Map, androidx.datastore.preferences.protobuf.I$a, androidx.datastore.preferences.protobuf.n):void");
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> void O(T t10, f0<T> f0Var, C6090n c6090n) throws IOException {
        Y(3);
        R(t10, f0Var, c6090n);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long b() throws IOException {
        Y(1);
        return this.f54494a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean e() throws IOException {
        Y(0);
        return this.f54494a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long f() throws IOException {
        Y(1);
        return this.f54494a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int h() throws IOException {
        Y(0);
        return this.f54494a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int k() throws IOException {
        Y(0);
        return this.f54494a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int l() throws IOException {
        Y(0);
        return this.f54494a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void n(List<String> list) throws IOException {
        W(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public AbstractC6083g o() throws IOException {
        Y(2);
        return this.f54494a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int p() throws IOException {
        Y(0);
        return this.f54494a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public double readDouble() throws IOException {
        Y(1);
        return this.f54494a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public float readFloat() throws IOException {
        Y(5);
        return this.f54494a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long s() throws IOException {
        Y(0);
        return this.f54494a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int u() throws IOException {
        Y(5);
        return this.f54494a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long y() throws IOException {
        Y(0);
        return this.f54494a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String z() throws IOException {
        Y(2);
        return this.f54494a.A();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54498a;

        static {
            int[] iArr = new int[q0.b.values().length];
            f54498a = iArr;
            try {
                iArr[q0.b.f54580j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54498a[q0.b.f54584n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54498a[q0.b.f54573c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54498a[q0.b.f54586p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54498a[q0.b.f54579i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54498a[q0.b.f54578h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54498a[q0.b.f54574d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54498a[q0.b.f54577g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f54498a[q0.b.f54575e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f54498a[q0.b.f54583m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f54498a[q0.b.f54587q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f54498a[q0.b.f54588r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f54498a[q0.b.f54589s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f54498a[q0.b.f54590t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f54498a[q0.b.f54581k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f54498a[q0.b.f54585o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f54498a[q0.b.f54576f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static C6085i Q(AbstractC6084h abstractC6084h) {
        C6085i c6085i = abstractC6084h.f54472d;
        return c6085i != null ? c6085i : new C6085i(abstractC6084h);
    }

    private <T> void R(T t10, f0<T> f0Var, C6090n c6090n) throws IOException {
        int i10 = this.f54496c;
        this.f54496c = q0.c(q0.a(this.f54495b), 4);
        try {
            f0Var.h(t10, this, c6090n);
            if (this.f54495b == this.f54496c) {
            } else {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.f54496c = i10;
        }
    }

    private <T> void S(T t10, f0<T> f0Var, C6090n c6090n) throws IOException {
        int iD = this.f54494a.D();
        AbstractC6084h abstractC6084h = this.f54494a;
        if (abstractC6084h.f54469a >= abstractC6084h.f54470b) {
            throw InvalidProtocolBufferException.i();
        }
        int iM = abstractC6084h.m(iD);
        this.f54494a.f54469a++;
        f0Var.h(t10, this, c6090n);
        this.f54494a.a(0);
        r5.f54469a--;
        this.f54494a.l(iM);
    }

    private Object T(q0.b bVar, Class<?> cls, C6090n c6090n) throws IOException {
        switch (a.f54498a[bVar.ordinal()]) {
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
                return L(cls, c6090n);
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
        if (this.f54494a.e() != i10) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void Y(int i10) throws IOException {
        if (q0.b(this.f54495b) != i10) {
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

    @Override // androidx.datastore.preferences.protobuf.e0
    public int A() throws IOException {
        int i10 = this.f54497d;
        if (i10 != 0) {
            this.f54495b = i10;
            this.f54497d = 0;
        } else {
            this.f54495b = this.f54494a.C();
        }
        int i11 = this.f54495b;
        return (i11 == 0 || i11 == this.f54496c) ? a.e.API_PRIORITY_OTHER : q0.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void C(List<Float> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C6096u)) {
            int iB = q0.b(this.f54495b);
            if (iB == 2) {
                int iD = this.f54494a.D();
                Z(iD);
                int iE = this.f54494a.e() + iD;
                do {
                    list.add(Float.valueOf(this.f54494a.t()));
                } while (this.f54494a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f54494a.t()));
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC = this.f54494a.C();
                }
            } while (iC == this.f54495b);
            this.f54497d = iC;
            return;
        }
        C6096u c6096u = (C6096u) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 2) {
            int iD2 = this.f54494a.D();
            Z(iD2);
            int iE2 = this.f54494a.e() + iD2;
            do {
                c6096u.h(this.f54494a.t());
            } while (this.f54494a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c6096u.h(this.f54494a.t());
            if (this.f54494a.f()) {
                return;
            } else {
                iC2 = this.f54494a.C();
            }
        } while (iC2 == this.f54495b);
        this.f54497d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean D() throws IOException {
        int i10;
        if (this.f54494a.f() || (i10 = this.f54495b) == this.f54496c) {
            return false;
        }
        return this.f54494a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void F(List<AbstractC6083g> list) throws IOException {
        int iC;
        if (q0.b(this.f54495b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(o());
            if (this.f54494a.f()) {
                return;
            } else {
                iC = this.f54494a.C();
            }
        } while (iC == this.f54495b);
        this.f54497d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void G(List<Double> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C6087k)) {
            int iB = q0.b(this.f54495b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f54494a.p()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f54494a.D();
            a0(iD);
            int iE = this.f54494a.e() + iD;
            do {
                list.add(Double.valueOf(this.f54494a.p()));
            } while (this.f54494a.e() < iE);
            return;
        }
        C6087k c6087k = (C6087k) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 1) {
            do {
                c6087k.h(this.f54494a.p());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f54494a.D();
        a0(iD2);
        int iE2 = this.f54494a.e() + iD2;
        do {
            c6087k.h(this.f54494a.p());
        } while (this.f54494a.e() < iE2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> void K(List<T> list, f0<T> f0Var, C6090n c6090n) throws IOException {
        int iC;
        if (q0.b(this.f54495b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f54495b;
        do {
            list.add(V(f0Var, c6090n));
            if (this.f54494a.f() || this.f54497d != 0) {
                return;
            } else {
                iC = this.f54494a.C();
            }
        } while (iC == i10);
        this.f54497d = iC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    @Deprecated
    public <T> void P(List<T> list, f0<T> f0Var, C6090n c6090n) throws IOException {
        int iC;
        if (q0.b(this.f54495b) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f54495b;
        do {
            list.add(U(f0Var, c6090n));
            if (this.f54494a.f() || this.f54497d != 0) {
                return;
            } else {
                iC = this.f54494a.C();
            }
        } while (iC == i10);
        this.f54497d = iC;
    }

    public void W(List<String> list, boolean z10) throws IOException {
        int iC;
        int iC2;
        if (q0.b(this.f54495b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof C) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC = this.f54494a.C();
                }
            } while (iC == this.f54495b);
            this.f54497d = iC;
            return;
        }
        C c10 = (C) list;
        do {
            c10.n2(o());
            if (this.f54494a.f()) {
                return;
            } else {
                iC2 = this.f54494a.C();
            }
        } while (iC2 == this.f54495b);
        this.f54497d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int a() {
        return this.f54495b;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void c(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C6099x)) {
            int iB = q0.b(this.f54495b);
            if (iB == 2) {
                int iD = this.f54494a.D();
                Z(iD);
                int iE = this.f54494a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f54494a.w()));
                } while (this.f54494a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f54494a.w()));
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC = this.f54494a.C();
                }
            } while (iC == this.f54495b);
            this.f54497d = iC;
            return;
        }
        C6099x c6099x = (C6099x) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 2) {
            int iD2 = this.f54494a.D();
            Z(iD2);
            int iE2 = this.f54494a.e() + iD2;
            do {
                c6099x.b2(this.f54494a.w());
            } while (this.f54494a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c6099x.b2(this.f54494a.w());
            if (this.f54494a.f()) {
                return;
            } else {
                iC2 = this.f54494a.C();
            }
        } while (iC2 == this.f54495b);
        this.f54497d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void d(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54495b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f54494a.z()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54494a.e() + this.f54494a.D();
            do {
                list.add(Long.valueOf(this.f54494a.z()));
            } while (this.f54494a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 0) {
            do {
                g10.k(this.f54494a.z());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54494a.e() + this.f54494a.D();
        do {
            g10.k(this.f54494a.z());
        } while (this.f54494a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void g(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54495b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f54494a.E()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54494a.e() + this.f54494a.D();
            do {
                list.add(Long.valueOf(this.f54494a.E()));
            } while (this.f54494a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 0) {
            do {
                g10.k(this.f54494a.E());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54494a.e() + this.f54494a.D();
        do {
            g10.k(this.f54494a.E());
        } while (this.f54494a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void i(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54495b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f54494a.v()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54494a.e() + this.f54494a.D();
            do {
                list.add(Long.valueOf(this.f54494a.v()));
            } while (this.f54494a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 0) {
            do {
                g10.k(this.f54494a.v());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54494a.e() + this.f54494a.D();
        do {
            g10.k(this.f54494a.v());
        } while (this.f54494a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void j(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C6099x)) {
            int iB = q0.b(this.f54495b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f54494a.q()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54494a.e() + this.f54494a.D();
            do {
                list.add(Integer.valueOf(this.f54494a.q()));
            } while (this.f54494a.e() < iE);
            X(iE);
            return;
        }
        C6099x c6099x = (C6099x) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 0) {
            do {
                c6099x.b2(this.f54494a.q());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54494a.e() + this.f54494a.D();
        do {
            c6099x.b2(this.f54494a.q());
        } while (this.f54494a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void m(List<Boolean> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C6081e)) {
            int iB = q0.b(this.f54495b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f54494a.n()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54494a.e() + this.f54494a.D();
            do {
                list.add(Boolean.valueOf(this.f54494a.n()));
            } while (this.f54494a.e() < iE);
            X(iE);
            return;
        }
        C6081e c6081e = (C6081e) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 0) {
            do {
                c6081e.k(this.f54494a.n());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54494a.e() + this.f54494a.D();
        do {
            c6081e.k(this.f54494a.n());
        } while (this.f54494a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void q(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54495b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f54494a.s()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f54494a.D();
            a0(iD);
            int iE = this.f54494a.e() + iD;
            do {
                list.add(Long.valueOf(this.f54494a.s()));
            } while (this.f54494a.e() < iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 1) {
            do {
                g10.k(this.f54494a.s());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f54494a.D();
        a0(iD2);
        int iE2 = this.f54494a.e() + iD2;
        do {
            g10.k(this.f54494a.s());
        } while (this.f54494a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void r(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C6099x)) {
            int iB = q0.b(this.f54495b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f54494a.y()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54494a.e() + this.f54494a.D();
            do {
                list.add(Integer.valueOf(this.f54494a.y()));
            } while (this.f54494a.e() < iE);
            X(iE);
            return;
        }
        C6099x c6099x = (C6099x) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 0) {
            do {
                c6099x.b2(this.f54494a.y());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54494a.e() + this.f54494a.D();
        do {
            c6099x.b2(this.f54494a.y());
        } while (this.f54494a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void t(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C6099x)) {
            int iB = q0.b(this.f54495b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f54494a.D()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54494a.e() + this.f54494a.D();
            do {
                list.add(Integer.valueOf(this.f54494a.D()));
            } while (this.f54494a.e() < iE);
            X(iE);
            return;
        }
        C6099x c6099x = (C6099x) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 0) {
            do {
                c6099x.b2(this.f54494a.D());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54494a.e() + this.f54494a.D();
        do {
            c6099x.b2(this.f54494a.D());
        } while (this.f54494a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void v(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54495b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f54494a.x()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f54494a.D();
            a0(iD);
            int iE = this.f54494a.e() + iD;
            do {
                list.add(Long.valueOf(this.f54494a.x()));
            } while (this.f54494a.e() < iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 1) {
            do {
                g10.k(this.f54494a.x());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f54494a.D();
        a0(iD2);
        int iE2 = this.f54494a.e() + iD2;
        do {
            g10.k(this.f54494a.x());
        } while (this.f54494a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void w(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C6099x)) {
            int iB = q0.b(this.f54495b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f54494a.u()));
                    if (this.f54494a.f()) {
                        return;
                    } else {
                        iC = this.f54494a.C();
                    }
                } while (iC == this.f54495b);
                this.f54497d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54494a.e() + this.f54494a.D();
            do {
                list.add(Integer.valueOf(this.f54494a.u()));
            } while (this.f54494a.e() < iE);
            X(iE);
            return;
        }
        C6099x c6099x = (C6099x) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 0) {
            do {
                c6099x.b2(this.f54494a.u());
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC2 = this.f54494a.C();
                }
            } while (iC2 == this.f54495b);
            this.f54497d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54494a.e() + this.f54494a.D();
        do {
            c6099x.b2(this.f54494a.u());
        } while (this.f54494a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void x(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C6099x)) {
            int iB = q0.b(this.f54495b);
            if (iB == 2) {
                int iD = this.f54494a.D();
                Z(iD);
                int iE = this.f54494a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f54494a.r()));
                } while (this.f54494a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f54494a.r()));
                if (this.f54494a.f()) {
                    return;
                } else {
                    iC = this.f54494a.C();
                }
            } while (iC == this.f54495b);
            this.f54497d = iC;
            return;
        }
        C6099x c6099x = (C6099x) list;
        int iB2 = q0.b(this.f54495b);
        if (iB2 == 2) {
            int iD2 = this.f54494a.D();
            Z(iD2);
            int iE2 = this.f54494a.e() + iD2;
            do {
                c6099x.b2(this.f54494a.r());
            } while (this.f54494a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c6099x.b2(this.f54494a.r());
            if (this.f54494a.f()) {
                return;
            } else {
                iC2 = this.f54494a.C();
            }
        } while (iC2 == this.f54495b);
        this.f54497d = iC2;
    }

    private C6085i(AbstractC6084h abstractC6084h) {
        AbstractC6084h abstractC6084h2 = (AbstractC6084h) C6100y.b(abstractC6084h, "input");
        this.f54494a = abstractC6084h2;
        abstractC6084h2.f54472d = this;
    }

    private <T> T U(f0<T> f0Var, C6090n c6090n) throws IOException {
        T tD = f0Var.d();
        R(tD, f0Var, c6090n);
        f0Var.e(tD);
        return tD;
    }

    private <T> T V(f0<T> f0Var, C6090n c6090n) throws IOException {
        T tD = f0Var.d();
        S(tD, f0Var, c6090n);
        f0Var.e(tD);
        return tD;
    }
}
