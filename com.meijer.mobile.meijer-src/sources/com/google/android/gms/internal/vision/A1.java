package com.google.android.gms.internal.vision;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class A1<T> implements O1<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f85103r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f85104s = l2.t();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f85105a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f85106b;

    /* renamed from: c, reason: collision with root package name */
    private final int f85107c;

    /* renamed from: d, reason: collision with root package name */
    private final int f85108d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC11208w1 f85109e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f85110f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f85111g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f85112h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f85113i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f85114j;

    /* renamed from: k, reason: collision with root package name */
    private final int f85115k;

    /* renamed from: l, reason: collision with root package name */
    private final int f85116l;

    /* renamed from: m, reason: collision with root package name */
    private final D1 f85117m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC11154f1 f85118n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC11155f2<?, ?> f85119o;

    /* renamed from: p, reason: collision with root package name */
    private final C0<?> f85120p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC11199t1 f85121q;

    private final int g(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C11145d0 c11145d0) throws IOException {
        int i18;
        int i19;
        int iK;
        Object object;
        Unsafe unsafe = f85104s;
        long j11 = this.f85105a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                unsafe.putObject(t10, j10, Double.valueOf(C11141c0.m(bArr, i10)));
                iK = i18 + 8;
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 52:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                unsafe.putObject(t10, j10, Float.valueOf(C11141c0.o(bArr, i10)));
                iK = i19 + 4;
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                iK = C11141c0.k(bArr, i10, c11145d0);
                unsafe.putObject(t10, j10, Long.valueOf(c11145d0.f85360b));
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                iK = C11141c0.i(bArr, i10, c11145d0);
                unsafe.putObject(t10, j10, Integer.valueOf(c11145d0.f85359a));
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 56:
            case 65:
                i18 = i10;
                if (i14 != 1) {
                    return i18;
                }
                unsafe.putObject(t10, j10, Long.valueOf(C11141c0.l(bArr, i10)));
                iK = i18 + 8;
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 57:
            case 64:
                i19 = i10;
                if (i14 != 5) {
                    return i19;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(C11141c0.h(bArr, i10)));
                iK = i19 + 4;
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                iK = C11141c0.k(bArr, i10, c11145d0);
                unsafe.putObject(t10, j10, Boolean.valueOf(c11145d0.f85360b != 0));
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int i20 = C11141c0.i(bArr, i10, c11145d0);
                int i21 = c11145d0.f85359a;
                if (i21 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !o2.g(bArr, i20, i20 + i21)) {
                        throw zzjk.f();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, i20, i21, S0.f85305a));
                    i20 += i21;
                }
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iG = C11141c0.g(l(i17), bArr, i10, i11, c11145d0);
                object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object == null) {
                    unsafe.putObject(t10, j10, c11145d0.f85361c);
                } else {
                    unsafe.putObject(t10, j10, S0.e(object, c11145d0.f85361c));
                }
                unsafe.putInt(t10, j11, i13);
                return iG;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                iK = C11141c0.q(bArr, i10, c11145d0);
                unsafe.putObject(t10, j10, c11145d0.f85361c);
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int i22 = C11141c0.i(bArr, i10, c11145d0);
                int i23 = c11145d0.f85359a;
                T0 t0G = G(i17);
                if (t0G != null && !t0G.zza(i23)) {
                    M(t10).c(i12, Long.valueOf(i23));
                    return i22;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(i23));
                iK = i22;
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                iK = C11141c0.i(bArr, i10, c11145d0);
                unsafe.putObject(t10, j10, Integer.valueOf(AbstractC11201u0.d(c11145d0.f85359a)));
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                iK = C11141c0.k(bArr, i10, c11145d0);
                unsafe.putObject(t10, j10, Long.valueOf(AbstractC11201u0.a(c11145d0.f85360b)));
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 68:
                if (i14 == 3) {
                    iK = C11141c0.f(l(i17), bArr, i10, i11, (i12 & (-8)) | 4, c11145d0);
                    object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t10, j10, c11145d0.f85361c);
                    } else {
                        unsafe.putObject(t10, j10, S0.e(object, c11145d0.f85361c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return iK;
                }
            default:
                return i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int h(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C11145d0 c11145d0) throws IOException {
        int i17;
        int i18;
        int iB;
        Unsafe unsafe = f85104s;
        X0 x0Zza = (X0) unsafe.getObject(t10, j11);
        if (!x0Zza.zza()) {
            int size = x0Zza.size();
            x0Zza = x0Zza.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(t10, j11, x0Zza);
        }
        X0 x02 = x0Zza;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    C11216z0 c11216z0 = (C11216z0) x02;
                    int i19 = C11141c0.i(bArr, i10, c11145d0);
                    int i20 = c11145d0.f85359a + i19;
                    while (i19 < i20) {
                        c11216z0.e(C11141c0.m(bArr, i19));
                        i19 += 8;
                    }
                    if (i19 == i20) {
                        return i19;
                    }
                    throw zzjk.a();
                }
                if (i14 != 1) {
                    return i10;
                }
                C11216z0 c11216z02 = (C11216z0) x02;
                c11216z02.e(C11141c0.m(bArr, i10));
                int i21 = i10 + 8;
                while (i21 < i11) {
                    int i22 = C11141c0.i(bArr, i21, c11145d0);
                    if (i12 != c11145d0.f85359a) {
                        return i21;
                    }
                    c11216z02.e(C11141c0.m(bArr, i22));
                    i21 = i22 + 8;
                }
                return i21;
            case 19:
            case 36:
                if (i14 == 2) {
                    N0 n02 = (N0) x02;
                    int i23 = C11141c0.i(bArr, i10, c11145d0);
                    int i24 = c11145d0.f85359a + i23;
                    while (i23 < i24) {
                        n02.e(C11141c0.o(bArr, i23));
                        i23 += 4;
                    }
                    if (i23 == i24) {
                        return i23;
                    }
                    throw zzjk.a();
                }
                if (i14 != 5) {
                    return i10;
                }
                N0 n03 = (N0) x02;
                n03.e(C11141c0.o(bArr, i10));
                int i25 = i10 + 4;
                while (i25 < i11) {
                    int i26 = C11141c0.i(bArr, i25, c11145d0);
                    if (i12 != c11145d0.f85359a) {
                        return i25;
                    }
                    n03.e(C11141c0.o(bArr, i26));
                    i25 = i26 + 4;
                }
                return i25;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    C11170j1 c11170j1 = (C11170j1) x02;
                    int i27 = C11141c0.i(bArr, i10, c11145d0);
                    int i28 = c11145d0.f85359a + i27;
                    while (i27 < i28) {
                        i27 = C11141c0.k(bArr, i27, c11145d0);
                        c11170j1.e(c11145d0.f85360b);
                    }
                    if (i27 == i28) {
                        return i27;
                    }
                    throw zzjk.a();
                }
                if (i14 != 0) {
                    return i10;
                }
                C11170j1 c11170j12 = (C11170j1) x02;
                int iK = C11141c0.k(bArr, i10, c11145d0);
                c11170j12.e(c11145d0.f85360b);
                while (iK < i11) {
                    int i29 = C11141c0.i(bArr, iK, c11145d0);
                    if (i12 != c11145d0.f85359a) {
                        return iK;
                    }
                    iK = C11141c0.k(bArr, i29, c11145d0);
                    c11170j12.e(c11145d0.f85360b);
                }
                return iK;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 29:
            case 39:
            case 43:
                return i14 == 2 ? C11141c0.j(bArr, i10, x02, c11145d0) : i14 == 0 ? C11141c0.b(i12, bArr, i10, i11, x02, c11145d0) : i10;
            case 23:
            case l3.f93325e /* 32 */:
            case 40:
            case 46:
                if (i14 == 2) {
                    C11170j1 c11170j13 = (C11170j1) x02;
                    int i30 = C11141c0.i(bArr, i10, c11145d0);
                    int i31 = c11145d0.f85359a + i30;
                    while (i30 < i31) {
                        c11170j13.e(C11141c0.l(bArr, i30));
                        i30 += 8;
                    }
                    if (i30 == i31) {
                        return i30;
                    }
                    throw zzjk.a();
                }
                if (i14 != 1) {
                    return i10;
                }
                C11170j1 c11170j14 = (C11170j1) x02;
                c11170j14.e(C11141c0.l(bArr, i10));
                int i32 = i10 + 8;
                while (i32 < i11) {
                    int i33 = C11141c0.i(bArr, i32, c11145d0);
                    if (i12 != c11145d0.f85359a) {
                        return i32;
                    }
                    c11170j14.e(C11141c0.l(bArr, i33));
                    i32 = i33 + 8;
                }
                return i32;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    Q0 q02 = (Q0) x02;
                    int i34 = C11141c0.i(bArr, i10, c11145d0);
                    int i35 = c11145d0.f85359a + i34;
                    while (i34 < i35) {
                        q02.f(C11141c0.h(bArr, i34));
                        i34 += 4;
                    }
                    if (i34 == i35) {
                        return i34;
                    }
                    throw zzjk.a();
                }
                if (i14 != 5) {
                    return i10;
                }
                Q0 q03 = (Q0) x02;
                q03.f(C11141c0.h(bArr, i10));
                int i36 = i10 + 4;
                while (i36 < i11) {
                    int i37 = C11141c0.i(bArr, i36, c11145d0);
                    if (i12 != c11145d0.f85359a) {
                        return i36;
                    }
                    q03.f(C11141c0.h(bArr, i37));
                    i36 = i37 + 4;
                }
                return i36;
            case 25:
            case 42:
                if (i14 == 2) {
                    C11153f0 c11153f0 = (C11153f0) x02;
                    int i38 = C11141c0.i(bArr, i10, c11145d0);
                    int i39 = c11145d0.f85359a + i38;
                    while (i38 < i39) {
                        i38 = C11141c0.k(bArr, i38, c11145d0);
                        c11153f0.e(c11145d0.f85360b != 0);
                    }
                    if (i38 == i39) {
                        return i38;
                    }
                    throw zzjk.a();
                }
                if (i14 != 0) {
                    return i10;
                }
                C11153f0 c11153f02 = (C11153f0) x02;
                int iK2 = C11141c0.k(bArr, i10, c11145d0);
                c11153f02.e(c11145d0.f85360b != 0);
                while (iK2 < i11) {
                    int i40 = C11141c0.i(bArr, iK2, c11145d0);
                    if (i12 != c11145d0.f85359a) {
                        return iK2;
                    }
                    iK2 = C11141c0.k(bArr, i40, c11145d0);
                    c11153f02.e(c11145d0.f85360b != 0);
                }
                return iK2;
            case 26:
                if (i14 != 2) {
                    return i10;
                }
                if ((j10 & 536870912) == 0) {
                    int i41 = C11141c0.i(bArr, i10, c11145d0);
                    int i42 = c11145d0.f85359a;
                    if (i42 < 0) {
                        throw zzjk.b();
                    }
                    if (i42 == 0) {
                        x02.add("");
                    } else {
                        x02.add(new String(bArr, i41, i42, S0.f85305a));
                        i41 += i42;
                    }
                    while (i41 < i11) {
                        int i43 = C11141c0.i(bArr, i41, c11145d0);
                        if (i12 != c11145d0.f85359a) {
                            return i41;
                        }
                        i41 = C11141c0.i(bArr, i43, c11145d0);
                        int i44 = c11145d0.f85359a;
                        if (i44 < 0) {
                            throw zzjk.b();
                        }
                        if (i44 == 0) {
                            x02.add("");
                        } else {
                            x02.add(new String(bArr, i41, i44, S0.f85305a));
                            i41 += i44;
                        }
                    }
                    return i41;
                }
                int i45 = C11141c0.i(bArr, i10, c11145d0);
                int i46 = c11145d0.f85359a;
                if (i46 < 0) {
                    throw zzjk.b();
                }
                if (i46 == 0) {
                    x02.add("");
                } else {
                    int i47 = i45 + i46;
                    if (!o2.g(bArr, i45, i47)) {
                        throw zzjk.f();
                    }
                    x02.add(new String(bArr, i45, i46, S0.f85305a));
                    i45 = i47;
                }
                while (i45 < i11) {
                    int i48 = C11141c0.i(bArr, i45, c11145d0);
                    if (i12 != c11145d0.f85359a) {
                        return i45;
                    }
                    i45 = C11141c0.i(bArr, i48, c11145d0);
                    int i49 = c11145d0.f85359a;
                    if (i49 < 0) {
                        throw zzjk.b();
                    }
                    if (i49 == 0) {
                        x02.add("");
                    } else {
                        int i50 = i45 + i49;
                        if (!o2.g(bArr, i45, i50)) {
                            throw zzjk.f();
                        }
                        x02.add(new String(bArr, i45, i49, S0.f85305a));
                        i45 = i50;
                    }
                }
                return i45;
            case 27:
                i17 = i10;
                if (i14 == 2) {
                    return C11141c0.e(l(i15), i12, bArr, i17, i11, x02, c11145d0);
                }
                return i17;
            case 28:
                i17 = i10;
                if (i14 == 2) {
                    int i51 = C11141c0.i(bArr, i17, c11145d0);
                    int i52 = c11145d0.f85359a;
                    if (i52 < 0) {
                        throw zzjk.b();
                    }
                    if (i52 > bArr.length - i51) {
                        throw zzjk.a();
                    }
                    if (i52 == 0) {
                        x02.add(AbstractC11161h0.f85385b);
                    } else {
                        x02.add(AbstractC11161h0.m(bArr, i51, i52));
                        i51 += i52;
                    }
                    while (i51 < i11) {
                        int i53 = C11141c0.i(bArr, i51, c11145d0);
                        if (i12 != c11145d0.f85359a) {
                            return i51;
                        }
                        i51 = C11141c0.i(bArr, i53, c11145d0);
                        int i54 = c11145d0.f85359a;
                        if (i54 < 0) {
                            throw zzjk.b();
                        }
                        if (i54 > bArr.length - i51) {
                            throw zzjk.a();
                        }
                        if (i54 == 0) {
                            x02.add(AbstractC11161h0.f85385b);
                        } else {
                            x02.add(AbstractC11161h0.m(bArr, i51, i54));
                            i51 += i54;
                        }
                    }
                    return i51;
                }
                return i17;
            case 30:
            case 44:
                i18 = i10;
                if (i14 != 2) {
                    if (i14 == 0) {
                        iB = C11141c0.b(i12, bArr, i18, i11, x02, c11145d0);
                    }
                    return i18;
                }
                iB = C11141c0.j(bArr, i18, x02, c11145d0);
                O0 o02 = (O0) t10;
                C11163h2 c11163h2 = o02.zzb;
                if (c11163h2 == C11163h2.a()) {
                    c11163h2 = null;
                }
                C11163h2 c11163h22 = (C11163h2) P1.i(i13, x02, G(i15), c11163h2, this.f85119o);
                if (c11163h22 != null) {
                    o02.zzb = c11163h22;
                }
                return iB;
            case 33:
            case 47:
                i18 = i10;
                if (i14 == 2) {
                    Q0 q04 = (Q0) x02;
                    int i55 = C11141c0.i(bArr, i18, c11145d0);
                    int i56 = c11145d0.f85359a + i55;
                    while (i55 < i56) {
                        i55 = C11141c0.i(bArr, i55, c11145d0);
                        q04.f(AbstractC11201u0.d(c11145d0.f85359a));
                    }
                    if (i55 == i56) {
                        return i55;
                    }
                    throw zzjk.a();
                }
                if (i14 == 0) {
                    Q0 q05 = (Q0) x02;
                    int i57 = C11141c0.i(bArr, i18, c11145d0);
                    q05.f(AbstractC11201u0.d(c11145d0.f85359a));
                    while (i57 < i11) {
                        int i58 = C11141c0.i(bArr, i57, c11145d0);
                        if (i12 != c11145d0.f85359a) {
                            return i57;
                        }
                        i57 = C11141c0.i(bArr, i58, c11145d0);
                        q05.f(AbstractC11201u0.d(c11145d0.f85359a));
                    }
                    return i57;
                }
                return i18;
            case 34:
            case 48:
                i18 = i10;
                if (i14 == 2) {
                    C11170j1 c11170j15 = (C11170j1) x02;
                    int i59 = C11141c0.i(bArr, i18, c11145d0);
                    int i60 = c11145d0.f85359a + i59;
                    while (i59 < i60) {
                        i59 = C11141c0.k(bArr, i59, c11145d0);
                        c11170j15.e(AbstractC11201u0.a(c11145d0.f85360b));
                    }
                    if (i59 == i60) {
                        return i59;
                    }
                    throw zzjk.a();
                }
                if (i14 == 0) {
                    C11170j1 c11170j16 = (C11170j1) x02;
                    int iK3 = C11141c0.k(bArr, i18, c11145d0);
                    c11170j16.e(AbstractC11201u0.a(c11145d0.f85360b));
                    while (iK3 < i11) {
                        int i61 = C11141c0.i(bArr, iK3, c11145d0);
                        if (i12 != c11145d0.f85359a) {
                            return iK3;
                        }
                        iK3 = C11141c0.k(bArr, i61, c11145d0);
                        c11170j16.e(AbstractC11201u0.a(c11145d0.f85360b));
                    }
                    return iK3;
                }
                return i18;
            case 49:
                if (i14 == 3) {
                    O1 o1L = l(i15);
                    int i62 = (i12 & (-8)) | 4;
                    int iF = C11141c0.f(o1L, bArr, i10, i11, i62, c11145d0);
                    O1 o12 = o1L;
                    int i63 = i11;
                    C11145d0 c11145d02 = c11145d0;
                    x02.add(c11145d02.f85361c);
                    while (iF < i63) {
                        int i64 = C11141c0.i(bArr, iF, c11145d02);
                        if (i12 != c11145d02.f85359a) {
                            return iF;
                        }
                        O1 o13 = o12;
                        int i65 = i63;
                        C11145d0 c11145d03 = c11145d02;
                        iF = C11141c0.f(o13, bArr, i64, i65, i62, c11145d03);
                        x02.add(c11145d03.f85361c);
                        o12 = o13;
                        i63 = i65;
                        c11145d02 = c11145d03;
                    }
                    return iF;
                }
            default:
                return i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.vision.O1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(T r14, com.google.android.gms.internal.vision.C2 r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.A1.c(java.lang.Object, com.google.android.gms.internal.vision.C2):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0087. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.O1
    public final void d(T t10, byte[] bArr, int i10, int i11, C11145d0 c11145d0) throws IOException {
        T t11;
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        A1<T> a12 = this;
        T t12 = t10;
        byte[] bArr2 = bArr;
        int i22 = i11;
        C11145d0 c11145d02 = c11145d0;
        if (!a12.f85112h) {
            j(t12, bArr, i10, i22, 0, c11145d0);
            return;
        }
        Unsafe unsafe2 = f85104s;
        int i23 = -1;
        int iK = i10;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1048575;
        while (iK < i22) {
            int iD = iK + 1;
            int i28 = bArr2[iK];
            if (i28 < 0) {
                iD = C11141c0.d(i28, bArr2, iD, c11145d02);
                i28 = c11145d02.f85359a;
            }
            int i29 = iD;
            int i30 = i28 >>> 3;
            int i31 = i28 & 7;
            int iE = i30 > i24 ? a12.e(i30, i25 / 3) : a12.O(i30);
            if (iE == i23) {
                t11 = t12;
                unsafe = unsafe2;
                i12 = i28;
                i13 = i30;
                i14 = 0;
            } else {
                int[] iArr = a12.f85105a;
                int i32 = iArr[iE + 1];
                int i33 = (i32 & 267386880) >>> 20;
                int i34 = i28;
                int i35 = iE;
                long j10 = i32 & 1048575;
                if (i33 <= 17) {
                    int i36 = iArr[i35 + 2];
                    int i37 = 1 << (i36 >>> 20);
                    int i38 = i36 & 1048575;
                    int i39 = 1048575;
                    if (i38 != i27) {
                        if (i27 != 1048575) {
                            unsafe2.putInt(t12, i27, i26);
                            i39 = 1048575;
                        }
                        if (i38 != i39) {
                            i26 = unsafe2.getInt(t12, i38);
                        }
                        i27 = i38;
                    }
                    switch (i33) {
                        case 0:
                            i20 = i39;
                            if (i31 != 1) {
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                l2.f(t12, j10, C11141c0.m(bArr2, i29));
                                iK = i29 + 8;
                                i26 |= i37;
                                i22 = i11;
                                i24 = i30;
                                i25 = i35;
                                i23 = -1;
                                break;
                            }
                        case 1:
                            i20 = i39;
                            if (i31 != 5) {
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                l2.g(t12, j10, C11141c0.o(bArr2, i29));
                                iK = i29 + 4;
                                i26 |= i37;
                                i22 = i11;
                                i24 = i30;
                                i25 = i35;
                                i23 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i20 = i39;
                            if (i31 != 0) {
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                int iK2 = C11141c0.k(bArr2, i29, c11145d02);
                                Unsafe unsafe3 = unsafe2;
                                T t13 = t12;
                                unsafe3.putLong(t13, j10, c11145d02.f85360b);
                                unsafe2 = unsafe3;
                                t12 = t13;
                                i26 |= i37;
                                iK = iK2;
                                i24 = i30;
                                i25 = i35;
                                i23 = -1;
                                i22 = i11;
                                break;
                            }
                        case 4:
                        case 11:
                            i20 = i39;
                            if (i31 != 0) {
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                int i40 = C11141c0.i(bArr2, i29, c11145d02);
                                unsafe2.putInt(t12, j10, c11145d02.f85359a);
                                i26 |= i37;
                                i22 = i11;
                                iK = i40;
                                i24 = i30;
                                i25 = i35;
                                i23 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i20 = i39;
                            if (i31 != 1) {
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                T t14 = t12;
                                unsafe4.putLong(t14, j10, C11141c0.l(bArr2, i29));
                                unsafe2 = unsafe4;
                                t12 = t14;
                                iK = i29 + 8;
                                i26 |= i37;
                                i22 = i11;
                                i24 = i30;
                                i25 = i35;
                                i23 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i20 = i39;
                            if (i31 != 5) {
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                unsafe2.putInt(t12, j10, C11141c0.h(bArr2, i29));
                                iK = i29 + 4;
                                i26 |= i37;
                                i22 = i11;
                                i24 = i30;
                                i25 = i35;
                                i23 = -1;
                                break;
                            }
                        case 7:
                            i20 = i39;
                            if (i31 != 0) {
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                iK = C11141c0.k(bArr2, i29, c11145d02);
                                l2.k(t12, j10, c11145d02.f85360b != 0);
                                i26 |= i37;
                                i22 = i11;
                                i24 = i30;
                                i25 = i35;
                                i23 = -1;
                                break;
                            }
                        case 8:
                            i20 = i39;
                            if (i31 != 2) {
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                iK = (536870912 & i32) == 0 ? C11141c0.n(bArr2, i29, c11145d02) : C11141c0.p(bArr2, i29, c11145d02);
                                unsafe2.putObject(t12, j10, c11145d02.f85361c);
                                i26 |= i37;
                                i24 = i30;
                                i25 = i35;
                                i23 = -1;
                                break;
                            }
                        case 9:
                            i20 = i39;
                            i21 = i35;
                            if (i31 != 2) {
                                i35 = i21;
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                iK = C11141c0.g(a12.l(i21), bArr2, i29, i22, c11145d02);
                                Object object = unsafe2.getObject(t12, j10);
                                if (object == null) {
                                    unsafe2.putObject(t12, j10, c11145d02.f85361c);
                                } else {
                                    unsafe2.putObject(t12, j10, S0.e(object, c11145d02.f85361c));
                                }
                                i26 |= i37;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 10:
                            i20 = i39;
                            i21 = i35;
                            if (i31 != 2) {
                                i35 = i21;
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                iK = C11141c0.q(bArr2, i29, c11145d02);
                                unsafe2.putObject(t12, j10, c11145d02.f85361c);
                                i26 |= i37;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 12:
                            i20 = i39;
                            i21 = i35;
                            if (i31 != 0) {
                                i35 = i21;
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                iK = C11141c0.i(bArr2, i29, c11145d02);
                                unsafe2.putInt(t12, j10, c11145d02.f85359a);
                                i26 |= i37;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 15:
                            i20 = i39;
                            i21 = i35;
                            if (i31 != 0) {
                                i35 = i21;
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                iK = C11141c0.i(bArr2, i29, c11145d02);
                                unsafe2.putInt(t12, j10, AbstractC11201u0.d(c11145d02.f85359a));
                                i26 |= i37;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        case 16:
                            if (i31 != 0) {
                                i20 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i13 = i30;
                                i14 = i35;
                                i12 = i34;
                                break;
                            } else {
                                int iK3 = C11141c0.k(bArr2, i29, c11145d02);
                                Unsafe unsafe5 = unsafe2;
                                T t15 = t12;
                                i21 = i35;
                                unsafe5.putLong(t15, j10, AbstractC11201u0.a(c11145d02.f85360b));
                                unsafe2 = unsafe5;
                                t12 = t15;
                                i26 |= i37;
                                iK = iK3;
                                i24 = i30;
                                i25 = i21;
                                i23 = -1;
                                break;
                            }
                        default:
                            i20 = i39;
                            t11 = t12;
                            unsafe = unsafe2;
                            i13 = i30;
                            i14 = i35;
                            i12 = i34;
                            break;
                    }
                } else {
                    i14 = i35;
                    if (i33 != 27) {
                        i15 = i29;
                        Unsafe unsafe6 = unsafe2;
                        if (i33 <= 49) {
                            int i41 = i27;
                            i16 = i26;
                            unsafe = unsafe6;
                            int iH = a12.h(t10, bArr, i15, i11, i34, i30, i31, i14, i32, i33, j10, c11145d0);
                            if (iH == i15) {
                                i29 = iH;
                                i13 = i30;
                                i12 = i34;
                                i26 = i16;
                                t11 = t10;
                                i27 = i41;
                            } else {
                                a12 = this;
                                t12 = t10;
                                i27 = i41;
                                c11145d02 = c11145d0;
                                iK = iH;
                                i25 = i14;
                                i24 = i30;
                                i26 = i16;
                                unsafe2 = unsafe;
                                i23 = -1;
                                bArr2 = bArr;
                                i22 = i11;
                            }
                        } else {
                            i16 = i26;
                            unsafe = unsafe6;
                            i17 = i30;
                            i18 = i27;
                            i19 = i34;
                            if (i33 != 50) {
                                i13 = i17;
                                int iG = g(t10, bArr, i15, i11, i19, i13, i31, i32, i33, j10, i14, c11145d0);
                                t11 = t10;
                                i12 = i19;
                                i14 = i14;
                                if (iG == i15) {
                                    i29 = iG;
                                    i27 = i18;
                                    i26 = i16;
                                } else {
                                    a12 = this;
                                    c11145d02 = c11145d0;
                                    i24 = i13;
                                    iK = iG;
                                    i25 = i14;
                                    t12 = t11;
                                    i27 = i18;
                                    i26 = i16;
                                    unsafe2 = unsafe;
                                    i23 = -1;
                                    bArr2 = bArr;
                                    i22 = i11;
                                }
                            } else if (i31 == 2) {
                                int i42 = i(t10, bArr, i15, i11, i14, j10, c11145d0);
                                i14 = i14;
                                if (i42 == i15) {
                                    i29 = i42;
                                    i13 = i17;
                                    i12 = i19;
                                    i27 = i18;
                                    i26 = i16;
                                    t11 = t10;
                                } else {
                                    a12 = this;
                                    t12 = t10;
                                    bArr2 = bArr;
                                    c11145d02 = c11145d0;
                                    iK = i42;
                                    i25 = i14;
                                    i24 = i17;
                                    i27 = i18;
                                    i26 = i16;
                                    unsafe2 = unsafe;
                                    i23 = -1;
                                    i22 = i11;
                                }
                            } else {
                                i14 = i14;
                                i29 = i15;
                                i13 = i17;
                                i12 = i19;
                                i27 = i18;
                                i26 = i16;
                                t11 = t10;
                            }
                        }
                    } else if (i31 == 2) {
                        X0 x0Zza = (X0) unsafe2.getObject(t12, j10);
                        if (!x0Zza.zza()) {
                            int size = x0Zza.size();
                            x0Zza = x0Zza.zza(size == 0 ? 10 : size << 1);
                            unsafe2.putObject(t12, j10, x0Zza);
                        }
                        int iE2 = C11141c0.e(a12.l(i14), i34, bArr2, i29, i11, x0Zza, c11145d02);
                        bArr2 = bArr;
                        c11145d02 = c11145d0;
                        iK = iE2;
                        i25 = i14;
                        unsafe2 = unsafe2;
                        i24 = i30;
                        i23 = -1;
                        t12 = t10;
                        i22 = i11;
                    } else {
                        i15 = i29;
                        i16 = i26;
                        unsafe = unsafe2;
                        i17 = i30;
                        i18 = i27;
                        i19 = i34;
                        i29 = i15;
                        i13 = i17;
                        i12 = i19;
                        i27 = i18;
                        i26 = i16;
                        t11 = t10;
                    }
                }
            }
            int iC = C11141c0.c(i12, bArr, i29, i11, M(t11), c11145d0);
            bArr2 = bArr;
            c11145d02 = c11145d0;
            i24 = i13;
            i25 = i14;
            t12 = t11;
            unsafe2 = unsafe;
            i23 = -1;
            i22 = i11;
            iK = iC;
            a12 = this;
        }
        T t16 = t12;
        Unsafe unsafe7 = unsafe2;
        int i43 = i22;
        int i44 = i27;
        int i45 = i26;
        if (i44 != 1048575) {
            unsafe7.putInt(t16, i44, i45);
        }
        if (iK != i43) {
            throw zzjk.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x05f3, code lost:
    
        if (r11 == 1048575) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05f5, code lost:
    
        r22.putInt(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05fb, code lost:
    
        r0 = r9.f85115k;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0601, code lost:
    
        if (r0 >= r9.f85116l) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0603, code lost:
    
        r1 = (com.google.android.gms.internal.vision.C11163h2) r9.n(r10, r9.f85114j[r0], r1, r9.f85119o);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0612, code lost:
    
        if (r1 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0614, code lost:
    
        r9.f85119o.h(r10, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0619, code lost:
    
        if (r14 != 0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x061b, code lost:
    
        if (r4 != r3) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0622, code lost:
    
        throw com.google.android.gms.internal.vision.zzjk.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0623, code lost:
    
        if (r4 > r3) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0625, code lost:
    
        if (r13 != r14) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0627, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x062c, code lost:
    
        throw com.google.android.gms.internal.vision.zzjk.e();
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0590  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int j(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.vision.C11145d0 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.A1.j(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.d0):int");
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final T zza() {
        return (T) this.f85117m.zza(this.f85109e);
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final void zzb(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f85105a.length; i10 += 3) {
            int I10 = I(i10);
            long j10 = 1048575 & I10;
            int i11 = this.f85105a[i10];
            switch ((I10 & 267386880) >>> 20) {
                case 0:
                    if (u(t11, i10)) {
                        l2.f(t10, j10, l2.C(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (u(t11, i10)) {
                        l2.g(t10, j10, l2.x(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (u(t11, i10)) {
                        l2.i(t10, j10, l2.o(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (u(t11, i10)) {
                        l2.i(t10, j10, l2.o(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (u(t11, i10)) {
                        l2.h(t10, j10, l2.b(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (u(t11, i10)) {
                        l2.i(t10, j10, l2.o(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (u(t11, i10)) {
                        l2.h(t10, j10, l2.b(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (u(t11, i10)) {
                        l2.k(t10, j10, l2.w(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (u(t11, i10)) {
                        l2.j(t10, j10, l2.F(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    t(t10, t11, i10);
                    break;
                case 10:
                    if (u(t11, i10)) {
                        l2.j(t10, j10, l2.F(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (u(t11, i10)) {
                        l2.h(t10, j10, l2.b(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (u(t11, i10)) {
                        l2.h(t10, j10, l2.b(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (u(t11, i10)) {
                        l2.h(t10, j10, l2.b(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (u(t11, i10)) {
                        l2.i(t10, j10, l2.o(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (u(t11, i10)) {
                        l2.h(t10, j10, l2.b(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (u(t11, i10)) {
                        l2.i(t10, j10, l2.o(t11, j10));
                        B(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    t(t10, t11, i10);
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
                case l3.f93325e /* 32 */:
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
                    this.f85118n.b(t10, t11, j10);
                    break;
                case 50:
                    P1.n(this.f85121q, t10, t11, j10);
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
                    if (v(t11, i11, i10)) {
                        l2.j(t10, j10, l2.F(t11, j10));
                        C(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    E(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(t11, i11, i10)) {
                        l2.j(t10, j10, l2.F(t11, j10));
                        C(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    E(t10, t11, i10);
                    break;
            }
        }
        P1.o(this.f85119o, t10, t11);
        if (this.f85110f) {
            P1.m(this.f85120p, t10, t11);
        }
    }

    private final Object A(int i10) {
        return this.f85106b[(i10 / 3) << 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void D(T r18, com.google.android.gms.internal.vision.C2 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.A1.D(java.lang.Object, com.google.android.gms.internal.vision.C2):void");
    }

    private final T0 G(int i10) {
        return (T0) this.f85106b[((i10 / 3) << 1) + 1];
    }

    private final int I(int i10) {
        return this.f85105a[i10 + 1];
    }

    private final int K(int i10) {
        return this.f85105a[i10 + 2];
    }

    private static C11163h2 M(Object obj) {
        O0 o02 = (O0) obj;
        C11163h2 c11163h2 = o02.zzb;
        if (c11163h2 != C11163h2.a()) {
            return c11163h2;
        }
        C11163h2 c11163h2G = C11163h2.g();
        o02.zzb = c11163h2G;
        return c11163h2G;
    }

    private final int O(int i10) {
        if (i10 < this.f85107c || i10 > this.f85108d) {
            return -1;
        }
        return z(i10, 0);
    }

    private final int e(int i10, int i11) {
        if (i10 < this.f85107c || i10 > this.f85108d) {
            return -1;
        }
        return z(i10, i11);
    }

    private final <K, V> int i(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C11145d0 c11145d0) throws IOException {
        Unsafe unsafe = f85104s;
        Object objA = A(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f85121q.a(object)) {
            Object objZzf = this.f85121q.zzf(objA);
            this.f85121q.b(objZzf, object);
            unsafe.putObject(t10, j10, objZzf);
            object = objZzf;
        }
        this.f85121q.zzb(objA);
        this.f85121q.zza(object);
        int i13 = C11141c0.i(bArr, i10, c11145d0);
        int i14 = c11145d0.f85359a;
        if (i14 < 0 || i14 > i11 - i13) {
            throw zzjk.a();
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.android.gms.internal.vision.A1<T> k(java.lang.Class<T> r33, com.google.android.gms.internal.vision.InterfaceC11202u1 r34, com.google.android.gms.internal.vision.D1 r35, com.google.android.gms.internal.vision.AbstractC11154f1 r36, com.google.android.gms.internal.vision.AbstractC11155f2<?, ?> r37, com.google.android.gms.internal.vision.C0<?> r38, com.google.android.gms.internal.vision.InterfaceC11199t1 r39) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.A1.k(java.lang.Class, com.google.android.gms.internal.vision.u1, com.google.android.gms.internal.vision.D1, com.google.android.gms.internal.vision.f1, com.google.android.gms.internal.vision.f2, com.google.android.gms.internal.vision.C0, com.google.android.gms.internal.vision.t1):com.google.android.gms.internal.vision.A1");
    }

    private final O1 l(int i10) {
        int i11 = (i10 / 3) << 1;
        O1 o12 = (O1) this.f85106b[i11];
        if (o12 != null) {
            return o12;
        }
        O1<T> o1B = J1.a().b((Class) this.f85106b[i11 + 1]);
        this.f85106b[i11] = o1B;
        return o1B;
    }

    private final <K, V, UT, UB> UB m(int i10, int i11, Map<K, V> map, T0 t02, UB ub2, AbstractC11155f2<UT, UB> abstractC11155f2) {
        this.f85121q.zzb(A(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!t02.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = abstractC11155f2.a();
                }
                C11190q0 c11190q0T = AbstractC11161h0.t(C11185o1.a(null, next.getKey(), next.getValue()));
                try {
                    C11185o1.b(c11190q0T.b(), null, next.getKey(), next.getValue());
                    abstractC11155f2.c(ub2, i11, c11190q0T.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private final <UT, UB> UB n(Object obj, int i10, UB ub2, AbstractC11155f2<UT, UB> abstractC11155f2) {
        T0 t0G;
        int i11 = this.f85105a[i10];
        Object objF = l2.F(obj, I(i10) & 1048575);
        return (objF == null || (t0G = G(i10)) == null) ? ub2 : (UB) m(i10, i11, this.f85121q.zza(objF), t0G, ub2, abstractC11155f2);
    }

    private static void q(int i10, Object obj, C2 c22) throws IOException {
        if (obj instanceof String) {
            c22.c(i10, (String) obj);
        } else {
            c22.p(i10, (AbstractC11161h0) obj);
        }
    }

    private final <K, V> void s(C2 c22, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            this.f85121q.zzb(A(i11));
            c22.y(i10, null, this.f85121q.zzc(obj));
        }
    }

    private final int z(int i10, int i11) {
        int length = (this.f85105a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f85105a[i13];
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.vision.O1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.A1.b(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final int zza(T t10) {
        int i10;
        int iB;
        int length = this.f85105a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int I10 = I(i12);
            int i13 = this.f85105a[i12];
            long j10 = 1048575 & I10;
            int iHashCode = 37;
            switch ((I10 & 267386880) >>> 20) {
                case 0:
                    i10 = i11 * 53;
                    iB = S0.b(Double.doubleToLongBits(l2.C(t10, j10)));
                    i11 = i10 + iB;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iB = Float.floatToIntBits(l2.x(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iB = S0.b(l2.o(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iB = S0.b(l2.o(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iB = l2.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iB = S0.b(l2.o(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iB = l2.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iB = S0.c(l2.w(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iB = ((String) l2.F(t10, j10)).hashCode();
                    i11 = i10 + iB;
                    break;
                case 9:
                    Object objF = l2.F(t10, j10);
                    if (objF != null) {
                        iHashCode = objF.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iB = l2.F(t10, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iB = l2.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iB = l2.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iB = l2.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iB = S0.b(l2.o(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iB = l2.b(t10, j10);
                    i11 = i10 + iB;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iB = S0.b(l2.o(t10, j10));
                    i11 = i10 + iB;
                    break;
                case 17:
                    Object objF2 = l2.F(t10, j10);
                    if (objF2 != null) {
                        iHashCode = objF2.hashCode();
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
                case l3.f93325e /* 32 */:
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
                    iB = l2.F(t10, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iB = l2.F(t10, j10).hashCode();
                    i11 = i10 + iB;
                    break;
                case 51:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = S0.b(Double.doubleToLongBits(y(t10, j10)));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = Float.floatToIntBits(F(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = S0.b(L(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = S0.b(L(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = S0.b(L(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = S0.c(N(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = ((String) l2.F(t10, j10)).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = l2.F(t10, j10).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = l2.F(t10, j10).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = S0.b(L(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = J(t10, j10);
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = S0.b(L(t10, j10));
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(t10, i13, i12)) {
                        i10 = i11 * 53;
                        iB = l2.F(t10, j10).hashCode();
                        i11 = i10 + iB;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f85119o.f(t10).hashCode();
        return this.f85110f ? (iHashCode2 * 53) + this.f85120p.b(t10).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.vision.O1
    public final void zzc(T t10) {
        int i10;
        int i11 = this.f85115k;
        while (true) {
            i10 = this.f85116l;
            if (i11 >= i10) {
                break;
            }
            long jI = I(this.f85114j[i11]) & 1048575;
            Object objF = l2.F(t10, jI);
            if (objF != null) {
                l2.j(t10, jI, this.f85121q.zze(objF));
            }
            i11++;
        }
        int length = this.f85114j.length;
        while (i10 < length) {
            this.f85118n.d(t10, this.f85114j[i10]);
            i10++;
        }
        this.f85119o.j(t10);
        if (this.f85110f) {
            this.f85120p.g(t10);
        }
    }

    private A1(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC11208w1 interfaceC11208w1, boolean z10, boolean z11, int[] iArr2, int i12, int i13, D1 d12, AbstractC11154f1 abstractC11154f1, AbstractC11155f2<?, ?> abstractC11155f2, C0<?> c02, InterfaceC11199t1 interfaceC11199t1) {
        boolean z12;
        this.f85105a = iArr;
        this.f85106b = objArr;
        this.f85107c = i10;
        this.f85108d = i11;
        this.f85111g = interfaceC11208w1 instanceof O0;
        this.f85112h = z10;
        if (c02 != null && c02.e(interfaceC11208w1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f85110f = z12;
        this.f85113i = false;
        this.f85114j = iArr2;
        this.f85115k = i12;
        this.f85116l = i13;
        this.f85117m = d12;
        this.f85118n = abstractC11154f1;
        this.f85119o = abstractC11155f2;
        this.f85120p = c02;
        this.f85109e = interfaceC11208w1;
        this.f85121q = interfaceC11199t1;
    }

    private final void B(T t10, int i10) {
        int iK = K(i10);
        long j10 = 1048575 & iK;
        if (j10 == 1048575) {
            return;
        }
        l2.h(t10, j10, (1 << (iK >>> 20)) | l2.b(t10, j10));
    }

    private final void C(T t10, int i10, int i11) {
        l2.h(t10, K(i11) & 1048575, i10);
    }

    private final void E(T t10, T t11, int i10) {
        Object objF;
        int I10 = I(i10);
        int i11 = this.f85105a[i10];
        long j10 = I10 & 1048575;
        if (v(t11, i11, i10)) {
            if (v(t10, i11, i10)) {
                objF = l2.F(t10, j10);
            } else {
                objF = null;
            }
            Object objF2 = l2.F(t11, j10);
            if (objF != null && objF2 != null) {
                l2.j(t10, j10, S0.e(objF, objF2));
                C(t10, i11, i10);
            } else if (objF2 != null) {
                l2.j(t10, j10, objF2);
                C(t10, i11, i10);
            }
        }
    }

    private static <T> float F(T t10, long j10) {
        return ((Float) l2.F(t10, j10)).floatValue();
    }

    private final boolean H(T t10, T t11, int i10) {
        if (u(t10, i10) == u(t11, i10)) {
            return true;
        }
        return false;
    }

    private static <T> int J(T t10, long j10) {
        return ((Integer) l2.F(t10, j10)).intValue();
    }

    private static <T> long L(T t10, long j10) {
        return ((Long) l2.F(t10, j10)).longValue();
    }

    private static <T> boolean N(T t10, long j10) {
        return ((Boolean) l2.F(t10, j10)).booleanValue();
    }

    private static <UT, UB> int f(AbstractC11155f2<UT, UB> abstractC11155f2, T t10) {
        return abstractC11155f2.l(abstractC11155f2.f(t10));
    }

    private static Field o(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString());
        }
    }

    private static List<?> p(Object obj, long j10) {
        return (List) l2.F(obj, j10);
    }

    private static <UT, UB> void r(AbstractC11155f2<UT, UB> abstractC11155f2, T t10, C2 c22) throws IOException {
        abstractC11155f2.d(abstractC11155f2.f(t10), c22);
    }

    private final void t(T t10, T t11, int i10) {
        long jI = I(i10) & 1048575;
        if (u(t11, i10)) {
            Object objF = l2.F(t10, jI);
            Object objF2 = l2.F(t11, jI);
            if (objF != null && objF2 != null) {
                l2.j(t10, jI, S0.e(objF, objF2));
                B(t10, i10);
            } else if (objF2 != null) {
                l2.j(t10, jI, objF2);
                B(t10, i10);
            }
        }
    }

    private final boolean u(T t10, int i10) {
        int iK = K(i10);
        long j10 = iK & 1048575;
        if (j10 == 1048575) {
            int I10 = I(i10);
            long j11 = I10 & 1048575;
            switch ((I10 & 267386880) >>> 20) {
                case 0:
                    if (l2.C(t10, j11) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (l2.x(t10, j11) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (l2.o(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (l2.o(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (l2.b(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (l2.o(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (l2.b(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return l2.w(t10, j11);
                case 8:
                    Object objF = l2.F(t10, j11);
                    if (objF instanceof String) {
                        if (((String) objF).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objF instanceof AbstractC11161h0) {
                        if (AbstractC11161h0.f85385b.equals(objF)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (l2.F(t10, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC11161h0.f85385b.equals(l2.F(t10, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (l2.b(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (l2.b(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (l2.b(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (l2.o(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (l2.b(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (l2.o(t10, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (l2.F(t10, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((l2.b(t10, j10) & (1 << (iK >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean v(T t10, int i10, int i11) {
        if (l2.b(t10, K(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private final boolean w(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return u(t10, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean x(Object obj, int i10, O1 o12) {
        return o12.a(l2.F(obj, i10 & 1048575));
    }

    private static <T> double y(T t10, long j10) {
        return ((Double) l2.F(t10, j10)).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    @Override // com.google.android.gms.internal.vision.O1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(T r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.A1.a(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.vision.O1
    public final int zzb(T t10) {
        int i10;
        int i11;
        boolean z10;
        int iB0;
        int iH;
        int iA0;
        int iV;
        int iG0;
        int iO0;
        int iB;
        int iV2;
        int iG02;
        int iO02;
        int i12 = 267386880;
        int i13 = 1048575;
        int i14 = 0;
        if (this.f85112h) {
            Unsafe unsafe = f85104s;
            int i15 = 0;
            int i16 = 0;
            while (i15 < this.f85105a.length) {
                int I10 = I(i15);
                int i17 = (I10 & i12) >>> 20;
                int i18 = i12;
                int i19 = this.f85105a[i15];
                long j10 = I10 & 1048575;
                if (i17 >= H0.f85163O.zza() && i17 <= H0.f85176b0.zza()) {
                    int i20 = this.f85105a[i15 + 2];
                }
                switch (i17) {
                    case 0:
                        if (u(t10, i15)) {
                            iB = zzii.B(i19, 0.0d);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (u(t10, i15)) {
                            iB = zzii.C(i19, 0.0f);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (u(t10, i15)) {
                            iB = zzii.b0(i19, l2.o(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (u(t10, i15)) {
                            iB = zzii.h0(i19, l2.o(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (u(t10, i15)) {
                            iB = zzii.l0(i19, l2.b(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (u(t10, i15)) {
                            iB = zzii.q0(i19, 0L);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (u(t10, i15)) {
                            iB = zzii.x0(i19, 0);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (u(t10, i15)) {
                            iB = zzii.H(i19, true);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (u(t10, i15)) {
                            Object objF = l2.F(t10, j10);
                            if (objF instanceof AbstractC11161h0) {
                                iB = zzii.T(i19, (AbstractC11161h0) objF);
                            } else {
                                iB = zzii.G(i19, (String) objF);
                            }
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (u(t10, i15)) {
                            iB = P1.a(i19, l2.F(t10, j10), l(i15));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (u(t10, i15)) {
                            iB = zzii.T(i19, (AbstractC11161h0) l2.F(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (u(t10, i15)) {
                            iB = zzii.p0(i19, l2.b(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (u(t10, i15)) {
                            iB = zzii.C0(i19, l2.b(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (u(t10, i15)) {
                            iB = zzii.A0(i19, 0);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (u(t10, i15)) {
                            iB = zzii.u0(i19, 0L);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (u(t10, i15)) {
                            iB = zzii.t0(i19, l2.b(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (u(t10, i15)) {
                            iB = zzii.m0(i19, l2.o(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (u(t10, i15)) {
                            iB = zzii.U(i19, (InterfaceC11208w1) l2.F(t10, j10), l(i15));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        iB = P1.U(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 19:
                        iB = P1.R(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 20:
                        iB = P1.d(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 21:
                        iB = P1.t(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                        iB = P1.H(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 23:
                        iB = P1.U(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 24:
                        iB = P1.R(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 25:
                        iB = P1.X(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 26:
                        iB = P1.b(i19, p(t10, j10));
                        i16 += iB;
                        break;
                    case 27:
                        iB = P1.c(i19, p(t10, j10), l(i15));
                        i16 += iB;
                        break;
                    case 28:
                        iB = P1.r(i19, p(t10, j10));
                        i16 += iB;
                        break;
                    case 29:
                        iB = P1.L(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 30:
                        iB = P1.D(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 31:
                        iB = P1.R(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case l3.f93325e /* 32 */:
                        iB = P1.U(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 33:
                        iB = P1.O(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 34:
                        iB = P1.z(i19, p(t10, j10), false);
                        i16 += iB;
                        break;
                    case 35:
                        iV2 = P1.V((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        iV2 = P1.S((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        iV2 = P1.e((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        iV2 = P1.u((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        iV2 = P1.I((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        iV2 = P1.V((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        iV2 = P1.S((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        iV2 = P1.Y((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        iV2 = P1.M((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        iV2 = P1.E((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        iV2 = P1.S((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        iV2 = P1.V((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        iV2 = P1.P((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        iV2 = P1.A((List) unsafe.getObject(t10, j10));
                        if (iV2 > 0) {
                            iG02 = zzii.g0(i19);
                            iO02 = zzii.o0(iV2);
                            iB = iG02 + iO02 + iV2;
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        iB = P1.s(i19, p(t10, j10), l(i15));
                        i16 += iB;
                        break;
                    case 50:
                        iB = this.f85121q.c(i19, l2.F(t10, j10), A(i15));
                        i16 += iB;
                        break;
                    case 51:
                        if (v(t10, i19, i15)) {
                            iB = zzii.B(i19, 0.0d);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (v(t10, i19, i15)) {
                            iB = zzii.C(i19, 0.0f);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (v(t10, i19, i15)) {
                            iB = zzii.b0(i19, L(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (v(t10, i19, i15)) {
                            iB = zzii.h0(i19, L(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (v(t10, i19, i15)) {
                            iB = zzii.l0(i19, J(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (v(t10, i19, i15)) {
                            iB = zzii.q0(i19, 0L);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (v(t10, i19, i15)) {
                            iB = zzii.x0(i19, 0);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (v(t10, i19, i15)) {
                            iB = zzii.H(i19, true);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (v(t10, i19, i15)) {
                            Object objF2 = l2.F(t10, j10);
                            if (objF2 instanceof AbstractC11161h0) {
                                iB = zzii.T(i19, (AbstractC11161h0) objF2);
                            } else {
                                iB = zzii.G(i19, (String) objF2);
                            }
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (v(t10, i19, i15)) {
                            iB = P1.a(i19, l2.F(t10, j10), l(i15));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (v(t10, i19, i15)) {
                            iB = zzii.T(i19, (AbstractC11161h0) l2.F(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (v(t10, i19, i15)) {
                            iB = zzii.p0(i19, J(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (v(t10, i19, i15)) {
                            iB = zzii.C0(i19, J(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (v(t10, i19, i15)) {
                            iB = zzii.A0(i19, 0);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (v(t10, i19, i15)) {
                            iB = zzii.u0(i19, 0L);
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (v(t10, i19, i15)) {
                            iB = zzii.t0(i19, J(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (v(t10, i19, i15)) {
                            iB = zzii.m0(i19, L(t10, j10));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (v(t10, i19, i15)) {
                            iB = zzii.U(i19, (InterfaceC11208w1) l2.F(t10, j10), l(i15));
                            i16 += iB;
                            break;
                        } else {
                            break;
                        }
                }
                i15 += 3;
                i12 = i18;
            }
            return i16 + f(this.f85119o, t10);
        }
        Unsafe unsafe2 = f85104s;
        int i21 = 1048575;
        int i22 = 0;
        int iB2 = 0;
        int i23 = 0;
        while (i22 < this.f85105a.length) {
            int I11 = I(i22);
            int[] iArr = this.f85105a;
            int i24 = iArr[i22];
            int i25 = i13;
            int i26 = (I11 & 267386880) >>> 20;
            if (i26 <= 17) {
                int i27 = iArr[i22 + 2];
                int i28 = i27 & i25;
                i10 = 1 << (i27 >>> 20);
                if (i28 != i21) {
                    i23 = unsafe2.getInt(t10, i28);
                    i21 = i28;
                }
            } else {
                i10 = 0;
            }
            long j11 = I11 & i25;
            switch (i26) {
                case 0:
                    i11 = 0;
                    z10 = false;
                    if ((i10 & i23) != 0) {
                        iB2 += zzii.B(i24, 0.0d);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i11 = 0;
                    if ((i10 & i23) != 0) {
                        z10 = false;
                        iB2 += zzii.C(i24, 0.0f);
                    } else {
                        z10 = false;
                    }
                    break;
                case 2:
                    i11 = 0;
                    if ((i10 & i23) != 0) {
                        iB0 = zzii.b0(i24, unsafe2.getLong(t10, j11));
                        iB2 += iB0;
                    }
                    z10 = false;
                    break;
                case 3:
                    i11 = 0;
                    if ((i10 & i23) != 0) {
                        iB0 = zzii.h0(i24, unsafe2.getLong(t10, j11));
                        iB2 += iB0;
                    }
                    z10 = false;
                    break;
                case 4:
                    i11 = 0;
                    if ((i10 & i23) != 0) {
                        iB0 = zzii.l0(i24, unsafe2.getInt(t10, j11));
                        iB2 += iB0;
                    }
                    z10 = false;
                    break;
                case 5:
                    i11 = 0;
                    if ((i10 & i23) != 0) {
                        iB0 = zzii.q0(i24, 0L);
                        iB2 += iB0;
                    }
                    z10 = false;
                    break;
                case 6:
                    if ((i10 & i23) != 0) {
                        i11 = 0;
                        iB0 = zzii.x0(i24, 0);
                        iB2 += iB0;
                        z10 = false;
                        break;
                    }
                    i11 = 0;
                    z10 = false;
                case 7:
                    if ((i10 & i23) != 0) {
                        iH = zzii.H(i24, true);
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 8:
                    if ((i10 & i23) != 0) {
                        Object object = unsafe2.getObject(t10, j11);
                        if (object instanceof AbstractC11161h0) {
                            iH = zzii.T(i24, (AbstractC11161h0) object);
                        } else {
                            iH = zzii.G(i24, (String) object);
                        }
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 9:
                    if ((i10 & i23) != 0) {
                        iH = P1.a(i24, unsafe2.getObject(t10, j11), l(i22));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 10:
                    if ((i10 & i23) != 0) {
                        iH = zzii.T(i24, (AbstractC11161h0) unsafe2.getObject(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 11:
                    if ((i10 & i23) != 0) {
                        iH = zzii.p0(i24, unsafe2.getInt(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 12:
                    if ((i10 & i23) != 0) {
                        iH = zzii.C0(i24, unsafe2.getInt(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 13:
                    if ((i10 & i23) != 0) {
                        iA0 = zzii.A0(i24, 0);
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 14:
                    if ((i10 & i23) != 0) {
                        iH = zzii.u0(i24, 0L);
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 15:
                    if ((i10 & i23) != 0) {
                        iH = zzii.t0(i24, unsafe2.getInt(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 16:
                    if ((i10 & i23) != 0) {
                        iH = zzii.m0(i24, unsafe2.getLong(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 17:
                    if ((i10 & i23) != 0) {
                        iH = zzii.U(i24, (InterfaceC11208w1) unsafe2.getObject(t10, j11), l(i22));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 18:
                    iH = P1.U(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iH;
                    i11 = 0;
                    z10 = false;
                    break;
                case 19:
                    i11 = 0;
                    iB0 = P1.R(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 20:
                    i11 = 0;
                    iB0 = P1.d(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 21:
                    i11 = 0;
                    iB0 = P1.t(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    i11 = 0;
                    iB0 = P1.H(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 23:
                    i11 = 0;
                    iB0 = P1.U(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 24:
                    i11 = 0;
                    iB0 = P1.R(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 25:
                    i11 = 0;
                    iB0 = P1.X(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 26:
                    iH = P1.b(i24, (List) unsafe2.getObject(t10, j11));
                    iB2 += iH;
                    i11 = 0;
                    z10 = false;
                    break;
                case 27:
                    iH = P1.c(i24, (List) unsafe2.getObject(t10, j11), l(i22));
                    iB2 += iH;
                    i11 = 0;
                    z10 = false;
                    break;
                case 28:
                    iH = P1.r(i24, (List) unsafe2.getObject(t10, j11));
                    iB2 += iH;
                    i11 = 0;
                    z10 = false;
                    break;
                case 29:
                    iH = P1.L(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iH;
                    i11 = 0;
                    z10 = false;
                    break;
                case 30:
                    i11 = 0;
                    iB0 = P1.D(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 31:
                    i11 = 0;
                    iB0 = P1.R(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case l3.f93325e /* 32 */:
                    i11 = 0;
                    iB0 = P1.U(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 33:
                    i11 = 0;
                    iB0 = P1.O(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 34:
                    i11 = 0;
                    iB0 = P1.z(i24, (List) unsafe2.getObject(t10, j11), false);
                    iB2 += iB0;
                    z10 = false;
                    break;
                case 35:
                    iV = P1.V((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 36:
                    iV = P1.S((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 37:
                    iV = P1.e((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 38:
                    iV = P1.u((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 39:
                    iV = P1.I((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 40:
                    iV = P1.V((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 41:
                    iV = P1.S((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 42:
                    iV = P1.Y((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 43:
                    iV = P1.M((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 44:
                    iV = P1.E((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 45:
                    iV = P1.S((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 46:
                    iV = P1.V((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 47:
                    iV = P1.P((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 48:
                    iV = P1.A((List) unsafe2.getObject(t10, j11));
                    if (iV > 0) {
                        iG0 = zzii.g0(i24);
                        iO0 = zzii.o0(iV);
                        iA0 = iG0 + iO0 + iV;
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 49:
                    iH = P1.s(i24, (List) unsafe2.getObject(t10, j11), l(i22));
                    iB2 += iH;
                    i11 = 0;
                    z10 = false;
                    break;
                case 50:
                    iH = this.f85121q.c(i24, unsafe2.getObject(t10, j11), A(i22));
                    iB2 += iH;
                    i11 = 0;
                    z10 = false;
                    break;
                case 51:
                    if (v(t10, i24, i22)) {
                        iB2 += zzii.B(i24, 0.0d);
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 52:
                    if (v(t10, i24, i22)) {
                        iA0 = zzii.C(i24, 0.0f);
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 53:
                    if (v(t10, i24, i22)) {
                        iH = zzii.b0(i24, L(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 54:
                    if (v(t10, i24, i22)) {
                        iH = zzii.h0(i24, L(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 55:
                    if (v(t10, i24, i22)) {
                        iH = zzii.l0(i24, J(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 56:
                    if (v(t10, i24, i22)) {
                        iH = zzii.q0(i24, 0L);
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 57:
                    if (v(t10, i24, i22)) {
                        iA0 = zzii.x0(i24, 0);
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 58:
                    if (v(t10, i24, i22)) {
                        iH = zzii.H(i24, true);
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 59:
                    if (v(t10, i24, i22)) {
                        Object object2 = unsafe2.getObject(t10, j11);
                        if (object2 instanceof AbstractC11161h0) {
                            iH = zzii.T(i24, (AbstractC11161h0) object2);
                        } else {
                            iH = zzii.G(i24, (String) object2);
                        }
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 60:
                    if (v(t10, i24, i22)) {
                        iH = P1.a(i24, unsafe2.getObject(t10, j11), l(i22));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 61:
                    if (v(t10, i24, i22)) {
                        iH = zzii.T(i24, (AbstractC11161h0) unsafe2.getObject(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 62:
                    if (v(t10, i24, i22)) {
                        iH = zzii.p0(i24, J(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 63:
                    if (v(t10, i24, i22)) {
                        iH = zzii.C0(i24, J(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 64:
                    if (v(t10, i24, i22)) {
                        iA0 = zzii.A0(i24, 0);
                        iB2 += iA0;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 65:
                    if (v(t10, i24, i22)) {
                        iH = zzii.u0(i24, 0L);
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 66:
                    if (v(t10, i24, i22)) {
                        iH = zzii.t0(i24, J(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 67:
                    if (v(t10, i24, i22)) {
                        iH = zzii.m0(i24, L(t10, j11));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                case 68:
                    if (v(t10, i24, i22)) {
                        iH = zzii.U(i24, (InterfaceC11208w1) unsafe2.getObject(t10, j11), l(i22));
                        iB2 += iH;
                    }
                    i11 = 0;
                    z10 = false;
                    break;
                default:
                    i11 = 0;
                    z10 = false;
                    break;
            }
            i22 += 3;
            i14 = i11;
            i13 = i25;
        }
        int iL = i14;
        int iF = iB2 + f(this.f85119o, t10);
        if (!this.f85110f) {
            return iF;
        }
        G0<T> g0B = this.f85120p.b(t10);
        for (int i29 = iL; i29 < g0B.f85140a.k(); i29++) {
            Map.Entry entryI = g0B.f85140a.i(i29);
            iL += G0.l((I0) entryI.getKey(), entryI.getValue());
        }
        for (Map.Entry entry : g0B.f85140a.r()) {
            iL += G0.l((I0) entry.getKey(), entry.getValue());
        }
        return iF + iL;
    }
}
