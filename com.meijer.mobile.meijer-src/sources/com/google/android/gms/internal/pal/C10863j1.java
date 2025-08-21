package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.pal.j1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10863j1<T> implements InterfaceC11006s1<T> {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f84014q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private static final Unsafe f84015r = T1.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f84016a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f84017b;

    /* renamed from: c, reason: collision with root package name */
    private final int f84018c;

    /* renamed from: d, reason: collision with root package name */
    private final int f84019d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10815g1 f84020e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f84021f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f84022g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f84023h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f84024i;

    /* renamed from: j, reason: collision with root package name */
    private final int f84025j;

    /* renamed from: k, reason: collision with root package name */
    private final int f84026k;

    /* renamed from: l, reason: collision with root package name */
    private final T0 f84027l;

    /* renamed from: m, reason: collision with root package name */
    private final J1 f84028m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC10974q0 f84029n;

    /* renamed from: o, reason: collision with root package name */
    private final C10895l1 f84030o;

    /* renamed from: p, reason: collision with root package name */
    private final C10731b1 f84031p;

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.pal.C10863j1 E(com.google.android.gms.internal.pal.C10975q1 r34, com.google.android.gms.internal.pal.C10895l1 r35, com.google.android.gms.internal.pal.T0 r36, com.google.android.gms.internal.pal.J1 r37, com.google.android.gms.internal.pal.AbstractC10974q0 r38, com.google.android.gms.internal.pal.C10731b1 r39) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.C10863j1.E(com.google.android.gms.internal.pal.q1, com.google.android.gms.internal.pal.l1, com.google.android.gms.internal.pal.T0, com.google.android.gms.internal.pal.J1, com.google.android.gms.internal.pal.q0, com.google.android.gms.internal.pal.b1):com.google.android.gms.internal.pal.j1");
    }

    private final int L(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, N n10) throws IOException {
        Object object;
        Unsafe unsafe = f84015r;
        long j11 = this.f84016a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(O.n(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(O.b(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iM = O.m(bArr, i10, n10);
                unsafe.putObject(obj, j10, Long.valueOf(n10.f83618b));
                unsafe.putInt(obj, j11, i13);
                return iM;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iJ = O.j(bArr, i10, n10);
                unsafe.putObject(obj, j10, Integer.valueOf(n10.f83617a));
                unsafe.putInt(obj, j11, i13);
                return iJ;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(O.n(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(O.b(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iM2 = O.m(bArr, i10, n10);
                unsafe.putObject(obj, j10, Boolean.valueOf(n10.f83618b != 0));
                unsafe.putInt(obj, j11, i13);
                return iM2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iJ2 = O.j(bArr, i10, n10);
                int i18 = n10.f83617a;
                if (i18 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !Y1.f(bArr, iJ2, iJ2 + i18)) {
                        throw zzadi.d();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iJ2, i18, J0.f83517b));
                    iJ2 += i18;
                }
                unsafe.putInt(obj, j11, i13);
                return iJ2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iD = O.d(i(i17), bArr, i10, i11, n10);
                object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, n10.f83619c);
                } else {
                    unsafe.putObject(obj, j10, J0.g(object, n10.f83619c));
                }
                unsafe.putInt(obj, j11, i13);
                return iD;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iA = O.a(bArr, i10, n10);
                unsafe.putObject(obj, j10, n10.f83619c);
                unsafe.putInt(obj, j11, i13);
                return iA;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iJ3 = O.j(bArr, i10, n10);
                int i19 = n10.f83617a;
                G0 g0H = h(i17);
                if (g0H != null && !g0H.zza(i19)) {
                    C(obj).h(i12, Long.valueOf(i19));
                    return iJ3;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(i19));
                unsafe.putInt(obj, j11, i13);
                return iJ3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iJ4 = O.j(bArr, i10, n10);
                unsafe.putObject(obj, j10, Integer.valueOf(AbstractC10814g0.l(n10.f83617a)));
                unsafe.putInt(obj, j11, i13);
                return iJ4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iM3 = O.m(bArr, i10, n10);
                unsafe.putObject(obj, j10, Long.valueOf(AbstractC10814g0.m(n10.f83618b)));
                unsafe.putInt(obj, j11, i13);
                return iM3;
            case 68:
                if (i14 == 3) {
                    int iC = O.c(i(i17), bArr, i10, i11, (i12 & (-8)) | 4, n10);
                    object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, n10.f83619c);
                    } else {
                        unsafe.putObject(obj, j10, J0.g(object, n10.f83619c));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return iC;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int M(Object obj, byte[] bArr, int i10, int i11, N n10) throws IOException {
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C10863j1<T> c10863j1 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i22 = i11;
        N n11 = n10;
        Unsafe unsafe2 = f84015r;
        int i23 = -1;
        int iM = i10;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (iM < i22) {
            int iK = iM + 1;
            int i28 = bArr2[iM];
            if (i28 < 0) {
                iK = O.k(i28, bArr2, iK, n11);
                i28 = n11.f83617a;
            }
            int i29 = iK;
            int i30 = i28 >>> 3;
            int i31 = i28 & 7;
            int iP = i30 > i24 ? c10863j1.P(i30, i25 / 3) : c10863j1.O(i30);
            if (iP == i23) {
                unsafe = unsafe2;
                i12 = i28;
                i13 = i23;
                i14 = i30;
                i15 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = c10863j1.f84016a;
                int i32 = iArr[iP + 1];
                int iE = e(i32);
                int i33 = i28;
                int i34 = iP;
                long j10 = i32 & 1048575;
                if (iE <= 17) {
                    int i35 = iArr[i34 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = i35 & 1048575;
                    if (i37 != i27) {
                        int i38 = 1048575;
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj3, i27, i26);
                            i38 = 1048575;
                        }
                        if (i37 != i38) {
                            i26 = unsafe2.getInt(obj3, i37);
                        }
                        i27 = i37;
                    }
                    switch (iE) {
                        case 0:
                            i21 = i34;
                            if (i31 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                T1.t(obj3, j10, Double.longBitsToDouble(O.n(bArr2, i29)));
                                iM = i29 + 8;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 1:
                            i21 = i34;
                            if (i31 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                T1.u(obj3, j10, Float.intBitsToFloat(O.b(bArr2, i29)));
                                iM = i29 + 4;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                int iM2 = O.m(bArr2, i29, n11);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j10, n11.f83618b);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i26 |= i36;
                                iM = iM2;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                i22 = i11;
                                break;
                            }
                        case 4:
                        case 11:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                int iJ = O.j(bArr2, i29, n11);
                                unsafe2.putInt(obj3, j10, n11.f83617a);
                                i26 |= i36;
                                i22 = i11;
                                iM = iJ;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i21 = i34;
                            if (i31 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j10, O.n(bArr2, i29));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                iM = i29 + 8;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i21 = i34;
                            if (i31 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j10, O.b(bArr2, i29));
                                iM = i29 + 4;
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 7:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iM = O.m(bArr2, i29, n11);
                                T1.r(obj3, j10, n11.f83618b != 0);
                                i26 |= i36;
                                i22 = i11;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 8:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iM = (536870912 & i32) == 0 ? O.g(bArr2, i29, n11) : O.h(bArr2, i29, n11);
                                unsafe2.putObject(obj3, j10, n11.f83619c);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 9:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iM = O.d(c10863j1.i(i21), bArr2, i29, i22, n11);
                                Object object = unsafe2.getObject(obj3, j10);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j10, n11.f83619c);
                                } else {
                                    unsafe2.putObject(obj3, j10, J0.g(object, n11.f83619c));
                                }
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 10:
                            i21 = i34;
                            if (i31 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iM = O.a(bArr2, i29, n11);
                                unsafe2.putObject(obj3, j10, n11.f83619c);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 12:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iM = O.j(bArr2, i29, n11);
                                unsafe2.putInt(obj3, j10, n11.f83617a);
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 15:
                            i21 = i34;
                            if (i31 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                iM = O.j(bArr2, i29, n11);
                                unsafe2.putInt(obj3, j10, AbstractC10814g0.l(n11.f83617a));
                                i26 |= i36;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 16:
                            if (i31 != 0) {
                                i21 = i34;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i14 = i30;
                                i15 = i21;
                                i13 = -1;
                                i12 = i33;
                                break;
                            } else {
                                int iM3 = O.m(bArr2, i29, n11);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i21 = i34;
                                unsafe5.putLong(obj6, j10, AbstractC10814g0.m(n11.f83618b));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i26 |= i36;
                                iM = iM3;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        default:
                            i21 = i34;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i14 = i30;
                            i15 = i21;
                            i13 = -1;
                            i12 = i33;
                            break;
                    }
                } else {
                    i15 = i34;
                    if (iE != 27) {
                        i16 = i29;
                        Unsafe unsafe6 = unsafe2;
                        if (iE <= 49) {
                            i17 = i26;
                            unsafe = unsafe6;
                            i13 = -1;
                            i19 = i27;
                            int iN = c10863j1.N(obj, bArr, i16, i11, i33, i30, i31, i15, i32, iE, j10, n10);
                            i18 = i33;
                            i20 = i30;
                            if (iN != i16) {
                                c10863j1 = this;
                                obj3 = obj;
                                n11 = n10;
                                iM = iN;
                                i25 = i15;
                                i24 = i20;
                                i27 = i19;
                                i23 = i13;
                                i26 = i17;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i22 = i11;
                            } else {
                                obj2 = obj;
                                i29 = iN;
                                i14 = i20;
                                i12 = i18;
                            }
                        } else {
                            i17 = i26;
                            unsafe = unsafe6;
                            i13 = -1;
                            i18 = i33;
                            i19 = i27;
                            i20 = i30;
                            if (iE != 50) {
                                i14 = i20;
                                int iL = L(obj, bArr, i16, i11, i18, i14, i31, i32, iE, j10, i15, n10);
                                obj2 = obj;
                                i12 = i18;
                                i15 = i15;
                                if (iL != i16) {
                                    c10863j1 = this;
                                    n11 = n10;
                                    i24 = i14;
                                    iM = iL;
                                    i25 = i15;
                                    obj3 = obj2;
                                    i27 = i19;
                                    i23 = i13;
                                    i26 = i17;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i22 = i11;
                                } else {
                                    i29 = iL;
                                }
                            } else if (i31 == 2) {
                                int iK2 = K(obj, bArr, i16, i11, i15, j10, n10);
                                i15 = i15;
                                if (iK2 != i16) {
                                    c10863j1 = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    n11 = n10;
                                    iM = iK2;
                                    i25 = i15;
                                    i24 = i20;
                                    i27 = i19;
                                    i23 = -1;
                                    i26 = i17;
                                    unsafe2 = unsafe;
                                    i22 = i11;
                                } else {
                                    obj2 = obj;
                                    i29 = iK2;
                                    i14 = i20;
                                    i12 = i18;
                                }
                            } else {
                                i15 = i15;
                                obj2 = obj;
                                i29 = i16;
                                i14 = i20;
                                i12 = i18;
                            }
                        }
                    } else if (i31 == 2) {
                        I0 i0Zzd = (I0) unsafe2.getObject(obj3, j10);
                        if (!i0Zzd.zzc()) {
                            int size = i0Zzd.size();
                            i0Zzd = i0Zzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j10, i0Zzd);
                        }
                        int iE2 = O.e(c10863j1.i(i15), i33, bArr2, i29, i11, i0Zzd, n11);
                        bArr2 = bArr;
                        n11 = n10;
                        iM = iE2;
                        i25 = i15;
                        unsafe2 = unsafe2;
                        i24 = i30;
                        i23 = -1;
                        obj3 = obj;
                        i22 = i11;
                    } else {
                        i16 = i29;
                        i19 = i27;
                        i17 = i26;
                        unsafe = unsafe2;
                        i20 = i30;
                        i13 = -1;
                        i18 = i33;
                        obj2 = obj;
                        i29 = i16;
                        i14 = i20;
                        i12 = i18;
                    }
                    i27 = i19;
                    i26 = i17;
                }
            }
            int i39 = O.i(i12, bArr, i29, i11, C(obj2), n10);
            bArr2 = bArr;
            n11 = n10;
            i24 = i14;
            i25 = i15;
            obj3 = obj2;
            i23 = i13;
            unsafe2 = unsafe;
            i22 = i11;
            iM = i39;
            c10863j1 = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i40 = i22;
        int i41 = i27;
        int i42 = i26;
        if (i41 != 1048575) {
            unsafe7.putInt(obj7, i41, i42);
        }
        if (iM == i40) {
            return iM;
        }
        throw zzadi.g();
    }

    private final int N(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, N n10) throws IOException {
        int iL;
        Unsafe unsafe = f84015r;
        I0 i0Zzd = (I0) unsafe.getObject(obj, j11);
        if (!i0Zzd.zzc()) {
            int size = i0Zzd.size();
            i0Zzd = i0Zzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, i0Zzd);
        }
        I0 i02 = i0Zzd;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    C10910m0 c10910m0 = (C10910m0) i02;
                    int iJ = O.j(bArr, i10, n10);
                    int i17 = n10.f83617a + iJ;
                    while (iJ < i17) {
                        c10910m0.a(Double.longBitsToDouble(O.n(bArr, iJ)));
                        iJ += 8;
                    }
                    if (iJ == i17) {
                        return iJ;
                    }
                    throw zzadi.i();
                }
                if (i14 == 1) {
                    C10910m0 c10910m02 = (C10910m0) i02;
                    c10910m02.a(Double.longBitsToDouble(O.n(bArr, i10)));
                    int i18 = i10 + 8;
                    while (i18 < i11) {
                        int iJ2 = O.j(bArr, i18, n10);
                        if (i12 != n10.f83617a) {
                            return i18;
                        }
                        c10910m02.a(Double.longBitsToDouble(O.n(bArr, iJ2)));
                        i18 = iJ2 + 8;
                    }
                    return i18;
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    C11069w0 c11069w0 = (C11069w0) i02;
                    int iJ3 = O.j(bArr, i10, n10);
                    int i19 = n10.f83617a + iJ3;
                    while (iJ3 < i19) {
                        c11069w0.a(Float.intBitsToFloat(O.b(bArr, iJ3)));
                        iJ3 += 4;
                    }
                    if (iJ3 == i19) {
                        return iJ3;
                    }
                    throw zzadi.i();
                }
                if (i14 == 5) {
                    C11069w0 c11069w02 = (C11069w0) i02;
                    c11069w02.a(Float.intBitsToFloat(O.b(bArr, i10)));
                    int i20 = i10 + 4;
                    while (i20 < i11) {
                        int iJ4 = O.j(bArr, i20, n10);
                        if (i12 != n10.f83617a) {
                            return i20;
                        }
                        c11069w02.a(Float.intBitsToFloat(O.b(bArr, iJ4)));
                        i20 = iJ4 + 4;
                    }
                    return i20;
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    U0 u02 = (U0) i02;
                    int iJ5 = O.j(bArr, i10, n10);
                    int i21 = n10.f83617a + iJ5;
                    while (iJ5 < i21) {
                        iJ5 = O.m(bArr, iJ5, n10);
                        u02.e(n10.f83618b);
                    }
                    if (iJ5 == i21) {
                        return iJ5;
                    }
                    throw zzadi.i();
                }
                if (i14 == 0) {
                    U0 u03 = (U0) i02;
                    int iM = O.m(bArr, i10, n10);
                    u03.e(n10.f83618b);
                    while (iM < i11) {
                        int iJ6 = O.j(bArr, iM, n10);
                        if (i12 != n10.f83617a) {
                            return iM;
                        }
                        iM = O.m(bArr, iJ6, n10);
                        u03.e(n10.f83618b);
                    }
                    return iM;
                }
                return i10;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return O.f(bArr, i10, i02, n10);
                }
                if (i14 == 0) {
                    return O.l(i12, bArr, i10, i11, i02, n10);
                }
                return i10;
            case 23:
            case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
            case 40:
            case 46:
                if (i14 == 2) {
                    U0 u04 = (U0) i02;
                    int iJ7 = O.j(bArr, i10, n10);
                    int i22 = n10.f83617a + iJ7;
                    while (iJ7 < i22) {
                        u04.e(O.n(bArr, iJ7));
                        iJ7 += 8;
                    }
                    if (iJ7 == i22) {
                        return iJ7;
                    }
                    throw zzadi.i();
                }
                if (i14 == 1) {
                    U0 u05 = (U0) i02;
                    u05.e(O.n(bArr, i10));
                    int i23 = i10 + 8;
                    while (i23 < i11) {
                        int iJ8 = O.j(bArr, i23, n10);
                        if (i12 != n10.f83617a) {
                            return i23;
                        }
                        u05.e(O.n(bArr, iJ8));
                        i23 = iJ8 + 8;
                    }
                    return i23;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    D0 d02 = (D0) i02;
                    int iJ9 = O.j(bArr, i10, n10);
                    int i24 = n10.f83617a + iJ9;
                    while (iJ9 < i24) {
                        d02.f(O.b(bArr, iJ9));
                        iJ9 += 4;
                    }
                    if (iJ9 == i24) {
                        return iJ9;
                    }
                    throw zzadi.i();
                }
                if (i14 == 5) {
                    D0 d03 = (D0) i02;
                    d03.f(O.b(bArr, i10));
                    int i25 = i10 + 4;
                    while (i25 < i11) {
                        int iJ10 = O.j(bArr, i25, n10);
                        if (i12 != n10.f83617a) {
                            return i25;
                        }
                        d03.f(O.b(bArr, iJ10));
                        i25 = iJ10 + 4;
                    }
                    return i25;
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    P p10 = (P) i02;
                    int iJ11 = O.j(bArr, i10, n10);
                    int i26 = n10.f83617a + iJ11;
                    while (iJ11 < i26) {
                        iJ11 = O.m(bArr, iJ11, n10);
                        p10.a(n10.f83618b != 0);
                    }
                    if (iJ11 == i26) {
                        return iJ11;
                    }
                    throw zzadi.i();
                }
                if (i14 == 0) {
                    P p11 = (P) i02;
                    int iM2 = O.m(bArr, i10, n10);
                    p11.a(n10.f83618b != 0);
                    while (iM2 < i11) {
                        int iJ12 = O.j(bArr, iM2, n10);
                        if (i12 != n10.f83617a) {
                            return iM2;
                        }
                        iM2 = O.m(bArr, iJ12, n10);
                        p11.a(n10.f83618b != 0);
                    }
                    return iM2;
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int iJ13 = O.j(bArr, i10, n10);
                        int i27 = n10.f83617a;
                        if (i27 < 0) {
                            throw zzadi.f();
                        }
                        if (i27 == 0) {
                            i02.add("");
                        } else {
                            i02.add(new String(bArr, iJ13, i27, J0.f83517b));
                            iJ13 += i27;
                        }
                        while (iJ13 < i11) {
                            int iJ14 = O.j(bArr, iJ13, n10);
                            if (i12 != n10.f83617a) {
                                return iJ13;
                            }
                            iJ13 = O.j(bArr, iJ14, n10);
                            int i28 = n10.f83617a;
                            if (i28 < 0) {
                                throw zzadi.f();
                            }
                            if (i28 == 0) {
                                i02.add("");
                            } else {
                                i02.add(new String(bArr, iJ13, i28, J0.f83517b));
                                iJ13 += i28;
                            }
                        }
                        return iJ13;
                    }
                    int iJ15 = O.j(bArr, i10, n10);
                    int i29 = n10.f83617a;
                    if (i29 < 0) {
                        throw zzadi.f();
                    }
                    if (i29 == 0) {
                        i02.add("");
                    } else {
                        int i30 = iJ15 + i29;
                        if (!Y1.f(bArr, iJ15, i30)) {
                            throw zzadi.d();
                        }
                        i02.add(new String(bArr, iJ15, i29, J0.f83517b));
                        iJ15 = i30;
                    }
                    while (iJ15 < i11) {
                        int iJ16 = O.j(bArr, iJ15, n10);
                        if (i12 != n10.f83617a) {
                            return iJ15;
                        }
                        iJ15 = O.j(bArr, iJ16, n10);
                        int i31 = n10.f83617a;
                        if (i31 < 0) {
                            throw zzadi.f();
                        }
                        if (i31 == 0) {
                            i02.add("");
                        } else {
                            int i32 = iJ15 + i31;
                            if (!Y1.f(bArr, iJ15, i32)) {
                                throw zzadi.d();
                            }
                            i02.add(new String(bArr, iJ15, i31, J0.f83517b));
                            iJ15 = i32;
                        }
                    }
                    return iJ15;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return O.e(i(i15), i12, bArr, i10, i11, i02, n10);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int iJ17 = O.j(bArr, i10, n10);
                    int i33 = n10.f83617a;
                    if (i33 < 0) {
                        throw zzadi.f();
                    }
                    if (i33 > bArr.length - iJ17) {
                        throw zzadi.i();
                    }
                    if (i33 == 0) {
                        i02.add(AbstractC10730b0.f83895b);
                    } else {
                        i02.add(AbstractC10730b0.t(bArr, iJ17, i33));
                        iJ17 += i33;
                    }
                    while (iJ17 < i11) {
                        int iJ18 = O.j(bArr, iJ17, n10);
                        if (i12 != n10.f83617a) {
                            return iJ17;
                        }
                        iJ17 = O.j(bArr, iJ18, n10);
                        int i34 = n10.f83617a;
                        if (i34 < 0) {
                            throw zzadi.f();
                        }
                        if (i34 > bArr.length - iJ17) {
                            throw zzadi.i();
                        }
                        if (i34 == 0) {
                            i02.add(AbstractC10730b0.f83895b);
                        } else {
                            i02.add(AbstractC10730b0.t(bArr, iJ17, i34));
                            iJ17 += i34;
                        }
                    }
                    return iJ17;
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iL = O.l(i12, bArr, i10, i11, i02, n10);
                    }
                    return i10;
                }
                iL = O.f(bArr, i10, i02, n10);
                B0 b02 = (B0) obj;
                K1 k12 = b02.zzc;
                if (k12 == K1.c()) {
                    k12 = null;
                }
                Object objC = C11038u1.c(i13, i02, h(i15), k12, this.f84028m);
                if (objC == null) {
                    return iL;
                }
                b02.zzc = (K1) objC;
                return iL;
            case 33:
            case 47:
                if (i14 == 2) {
                    D0 d04 = (D0) i02;
                    int iJ19 = O.j(bArr, i10, n10);
                    int i35 = n10.f83617a + iJ19;
                    while (iJ19 < i35) {
                        iJ19 = O.j(bArr, iJ19, n10);
                        d04.f(AbstractC10814g0.l(n10.f83617a));
                    }
                    if (iJ19 == i35) {
                        return iJ19;
                    }
                    throw zzadi.i();
                }
                if (i14 == 0) {
                    D0 d05 = (D0) i02;
                    int iJ20 = O.j(bArr, i10, n10);
                    d05.f(AbstractC10814g0.l(n10.f83617a));
                    while (iJ20 < i11) {
                        int iJ21 = O.j(bArr, iJ20, n10);
                        if (i12 != n10.f83617a) {
                            return iJ20;
                        }
                        iJ20 = O.j(bArr, iJ21, n10);
                        d05.f(AbstractC10814g0.l(n10.f83617a));
                    }
                    return iJ20;
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    U0 u06 = (U0) i02;
                    int iJ22 = O.j(bArr, i10, n10);
                    int i36 = n10.f83617a + iJ22;
                    while (iJ22 < i36) {
                        iJ22 = O.m(bArr, iJ22, n10);
                        u06.e(AbstractC10814g0.m(n10.f83618b));
                    }
                    if (iJ22 == i36) {
                        return iJ22;
                    }
                    throw zzadi.i();
                }
                if (i14 == 0) {
                    U0 u07 = (U0) i02;
                    int iM3 = O.m(bArr, i10, n10);
                    u07.e(AbstractC10814g0.m(n10.f83618b));
                    while (iM3 < i11) {
                        int iJ23 = O.j(bArr, iM3, n10);
                        if (i12 != n10.f83617a) {
                            return iM3;
                        }
                        iM3 = O.m(bArr, iJ23, n10);
                        u07.e(AbstractC10814g0.m(n10.f83618b));
                    }
                    return iM3;
                }
                return i10;
            default:
                if (i14 == 3) {
                    InterfaceC11006s1 interfaceC11006s1I = i(i15);
                    int i37 = (i12 & (-8)) | 4;
                    int iC = O.c(interfaceC11006s1I, bArr, i10, i11, i37, n10);
                    InterfaceC11006s1 interfaceC11006s1 = interfaceC11006s1I;
                    N n11 = n10;
                    i02.add(n11.f83619c);
                    while (iC < i11) {
                        int iJ24 = O.j(bArr, iC, n11);
                        if (i12 != n11.f83617a) {
                            return iC;
                        }
                        InterfaceC11006s1 interfaceC11006s12 = interfaceC11006s1;
                        N n12 = n11;
                        iC = O.c(interfaceC11006s12, bArr, iJ24, i11, i37, n12);
                        i02.add(n12.f83619c);
                        interfaceC11006s1 = interfaceC11006s12;
                        n11 = n12;
                    }
                    return iC;
                }
                return i10;
        }
    }

    private static int e(int i10) {
        return (i10 >>> 20) & com.medallia.digital.mobilesdk.l3.f93323c;
    }

    private static boolean u(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x04ac, code lost:
    
        if (r11 == r15) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04ae, code lost:
    
        r19.putInt(r9, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04b4, code lost:
    
        r0 = r8.f84025j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04b8, code lost:
    
        if (r0 >= r8.f84026k) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04ba, code lost:
    
        r8.j(r9, r8.f84024i[r0], r30, r8.f84028m);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04c8, code lost:
    
        if (r7 != 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04ca, code lost:
    
        if (r3 != r4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04d1, code lost:
    
        throw com.google.android.gms.internal.pal.zzadi.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04d2, code lost:
    
        if (r3 > r4) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04d4, code lost:
    
        if (r6 != r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04d6, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04db, code lost:
    
        throw com.google.android.gms.internal.pal.zzadi.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int B(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.pal.N r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.C10863j1.B(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.pal.N):int");
    }

    private static final void A(int i10, Object obj, InterfaceC10749c2 interfaceC10749c2) throws IOException {
        if (obj instanceof String) {
            interfaceC10749c2.d(i10, (String) obj);
        } else {
            interfaceC10749c2.f(i10, (AbstractC10730b0) obj);
        }
    }

    static K1 C(Object obj) {
        B0 b02 = (B0) obj;
        K1 k12 = b02.zzc;
        if (k12 != K1.c()) {
            return k12;
        }
        K1 k1E = K1.e();
        b02.zzc = k1E;
        return k1E;
    }

    static C10863j1 D(Class cls, InterfaceC10765d1 interfaceC10765d1, C10895l1 c10895l1, T0 t02, J1 j12, AbstractC10974q0 abstractC10974q0, C10731b1 c10731b1) {
        if (interfaceC10765d1 instanceof C10975q1) {
            return E((C10975q1) interfaceC10765d1, c10895l1, t02, j12, abstractC10974q0, c10731b1);
        }
        throw null;
    }

    private final int H(Object obj) {
        int i10;
        int iA;
        int iA2;
        int iA3;
        int iB;
        int iA4;
        int iZ;
        int iA5;
        int iA6;
        int iF;
        int iA7;
        int iQ;
        int iD;
        int iA8;
        int i11;
        Unsafe unsafe = f84015r;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        for (int i15 = 0; i15 < this.f84016a.length; i15 += 3) {
            int iF2 = f(i15);
            int[] iArr = this.f84016a;
            int i16 = iArr[i15];
            int iE = e(iF2);
            if (iE <= 17) {
                int i17 = iArr[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i14) {
                    i13 = unsafe.getInt(obj, i18);
                    i14 = i18;
                }
            } else {
                i10 = 0;
            }
            long j10 = iF2 & 1048575;
            switch (iE) {
                case 0:
                    if ((i13 & i10) != 0) {
                        iA = AbstractC10878k0.a(i16 << 3);
                        iQ = iA + 8;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i13 & i10) != 0) {
                        iA2 = AbstractC10878k0.a(i16 << 3);
                        iQ = iA2 + 4;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i13 & i10) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iA3 = AbstractC10878k0.a(i16 << 3);
                        iB = AbstractC10878k0.b(j11);
                        i12 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i13 & i10) != 0) {
                        long j12 = unsafe.getLong(obj, j10);
                        iA3 = AbstractC10878k0.a(i16 << 3);
                        iB = AbstractC10878k0.b(j12);
                        i12 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i13 & i10) != 0) {
                        int i19 = unsafe.getInt(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.z(i19);
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i13 & i10) != 0) {
                        iA = AbstractC10878k0.a(i16 << 3);
                        iQ = iA + 8;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i13 & i10) != 0) {
                        iA2 = AbstractC10878k0.a(i16 << 3);
                        iQ = iA2 + 4;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i13 & i10) != 0) {
                        iA5 = AbstractC10878k0.a(i16 << 3);
                        iQ = iA5 + 1;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i13 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof AbstractC10730b0) {
                            iA6 = AbstractC10878k0.a(i16 << 3);
                            iF = ((AbstractC10730b0) object).f();
                            iA7 = AbstractC10878k0.a(iF);
                            i11 = iA6 + iA7 + iF;
                            i12 += i11;
                            break;
                        } else {
                            iA4 = AbstractC10878k0.a(i16 << 3);
                            iZ = AbstractC10878k0.C((String) object);
                            i11 = iA4 + iZ;
                            i12 += i11;
                        }
                    }
                case 9:
                    if ((i13 & i10) != 0) {
                        iQ = C11038u1.Q(i16, unsafe.getObject(obj, j10), i(i15));
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i13 & i10) != 0) {
                        AbstractC10730b0 abstractC10730b0 = (AbstractC10730b0) unsafe.getObject(obj, j10);
                        iA6 = AbstractC10878k0.a(i16 << 3);
                        iF = abstractC10730b0.f();
                        iA7 = AbstractC10878k0.a(iF);
                        i11 = iA6 + iA7 + iF;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i13 & i10) != 0) {
                        int i20 = unsafe.getInt(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.a(i20);
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i13 & i10) != 0) {
                        int i21 = unsafe.getInt(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.z(i21);
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i13 & i10) != 0) {
                        iA2 = AbstractC10878k0.a(i16 << 3);
                        iQ = iA2 + 4;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i13 & i10) != 0) {
                        iA = AbstractC10878k0.a(i16 << 3);
                        iQ = iA + 8;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i13 & i10) != 0) {
                        int i22 = unsafe.getInt(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.a((i22 >> 31) ^ (i22 + i22));
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i13) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.b((j13 >> 63) ^ (j13 + j13));
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i13 & i10) != 0) {
                        iQ = AbstractC10878k0.y(i16, (InterfaceC10815g1) unsafe.getObject(obj, j10), i(i15));
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iQ = C11038u1.J(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 19:
                    iQ = C11038u1.H(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 20:
                    iQ = C11038u1.O(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 21:
                    iQ = C11038u1.Z(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    iQ = C11038u1.M(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 23:
                    iQ = C11038u1.J(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 24:
                    iQ = C11038u1.H(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 25:
                    iQ = C11038u1.A(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 26:
                    iQ = C11038u1.W(i16, (List) unsafe.getObject(obj, j10));
                    i12 += iQ;
                    break;
                case 27:
                    iQ = C11038u1.R(i16, (List) unsafe.getObject(obj, j10), i(i15));
                    i12 += iQ;
                    break;
                case 28:
                    iQ = C11038u1.E(i16, (List) unsafe.getObject(obj, j10));
                    i12 += iQ;
                    break;
                case 29:
                    iQ = C11038u1.X(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 30:
                    iQ = C11038u1.F(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 31:
                    iQ = C11038u1.H(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                    iQ = C11038u1.J(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 33:
                    iQ = C11038u1.S(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 34:
                    iQ = C11038u1.U(i16, (List) unsafe.getObject(obj, j10), false);
                    i12 += iQ;
                    break;
                case 35:
                    iZ = C11038u1.K((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZ = C11038u1.I((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZ = C11038u1.P((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZ = C11038u1.a0((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZ = C11038u1.N((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZ = C11038u1.K((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZ = C11038u1.I((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    iZ = C11038u1.D((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZ = C11038u1.Y((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZ = C11038u1.G((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZ = C11038u1.I((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZ = C11038u1.K((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZ = C11038u1.T((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZ = C11038u1.V((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i16);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iQ = C11038u1.L(i16, (List) unsafe.getObject(obj, j10), i(i15));
                    i12 += iQ;
                    break;
                case 50:
                    C10731b1.a(i16, unsafe.getObject(obj, j10), k(i15));
                    break;
                case 51:
                    if (y(obj, i16, i15)) {
                        iA = AbstractC10878k0.a(i16 << 3);
                        iQ = iA + 8;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(obj, i16, i15)) {
                        iA2 = AbstractC10878k0.a(i16 << 3);
                        iQ = iA2 + 4;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(obj, i16, i15)) {
                        long jG = g(obj, j10);
                        iA3 = AbstractC10878k0.a(i16 << 3);
                        iB = AbstractC10878k0.b(jG);
                        i12 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(obj, i16, i15)) {
                        long jG2 = g(obj, j10);
                        iA3 = AbstractC10878k0.a(i16 << 3);
                        iB = AbstractC10878k0.b(jG2);
                        i12 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(obj, i16, i15)) {
                        int iJ = J(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.z(iJ);
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(obj, i16, i15)) {
                        iA = AbstractC10878k0.a(i16 << 3);
                        iQ = iA + 8;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(obj, i16, i15)) {
                        iA2 = AbstractC10878k0.a(i16 << 3);
                        iQ = iA2 + 4;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(obj, i16, i15)) {
                        iA5 = AbstractC10878k0.a(i16 << 3);
                        iQ = iA5 + 1;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!y(obj, i16, i15)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof AbstractC10730b0) {
                            iA6 = AbstractC10878k0.a(i16 << 3);
                            iF = ((AbstractC10730b0) object2).f();
                            iA7 = AbstractC10878k0.a(iF);
                            i11 = iA6 + iA7 + iF;
                            i12 += i11;
                            break;
                        } else {
                            iA4 = AbstractC10878k0.a(i16 << 3);
                            iZ = AbstractC10878k0.C((String) object2);
                            i11 = iA4 + iZ;
                            i12 += i11;
                        }
                    }
                case 60:
                    if (y(obj, i16, i15)) {
                        iQ = C11038u1.Q(i16, unsafe.getObject(obj, j10), i(i15));
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(obj, i16, i15)) {
                        AbstractC10730b0 abstractC10730b02 = (AbstractC10730b0) unsafe.getObject(obj, j10);
                        iA6 = AbstractC10878k0.a(i16 << 3);
                        iF = abstractC10730b02.f();
                        iA7 = AbstractC10878k0.a(iF);
                        i11 = iA6 + iA7 + iF;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(obj, i16, i15)) {
                        int iJ2 = J(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.a(iJ2);
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(obj, i16, i15)) {
                        int iJ3 = J(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.z(iJ3);
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(obj, i16, i15)) {
                        iA2 = AbstractC10878k0.a(i16 << 3);
                        iQ = iA2 + 4;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(obj, i16, i15)) {
                        iA = AbstractC10878k0.a(i16 << 3);
                        iQ = iA + 8;
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(obj, i16, i15)) {
                        int iJ4 = J(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.a((iJ4 >> 31) ^ (iJ4 + iJ4));
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(obj, i16, i15)) {
                        long jG3 = g(obj, j10);
                        iA4 = AbstractC10878k0.a(i16 << 3);
                        iZ = AbstractC10878k0.b((jG3 >> 63) ^ (jG3 + jG3));
                        i11 = iA4 + iZ;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(obj, i16, i15)) {
                        iQ = AbstractC10878k0.y(i16, (InterfaceC10815g1) unsafe.getObject(obj, j10), i(i15));
                        i12 += iQ;
                        break;
                    } else {
                        break;
                    }
            }
        }
        J1 j14 = this.f84028m;
        int iA9 = i12 + j14.a(j14.d(obj));
        if (!this.f84021f) {
            return iA9;
        }
        this.f84029n.a(obj);
        throw null;
    }

    private final int I(Object obj) {
        int iA;
        int iA2;
        int iA3;
        int iB;
        int iA4;
        int iZ;
        int iA5;
        int iA6;
        int iF;
        int iA7;
        int iQ;
        int iD;
        int iA8;
        int i10;
        Unsafe unsafe = f84015r;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f84016a.length; i12 += 3) {
            int iF2 = f(i12);
            int iE = e(iF2);
            int i13 = this.f84016a[i12];
            long j10 = iF2 & 1048575;
            if (iE >= EnumC11053v0.f84937M.zza() && iE <= EnumC11053v0.f84950Z.zza()) {
                int i14 = this.f84016a[i12 + 2];
            }
            switch (iE) {
                case 0:
                    if (v(obj, i12)) {
                        iA = AbstractC10878k0.a(i13 << 3);
                        iQ = iA + 8;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(obj, i12)) {
                        iA2 = AbstractC10878k0.a(i13 << 3);
                        iQ = iA2 + 4;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(obj, i12)) {
                        long jI = T1.i(obj, j10);
                        iA3 = AbstractC10878k0.a(i13 << 3);
                        iB = AbstractC10878k0.b(jI);
                        i11 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(obj, i12)) {
                        long jI2 = T1.i(obj, j10);
                        iA3 = AbstractC10878k0.a(i13 << 3);
                        iB = AbstractC10878k0.b(jI2);
                        i11 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(obj, i12)) {
                        int iH = T1.h(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.z(iH);
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(obj, i12)) {
                        iA = AbstractC10878k0.a(i13 << 3);
                        iQ = iA + 8;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(obj, i12)) {
                        iA2 = AbstractC10878k0.a(i13 << 3);
                        iQ = iA2 + 4;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(obj, i12)) {
                        iA5 = AbstractC10878k0.a(i13 << 3);
                        iQ = iA5 + 1;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!v(obj, i12)) {
                        break;
                    } else {
                        Object objK = T1.k(obj, j10);
                        if (objK instanceof AbstractC10730b0) {
                            iA6 = AbstractC10878k0.a(i13 << 3);
                            iF = ((AbstractC10730b0) objK).f();
                            iA7 = AbstractC10878k0.a(iF);
                            i10 = iA6 + iA7 + iF;
                            i11 += i10;
                            break;
                        } else {
                            iA4 = AbstractC10878k0.a(i13 << 3);
                            iZ = AbstractC10878k0.C((String) objK);
                            i10 = iA4 + iZ;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (v(obj, i12)) {
                        iQ = C11038u1.Q(i13, T1.k(obj, j10), i(i12));
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v(obj, i12)) {
                        AbstractC10730b0 abstractC10730b0 = (AbstractC10730b0) T1.k(obj, j10);
                        iA6 = AbstractC10878k0.a(i13 << 3);
                        iF = abstractC10730b0.f();
                        iA7 = AbstractC10878k0.a(iF);
                        i10 = iA6 + iA7 + iF;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(obj, i12)) {
                        int iH2 = T1.h(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.a(iH2);
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(obj, i12)) {
                        int iH3 = T1.h(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.z(iH3);
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(obj, i12)) {
                        iA2 = AbstractC10878k0.a(i13 << 3);
                        iQ = iA2 + 4;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(obj, i12)) {
                        iA = AbstractC10878k0.a(i13 << 3);
                        iQ = iA + 8;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(obj, i12)) {
                        int iH4 = T1.h(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.a((iH4 >> 31) ^ (iH4 + iH4));
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(obj, i12)) {
                        long jI3 = T1.i(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.b((jI3 >> 63) ^ (jI3 + jI3));
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v(obj, i12)) {
                        iQ = AbstractC10878k0.y(i13, (InterfaceC10815g1) T1.k(obj, j10), i(i12));
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iQ = C11038u1.J(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 19:
                    iQ = C11038u1.H(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 20:
                    iQ = C11038u1.O(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 21:
                    iQ = C11038u1.Z(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    iQ = C11038u1.M(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 23:
                    iQ = C11038u1.J(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 24:
                    iQ = C11038u1.H(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 25:
                    iQ = C11038u1.A(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 26:
                    iQ = C11038u1.W(i13, (List) T1.k(obj, j10));
                    i11 += iQ;
                    break;
                case 27:
                    iQ = C11038u1.R(i13, (List) T1.k(obj, j10), i(i12));
                    i11 += iQ;
                    break;
                case 28:
                    iQ = C11038u1.E(i13, (List) T1.k(obj, j10));
                    i11 += iQ;
                    break;
                case 29:
                    iQ = C11038u1.X(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 30:
                    iQ = C11038u1.F(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 31:
                    iQ = C11038u1.H(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                    iQ = C11038u1.J(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 33:
                    iQ = C11038u1.S(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 34:
                    iQ = C11038u1.U(i13, (List) T1.k(obj, j10), false);
                    i11 += iQ;
                    break;
                case 35:
                    iZ = C11038u1.K((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZ = C11038u1.I((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZ = C11038u1.P((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZ = C11038u1.a0((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZ = C11038u1.N((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZ = C11038u1.K((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZ = C11038u1.I((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    iZ = C11038u1.D((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZ = C11038u1.Y((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZ = C11038u1.G((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZ = C11038u1.I((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZ = C11038u1.K((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZ = C11038u1.T((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZ = C11038u1.V((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        iD = AbstractC10878k0.D(i13);
                        iA8 = AbstractC10878k0.a(iZ);
                        iA4 = iD + iA8;
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iQ = C11038u1.L(i13, (List) T1.k(obj, j10), i(i12));
                    i11 += iQ;
                    break;
                case 50:
                    C10731b1.a(i13, T1.k(obj, j10), k(i12));
                    break;
                case 51:
                    if (y(obj, i13, i12)) {
                        iA = AbstractC10878k0.a(i13 << 3);
                        iQ = iA + 8;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(obj, i13, i12)) {
                        iA2 = AbstractC10878k0.a(i13 << 3);
                        iQ = iA2 + 4;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(obj, i13, i12)) {
                        long jG = g(obj, j10);
                        iA3 = AbstractC10878k0.a(i13 << 3);
                        iB = AbstractC10878k0.b(jG);
                        i11 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(obj, i13, i12)) {
                        long jG2 = g(obj, j10);
                        iA3 = AbstractC10878k0.a(i13 << 3);
                        iB = AbstractC10878k0.b(jG2);
                        i11 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(obj, i13, i12)) {
                        int iJ = J(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.z(iJ);
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(obj, i13, i12)) {
                        iA = AbstractC10878k0.a(i13 << 3);
                        iQ = iA + 8;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(obj, i13, i12)) {
                        iA2 = AbstractC10878k0.a(i13 << 3);
                        iQ = iA2 + 4;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(obj, i13, i12)) {
                        iA5 = AbstractC10878k0.a(i13 << 3);
                        iQ = iA5 + 1;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!y(obj, i13, i12)) {
                        break;
                    } else {
                        Object objK2 = T1.k(obj, j10);
                        if (objK2 instanceof AbstractC10730b0) {
                            iA6 = AbstractC10878k0.a(i13 << 3);
                            iF = ((AbstractC10730b0) objK2).f();
                            iA7 = AbstractC10878k0.a(iF);
                            i10 = iA6 + iA7 + iF;
                            i11 += i10;
                            break;
                        } else {
                            iA4 = AbstractC10878k0.a(i13 << 3);
                            iZ = AbstractC10878k0.C((String) objK2);
                            i10 = iA4 + iZ;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (y(obj, i13, i12)) {
                        iQ = C11038u1.Q(i13, T1.k(obj, j10), i(i12));
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(obj, i13, i12)) {
                        AbstractC10730b0 abstractC10730b02 = (AbstractC10730b0) T1.k(obj, j10);
                        iA6 = AbstractC10878k0.a(i13 << 3);
                        iF = abstractC10730b02.f();
                        iA7 = AbstractC10878k0.a(iF);
                        i10 = iA6 + iA7 + iF;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(obj, i13, i12)) {
                        int iJ2 = J(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.a(iJ2);
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(obj, i13, i12)) {
                        int iJ3 = J(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.z(iJ3);
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(obj, i13, i12)) {
                        iA2 = AbstractC10878k0.a(i13 << 3);
                        iQ = iA2 + 4;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(obj, i13, i12)) {
                        iA = AbstractC10878k0.a(i13 << 3);
                        iQ = iA + 8;
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(obj, i13, i12)) {
                        int iJ4 = J(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.a((iJ4 >> 31) ^ (iJ4 + iJ4));
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(obj, i13, i12)) {
                        long jG3 = g(obj, j10);
                        iA4 = AbstractC10878k0.a(i13 << 3);
                        iZ = AbstractC10878k0.b((jG3 >> 63) ^ (jG3 + jG3));
                        i10 = iA4 + iZ;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(obj, i13, i12)) {
                        iQ = AbstractC10878k0.y(i13, (InterfaceC10815g1) T1.k(obj, j10), i(i12));
                        i11 += iQ;
                        break;
                    } else {
                        break;
                    }
            }
        }
        J1 j12 = this.f84028m;
        return i11 + j12.a(j12.d(obj));
    }

    private final int K(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, N n10) throws IOException {
        Unsafe unsafe = f84015r;
        Object objK = k(i12);
        Object object = unsafe.getObject(obj, j10);
        if (C10731b1.b(object)) {
            Z0 z0B = Z0.a().b();
            C10731b1.c(z0B, object);
            unsafe.putObject(obj, j10, z0B);
        }
        throw null;
    }

    private final int O(int i10) {
        if (i10 < this.f84018c || i10 > this.f84019d) {
            return -1;
        }
        return d(i10, 0);
    }

    private final int P(int i10, int i11) {
        if (i10 < this.f84018c || i10 > this.f84019d) {
            return -1;
        }
        return d(i10, i11);
    }

    private final int Q(int i10) {
        return this.f84016a[i10 + 2];
    }

    private final int d(int i10, int i11) {
        int length = (this.f84016a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f84016a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private final int f(int i10) {
        return this.f84016a[i10 + 1];
    }

    private final G0 h(int i10) {
        int i11 = i10 / 3;
        return (G0) this.f84017b[i11 + i11 + 1];
    }

    private final InterfaceC11006s1 i(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC11006s1 interfaceC11006s1 = (InterfaceC11006s1) this.f84017b[i12];
        if (interfaceC11006s1 != null) {
            return interfaceC11006s1;
        }
        InterfaceC11006s1 interfaceC11006s1B = C10943o1.a().b((Class) this.f84017b[i12 + 1]);
        this.f84017b[i12] = interfaceC11006s1B;
        return interfaceC11006s1B;
    }

    private final Object j(Object obj, int i10, Object obj2, J1 j12) {
        int i11 = this.f84016a[i10];
        Object objK = T1.k(obj, f(i10) & 1048575);
        if (objK == null || h(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object k(int i10) {
        int i11 = i10 / 3;
        return this.f84017b[i11 + i11];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void r(Object obj, InterfaceC10749c2 interfaceC10749c2) throws IOException {
        int i10;
        boolean z10;
        if (this.f84021f) {
            this.f84029n.a(obj);
            throw null;
        }
        int length = this.f84016a.length;
        Unsafe unsafe = f84015r;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iF = f(i13);
            int[] iArr = this.f84016a;
            int i15 = iArr[i13];
            int iE = e(iF);
            if (iE <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iF & i11;
            switch (iE) {
                case 0:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.zzf(i15, T1.f(obj, j10));
                        break;
                    }
                case 1:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.zzo(i15, T1.g(obj, j10));
                        break;
                    }
                case 2:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.zzt(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 3:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.k(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 4:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.zzr(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 5:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.zzm(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 6:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.zzk(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 7:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.zzb(i15, T1.B(obj, j10));
                        break;
                    }
                case 8:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        A(i15, unsafe.getObject(obj, j10), interfaceC10749c2);
                        break;
                    }
                case 9:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.b(i15, unsafe.getObject(obj, j10), i(i13));
                        break;
                    }
                case 10:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.f(i15, (AbstractC10730b0) unsafe.getObject(obj, j10));
                        break;
                    }
                case 11:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.i(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 12:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.zzi(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 13:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.a(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 14:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.j(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 15:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.c(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 16:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.h(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 17:
                    if ((i14 & i10) == 0) {
                        break;
                    } else {
                        interfaceC10749c2.e(i15, unsafe.getObject(obj, j10), i(i13));
                        break;
                    }
                case 18:
                    C11038u1.j(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 19:
                    C11038u1.n(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 20:
                    C11038u1.q(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 21:
                    C11038u1.y(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    C11038u1.p(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 23:
                    C11038u1.m(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 24:
                    C11038u1.l(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 25:
                    C11038u1.h(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 26:
                    C11038u1.w(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2);
                    break;
                case 27:
                    C11038u1.r(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, i(i13));
                    break;
                case 28:
                    C11038u1.i(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2);
                    break;
                case 29:
                    z10 = false;
                    C11038u1.x(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 30:
                    z10 = false;
                    C11038u1.k(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 31:
                    z10 = false;
                    C11038u1.s(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                    z10 = false;
                    C11038u1.t(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 33:
                    z10 = false;
                    C11038u1.u(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 34:
                    z10 = false;
                    C11038u1.v(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, false);
                    break;
                case 35:
                    C11038u1.j(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 36:
                    C11038u1.n(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 37:
                    C11038u1.q(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 38:
                    C11038u1.y(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 39:
                    C11038u1.p(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 40:
                    C11038u1.m(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 41:
                    C11038u1.l(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 42:
                    C11038u1.h(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 43:
                    C11038u1.x(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 44:
                    C11038u1.k(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 45:
                    C11038u1.s(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 46:
                    C11038u1.t(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 47:
                    C11038u1.u(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 48:
                    C11038u1.v(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, true);
                    break;
                case 49:
                    C11038u1.o(this.f84016a[i13], (List) unsafe.getObject(obj, j10), interfaceC10749c2, i(i13));
                    break;
                case 50:
                    s(interfaceC10749c2, i15, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.zzf(i15, F(obj, j10));
                    }
                    break;
                case 52:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.zzo(i15, G(obj, j10));
                    }
                    break;
                case 53:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.zzt(i15, g(obj, j10));
                    }
                    break;
                case 54:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.k(i15, g(obj, j10));
                    }
                    break;
                case 55:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.zzr(i15, J(obj, j10));
                    }
                    break;
                case 56:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.zzm(i15, g(obj, j10));
                    }
                    break;
                case 57:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.zzk(i15, J(obj, j10));
                    }
                    break;
                case 58:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.zzb(i15, z(obj, j10));
                    }
                    break;
                case 59:
                    if (y(obj, i15, i13)) {
                        A(i15, unsafe.getObject(obj, j10), interfaceC10749c2);
                    }
                    break;
                case 60:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.b(i15, unsafe.getObject(obj, j10), i(i13));
                    }
                    break;
                case 61:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.f(i15, (AbstractC10730b0) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.i(i15, J(obj, j10));
                    }
                    break;
                case 63:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.zzi(i15, J(obj, j10));
                    }
                    break;
                case 64:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.a(i15, J(obj, j10));
                    }
                    break;
                case 65:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.j(i15, g(obj, j10));
                    }
                    break;
                case 66:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.c(i15, J(obj, j10));
                    }
                    break;
                case 67:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.h(i15, g(obj, j10));
                    }
                    break;
                case 68:
                    if (y(obj, i15, i13)) {
                        interfaceC10749c2.e(i15, unsafe.getObject(obj, j10), i(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        J1 j12 = this.f84028m;
        j12.p(j12.d(obj), interfaceC10749c2);
    }

    private final void s(InterfaceC10749c2 interfaceC10749c2, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void a(Object obj, byte[] bArr, int i10, int i11, N n10) throws Throwable {
        if (this.f84023h) {
            M(obj, bArr, i10, i11, n10);
        } else {
            B(obj, bArr, i10, i11, 0, n10);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void b(Object obj, InterfaceC10749c2 interfaceC10749c2) throws IOException {
        if (!this.f84023h) {
            r(obj, interfaceC10749c2);
            return;
        }
        if (this.f84021f) {
            this.f84029n.a(obj);
            throw null;
        }
        int length = this.f84016a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iF = f(i10);
            int i11 = this.f84016a[i10];
            switch (e(iF)) {
                case 0:
                    if (v(obj, i10)) {
                        interfaceC10749c2.zzf(i11, T1.f(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(obj, i10)) {
                        interfaceC10749c2.zzo(i11, T1.g(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(obj, i10)) {
                        interfaceC10749c2.zzt(i11, T1.i(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(obj, i10)) {
                        interfaceC10749c2.k(i11, T1.i(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(obj, i10)) {
                        interfaceC10749c2.zzr(i11, T1.h(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(obj, i10)) {
                        interfaceC10749c2.zzm(i11, T1.i(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(obj, i10)) {
                        interfaceC10749c2.zzk(i11, T1.h(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(obj, i10)) {
                        interfaceC10749c2.zzb(i11, T1.B(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(obj, i10)) {
                        A(i11, T1.k(obj, iF & 1048575), interfaceC10749c2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (v(obj, i10)) {
                        interfaceC10749c2.b(i11, T1.k(obj, iF & 1048575), i(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v(obj, i10)) {
                        interfaceC10749c2.f(i11, (AbstractC10730b0) T1.k(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(obj, i10)) {
                        interfaceC10749c2.i(i11, T1.h(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(obj, i10)) {
                        interfaceC10749c2.zzi(i11, T1.h(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(obj, i10)) {
                        interfaceC10749c2.a(i11, T1.h(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(obj, i10)) {
                        interfaceC10749c2.j(i11, T1.i(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(obj, i10)) {
                        interfaceC10749c2.c(i11, T1.h(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(obj, i10)) {
                        interfaceC10749c2.h(i11, T1.i(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v(obj, i10)) {
                        interfaceC10749c2.e(i11, T1.k(obj, iF & 1048575), i(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    C11038u1.j(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 19:
                    C11038u1.n(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 20:
                    C11038u1.q(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 21:
                    C11038u1.y(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    C11038u1.p(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 23:
                    C11038u1.m(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 24:
                    C11038u1.l(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 25:
                    C11038u1.h(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 26:
                    C11038u1.w(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2);
                    break;
                case 27:
                    C11038u1.r(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, i(i10));
                    break;
                case 28:
                    C11038u1.i(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2);
                    break;
                case 29:
                    C11038u1.x(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 30:
                    C11038u1.k(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 31:
                    C11038u1.s(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                    C11038u1.t(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 33:
                    C11038u1.u(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 34:
                    C11038u1.v(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, false);
                    break;
                case 35:
                    C11038u1.j(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 36:
                    C11038u1.n(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 37:
                    C11038u1.q(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 38:
                    C11038u1.y(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 39:
                    C11038u1.p(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 40:
                    C11038u1.m(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 41:
                    C11038u1.l(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 42:
                    C11038u1.h(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 43:
                    C11038u1.x(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 44:
                    C11038u1.k(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 45:
                    C11038u1.s(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 46:
                    C11038u1.t(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 47:
                    C11038u1.u(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 48:
                    C11038u1.v(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, true);
                    break;
                case 49:
                    C11038u1.o(i11, (List) T1.k(obj, iF & 1048575), interfaceC10749c2, i(i10));
                    break;
                case 50:
                    s(interfaceC10749c2, i11, T1.k(obj, iF & 1048575), i10);
                    break;
                case 51:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.zzf(i11, F(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.zzo(i11, G(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.zzt(i11, g(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.k(i11, g(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.zzr(i11, J(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.zzm(i11, g(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.zzk(i11, J(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.zzb(i11, z(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (y(obj, i11, i10)) {
                        A(i11, T1.k(obj, iF & 1048575), interfaceC10749c2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.b(i11, T1.k(obj, iF & 1048575), i(i10));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.f(i11, (AbstractC10730b0) T1.k(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.i(i11, J(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.zzi(i11, J(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.a(i11, J(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.j(i11, g(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.c(i11, J(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.h(i11, g(obj, iF & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(obj, i11, i10)) {
                        interfaceC10749c2.e(i11, T1.k(obj, iF & 1048575), i(i10));
                        break;
                    } else {
                        break;
                    }
            }
        }
        J1 j12 = this.f84028m;
        j12.p(j12.d(obj), interfaceC10749c2);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final int zza(Object obj) {
        return this.f84023h ? I(obj) : H(obj);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final int zzb(Object obj) {
        int i10;
        int iC;
        int length = this.f84016a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iF = f(i12);
            int i13 = this.f84016a[i12];
            long j10 = 1048575 & iF;
            int iHashCode = 37;
            switch (e(iF)) {
                case 0:
                    i10 = i11 * 53;
                    iC = J0.c(Double.doubleToLongBits(T1.f(obj, j10)));
                    i11 = i10 + iC;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iC = Float.floatToIntBits(T1.g(obj, j10));
                    i11 = i10 + iC;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iC = J0.c(T1.i(obj, j10));
                    i11 = i10 + iC;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iC = J0.c(T1.i(obj, j10));
                    i11 = i10 + iC;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iC = T1.h(obj, j10);
                    i11 = i10 + iC;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iC = J0.c(T1.i(obj, j10));
                    i11 = i10 + iC;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iC = T1.h(obj, j10);
                    i11 = i10 + iC;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iC = J0.a(T1.B(obj, j10));
                    i11 = i10 + iC;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iC = ((String) T1.k(obj, j10)).hashCode();
                    i11 = i10 + iC;
                    break;
                case 9:
                    Object objK = T1.k(obj, j10);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iC = T1.k(obj, j10).hashCode();
                    i11 = i10 + iC;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iC = T1.h(obj, j10);
                    i11 = i10 + iC;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iC = T1.h(obj, j10);
                    i11 = i10 + iC;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iC = T1.h(obj, j10);
                    i11 = i10 + iC;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iC = J0.c(T1.i(obj, j10));
                    i11 = i10 + iC;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iC = T1.h(obj, j10);
                    i11 = i10 + iC;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iC = J0.c(T1.i(obj, j10));
                    i11 = i10 + iC;
                    break;
                case 17:
                    Object objK2 = T1.k(obj, j10);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iC = T1.k(obj, j10).hashCode();
                    i11 = i10 + iC;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iC = T1.k(obj, j10).hashCode();
                    i11 = i10 + iC;
                    break;
                case 51:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J0.c(Double.doubleToLongBits(F(obj, j10)));
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = Float.floatToIntBits(G(obj, j10));
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J0.c(g(obj, j10));
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J0.c(g(obj, j10));
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J(obj, j10);
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J0.c(g(obj, j10));
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J(obj, j10);
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J0.a(z(obj, j10));
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = ((String) T1.k(obj, j10)).hashCode();
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = T1.k(obj, j10).hashCode();
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = T1.k(obj, j10).hashCode();
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J(obj, j10);
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J(obj, j10);
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J(obj, j10);
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J0.c(g(obj, j10));
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J(obj, j10);
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = J0.c(g(obj, j10));
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iC = T1.k(obj, j10).hashCode();
                        i11 = i10 + iC;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f84028m.d(obj).hashCode();
        if (!this.f84021f) {
            return iHashCode2;
        }
        this.f84029n.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final Object zze() {
        return ((B0) this.f84020e).r(4, null, null);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.f84025j;
        while (true) {
            i10 = this.f84026k;
            if (i11 >= i10) {
                break;
            }
            long jF = f(this.f84024i[i11]) & 1048575;
            Object objK = T1.k(obj, jF);
            if (objK != null) {
                ((Z0) objK).c();
                T1.x(obj, jF, objK);
            }
            i11++;
        }
        int length = this.f84024i.length;
        while (i10 < length) {
            this.f84027l.b(obj, this.f84024i[i10]);
            i10++;
        }
        this.f84028m.m(obj);
        if (this.f84021f) {
            this.f84029n.e(obj);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final boolean zzk(Object obj, Object obj2) {
        boolean z10;
        int length = this.f84016a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iF = f(i10);
            long j10 = iF & 1048575;
            switch (e(iF)) {
                case 0:
                    if (!t(obj, obj2, i10) || Double.doubleToLongBits(T1.f(obj, j10)) != Double.doubleToLongBits(T1.f(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!t(obj, obj2, i10) || Float.floatToIntBits(T1.g(obj, j10)) != Float.floatToIntBits(T1.g(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!t(obj, obj2, i10) || T1.i(obj, j10) != T1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!t(obj, obj2, i10) || T1.i(obj, j10) != T1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!t(obj, obj2, i10) || T1.h(obj, j10) != T1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!t(obj, obj2, i10) || T1.i(obj, j10) != T1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!t(obj, obj2, i10) || T1.h(obj, j10) != T1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!t(obj, obj2, i10) || T1.B(obj, j10) != T1.B(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!t(obj, obj2, i10) || !C11038u1.z(T1.k(obj, j10), T1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!t(obj, obj2, i10) || !C11038u1.z(T1.k(obj, j10), T1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!t(obj, obj2, i10) || !C11038u1.z(T1.k(obj, j10), T1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!t(obj, obj2, i10) || T1.h(obj, j10) != T1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!t(obj, obj2, i10) || T1.h(obj, j10) != T1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!t(obj, obj2, i10) || T1.h(obj, j10) != T1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!t(obj, obj2, i10) || T1.i(obj, j10) != T1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!t(obj, obj2, i10) || T1.h(obj, j10) != T1.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!t(obj, obj2, i10) || T1.i(obj, j10) != T1.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!t(obj, obj2, i10) || !C11038u1.z(T1.k(obj, j10), T1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z10 = C11038u1.z(T1.k(obj, j10), T1.k(obj2, j10));
                    break;
                case 50:
                    z10 = C11038u1.z(T1.k(obj, j10), T1.k(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jQ = Q(i10) & 1048575;
                    if (T1.h(obj, jQ) != T1.h(obj2, jQ) || !C11038u1.z(T1.k(obj, j10), T1.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!z10) {
                return false;
            }
        }
        if (!this.f84028m.d(obj).equals(this.f84028m.d(obj2))) {
            return false;
        }
        if (!this.f84021f) {
            return true;
        }
        this.f84029n.a(obj);
        this.f84029n.a(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.C10863j1.zzl(java.lang.Object):boolean");
    }

    private C10863j1(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC10815g1 interfaceC10815g1, boolean z10, boolean z11, int[] iArr2, int i12, int i13, C10895l1 c10895l1, T0 t02, J1 j12, AbstractC10974q0 abstractC10974q0, C10731b1 c10731b1, byte[] bArr) {
        this.f84016a = iArr;
        this.f84017b = objArr;
        this.f84018c = i10;
        this.f84019d = i11;
        this.f84022g = interfaceC10815g1 instanceof B0;
        this.f84023h = z10;
        boolean z12 = false;
        if (abstractC10974q0 != null && abstractC10974q0.h(interfaceC10815g1)) {
            z12 = true;
        }
        this.f84021f = z12;
        this.f84024i = iArr2;
        this.f84025j = i12;
        this.f84026k = i13;
        this.f84030o = c10895l1;
        this.f84027l = t02;
        this.f84028m = j12;
        this.f84029n = abstractC10974q0;
        this.f84020e = interfaceC10815g1;
        this.f84031p = c10731b1;
    }

    private static double F(Object obj, long j10) {
        return ((Double) T1.k(obj, j10)).doubleValue();
    }

    private static float G(Object obj, long j10) {
        return ((Float) T1.k(obj, j10)).floatValue();
    }

    private static int J(Object obj, long j10) {
        return ((Integer) T1.k(obj, j10)).intValue();
    }

    private static long g(Object obj, long j10) {
        return ((Long) T1.k(obj, j10)).longValue();
    }

    private static Field l(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void m(Object obj, Object obj2, int i10) {
        long jF = f(i10) & 1048575;
        if (v(obj2, i10)) {
            Object objK = T1.k(obj, jF);
            Object objK2 = T1.k(obj2, jF);
            if (objK != null && objK2 != null) {
                T1.x(obj, jF, J0.g(objK, objK2));
                p(obj, i10);
            } else if (objK2 != null) {
                T1.x(obj, jF, objK2);
                p(obj, i10);
            }
        }
    }

    private final void n(Object obj, Object obj2, int i10) {
        Object objK;
        int iF = f(i10);
        int i11 = this.f84016a[i10];
        long j10 = iF & 1048575;
        if (y(obj2, i11, i10)) {
            if (y(obj, i11, i10)) {
                objK = T1.k(obj, j10);
            } else {
                objK = null;
            }
            Object objK2 = T1.k(obj2, j10);
            if (objK != null && objK2 != null) {
                T1.x(obj, j10, J0.g(objK, objK2));
                q(obj, i11, i10);
            } else if (objK2 != null) {
                T1.x(obj, j10, objK2);
                q(obj, i11, i10);
            }
        }
    }

    private final void o(Object obj, int i10, InterfaceC10990r1 interfaceC10990r1) throws IOException {
        if (u(i10)) {
            T1.x(obj, i10 & 1048575, interfaceC10990r1.zzu());
        } else if (this.f84022g) {
            T1.x(obj, i10 & 1048575, interfaceC10990r1.zzt());
        } else {
            T1.x(obj, i10 & 1048575, interfaceC10990r1.zzp());
        }
    }

    private final void p(Object obj, int i10) {
        int iQ = Q(i10);
        long j10 = 1048575 & iQ;
        if (j10 == 1048575) {
            return;
        }
        T1.v(obj, j10, (1 << (iQ >>> 20)) | T1.h(obj, j10));
    }

    private final void q(Object obj, int i10, int i11) {
        T1.v(obj, Q(i11) & 1048575, i10);
    }

    private final boolean t(Object obj, Object obj2, int i10) {
        if (v(obj, i10) == v(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean v(Object obj, int i10) {
        int iQ = Q(i10);
        long j10 = iQ & 1048575;
        if (j10 == 1048575) {
            int iF = f(i10);
            long j11 = iF & 1048575;
            switch (e(iF)) {
                case 0:
                    if (Double.doubleToRawLongBits(T1.f(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(T1.g(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (T1.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (T1.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (T1.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (T1.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (T1.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return T1.B(obj, j11);
                case 8:
                    Object objK = T1.k(obj, j11);
                    if (objK instanceof String) {
                        if (((String) objK).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objK instanceof AbstractC10730b0) {
                        if (AbstractC10730b0.f83895b.equals(objK)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (T1.k(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC10730b0.f83895b.equals(T1.k(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (T1.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (T1.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (T1.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (T1.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (T1.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (T1.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (T1.k(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((T1.h(obj, j10) & (1 << (iQ >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean w(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return v(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean x(Object obj, int i10, InterfaceC11006s1 interfaceC11006s1) {
        return interfaceC11006s1.zzl(T1.k(obj, i10 & 1048575));
    }

    private final boolean y(Object obj, int i10, int i11) {
        if (T1.h(obj, Q(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean z(Object obj, long j10) {
        return ((Boolean) T1.k(obj, j10)).booleanValue();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void c(Object obj, InterfaceC10990r1 interfaceC10990r1, C10958p0 c10958p0) throws IOException {
        Object objC;
        c10958p0.getClass();
        J1 j12 = this.f84028m;
        AbstractC10974q0 abstractC10974q0 = this.f84029n;
        C11037u0 c11037u0B = null;
        Object objJ = null;
        while (true) {
            try {
                int iZzc = interfaceC10990r1.zzc();
                int iO = O(iZzc);
                if (iO < 0) {
                    if (iZzc == Integer.MAX_VALUE) {
                        for (int i10 = this.f84025j; i10 < this.f84026k; i10++) {
                            objJ = j(obj, this.f84024i[i10], objJ, j12);
                        }
                        if (objJ != null) {
                            j12.n(obj, objJ);
                            return;
                        }
                        return;
                    }
                    if (!this.f84021f) {
                        objC = null;
                    } else {
                        objC = abstractC10974q0.c(c10958p0, this.f84020e, iZzc);
                    }
                    if (objC != null) {
                        if (c11037u0B == null) {
                            c11037u0B = abstractC10974q0.b(obj);
                        }
                        C10958p0 c10958p02 = c10958p0;
                        C11037u0 c11037u0 = c11037u0B;
                        InterfaceC10990r1 interfaceC10990r12 = interfaceC10990r1;
                        objJ = abstractC10974q0.d(interfaceC10990r12, objC, c10958p02, c11037u0, objJ, j12);
                        interfaceC10990r1 = interfaceC10990r12;
                        c10958p0 = c10958p02;
                        c11037u0B = c11037u0;
                    } else {
                        j12.r(interfaceC10990r1);
                        if (objJ == null) {
                            objJ = j12.c(obj);
                        }
                        if (!j12.q(objJ, interfaceC10990r1)) {
                            for (int i11 = this.f84025j; i11 < this.f84026k; i11++) {
                                objJ = j(obj, this.f84024i[i11], objJ, j12);
                            }
                            if (objJ != null) {
                                j12.n(obj, objJ);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int iF = f(iO);
                    try {
                        switch (e(iF)) {
                            case 0:
                                T1.t(obj, iF & 1048575, interfaceC10990r1.zza());
                                p(obj, iO);
                                break;
                            case 1:
                                T1.u(obj, iF & 1048575, interfaceC10990r1.zzb());
                                p(obj, iO);
                                break;
                            case 2:
                                T1.w(obj, iF & 1048575, interfaceC10990r1.zzl());
                                p(obj, iO);
                                break;
                            case 3:
                                T1.w(obj, iF & 1048575, interfaceC10990r1.zzo());
                                p(obj, iO);
                                break;
                            case 4:
                                T1.v(obj, iF & 1048575, interfaceC10990r1.zzg());
                                p(obj, iO);
                                break;
                            case 5:
                                T1.w(obj, iF & 1048575, interfaceC10990r1.zzk());
                                p(obj, iO);
                                break;
                            case 6:
                                T1.v(obj, iF & 1048575, interfaceC10990r1.zzf());
                                p(obj, iO);
                                break;
                            case 7:
                                T1.r(obj, iF & 1048575, interfaceC10990r1.zzN());
                                p(obj, iO);
                                break;
                            case 8:
                                o(obj, iF, interfaceC10990r1);
                                p(obj, iO);
                                break;
                            case 9:
                                if (v(obj, iO)) {
                                    long j10 = iF & 1048575;
                                    T1.x(obj, j10, J0.g(T1.k(obj, j10), interfaceC10990r1.d(i(iO), c10958p0)));
                                    break;
                                } else {
                                    T1.x(obj, iF & 1048575, interfaceC10990r1.d(i(iO), c10958p0));
                                    p(obj, iO);
                                    break;
                                }
                            case 10:
                                T1.x(obj, iF & 1048575, interfaceC10990r1.zzp());
                                p(obj, iO);
                                break;
                            case 11:
                                T1.v(obj, iF & 1048575, interfaceC10990r1.zzj());
                                p(obj, iO);
                                break;
                            case 12:
                                int iZze = interfaceC10990r1.zze();
                                G0 g0H = h(iO);
                                if (g0H != null && !g0H.zza(iZze)) {
                                    objJ = C11038u1.d(iZzc, iZze, objJ, j12);
                                    break;
                                } else {
                                    T1.v(obj, iF & 1048575, iZze);
                                    p(obj, iO);
                                    break;
                                }
                                break;
                            case 13:
                                T1.v(obj, iF & 1048575, interfaceC10990r1.zzh());
                                p(obj, iO);
                                break;
                            case 14:
                                T1.w(obj, iF & 1048575, interfaceC10990r1.zzm());
                                p(obj, iO);
                                break;
                            case 15:
                                T1.v(obj, iF & 1048575, interfaceC10990r1.zzi());
                                p(obj, iO);
                                break;
                            case 16:
                                T1.w(obj, iF & 1048575, interfaceC10990r1.zzn());
                                p(obj, iO);
                                break;
                            case 17:
                                if (v(obj, iO)) {
                                    long j11 = iF & 1048575;
                                    T1.x(obj, j11, J0.g(T1.k(obj, j11), interfaceC10990r1.b(i(iO), c10958p0)));
                                    break;
                                } else {
                                    T1.x(obj, iF & 1048575, interfaceC10990r1.b(i(iO), c10958p0));
                                    p(obj, iO);
                                    break;
                                }
                            case 18:
                                interfaceC10990r1.zzx(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 19:
                                interfaceC10990r1.zzB(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 20:
                                interfaceC10990r1.zzE(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 21:
                                interfaceC10990r1.zzM(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                                interfaceC10990r1.zzD(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 23:
                                interfaceC10990r1.zzA(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 24:
                                interfaceC10990r1.zzz(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 25:
                                interfaceC10990r1.zzv(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 26:
                                if (u(iF)) {
                                    ((C10830h0) interfaceC10990r1).f(this.f84027l.a(obj, iF & 1048575), true);
                                    break;
                                } else {
                                    ((C10830h0) interfaceC10990r1).f(this.f84027l.a(obj, iF & 1048575), false);
                                    break;
                                }
                            case 27:
                                interfaceC10990r1.e(this.f84027l.a(obj, iF & 1048575), i(iO), c10958p0);
                                break;
                            case 28:
                                interfaceC10990r1.zzw(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 29:
                                interfaceC10990r1.zzL(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 30:
                                List listA = this.f84027l.a(obj, iF & 1048575);
                                interfaceC10990r1.zzy(listA);
                                objJ = C11038u1.c(iZzc, listA, h(iO), objJ, j12);
                                break;
                            case 31:
                                interfaceC10990r1.zzG(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                                interfaceC10990r1.zzH(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 33:
                                interfaceC10990r1.zzI(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 34:
                                interfaceC10990r1.zzJ(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 35:
                                interfaceC10990r1.zzx(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 36:
                                interfaceC10990r1.zzB(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 37:
                                interfaceC10990r1.zzE(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 38:
                                interfaceC10990r1.zzM(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 39:
                                interfaceC10990r1.zzD(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 40:
                                interfaceC10990r1.zzA(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 41:
                                interfaceC10990r1.zzz(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 42:
                                interfaceC10990r1.zzv(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 43:
                                interfaceC10990r1.zzL(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 44:
                                List listA2 = this.f84027l.a(obj, iF & 1048575);
                                interfaceC10990r1.zzy(listA2);
                                objJ = C11038u1.c(iZzc, listA2, h(iO), objJ, j12);
                                break;
                            case 45:
                                interfaceC10990r1.zzG(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 46:
                                interfaceC10990r1.zzH(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 47:
                                interfaceC10990r1.zzI(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 48:
                                interfaceC10990r1.zzJ(this.f84027l.a(obj, iF & 1048575));
                                break;
                            case 49:
                                interfaceC10990r1.a(this.f84027l.a(obj, iF & 1048575), i(iO), c10958p0);
                                break;
                            case 50:
                                Object objK = k(iO);
                                long jF = f(iO) & 1048575;
                                Object objK2 = T1.k(obj, jF);
                                if (objK2 != null) {
                                    if (C10731b1.b(objK2)) {
                                        Object objB = Z0.a().b();
                                        C10731b1.c(objB, objK2);
                                        T1.x(obj, jF, objB);
                                        objK2 = objB;
                                    }
                                } else {
                                    objK2 = Z0.a().b();
                                    T1.x(obj, jF, objK2);
                                }
                                throw null;
                                break;
                            case 51:
                                T1.x(obj, iF & 1048575, Double.valueOf(interfaceC10990r1.zza()));
                                q(obj, iZzc, iO);
                                break;
                            case 52:
                                T1.x(obj, iF & 1048575, Float.valueOf(interfaceC10990r1.zzb()));
                                q(obj, iZzc, iO);
                                break;
                            case 53:
                                T1.x(obj, iF & 1048575, Long.valueOf(interfaceC10990r1.zzl()));
                                q(obj, iZzc, iO);
                                break;
                            case 54:
                                T1.x(obj, iF & 1048575, Long.valueOf(interfaceC10990r1.zzo()));
                                q(obj, iZzc, iO);
                                break;
                            case 55:
                                T1.x(obj, iF & 1048575, Integer.valueOf(interfaceC10990r1.zzg()));
                                q(obj, iZzc, iO);
                                break;
                            case 56:
                                T1.x(obj, iF & 1048575, Long.valueOf(interfaceC10990r1.zzk()));
                                q(obj, iZzc, iO);
                                break;
                            case 57:
                                T1.x(obj, iF & 1048575, Integer.valueOf(interfaceC10990r1.zzf()));
                                q(obj, iZzc, iO);
                                break;
                            case 58:
                                T1.x(obj, iF & 1048575, Boolean.valueOf(interfaceC10990r1.zzN()));
                                q(obj, iZzc, iO);
                                break;
                            case 59:
                                o(obj, iF, interfaceC10990r1);
                                q(obj, iZzc, iO);
                                break;
                            case 60:
                                if (y(obj, iZzc, iO)) {
                                    long j13 = iF & 1048575;
                                    T1.x(obj, j13, J0.g(T1.k(obj, j13), interfaceC10990r1.d(i(iO), c10958p0)));
                                } else {
                                    T1.x(obj, iF & 1048575, interfaceC10990r1.d(i(iO), c10958p0));
                                    p(obj, iO);
                                }
                                q(obj, iZzc, iO);
                                break;
                            case 61:
                                T1.x(obj, iF & 1048575, interfaceC10990r1.zzp());
                                q(obj, iZzc, iO);
                                break;
                            case 62:
                                T1.x(obj, iF & 1048575, Integer.valueOf(interfaceC10990r1.zzj()));
                                q(obj, iZzc, iO);
                                break;
                            case 63:
                                int iZze2 = interfaceC10990r1.zze();
                                G0 g0H2 = h(iO);
                                if (g0H2 != null && !g0H2.zza(iZze2)) {
                                    objJ = C11038u1.d(iZzc, iZze2, objJ, j12);
                                    break;
                                } else {
                                    T1.x(obj, iF & 1048575, Integer.valueOf(iZze2));
                                    q(obj, iZzc, iO);
                                    break;
                                }
                            case 64:
                                T1.x(obj, iF & 1048575, Integer.valueOf(interfaceC10990r1.zzh()));
                                q(obj, iZzc, iO);
                                break;
                            case 65:
                                T1.x(obj, iF & 1048575, Long.valueOf(interfaceC10990r1.zzm()));
                                q(obj, iZzc, iO);
                                break;
                            case 66:
                                T1.x(obj, iF & 1048575, Integer.valueOf(interfaceC10990r1.zzi()));
                                q(obj, iZzc, iO);
                                break;
                            case 67:
                                T1.x(obj, iF & 1048575, Long.valueOf(interfaceC10990r1.zzn()));
                                q(obj, iZzc, iO);
                                break;
                            case 68:
                                T1.x(obj, iF & 1048575, interfaceC10990r1.b(i(iO), c10958p0));
                                q(obj, iZzc, iO);
                                break;
                            default:
                                if (objJ == null) {
                                    objJ = j12.f();
                                }
                                if (!j12.q(objJ, interfaceC10990r1)) {
                                    for (int i12 = this.f84025j; i12 < this.f84026k; i12++) {
                                        objJ = j(obj, this.f84024i[i12], objJ, j12);
                                    }
                                    if (objJ != null) {
                                        j12.n(obj, objJ);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzadh unused) {
                        j12.r(interfaceC10990r1);
                        if (objJ == null) {
                            objJ = j12.c(obj);
                        }
                        if (!j12.q(objJ, interfaceC10990r1)) {
                            for (int i13 = this.f84025j; i13 < this.f84026k; i13++) {
                                objJ = j(obj, this.f84024i[i13], objJ, j12);
                            }
                            if (objJ != null) {
                                j12.n(obj, objJ);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                for (int i14 = this.f84025j; i14 < this.f84026k; i14++) {
                    objJ = j(obj, this.f84024i[i14], objJ, j12);
                }
                if (objJ != null) {
                    j12.n(obj, objJ);
                    throw th2;
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11006s1
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.f84016a.length; i10 += 3) {
            int iF = f(i10);
            long j10 = 1048575 & iF;
            int i11 = this.f84016a[i10];
            switch (e(iF)) {
                case 0:
                    if (v(obj2, i10)) {
                        T1.t(obj, j10, T1.f(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(obj2, i10)) {
                        T1.u(obj, j10, T1.g(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(obj2, i10)) {
                        T1.w(obj, j10, T1.i(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(obj2, i10)) {
                        T1.w(obj, j10, T1.i(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(obj2, i10)) {
                        T1.v(obj, j10, T1.h(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(obj2, i10)) {
                        T1.w(obj, j10, T1.i(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(obj2, i10)) {
                        T1.v(obj, j10, T1.h(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(obj2, i10)) {
                        T1.r(obj, j10, T1.B(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(obj2, i10)) {
                        T1.x(obj, j10, T1.k(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m(obj, obj2, i10);
                    break;
                case 10:
                    if (v(obj2, i10)) {
                        T1.x(obj, j10, T1.k(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(obj2, i10)) {
                        T1.v(obj, j10, T1.h(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(obj2, i10)) {
                        T1.v(obj, j10, T1.h(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(obj2, i10)) {
                        T1.v(obj, j10, T1.h(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(obj2, i10)) {
                        T1.w(obj, j10, T1.i(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(obj2, i10)) {
                        T1.v(obj, j10, T1.h(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(obj2, i10)) {
                        T1.w(obj, j10, T1.i(obj2, j10));
                        p(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f84027l.c(obj, obj2, j10);
                    break;
                case 50:
                    C11038u1.B(this.f84031p, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (y(obj2, i11, i10)) {
                        T1.x(obj, j10, T1.k(obj2, j10));
                        q(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    n(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (y(obj2, i11, i10)) {
                        T1.x(obj, j10, T1.k(obj2, j10));
                        q(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    n(obj, obj2, i10);
                    break;
            }
        }
        C11038u1.f(this.f84028m, obj, obj2);
        if (this.f84021f) {
            C11038u1.e(this.f84029n, obj, obj2);
        }
    }
}
