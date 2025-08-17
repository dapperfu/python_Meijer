package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5943i implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5942h f54270a;

    /* renamed from: b, reason: collision with root package name */
    private int f54271b;

    /* renamed from: c, reason: collision with root package name */
    private int f54272c;

    /* renamed from: d, reason: collision with root package name */
    private int f54273d = 0;

    @Override // androidx.datastore.preferences.protobuf.e0
    public void B(List<String> list) throws IOException {
        W(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int E() throws IOException {
        Y(5);
        return this.f54270a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long H() throws IOException {
        Y(0);
        return this.f54270a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String I() throws IOException {
        Y(2);
        return this.f54270a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> void J(T t10, f0<T> f0Var, C5948n c5948n) throws IOException {
        Y(2);
        S(t10, f0Var, c5948n);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> T L(Class<T> cls, C5948n c5948n) throws IOException {
        Y(2);
        return (T) V(b0.a().c(cls), c5948n);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    @Deprecated
    public <T> T M(Class<T> cls, C5948n c5948n) throws IOException {
        Y(3);
        return (T) U(b0.a().c(cls), c5948n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f54270a.l(r1);
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
    public <K, V> void N(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.I.a<K, V> r9, androidx.datastore.preferences.protobuf.C5948n r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f54270a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.h r2 = r7.f54270a
            int r1 = r2.m(r1)
            K r2 = r9.f54173b
            V r3 = r9.f54175d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.h r5 = r7.f54270a     // Catch: java.lang.Throwable -> L3a
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
            androidx.datastore.preferences.protobuf.q0$b r4 = r9.f54174c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            V r5 = r9.f54175d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.q0$b r4 = r9.f54172a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
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
            androidx.datastore.preferences.protobuf.h r8 = r7.f54270a
            r8.l(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.h r9 = r7.f54270a
            r9.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C5943i.N(java.util.Map, androidx.datastore.preferences.protobuf.I$a, androidx.datastore.preferences.protobuf.n):void");
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> void O(T t10, f0<T> f0Var, C5948n c5948n) throws IOException {
        Y(3);
        R(t10, f0Var, c5948n);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long b() throws IOException {
        Y(1);
        return this.f54270a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean e() throws IOException {
        Y(0);
        return this.f54270a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long f() throws IOException {
        Y(1);
        return this.f54270a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int h() throws IOException {
        Y(0);
        return this.f54270a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int k() throws IOException {
        Y(0);
        return this.f54270a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int l() throws IOException {
        Y(0);
        return this.f54270a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void n(List<String> list) throws IOException {
        W(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public AbstractC5941g o() throws IOException {
        Y(2);
        return this.f54270a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int p() throws IOException {
        Y(0);
        return this.f54270a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public double readDouble() throws IOException {
        Y(1);
        return this.f54270a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public float readFloat() throws IOException {
        Y(5);
        return this.f54270a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long s() throws IOException {
        Y(0);
        return this.f54270a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int u() throws IOException {
        Y(5);
        return this.f54270a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long y() throws IOException {
        Y(0);
        return this.f54270a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String z() throws IOException {
        Y(2);
        return this.f54270a.A();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54274a;

        static {
            int[] iArr = new int[q0.b.values().length];
            f54274a = iArr;
            try {
                iArr[q0.b.f54356j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54274a[q0.b.f54360n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54274a[q0.b.f54349c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54274a[q0.b.f54362p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54274a[q0.b.f54355i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54274a[q0.b.f54354h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54274a[q0.b.f54350d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54274a[q0.b.f54353g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f54274a[q0.b.f54351e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f54274a[q0.b.f54359m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f54274a[q0.b.f54363q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f54274a[q0.b.f54364r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f54274a[q0.b.f54365s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f54274a[q0.b.f54366t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f54274a[q0.b.f54357k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f54274a[q0.b.f54361o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f54274a[q0.b.f54352f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static C5943i Q(AbstractC5942h abstractC5942h) {
        C5943i c5943i = abstractC5942h.f54248d;
        return c5943i != null ? c5943i : new C5943i(abstractC5942h);
    }

    private <T> void R(T t10, f0<T> f0Var, C5948n c5948n) throws IOException {
        int i10 = this.f54272c;
        this.f54272c = q0.c(q0.a(this.f54271b), 4);
        try {
            f0Var.h(t10, this, c5948n);
            if (this.f54271b == this.f54272c) {
            } else {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.f54272c = i10;
        }
    }

    private <T> void S(T t10, f0<T> f0Var, C5948n c5948n) throws IOException {
        int iD = this.f54270a.D();
        AbstractC5942h abstractC5942h = this.f54270a;
        if (abstractC5942h.f54245a >= abstractC5942h.f54246b) {
            throw InvalidProtocolBufferException.i();
        }
        int iM = abstractC5942h.m(iD);
        this.f54270a.f54245a++;
        f0Var.h(t10, this, c5948n);
        this.f54270a.a(0);
        r5.f54245a--;
        this.f54270a.l(iM);
    }

    private Object T(q0.b bVar, Class<?> cls, C5948n c5948n) throws IOException {
        switch (a.f54274a[bVar.ordinal()]) {
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
                return L(cls, c5948n);
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
        if (this.f54270a.e() != i10) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void Y(int i10) throws IOException {
        if (q0.b(this.f54271b) != i10) {
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
        int i10 = this.f54273d;
        if (i10 != 0) {
            this.f54271b = i10;
            this.f54273d = 0;
        } else {
            this.f54271b = this.f54270a.C();
        }
        int i11 = this.f54271b;
        return (i11 == 0 || i11 == this.f54272c) ? a.e.API_PRIORITY_OTHER : q0.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void C(List<Float> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C5954u)) {
            int iB = q0.b(this.f54271b);
            if (iB == 2) {
                int iD = this.f54270a.D();
                Z(iD);
                int iE = this.f54270a.e() + iD;
                do {
                    list.add(Float.valueOf(this.f54270a.t()));
                } while (this.f54270a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f54270a.t()));
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC = this.f54270a.C();
                }
            } while (iC == this.f54271b);
            this.f54273d = iC;
            return;
        }
        C5954u c5954u = (C5954u) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 2) {
            int iD2 = this.f54270a.D();
            Z(iD2);
            int iE2 = this.f54270a.e() + iD2;
            do {
                c5954u.h(this.f54270a.t());
            } while (this.f54270a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c5954u.h(this.f54270a.t());
            if (this.f54270a.f()) {
                return;
            } else {
                iC2 = this.f54270a.C();
            }
        } while (iC2 == this.f54271b);
        this.f54273d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean D() throws IOException {
        int i10;
        if (this.f54270a.f() || (i10 = this.f54271b) == this.f54272c) {
            return false;
        }
        return this.f54270a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void F(List<AbstractC5941g> list) throws IOException {
        int iC;
        if (q0.b(this.f54271b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(o());
            if (this.f54270a.f()) {
                return;
            } else {
                iC = this.f54270a.C();
            }
        } while (iC == this.f54271b);
        this.f54273d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void G(List<Double> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C5945k)) {
            int iB = q0.b(this.f54271b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f54270a.p()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f54270a.D();
            a0(iD);
            int iE = this.f54270a.e() + iD;
            do {
                list.add(Double.valueOf(this.f54270a.p()));
            } while (this.f54270a.e() < iE);
            return;
        }
        C5945k c5945k = (C5945k) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 1) {
            do {
                c5945k.h(this.f54270a.p());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f54270a.D();
        a0(iD2);
        int iE2 = this.f54270a.e() + iD2;
        do {
            c5945k.h(this.f54270a.p());
        } while (this.f54270a.e() < iE2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> void K(List<T> list, f0<T> f0Var, C5948n c5948n) throws IOException {
        int iC;
        if (q0.b(this.f54271b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f54271b;
        do {
            list.add(V(f0Var, c5948n));
            if (this.f54270a.f() || this.f54273d != 0) {
                return;
            } else {
                iC = this.f54270a.C();
            }
        } while (iC == i10);
        this.f54273d = iC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    @Deprecated
    public <T> void P(List<T> list, f0<T> f0Var, C5948n c5948n) throws IOException {
        int iC;
        if (q0.b(this.f54271b) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f54271b;
        do {
            list.add(U(f0Var, c5948n));
            if (this.f54270a.f() || this.f54273d != 0) {
                return;
            } else {
                iC = this.f54270a.C();
            }
        } while (iC == i10);
        this.f54273d = iC;
    }

    public void W(List<String> list, boolean z10) throws IOException {
        int iC;
        int iC2;
        if (q0.b(this.f54271b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof C) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC = this.f54270a.C();
                }
            } while (iC == this.f54271b);
            this.f54273d = iC;
            return;
        }
        C c10 = (C) list;
        do {
            c10.p2(o());
            if (this.f54270a.f()) {
                return;
            } else {
                iC2 = this.f54270a.C();
            }
        } while (iC2 == this.f54271b);
        this.f54273d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int a() {
        return this.f54271b;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void c(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C5957x)) {
            int iB = q0.b(this.f54271b);
            if (iB == 2) {
                int iD = this.f54270a.D();
                Z(iD);
                int iE = this.f54270a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f54270a.w()));
                } while (this.f54270a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f54270a.w()));
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC = this.f54270a.C();
                }
            } while (iC == this.f54271b);
            this.f54273d = iC;
            return;
        }
        C5957x c5957x = (C5957x) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 2) {
            int iD2 = this.f54270a.D();
            Z(iD2);
            int iE2 = this.f54270a.e() + iD2;
            do {
                c5957x.c2(this.f54270a.w());
            } while (this.f54270a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c5957x.c2(this.f54270a.w());
            if (this.f54270a.f()) {
                return;
            } else {
                iC2 = this.f54270a.C();
            }
        } while (iC2 == this.f54271b);
        this.f54273d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void d(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54271b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f54270a.z()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54270a.e() + this.f54270a.D();
            do {
                list.add(Long.valueOf(this.f54270a.z()));
            } while (this.f54270a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 0) {
            do {
                g10.k(this.f54270a.z());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54270a.e() + this.f54270a.D();
        do {
            g10.k(this.f54270a.z());
        } while (this.f54270a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void g(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54271b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f54270a.E()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54270a.e() + this.f54270a.D();
            do {
                list.add(Long.valueOf(this.f54270a.E()));
            } while (this.f54270a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 0) {
            do {
                g10.k(this.f54270a.E());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54270a.e() + this.f54270a.D();
        do {
            g10.k(this.f54270a.E());
        } while (this.f54270a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void i(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54271b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f54270a.v()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54270a.e() + this.f54270a.D();
            do {
                list.add(Long.valueOf(this.f54270a.v()));
            } while (this.f54270a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 0) {
            do {
                g10.k(this.f54270a.v());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54270a.e() + this.f54270a.D();
        do {
            g10.k(this.f54270a.v());
        } while (this.f54270a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void j(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C5957x)) {
            int iB = q0.b(this.f54271b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f54270a.q()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54270a.e() + this.f54270a.D();
            do {
                list.add(Integer.valueOf(this.f54270a.q()));
            } while (this.f54270a.e() < iE);
            X(iE);
            return;
        }
        C5957x c5957x = (C5957x) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 0) {
            do {
                c5957x.c2(this.f54270a.q());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54270a.e() + this.f54270a.D();
        do {
            c5957x.c2(this.f54270a.q());
        } while (this.f54270a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void m(List<Boolean> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C5939e)) {
            int iB = q0.b(this.f54271b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f54270a.n()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54270a.e() + this.f54270a.D();
            do {
                list.add(Boolean.valueOf(this.f54270a.n()));
            } while (this.f54270a.e() < iE);
            X(iE);
            return;
        }
        C5939e c5939e = (C5939e) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 0) {
            do {
                c5939e.k(this.f54270a.n());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54270a.e() + this.f54270a.D();
        do {
            c5939e.k(this.f54270a.n());
        } while (this.f54270a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void q(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54271b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f54270a.s()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f54270a.D();
            a0(iD);
            int iE = this.f54270a.e() + iD;
            do {
                list.add(Long.valueOf(this.f54270a.s()));
            } while (this.f54270a.e() < iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 1) {
            do {
                g10.k(this.f54270a.s());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f54270a.D();
        a0(iD2);
        int iE2 = this.f54270a.e() + iD2;
        do {
            g10.k(this.f54270a.s());
        } while (this.f54270a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void r(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C5957x)) {
            int iB = q0.b(this.f54271b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f54270a.y()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54270a.e() + this.f54270a.D();
            do {
                list.add(Integer.valueOf(this.f54270a.y()));
            } while (this.f54270a.e() < iE);
            X(iE);
            return;
        }
        C5957x c5957x = (C5957x) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 0) {
            do {
                c5957x.c2(this.f54270a.y());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54270a.e() + this.f54270a.D();
        do {
            c5957x.c2(this.f54270a.y());
        } while (this.f54270a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void t(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C5957x)) {
            int iB = q0.b(this.f54271b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f54270a.D()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54270a.e() + this.f54270a.D();
            do {
                list.add(Integer.valueOf(this.f54270a.D()));
            } while (this.f54270a.e() < iE);
            X(iE);
            return;
        }
        C5957x c5957x = (C5957x) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 0) {
            do {
                c5957x.c2(this.f54270a.D());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54270a.e() + this.f54270a.D();
        do {
            c5957x.c2(this.f54270a.D());
        } while (this.f54270a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void v(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof G)) {
            int iB = q0.b(this.f54271b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f54270a.x()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f54270a.D();
            a0(iD);
            int iE = this.f54270a.e() + iD;
            do {
                list.add(Long.valueOf(this.f54270a.x()));
            } while (this.f54270a.e() < iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 1) {
            do {
                g10.k(this.f54270a.x());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f54270a.D();
        a0(iD2);
        int iE2 = this.f54270a.e() + iD2;
        do {
            g10.k(this.f54270a.x());
        } while (this.f54270a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void w(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C5957x)) {
            int iB = q0.b(this.f54271b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f54270a.u()));
                    if (this.f54270a.f()) {
                        return;
                    } else {
                        iC = this.f54270a.C();
                    }
                } while (iC == this.f54271b);
                this.f54273d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f54270a.e() + this.f54270a.D();
            do {
                list.add(Integer.valueOf(this.f54270a.u()));
            } while (this.f54270a.e() < iE);
            X(iE);
            return;
        }
        C5957x c5957x = (C5957x) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 0) {
            do {
                c5957x.c2(this.f54270a.u());
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC2 = this.f54270a.C();
                }
            } while (iC2 == this.f54271b);
            this.f54273d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f54270a.e() + this.f54270a.D();
        do {
            c5957x.c2(this.f54270a.u());
        } while (this.f54270a.e() < iE2);
        X(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void x(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof C5957x)) {
            int iB = q0.b(this.f54271b);
            if (iB == 2) {
                int iD = this.f54270a.D();
                Z(iD);
                int iE = this.f54270a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f54270a.r()));
                } while (this.f54270a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f54270a.r()));
                if (this.f54270a.f()) {
                    return;
                } else {
                    iC = this.f54270a.C();
                }
            } while (iC == this.f54271b);
            this.f54273d = iC;
            return;
        }
        C5957x c5957x = (C5957x) list;
        int iB2 = q0.b(this.f54271b);
        if (iB2 == 2) {
            int iD2 = this.f54270a.D();
            Z(iD2);
            int iE2 = this.f54270a.e() + iD2;
            do {
                c5957x.c2(this.f54270a.r());
            } while (this.f54270a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c5957x.c2(this.f54270a.r());
            if (this.f54270a.f()) {
                return;
            } else {
                iC2 = this.f54270a.C();
            }
        } while (iC2 == this.f54271b);
        this.f54273d = iC2;
    }

    private C5943i(AbstractC5942h abstractC5942h) {
        AbstractC5942h abstractC5942h2 = (AbstractC5942h) C5958y.b(abstractC5942h, "input");
        this.f54270a = abstractC5942h2;
        abstractC5942h2.f54248d = this;
    }

    private <T> T U(f0<T> f0Var, C5948n c5948n) throws IOException {
        T tD = f0Var.d();
        R(tD, f0Var, c5948n);
        f0Var.e(tD);
        return tD;
    }

    private <T> T V(f0<T> f0Var, C5948n c5948n) throws IOException {
        T tD = f0Var.d();
        S(tD, f0Var, c5948n);
        f0Var.e(tD);
        return tD;
    }
}
