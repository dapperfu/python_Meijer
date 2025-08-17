package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10293f0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class N0<T> implements InterfaceC10279a1<T> {

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f81157s = C10350y1.z();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f81158a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f81159b;

    /* renamed from: c, reason: collision with root package name */
    private final int f81160c;

    /* renamed from: d, reason: collision with root package name */
    private final int f81161d;

    /* renamed from: e, reason: collision with root package name */
    private final int f81162e;

    /* renamed from: f, reason: collision with root package name */
    private final J0 f81163f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f81164g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f81165h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f81166i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f81167j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f81168k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f81169l;

    /* renamed from: m, reason: collision with root package name */
    private final int[] f81170m;

    /* renamed from: n, reason: collision with root package name */
    private final Q0 f81171n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC10334t0 f81172o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC10329r1<?, ?> f81173p;

    /* renamed from: q, reason: collision with root package name */
    private final S<?> f81174q;

    /* renamed from: r, reason: collision with root package name */
    private final E0 f81175r;

    private N0(int[] iArr, Object[] objArr, int i10, int i11, int i12, J0 j02, boolean z10, boolean z11, int[] iArr2, int[] iArr3, int[] iArr4, Q0 q02, AbstractC10334t0 abstractC10334t0, AbstractC10329r1<?, ?> abstractC10329r1, S<?> s10, E0 e02) {
        this.f81158a = iArr;
        this.f81159b = objArr;
        this.f81160c = i10;
        this.f81161d = i11;
        this.f81162e = i12;
        this.f81165h = j02 instanceof AbstractC10293f0;
        this.f81166i = z10;
        this.f81164g = s10 != null && s10.g(j02);
        this.f81167j = false;
        this.f81168k = iArr2;
        this.f81169l = iArr3;
        this.f81170m = iArr4;
        this.f81171n = q02;
        this.f81172o = abstractC10334t0;
        this.f81173p = abstractC10329r1;
        this.f81174q = s10;
        this.f81163f = j02;
        this.f81175r = e02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i10, InterfaceC10279a1 interfaceC10279a1) {
        return interfaceC10279a1.e(C10350y1.M(obj, i10 & 1048575));
    }

    private final InterfaceC10279a1 B(int i10) {
        int i11 = (i10 / 4) << 1;
        InterfaceC10279a1 interfaceC10279a1 = (InterfaceC10279a1) this.f81159b[i11];
        if (interfaceC10279a1 != null) {
            return interfaceC10279a1;
        }
        InterfaceC10279a1<T> interfaceC10279a1B = V0.a().b((Class) this.f81159b[i11 + 1]);
        this.f81159b[i11] = interfaceC10279a1B;
        return interfaceC10279a1B;
    }

    private final Object C(int i10) {
        return this.f81159b[(i10 / 4) << 1];
    }

    private final InterfaceC10305j0<?> D(int i10) {
        return (InterfaceC10305j0) this.f81159b[((i10 / 4) << 1) + 1];
    }

    private final int E(int i10) {
        return this.f81158a[i10 + 1];
    }

    private final int F(int i10) {
        return this.f81158a[i10 + 2];
    }

    private final int G(int i10) {
        int i11 = this.f81160c;
        if (i10 >= i11) {
            int i12 = this.f81162e;
            if (i10 < i12) {
                int i13 = (i10 - i11) << 2;
                if (this.f81158a[i13] == i10) {
                    return i13;
                }
                return -1;
            }
            if (i10 <= this.f81161d) {
                int i14 = i12 - i11;
                int length = (this.f81158a.length / 4) - 1;
                while (i14 <= length) {
                    int i15 = (length + i14) >>> 1;
                    int i16 = i15 << 2;
                    int i17 = this.f81158a[i16];
                    if (i10 == i17) {
                        return i16;
                    }
                    if (i10 < i17) {
                        length = i15 - 1;
                    } else {
                        i14 = i15 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void H(T t10, int i10) {
        if (this.f81166i) {
            return;
        }
        int iF = F(i10);
        long j10 = iF & 1048575;
        C10350y1.g(t10, j10, C10350y1.H(t10, j10) | (1 << (iF >>> 20)));
    }

    private final void I(T t10, int i10, int i11) {
        C10350y1.g(t10, F(i11) & 1048575, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J(T r19, com.google.android.gms.internal.clearcut.M1 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.N0.J(java.lang.Object, com.google.android.gms.internal.clearcut.M1):void");
    }

    private final void K(T t10, T t11, int i10) {
        int iE = E(i10);
        int i11 = this.f81158a[i10];
        long j10 = iE & 1048575;
        if (y(t11, i11, i10)) {
            Object objM = C10350y1.M(t10, j10);
            Object objM2 = C10350y1.M(t11, j10);
            if (objM != null && objM2 != null) {
                objM2 = C10299h0.d(objM, objM2);
            } else if (objM2 == null) {
                return;
            }
            C10350y1.i(t10, j10, objM2);
            I(t10, i11, i10);
        }
    }

    private final boolean L(T t10, T t11, int i10) {
        return x(t10, i10) == x(t11, i10);
    }

    private static <E> List<E> M(Object obj, long j10) {
        return (List) C10350y1.M(obj, j10);
    }

    private static <T> double N(T t10, long j10) {
        return ((Double) C10350y1.M(t10, j10)).doubleValue();
    }

    private static <T> float O(T t10, long j10) {
        return ((Float) C10350y1.M(t10, j10)).floatValue();
    }

    private static <T> int P(T t10, long j10) {
        return ((Integer) C10350y1.M(t10, j10)).intValue();
    }

    private static <T> long Q(T t10, long j10) {
        return ((Long) C10350y1.M(t10, j10)).longValue();
    }

    private static <T> boolean R(T t10, long j10) {
        return ((Boolean) C10350y1.M(t10, j10)).booleanValue();
    }

    private static C10332s1 S(Object obj) {
        AbstractC10293f0 abstractC10293f0 = (AbstractC10293f0) obj;
        C10332s1 c10332s1 = abstractC10293f0.zzjp;
        if (c10332s1 != C10332s1.h()) {
            return c10332s1;
        }
        C10332s1 c10332s1I = C10332s1.i();
        abstractC10293f0.zzjp = c10332s1I;
        return c10332s1I;
    }

    private static int i(int i10, byte[] bArr, int i11, int i12, Object obj, C10342w c10342w) throws IOException {
        return C10339v.c(i10, bArr, i11, i12, S(obj), c10342w);
    }

    private static int j(InterfaceC10279a1<?> interfaceC10279a1, int i10, byte[] bArr, int i11, int i12, InterfaceC10308k0<?> interfaceC10308k0, C10342w c10342w) throws IOException {
        int iL = l(interfaceC10279a1, bArr, i11, i12, c10342w);
        while (true) {
            interfaceC10308k0.add(c10342w.f81596c);
            if (iL >= i12) {
                break;
            }
            int iE = C10339v.e(bArr, iL, c10342w);
            if (i10 != c10342w.f81594a) {
                break;
            }
            iL = l(interfaceC10279a1, bArr, iE, i12, c10342w);
        }
        return iL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int k(InterfaceC10279a1 interfaceC10279a1, byte[] bArr, int i10, int i11, int i12, C10342w c10342w) throws IOException {
        N0 n02 = (N0) interfaceC10279a1;
        Object objD = n02.d();
        int iQ = n02.q(objD, bArr, i10, i11, i12, c10342w);
        n02.zzc(objD);
        c10342w.f81596c = objD;
        return iQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int l(InterfaceC10279a1 interfaceC10279a1, byte[] bArr, int i10, int i11, C10342w c10342w) throws IOException {
        int iD = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iD = C10339v.d(i12, bArr, iD, c10342w);
            i12 = c10342w.f81594a;
        }
        int i13 = iD;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzco.a();
        }
        Object objD = interfaceC10279a1.d();
        int i14 = i13 + i12;
        interfaceC10279a1.h(objD, bArr, i13, i14, c10342w);
        interfaceC10279a1.zzc(objD);
        c10342w.f81596c = objD;
        return i14;
    }

    private static <UT, UB> int m(AbstractC10329r1<UT, UB> abstractC10329r1, T t10) {
        return abstractC10329r1.j(abstractC10329r1.k(t10));
    }

    private final int n(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C10342w c10342w) throws IOException {
        int i18;
        Object objValueOf;
        int i19;
        Object objValueOf2;
        int iG;
        long jA;
        int iE;
        Object objValueOf3;
        Object object;
        Unsafe unsafe = f81157s;
        long j11 = this.f81158a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                objValueOf = Double.valueOf(C10339v.l(bArr, i10));
                unsafe.putObject(t10, j10, objValueOf);
                iG = i18 + 8;
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 52:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                objValueOf2 = Float.valueOf(C10339v.n(bArr, i10));
                unsafe.putObject(t10, j10, objValueOf2);
                iG = i19 + 4;
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                iG = C10339v.g(bArr, i10, c10342w);
                jA = c10342w.f81595b;
                objValueOf3 = Long.valueOf(jA);
                unsafe.putObject(t10, j10, objValueOf3);
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                iG = C10339v.e(bArr, i10, c10342w);
                iE = c10342w.f81594a;
                objValueOf3 = Integer.valueOf(iE);
                unsafe.putObject(t10, j10, objValueOf3);
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 56:
            case 65:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                objValueOf = Long.valueOf(C10339v.k(bArr, i10));
                unsafe.putObject(t10, j10, objValueOf);
                iG = i18 + 8;
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 57:
            case 64:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                objValueOf2 = Integer.valueOf(C10339v.h(bArr, i10));
                unsafe.putObject(t10, j10, objValueOf2);
                iG = i19 + 4;
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                iG = C10339v.g(bArr, i10, c10342w);
                objValueOf3 = Boolean.valueOf(c10342w.f81595b != 0);
                unsafe.putObject(t10, j10, objValueOf3);
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iE2 = C10339v.e(bArr, i10, c10342w);
                int i20 = c10342w.f81594a;
                if (i20 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !A1.i(bArr, iE2, iE2 + i20)) {
                        throw zzco.e();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, iE2, i20, C10299h0.f81467a));
                    iE2 += i20;
                }
                unsafe.putInt(t10, j11, i13);
                return iE2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iL = l(B(i17), bArr, i10, i11, c10342w);
                object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                Object objD = c10342w.f81596c;
                if (object != null) {
                    objD = C10299h0.d(object, objD);
                }
                unsafe.putObject(t10, j10, objD);
                unsafe.putInt(t10, j11, i13);
                return iL;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iE3 = C10339v.e(bArr, i10, c10342w);
                int i21 = c10342w.f81594a;
                if (i21 == 0) {
                    unsafe.putObject(t10, j10, A.f81097b);
                } else {
                    unsafe.putObject(t10, j10, A.n(bArr, iE3, i21));
                    iE3 += i21;
                }
                unsafe.putInt(t10, j11, i13);
                return iE3;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iE4 = C10339v.e(bArr, i10, c10342w);
                int i22 = c10342w.f81594a;
                InterfaceC10305j0<?> interfaceC10305j0D = D(i17);
                if (interfaceC10305j0D != null && interfaceC10305j0D.zzb(i22) == null) {
                    S(t10).e(i12, Long.valueOf(i22));
                    return iE4;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(i22));
                iG = iE4;
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                iG = C10339v.e(bArr, i10, c10342w);
                iE = J.e(c10342w.f81594a);
                objValueOf3 = Integer.valueOf(iE);
                unsafe.putObject(t10, j10, objValueOf3);
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                iG = C10339v.g(bArr, i10, c10342w);
                jA = J.a(c10342w.f81595b);
                objValueOf3 = Long.valueOf(jA);
                unsafe.putObject(t10, j10, objValueOf3);
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 68:
                if (i14 == 3) {
                    iG = k(B(i17), bArr, i10, i11, (i12 & (-8)) | 4, c10342w);
                    object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    objValueOf3 = c10342w.f81596c;
                    if (object != null) {
                        objValueOf3 = C10299h0.d(object, objValueOf3);
                    }
                    unsafe.putObject(t10, j10, objValueOf3);
                    unsafe.putInt(t10, j11, i13);
                    return iG;
                }
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0274, code lost:
    
        if (r27.f81595b != 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0276, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0278, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0279, code lost:
    
        r1.e(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027c, code lost:
    
        if (r14 >= r17) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x027e, code lost:
    
        r3 = com.google.android.gms.internal.clearcut.C10339v.e(r15, r14, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0284, code lost:
    
        if (r18 != r27.f81594a) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0286, code lost:
    
        r14 = com.google.android.gms.internal.clearcut.C10339v.g(r15, r3, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x028e, code lost:
    
        if (r27.f81595b == 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0291, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0170, code lost:
    
        r4.add(com.google.android.gms.internal.clearcut.A.n(r15, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0279, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0160, code lost:
    
        if (r2 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0162, code lost:
    
        r4.add(com.google.android.gms.internal.clearcut.A.f81097b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0168, code lost:
    
        r4.add(com.google.android.gms.internal.clearcut.A.n(r15, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0170, code lost:
    
        if (r1 >= r17) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0172, code lost:
    
        r2 = com.google.android.gms.internal.clearcut.C10339v.e(r15, r1, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0178, code lost:
    
        if (r18 != r27.f81594a) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.C10339v.e(r15, r2, r27);
        r2 = r27.f81594a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0180, code lost:
    
        if (r2 != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0219 -> B:104:0x01f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x028e -> B:139:0x0276). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0180 -> B:71:0x0162). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01e2 -> B:91:0x01c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int o(T r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21, long r22, int r24, long r25, com.google.android.gms.internal.clearcut.C10342w r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.N0.o(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.w):int");
    }

    private final <K, V> int p(T t10, byte[] bArr, int i10, int i11, int i12, int i13, long j10, C10342w c10342w) throws IOException {
        Unsafe unsafe = f81157s;
        Object objC = C(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f81175r.zzi(object)) {
            Object objA = this.f81175r.a(objC);
            this.f81175r.zzb(objA, object);
            unsafe.putObject(t10, j10, objA);
            object = objA;
        }
        this.f81175r.zzl(objC);
        this.f81175r.d(object);
        int iE = C10339v.e(bArr, i10, c10342w);
        int i14 = c10342w.f81594a;
        if (i14 < 0 || i14 > i11 - iE) {
            throw zzco.a();
        }
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0067. Please report as an issue. */
    private final int q(T t10, byte[] bArr, int i10, int i11, int i12, C10342w c10342w) throws IOException {
        N0<T> n02;
        int i13;
        Unsafe unsafe;
        int i14;
        int i15;
        T t11;
        int i16;
        int i17;
        int i18;
        N0<T> n03;
        InterfaceC10305j0<?> interfaceC10305j0D;
        int i19;
        int i20;
        int i21;
        byte[] bArr2;
        Unsafe unsafe2;
        int i22;
        int i23;
        int i24;
        int i25;
        int iE;
        int i26;
        C10342w c10342w2;
        int i27;
        long j10;
        Object objD;
        C10342w c10342w3;
        int iG;
        Unsafe unsafe3;
        int i28;
        N0<T> n04 = this;
        T t12 = t10;
        byte[] bArr3 = bArr;
        int i29 = i11;
        C10342w c10342w4 = c10342w;
        Unsafe unsafe4 = f81157s;
        int i30 = -1;
        int iJ = i10;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            if (iJ < i29) {
                int iD = iJ + 1;
                int i34 = bArr3[iJ];
                if (i34 < 0) {
                    iD = C10339v.d(i34, bArr3, iD, c10342w4);
                    i34 = c10342w4.f81594a;
                }
                int i35 = i34;
                iJ = iD;
                int i36 = i35 >>> 3;
                int i37 = i35 & 7;
                int iG2 = n04.G(i36);
                if (iG2 != i30) {
                    int[] iArr = n04.f81158a;
                    int i38 = iArr[iG2 + 1];
                    int i39 = (i38 & 267386880) >>> 20;
                    long j11 = i38 & 1048575;
                    if (i39 <= 17) {
                        int i40 = iArr[iG2 + 2];
                        int i41 = 1 << (i40 >>> 20);
                        int i42 = i40 & 1048575;
                        i14 = -1;
                        if (i42 != i31) {
                            if (i31 != -1) {
                                unsafe4.putInt(t12, i31, i33);
                            }
                            i31 = i42;
                            i33 = unsafe4.getInt(t12, i42);
                        }
                        switch (i39) {
                            case 0:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i22 = i35;
                                i23 = i11;
                                i24 = i31;
                                i25 = iJ;
                                i20 = i33;
                                if (i37 != 1) {
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    C10350y1.e(t12, j11, C10339v.l(bArr2, i25));
                                    iE = i25 + 8;
                                    i33 = i20 | i41;
                                    c10342w4 = c10342w;
                                    i32 = i22;
                                    i29 = i23;
                                    i31 = i24;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 1:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i22 = i35;
                                i23 = i11;
                                i24 = i31;
                                i25 = iJ;
                                i20 = i33;
                                if (i37 != 5) {
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    C10350y1.f(t12, j11, C10339v.n(bArr2, i25));
                                    iE = i25 + 4;
                                    i33 = i20 | i41;
                                    c10342w4 = c10342w;
                                    i32 = i22;
                                    i29 = i23;
                                    i31 = i24;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 2:
                            case 3:
                                unsafe2 = unsafe4;
                                c10342w3 = c10342w;
                                i24 = i31;
                                i25 = iJ;
                                i20 = i33;
                                if (i37 != 0) {
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iG = C10339v.g(bArr, i25, c10342w3);
                                    T t13 = t12;
                                    unsafe2.putLong(t13, j11, c10342w3.f81595b);
                                    unsafe3 = unsafe2;
                                    t12 = t13;
                                    i33 = i20 | i41;
                                    i29 = i11;
                                    bArr3 = bArr;
                                    i32 = i35;
                                    i31 = i24;
                                    i30 = -1;
                                    unsafe4 = unsafe3;
                                    iJ = iG;
                                    c10342w4 = c10342w3;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i26 = i11;
                                c10342w2 = c10342w;
                                i24 = i31;
                                i25 = iJ;
                                i20 = i33;
                                if (i37 != 0) {
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iE = C10339v.e(bArr2, i25, c10342w2);
                                    unsafe2.putInt(t12, j11, c10342w2.f81594a);
                                    i33 = i20 | i41;
                                    i29 = i26;
                                    i32 = i35;
                                    c10342w4 = c10342w2;
                                    i31 = i24;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i27 = iJ;
                                i26 = i11;
                                i20 = i33;
                                c10342w2 = c10342w;
                                i24 = i31;
                                if (i37 != 1) {
                                    i25 = i27;
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    T t14 = t12;
                                    unsafe2.putLong(t14, j11, C10339v.k(bArr2, i27));
                                    unsafe2 = unsafe2;
                                    t12 = t14;
                                    iE = i27 + 8;
                                    i33 = i20 | i41;
                                    i29 = i26;
                                    i32 = i35;
                                    c10342w4 = c10342w2;
                                    i31 = i24;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i27 = iJ;
                                i26 = i11;
                                i20 = i33;
                                c10342w2 = c10342w;
                                i24 = i31;
                                if (i37 != 5) {
                                    i25 = i27;
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    unsafe2.putInt(t12, j11, C10339v.h(bArr2, i27));
                                    iE = i27 + 4;
                                    i33 = i20 | i41;
                                    i29 = i26;
                                    i32 = i35;
                                    c10342w4 = c10342w2;
                                    i31 = i24;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 7:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i27 = iJ;
                                i26 = i11;
                                i20 = i33;
                                c10342w2 = c10342w;
                                i24 = i31;
                                if (i37 != 0) {
                                    i25 = i27;
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iE = C10339v.g(bArr2, i27, c10342w2);
                                    C10350y1.j(t12, j11, c10342w2.f81595b != 0);
                                    i33 = i20 | i41;
                                    i29 = i26;
                                    i32 = i35;
                                    c10342w4 = c10342w2;
                                    i31 = i24;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 8:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i27 = iJ;
                                i26 = i11;
                                i20 = i33;
                                c10342w2 = c10342w;
                                i24 = i31;
                                j10 = j11;
                                if (i37 != 2) {
                                    i25 = i27;
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iE = (i38 & 536870912) == 0 ? C10339v.i(bArr2, i27, c10342w2) : C10339v.j(bArr2, i27, c10342w2);
                                    objD = c10342w2.f81596c;
                                    unsafe2.putObject(t12, j10, objD);
                                    i33 = i20 | i41;
                                    i29 = i26;
                                    i32 = i35;
                                    c10342w4 = c10342w2;
                                    i31 = i24;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 9:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i27 = iJ;
                                i26 = i11;
                                i20 = i33;
                                c10342w2 = c10342w;
                                i24 = i31;
                                j10 = j11;
                                if (i37 != 2) {
                                    i25 = i27;
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iE = l(n04.B(iG2), bArr2, i27, i26, c10342w2);
                                    objD = (i20 & i41) == 0 ? c10342w2.f81596c : C10299h0.d(unsafe2.getObject(t12, j10), c10342w2.f81596c);
                                    unsafe2.putObject(t12, j10, objD);
                                    i33 = i20 | i41;
                                    i29 = i26;
                                    i32 = i35;
                                    c10342w4 = c10342w2;
                                    i31 = i24;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 10:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i27 = iJ;
                                i26 = i11;
                                i20 = i33;
                                c10342w2 = c10342w;
                                i24 = i31;
                                j10 = j11;
                                if (i37 != 2) {
                                    i25 = i27;
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iE = C10339v.m(bArr2, i27, c10342w2);
                                    objD = c10342w2.f81596c;
                                    unsafe2.putObject(t12, j10, objD);
                                    i33 = i20 | i41;
                                    i29 = i26;
                                    i32 = i35;
                                    c10342w4 = c10342w2;
                                    i31 = i24;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 12:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i27 = iJ;
                                i26 = i11;
                                i20 = i33;
                                c10342w2 = c10342w;
                                i24 = i31;
                                if (i37 != 0) {
                                    i25 = i27;
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iE = C10339v.e(bArr2, i27, c10342w2);
                                    int i43 = c10342w2.f81594a;
                                    InterfaceC10305j0<?> interfaceC10305j0D2 = n04.D(iG2);
                                    if (interfaceC10305j0D2 == null || interfaceC10305j0D2.zzb(i43) != null) {
                                        unsafe2.putInt(t12, j11, i43);
                                        i33 = i20 | i41;
                                        i29 = i26;
                                        i32 = i35;
                                        c10342w4 = c10342w2;
                                        i31 = i24;
                                        unsafe4 = unsafe2;
                                        iJ = iE;
                                        bArr3 = bArr2;
                                        i30 = -1;
                                    } else {
                                        S(t12).e(i35, Long.valueOf(i43));
                                        i29 = i26;
                                        i32 = i35;
                                        c10342w4 = c10342w2;
                                        i31 = i24;
                                        i33 = i20;
                                        unsafe4 = unsafe2;
                                        iJ = iE;
                                        bArr3 = bArr2;
                                        i30 = -1;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                unsafe2 = unsafe4;
                                i27 = iJ;
                                if (i37 != 0) {
                                    i24 = i31;
                                    i20 = i33;
                                    i25 = i27;
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iE = C10339v.e(bArr2, i27, c10342w);
                                    unsafe2.putInt(t12, j11, J.e(c10342w.f81594a));
                                    i33 |= i41;
                                    i29 = i11;
                                    i32 = i35;
                                    c10342w4 = c10342w;
                                    unsafe4 = unsafe2;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            case 16:
                                i27 = iJ;
                                if (i37 != 0) {
                                    unsafe2 = unsafe4;
                                    i24 = i31;
                                    i20 = i33;
                                    i25 = i27;
                                    i22 = i35;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iG = C10339v.g(bArr, i27, c10342w);
                                    c10342w3 = c10342w;
                                    T t15 = t12;
                                    Unsafe unsafe5 = unsafe4;
                                    unsafe5.putLong(t15, j11, J.a(c10342w.f81595b));
                                    unsafe3 = unsafe5;
                                    t12 = t15;
                                    i33 |= i41;
                                    i29 = i11;
                                    bArr3 = bArr;
                                    i32 = i35;
                                    i30 = -1;
                                    unsafe4 = unsafe3;
                                    iJ = iG;
                                    c10342w4 = c10342w3;
                                }
                            case 17:
                                if (i37 != 3) {
                                    unsafe2 = unsafe4;
                                    i24 = i31;
                                    i22 = i35;
                                    i25 = iJ;
                                    i20 = i33;
                                    i15 = i12;
                                    n02 = n04;
                                    unsafe = unsafe2;
                                    i21 = i22;
                                    iJ = i25;
                                    i31 = i24;
                                    i33 = i20;
                                    break;
                                } else {
                                    iE = k(n04.B(iG2), bArr, iJ, i11, (i36 << 3) | 4, c10342w);
                                    bArr2 = bArr;
                                    unsafe4.putObject(t12, j11, (i33 & i41) == 0 ? c10342w.f81596c : C10299h0.d(unsafe4.getObject(t12, j11), c10342w.f81596c));
                                    i33 |= i41;
                                    i29 = i11;
                                    c10342w4 = c10342w;
                                    i32 = i35;
                                    iJ = iE;
                                    bArr3 = bArr2;
                                    i30 = -1;
                                }
                            default:
                                unsafe2 = unsafe4;
                                i24 = i31;
                                i22 = i35;
                                i25 = iJ;
                                i20 = i33;
                                i15 = i12;
                                n02 = n04;
                                unsafe = unsafe2;
                                i21 = i22;
                                iJ = i25;
                                i31 = i24;
                                i33 = i20;
                                break;
                        }
                    } else {
                        Unsafe unsafe6 = unsafe4;
                        i14 = -1;
                        int i44 = i29;
                        if (i39 != 27) {
                            iJ = iJ;
                            if (i39 <= 49) {
                                i20 = i33;
                                unsafe = unsafe6;
                                i19 = i31;
                                int iO = n04.o(t10, bArr, iJ, i11, i35, i36, i37, iG2, i38, i39, j11, c10342w);
                                i28 = i35;
                                if (iO == iJ) {
                                    n02 = this;
                                    i15 = i12;
                                    iJ = iO;
                                    i21 = i28;
                                    i33 = i20;
                                    i31 = i19;
                                } else {
                                    n04 = this;
                                    t12 = t10;
                                    bArr3 = bArr;
                                    i29 = i11;
                                    c10342w4 = c10342w;
                                    iJ = iO;
                                    i32 = i28;
                                    i30 = -1;
                                    unsafe4 = unsafe;
                                    i33 = i20;
                                    i31 = i19;
                                }
                            } else {
                                unsafe = unsafe6;
                                i19 = i31;
                                i20 = i33;
                                i28 = i35;
                                if (i39 != 50) {
                                    int iN = n(t10, bArr, iJ, i11, i28, i36, i37, i38, i39, j11, iG2, c10342w);
                                    n02 = this;
                                    i21 = i28;
                                    if (iN == iJ) {
                                        i31 = i19;
                                        i15 = i12;
                                        iJ = iN;
                                        i33 = i20;
                                    } else {
                                        t12 = t10;
                                        i31 = i19;
                                        i29 = i11;
                                        i32 = i21;
                                        iJ = iN;
                                        n04 = n02;
                                        i30 = -1;
                                        unsafe4 = unsafe;
                                        i33 = i20;
                                        bArr3 = bArr;
                                        c10342w4 = c10342w;
                                    }
                                } else if (i37 == 2) {
                                    int iP = p(t10, bArr, iJ, i11, iG2, i36, j11, c10342w);
                                    if (iP == iJ) {
                                        n02 = this;
                                        i15 = i12;
                                        iJ = iP;
                                        i21 = i28;
                                        i33 = i20;
                                        i31 = i19;
                                    } else {
                                        n04 = this;
                                        t12 = t10;
                                        bArr3 = bArr;
                                        i29 = i11;
                                        c10342w4 = c10342w;
                                        iJ = iP;
                                        i32 = i28;
                                        i30 = -1;
                                        unsafe4 = unsafe;
                                        i33 = i20;
                                        i31 = i19;
                                    }
                                } else {
                                    n02 = this;
                                    i21 = i28;
                                }
                            }
                        } else if (i37 == 2) {
                            InterfaceC10308k0 interfaceC10308k0Zzi = (InterfaceC10308k0) unsafe6.getObject(t12, j11);
                            if (!interfaceC10308k0Zzi.zzu()) {
                                int size = interfaceC10308k0Zzi.size();
                                interfaceC10308k0Zzi = interfaceC10308k0Zzi.zzi(size == 0 ? 10 : size << 1);
                                unsafe6.putObject(t12, j11, interfaceC10308k0Zzi);
                            }
                            c10342w4 = c10342w;
                            unsafe4 = unsafe6;
                            i29 = i11;
                            iJ = j(n04.B(iG2), i35, bArr, iJ, i44, interfaceC10308k0Zzi, c10342w4);
                            i32 = i35;
                            i30 = -1;
                            t12 = t10;
                            bArr3 = bArr;
                        } else {
                            n02 = n04;
                            i21 = i35;
                            unsafe = unsafe6;
                            i19 = i31;
                            iJ = iJ;
                            i20 = i33;
                        }
                    }
                    if (i21 == i15 || i15 == 0) {
                        int i45 = i21;
                        int i46 = i(i45, bArr, iJ, i11, t10, c10342w);
                        i32 = i45;
                        t12 = t10;
                        n04 = n02;
                        i30 = i14;
                        unsafe4 = unsafe;
                        c10342w4 = c10342w;
                        i29 = i11;
                        iJ = i46;
                        bArr3 = bArr;
                    } else {
                        t11 = t10;
                        i13 = i11;
                        i16 = i31;
                        i18 = i33;
                        i17 = i21;
                    }
                } else {
                    n02 = n04;
                    unsafe = unsafe4;
                    i14 = i30;
                    i19 = i31;
                    i20 = i33;
                    i21 = i35;
                }
                i31 = i19;
                i15 = i12;
                i33 = i20;
                if (i21 == i15) {
                }
                int i452 = i21;
                int i462 = i(i452, bArr, iJ, i11, t10, c10342w);
                i32 = i452;
                t12 = t10;
                n04 = n02;
                i30 = i14;
                unsafe4 = unsafe;
                c10342w4 = c10342w;
                i29 = i11;
                iJ = i462;
                bArr3 = bArr;
            } else {
                n02 = n04;
                i13 = i29;
                unsafe = unsafe4;
                i14 = i30;
                int i47 = i33;
                i15 = i12;
                t11 = t12;
                i16 = i31;
                i17 = i32;
                i18 = i47;
            }
        }
        int i48 = iJ;
        if (i16 != i14) {
            unsafe.putInt(t11, i16, i18);
        }
        int[] iArr2 = n02.f81169l;
        if (iArr2 != null) {
            int length = iArr2.length;
            Object objS = null;
            int i49 = 0;
            while (i49 < length) {
                int i50 = iArr2[i49];
                AbstractC10329r1 abstractC10329r1 = n02.f81173p;
                int i51 = n02.f81158a[i50];
                Object objM = C10350y1.M(t11, n02.E(i50) & 1048575);
                if (objM == null || (interfaceC10305j0D = n02.D(i50)) == null) {
                    n03 = n02;
                } else {
                    Map mapD = n02.f81175r.d(objM);
                    n03 = n02;
                    objS = n03.s(i50, i51, mapD, interfaceC10305j0D, objS, abstractC10329r1);
                }
                objS = (C10332s1) objS;
                i49++;
                n02 = n03;
            }
            N0<T> n05 = n02;
            if (objS != null) {
                n05.f81173p.h(t11, objS);
            }
        }
        if (i15 == 0) {
            if (i48 != i13) {
                throw zzco.d();
            }
        } else if (i48 > i13 || i17 != i15) {
            throw zzco.d();
        }
        return i48;
    }

    static <T> N0<T> r(Class<T> cls, H0 h02, Q0 q02, AbstractC10334t0 abstractC10334t0, AbstractC10329r1<?, ?> abstractC10329r1, S<?> s10, E0 e02) {
        int iK;
        int i10;
        int i11;
        int iB;
        int iB2;
        int iQ;
        if (!(h02 instanceof X0)) {
            ((C10318n1) h02).a();
            throw new NoSuchMethodError();
        }
        X0 x02 = (X0) h02;
        boolean z10 = x02.a() == AbstractC10293f0.e.f81443j;
        if (x02.d() == 0) {
            iK = 0;
            i10 = 0;
            i11 = 0;
        } else {
            int iF = x02.f();
            int iG = x02.g();
            iK = x02.k();
            i10 = iF;
            i11 = iG;
        }
        int[] iArr = new int[iK << 2];
        Object[] objArr = new Object[iK << 1];
        int[] iArr2 = x02.h() > 0 ? new int[x02.h()] : null;
        int[] iArr3 = x02.i() > 0 ? new int[x02.i()] : null;
        Y0 y0E = x02.e();
        if (y0E.a()) {
            int iG2 = y0E.g();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (iG2 >= x02.l() || i12 >= ((iG2 - i10) << 2)) {
                    if (y0E.k()) {
                        iB = (int) C10350y1.b(y0E.l());
                        iB2 = (int) C10350y1.b(y0E.m());
                        iQ = 0;
                    } else {
                        iB = (int) C10350y1.b(y0E.n());
                        if (y0E.o()) {
                            iB2 = (int) C10350y1.b(y0E.p());
                            iQ = y0E.q();
                        } else {
                            iB2 = 0;
                            iQ = 0;
                        }
                    }
                    iArr[i12] = y0E.g();
                    int i15 = i12 + 1;
                    iArr[i15] = (y0E.s() ? 536870912 : 0) | (y0E.r() ? 268435456 : 0) | (y0E.h() << 20) | iB;
                    iArr[i12 + 2] = iB2 | (iQ << 20);
                    if (y0E.v() != null) {
                        int i16 = (i12 / 4) << 1;
                        objArr[i16] = y0E.v();
                        if (y0E.t() != null) {
                            objArr[i16 + 1] = y0E.t();
                        } else if (y0E.u() != null) {
                            objArr[i16 + 1] = y0E.u();
                        }
                    } else if (y0E.t() != null) {
                        objArr[((i12 / 4) << 1) + 1] = y0E.t();
                    } else if (y0E.u() != null) {
                        objArr[((i12 / 4) << 1) + 1] = y0E.u();
                    }
                    int iH = y0E.h();
                    if (iH == EnumC10278a0.f81350d0.ordinal()) {
                        iArr2[i13] = i12;
                        i13++;
                    } else if (iH >= 18 && iH <= 49) {
                        iArr3[i14] = iArr[i15] & 1048575;
                        i14++;
                    }
                    if (!y0E.a()) {
                        break;
                    }
                    iG2 = y0E.g();
                } else {
                    for (int i17 = 0; i17 < 4; i17++) {
                        iArr[i12 + i17] = -1;
                    }
                }
                i12 += 4;
            }
        }
        return new N0<>(iArr, objArr, i10, i11, x02.l(), x02.c(), z10, false, x02.j(), iArr2, iArr3, q02, abstractC10334t0, abstractC10329r1, s10, e02);
    }

    private final <K, V, UT, UB> UB s(int i10, int i11, Map<K, V> map, InterfaceC10305j0<?> interfaceC10305j0, UB ub2, AbstractC10329r1<UT, UB> abstractC10329r1) {
        this.f81175r.zzl(C(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (interfaceC10305j0.zzb(((Integer) next.getValue()).intValue()) == null) {
                if (ub2 == null) {
                    ub2 = abstractC10329r1.f();
                }
                F fQ = A.q(B0.a(null, next.getKey(), next.getValue()));
                try {
                    B0.b(fQ.b(), null, next.getKey(), next.getValue());
                    abstractC10329r1.b(ub2, i11, fQ.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private static void t(int i10, Object obj, M1 m12) throws IOException {
        if (obj instanceof String) {
            m12.c(i10, (String) obj);
        } else {
            m12.B(i10, (A) obj);
        }
    }

    private static <UT, UB> void u(AbstractC10329r1<UT, UB> abstractC10329r1, T t10, M1 m12) throws IOException {
        abstractC10329r1.c(abstractC10329r1.k(t10), m12);
    }

    private final <K, V> void v(M1 m12, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            this.f81175r.zzl(C(i11));
            m12.H(i10, null, this.f81175r.zzh(obj));
        }
    }

    private final void w(T t10, T t11, int i10) {
        long jE = E(i10) & 1048575;
        if (x(t11, i10)) {
            Object objM = C10350y1.M(t10, jE);
            Object objM2 = C10350y1.M(t11, jE);
            if (objM != null && objM2 != null) {
                objM2 = C10299h0.d(objM, objM2);
            } else if (objM2 == null) {
                return;
            }
            C10350y1.i(t10, jE, objM2);
            H(t10, i10);
        }
    }

    private final boolean x(T t10, int i10) {
        if (!this.f81166i) {
            int iF = F(i10);
            return (C10350y1.H(t10, (long) (iF & 1048575)) & (1 << (iF >>> 20))) != 0;
        }
        int iE = E(i10);
        long j10 = iE & 1048575;
        switch ((iE & 267386880) >>> 20) {
            case 0:
                return C10350y1.L(t10, j10) != 0.0d;
            case 1:
                return C10350y1.K(t10, j10) != 0.0f;
            case 2:
                return C10350y1.I(t10, j10) != 0;
            case 3:
                return C10350y1.I(t10, j10) != 0;
            case 4:
                return C10350y1.H(t10, j10) != 0;
            case 5:
                return C10350y1.I(t10, j10) != 0;
            case 6:
                return C10350y1.H(t10, j10) != 0;
            case 7:
                return C10350y1.J(t10, j10);
            case 8:
                Object objM = C10350y1.M(t10, j10);
                if (objM instanceof String) {
                    return !((String) objM).isEmpty();
                }
                if (objM instanceof A) {
                    return !A.f81097b.equals(objM);
                }
                throw new IllegalArgumentException();
            case 9:
                return C10350y1.M(t10, j10) != null;
            case 10:
                return !A.f81097b.equals(C10350y1.M(t10, j10));
            case 11:
                return C10350y1.H(t10, j10) != 0;
            case 12:
                return C10350y1.H(t10, j10) != 0;
            case 13:
                return C10350y1.H(t10, j10) != 0;
            case 14:
                return C10350y1.I(t10, j10) != 0;
            case 15:
                return C10350y1.H(t10, j10) != 0;
            case 16:
                return C10350y1.I(t10, j10) != 0;
            case 17:
                return C10350y1.M(t10, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean y(T t10, int i10, int i11) {
        return C10350y1.H(t10, (long) (F(i11) & 1048575)) == i10;
    }

    private final boolean z(T t10, int i10, int i11, int i12) {
        return this.f81166i ? x(t10, i10) : (i11 & i12) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.google.android.gms.internal.clearcut.InterfaceC10279a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(T r14, com.google.android.gms.internal.clearcut.M1 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.N0.a(java.lang.Object, com.google.android.gms.internal.clearcut.M1):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4 A[PHI: r3
      0x00f4: PHI (r3v9 java.lang.Object) = (r3v6 java.lang.Object), (r3v10 java.lang.Object) binds: [B:74:0x0110, B:68:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.clearcut.InterfaceC10279a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.N0.b(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.clearcut.InterfaceC10279a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.N0.c(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10279a1
    public final T d() {
        return (T) this.f81171n.a(this.f81163f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    @Override // com.google.android.gms.internal.clearcut.InterfaceC10279a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(T r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.N0.e(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.google.android.gms.internal.clearcut.InterfaceC10279a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(T r7, T r8) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.N0.f(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0423, code lost:
    
        if (y(r21, r15, r4) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0425, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.P(r15, (com.google.android.gms.internal.clearcut.J0) r2.getObject(r21, r13), B(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x045c, code lost:
    
        if (y(r21, r15, r4) != false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x045e, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.o0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0467, code lost:
    
        if (y(r21, r15, r4) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0469, code lost:
    
        r8 = com.google.android.gms.internal.clearcut.zzbn.v0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0492, code lost:
    
        if (y(r21, r15, r4) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0494, code lost:
    
        r6 = r2.getObject(r21, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04a3, code lost:
    
        if (y(r21, r15, r4) != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04a5, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.C10285c1.n(r15, r2.getObject(r21, r13), B(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04cd, code lost:
    
        if (y(r21, r15, r4) != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04cf, code lost:
    
        r6 = com.google.android.gms.internal.clearcut.zzbn.Q(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0712, code lost:
    
        if ((r12 & r19) != 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x072c, code lost:
    
        if ((r12 & r19) != 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0732, code lost:
    
        if ((r12 & r19) != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x074c, code lost:
    
        if ((r12 & r19) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0752, code lost:
    
        if ((r12 & r19) != 0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0766, code lost:
    
        if ((r12 & r19) != 0) goto L291;
     */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0498 A[PHI: r6
      0x0498: PHI (r6v119 java.lang.Object) = (r6v25 java.lang.Object), (r6v115 java.lang.Object), (r6v122 java.lang.Object) binds: [B:431:0x0760, B:286:0x04be, B:278:0x0494] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04c1 A[PHI: r6
      0x04c1: PHI (r6v111 java.lang.Object) = (r6v25 java.lang.Object), (r6v115 java.lang.Object) binds: [B:431:0x0760, B:286:0x04be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0568 A[PHI: r8
      0x0568: PHI (r8v75 int) = 
      (r8v37 int)
      (r8v40 int)
      (r8v43 int)
      (r8v46 int)
      (r8v49 int)
      (r8v52 int)
      (r8v55 int)
      (r8v58 int)
      (r8v61 int)
      (r8v64 int)
      (r8v67 int)
      (r8v70 int)
      (r8v73 int)
      (r8v78 int)
     binds: [B:384:0x0658, B:379:0x0646, B:374:0x0634, B:369:0x0622, B:364:0x0610, B:359:0x05fe, B:354:0x05ec, B:349:0x05db, B:344:0x05ca, B:339:0x05b9, B:334:0x05a8, B:329:0x0597, B:324:0x0586, B:318:0x0566] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc A[PHI: r4
      0x00bc: PHI (r4v94 java.lang.Object) = (r4v12 java.lang.Object), (r4v92 java.lang.Object), (r4v96 java.lang.Object) binds: [B:197:0x0367, B:51:0x00e2, B:43:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5 A[PHI: r4
      0x00e5: PHI (r4v90 java.lang.Object) = (r4v12 java.lang.Object), (r4v92 java.lang.Object) binds: [B:197:0x0367, B:51:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0189 A[PHI: r4
      0x0189: PHI (r4v72 int) = 
      (r4v34 int)
      (r4v37 int)
      (r4v40 int)
      (r4v43 int)
      (r4v46 int)
      (r4v49 int)
      (r4v52 int)
      (r4v55 int)
      (r4v58 int)
      (r4v61 int)
      (r4v64 int)
      (r4v67 int)
      (r4v70 int)
      (r4v75 int)
     binds: [B:152:0x0279, B:147:0x0267, B:142:0x0255, B:137:0x0243, B:132:0x0231, B:127:0x021f, B:122:0x020d, B:117:0x01fc, B:112:0x01eb, B:107:0x01da, B:102:0x01c9, B:97:0x01b8, B:92:0x01a7, B:86:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.clearcut.InterfaceC10279a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(T r21) {
        /*
            Method dump skipped, instructions count: 2304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.N0.g(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10279a1
    public final void h(T t10, byte[] bArr, int i10, int i11, C10342w c10342w) throws IOException {
        Unsafe unsafe;
        C10342w c10342w2;
        T t11;
        int i12;
        int i13;
        byte[] bArr2;
        int i14;
        int i15;
        int iN;
        Unsafe unsafe2;
        T t12;
        Object objD;
        T t13;
        int iE;
        N0<T> n02 = this;
        byte[] bArr3 = bArr;
        int i16 = i11;
        C10342w c10342w3 = c10342w;
        if (!n02.f81166i) {
            q(t10, bArr, i10, i16, 0, c10342w);
            return;
        }
        Unsafe unsafe3 = f81157s;
        int i17 = i10;
        while (i17 < i16) {
            int iD = i17 + 1;
            int i18 = bArr3[i17];
            if (i18 < 0) {
                iD = C10339v.d(i18, bArr3, iD, c10342w3);
                i18 = c10342w3.f81594a;
            }
            int i19 = i18;
            int i20 = iD;
            int i21 = i19 >>> 3;
            int i22 = i19 & 7;
            int iG = n02.G(i21);
            if (iG >= 0) {
                int i23 = n02.f81158a[iG + 1];
                int i24 = (267386880 & i23) >>> 20;
                long j10 = 1048575 & i23;
                if (i24 <= 17) {
                    switch (i24) {
                        case 0:
                            unsafe = unsafe3;
                            if (i22 == 1) {
                                C10350y1.e(t10, j10, C10339v.l(bArr3, i20));
                                i17 = i20 + 8;
                                unsafe3 = unsafe;
                                break;
                            }
                            i15 = i20;
                            t11 = t10;
                            bArr2 = bArr;
                            i13 = i15;
                            i14 = i19;
                            i12 = i11;
                            c10342w2 = c10342w;
                            i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                            n02 = this;
                            bArr3 = bArr;
                            c10342w3 = c10342w;
                            i16 = i12;
                            unsafe3 = unsafe;
                        case 1:
                            unsafe = unsafe3;
                            if (i22 == 5) {
                                C10350y1.f(t10, j10, C10339v.n(bArr3, i20));
                                i17 = i20 + 4;
                                unsafe3 = unsafe;
                                break;
                            }
                            i15 = i20;
                            t11 = t10;
                            bArr2 = bArr;
                            i13 = i15;
                            i14 = i19;
                            i12 = i11;
                            c10342w2 = c10342w;
                            i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                            n02 = this;
                            bArr3 = bArr;
                            c10342w3 = c10342w;
                            i16 = i12;
                            unsafe3 = unsafe;
                        case 2:
                        case 3:
                            Unsafe unsafe4 = unsafe3;
                            if (i22 != 0) {
                                unsafe = unsafe4;
                                i15 = i20;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                int iG2 = C10339v.g(bArr3, i20, c10342w3);
                                unsafe3 = unsafe4;
                                unsafe3.putLong(t10, j10, c10342w3.f81595b);
                                i17 = iG2;
                                break;
                            }
                        case 4:
                        case 11:
                            unsafe2 = unsafe3;
                            if (i22 != 0) {
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                i17 = C10339v.e(bArr3, i20, c10342w3);
                                unsafe2.putInt(t10, j10, c10342w3.f81594a);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 5:
                        case 14:
                            unsafe2 = unsafe3;
                            if (i22 != 1) {
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                unsafe2.putLong(t10, j10, C10339v.k(bArr3, i20));
                                i17 = i20 + 8;
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 6:
                        case 13:
                            unsafe2 = unsafe3;
                            if (i22 != 5) {
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                unsafe2.putInt(t10, j10, C10339v.h(bArr3, i20));
                                i17 = i20 + 4;
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 7:
                            unsafe2 = unsafe3;
                            if (i22 != 0) {
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                i17 = C10339v.g(bArr3, i20, c10342w3);
                                C10350y1.j(t10, j10, c10342w3.f81595b != 0);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 8:
                            unsafe2 = unsafe3;
                            t12 = t10;
                            if (i22 != 2) {
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                i17 = (536870912 & i23) == 0 ? C10339v.i(bArr3, i20, c10342w3) : C10339v.j(bArr3, i20, c10342w3);
                                objD = c10342w3.f81596c;
                                unsafe2.putObject(t12, j10, objD);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 9:
                            unsafe2 = unsafe3;
                            t12 = t10;
                            if (i22 != 2) {
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                i17 = l(n02.B(iG), bArr3, i20, i16, c10342w3);
                                Object object = unsafe2.getObject(t12, j10);
                                objD = object == null ? c10342w3.f81596c : C10299h0.d(object, c10342w3.f81596c);
                                unsafe2.putObject(t12, j10, objD);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 10:
                            unsafe2 = unsafe3;
                            t12 = t10;
                            if (i22 != 2) {
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                i17 = C10339v.m(bArr3, i20, c10342w3);
                                objD = c10342w3.f81596c;
                                unsafe2.putObject(t12, j10, objD);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 12:
                            unsafe2 = unsafe3;
                            t13 = t10;
                            if (i22 != 0) {
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                i17 = C10339v.e(bArr3, i20, c10342w3);
                                iE = c10342w3.f81594a;
                                unsafe2.putInt(t13, j10, iE);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 15:
                            unsafe2 = unsafe3;
                            t13 = t10;
                            if (i22 != 0) {
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                i17 = C10339v.e(bArr3, i20, c10342w3);
                                iE = J.e(c10342w3.f81594a);
                                unsafe2.putInt(t13, j10, iE);
                                unsafe3 = unsafe2;
                                break;
                            }
                        case 16:
                            if (i22 != 0) {
                                unsafe2 = unsafe3;
                                i15 = i20;
                                unsafe = unsafe2;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                                unsafe3 = unsafe;
                                break;
                            } else {
                                int iG3 = C10339v.g(bArr3, i20, c10342w3);
                                unsafe3.putLong(t10, j10, J.a(c10342w3.f81595b));
                                unsafe2 = unsafe3;
                                i17 = iG3;
                                unsafe3 = unsafe2;
                                break;
                            }
                    }
                } else {
                    unsafe = unsafe3;
                    if (i24 != 27) {
                        if (i24 <= 49) {
                            iN = n02.o(t10, bArr, i20, i11, i19, i21, i22, iG, i23, i24, j10, c10342w);
                            if (iN == i20) {
                                t11 = t10;
                                bArr2 = bArr;
                                i12 = i11;
                                c10342w2 = c10342w;
                                i13 = iN;
                                i14 = i19;
                                i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                                n02 = this;
                                bArr3 = bArr;
                                c10342w3 = c10342w;
                                i16 = i12;
                            }
                        } else {
                            if (i24 != 50) {
                                iN = n(t10, bArr, i20, i11, i19, i21, i22, i23, i24, j10, iG, c10342w);
                                if (iN == i20) {
                                    t11 = t10;
                                    bArr2 = bArr;
                                    i12 = i11;
                                    i14 = i19;
                                    i13 = iN;
                                }
                            } else if (i22 == 2) {
                                int iP = p(t10, bArr, i20, i11, iG, i21, j10, c10342w);
                                if (iP == i20) {
                                    t11 = t10;
                                    bArr2 = bArr;
                                    i12 = i11;
                                    i13 = iP;
                                    i14 = i19;
                                } else {
                                    n02 = this;
                                    bArr3 = bArr;
                                    i16 = i11;
                                    c10342w3 = c10342w;
                                    i17 = iP;
                                }
                            } else {
                                i15 = i20;
                                i19 = i19;
                                t11 = t10;
                                bArr2 = bArr;
                                i13 = i15;
                                i14 = i19;
                                i12 = i11;
                            }
                            c10342w2 = c10342w;
                            i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                            n02 = this;
                            bArr3 = bArr;
                            c10342w3 = c10342w;
                            i16 = i12;
                        }
                        n02 = this;
                        bArr3 = bArr;
                        i16 = i11;
                        c10342w3 = c10342w;
                        i17 = iN;
                    } else if (i22 == 2) {
                        InterfaceC10308k0 interfaceC10308k0Zzi = (InterfaceC10308k0) unsafe.getObject(t10, j10);
                        if (!interfaceC10308k0Zzi.zzu()) {
                            int size = interfaceC10308k0Zzi.size();
                            interfaceC10308k0Zzi = interfaceC10308k0Zzi.zzi(size == 0 ? 10 : size << 1);
                            unsafe.putObject(t10, j10, interfaceC10308k0Zzi);
                        }
                        i17 = j(n02.B(iG), i19, bArr3, i20, i16, interfaceC10308k0Zzi, c10342w3);
                        bArr3 = bArr;
                        i16 = i11;
                        c10342w3 = c10342w;
                    } else {
                        i19 = i19;
                        i15 = i20;
                        t11 = t10;
                        bArr2 = bArr;
                        i13 = i15;
                        i14 = i19;
                        i12 = i11;
                        c10342w2 = c10342w;
                        i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
                        n02 = this;
                        bArr3 = bArr;
                        c10342w3 = c10342w;
                        i16 = i12;
                    }
                    unsafe3 = unsafe;
                }
            }
            unsafe = unsafe3;
            i15 = i20;
            t11 = t10;
            bArr2 = bArr;
            i13 = i15;
            i14 = i19;
            i12 = i11;
            c10342w2 = c10342w;
            i17 = i(i14, bArr2, i13, i12, t11, c10342w2);
            n02 = this;
            bArr3 = bArr;
            c10342w3 = c10342w;
            i16 = i12;
            unsafe3 = unsafe;
        }
        if (i17 != i16) {
            throw zzco.d();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10279a1
    public final void zzc(T t10) {
        int[] iArr = this.f81169l;
        if (iArr != null) {
            for (int i10 : iArr) {
                long jE = E(i10) & 1048575;
                Object objM = C10350y1.M(t10, jE);
                if (objM != null) {
                    C10350y1.i(t10, jE, this.f81175r.b(objM));
                }
            }
        }
        int[] iArr2 = this.f81170m;
        if (iArr2 != null) {
            for (int i11 : iArr2) {
                this.f81172o.a(t10, i11);
            }
        }
        this.f81173p.d(t10);
        if (this.f81164g) {
            this.f81174q.f(t10);
        }
    }
}
