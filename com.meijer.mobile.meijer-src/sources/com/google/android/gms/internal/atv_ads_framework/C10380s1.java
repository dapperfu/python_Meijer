package com.google.android.gms.internal.atv_ads_framework;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.s1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10380s1<T> implements InterfaceC10401z1<T> {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f81880m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    private static final Unsafe f81881n = C10326a2.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f81882a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f81883b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10372p1 f81884c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f81885d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f81886e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f81887f;

    /* renamed from: g, reason: collision with root package name */
    private final int f81888g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC10336d1 f81889h;

    /* renamed from: i, reason: collision with root package name */
    private final Q1 f81890i;

    /* renamed from: j, reason: collision with root package name */
    private final A0 f81891j;

    /* renamed from: k, reason: collision with root package name */
    private final C10386u1 f81892k;

    /* renamed from: l, reason: collision with root package name */
    private final C10357k1 f81893l;

    private C10380s1(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC10372p1 interfaceC10372p1, boolean z10, boolean z11, int[] iArr2, int i12, int i13, C10386u1 c10386u1, AbstractC10336d1 abstractC10336d1, Q1 q12, A0 a02, C10357k1 c10357k1) {
        this.f81882a = iArr;
        this.f81883b = objArr;
        this.f81886e = z10;
        boolean z12 = false;
        if (a02 != null && a02.c(interfaceC10372p1)) {
            z12 = true;
        }
        this.f81885d = z12;
        this.f81887f = iArr2;
        this.f81888g = i12;
        this.f81892k = c10386u1;
        this.f81889h = abstractC10336d1;
        this.f81890i = q12;
        this.f81891j = a02;
        this.f81884c = interfaceC10372p1;
        this.f81893l = c10357k1;
    }

    private static int q(int i10) {
        return (i10 >>> 20) & l3.f93323c;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final void b(Object obj, i2 i2Var) throws IOException {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 1048575;
        if (this.f81886e) {
            if (this.f81885d) {
                this.f81891j.a(obj);
                throw null;
            }
            int length = this.f81882a.length;
            for (int i14 = 0; i14 < length; i14 += 3) {
                int iR = r(i14);
                int i15 = this.f81882a[i14];
                switch (q(iR)) {
                    case 0:
                        if (d(obj, i14)) {
                            i2Var.zzf(i15, C10326a2.f(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (d(obj, i14)) {
                            i2Var.v(i15, C10326a2.g(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (d(obj, i14)) {
                            i2Var.f(i15, C10326a2.i(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (d(obj, i14)) {
                            i2Var.q(i15, C10326a2.i(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (d(obj, i14)) {
                            i2Var.i(i15, C10326a2.h(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (d(obj, i14)) {
                            i2Var.r0(i15, C10326a2.i(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (d(obj, i14)) {
                            i2Var.c(i15, C10326a2.h(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (d(obj, i14)) {
                            i2Var.zzb(i15, C10326a2.B(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (d(obj, i14)) {
                            j(i15, C10326a2.k(obj, iR & 1048575), i2Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (d(obj, i14)) {
                            i2Var.o(i15, C10326a2.k(obj, iR & 1048575), t(i14));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (d(obj, i14)) {
                            i2Var.u(i15, (AbstractC10374q0) C10326a2.k(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (d(obj, i14)) {
                            i2Var.s(i15, C10326a2.h(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (d(obj, i14)) {
                            i2Var.r(i15, C10326a2.h(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (d(obj, i14)) {
                            i2Var.m(i15, C10326a2.h(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (d(obj, i14)) {
                            i2Var.k(i15, C10326a2.i(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (d(obj, i14)) {
                            i2Var.t(i15, C10326a2.h(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (d(obj, i14)) {
                            i2Var.l(i15, C10326a2.i(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (d(obj, i14)) {
                            i2Var.j(i15, C10326a2.k(obj, iR & 1048575), t(i14));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        C1.e(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 19:
                        C1.i(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 20:
                        C1.l(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 21:
                        C1.t(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                        C1.k(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 23:
                        C1.h(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 24:
                        C1.g(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 25:
                        C1.c(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 26:
                        C1.r(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var);
                        break;
                    case 27:
                        C1.m(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, t(i14));
                        break;
                    case 28:
                        C1.d(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var);
                        break;
                    case 29:
                        C1.s(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 30:
                        C1.f(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 31:
                        C1.n(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case l3.f93325e /* 32 */:
                        C1.o(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 33:
                        C1.p(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 34:
                        C1.q(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, false);
                        break;
                    case 35:
                        C1.e(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 36:
                        C1.i(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 37:
                        C1.l(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 38:
                        C1.t(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 39:
                        C1.k(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 40:
                        C1.h(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 41:
                        C1.g(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 42:
                        C1.c(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 43:
                        C1.s(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 44:
                        C1.f(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 45:
                        C1.n(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 46:
                        C1.o(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 47:
                        C1.p(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 48:
                        C1.q(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, true);
                        break;
                    case 49:
                        C1.j(i15, (List) C10326a2.k(obj, iR & 1048575), i2Var, t(i14));
                        break;
                    case 50:
                        A(i2Var, i15, C10326a2.k(obj, iR & 1048575), i14);
                        break;
                    case 51:
                        if (h(obj, i15, i14)) {
                            i2Var.zzf(i15, l(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (h(obj, i15, i14)) {
                            i2Var.v(i15, m(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (h(obj, i15, i14)) {
                            i2Var.f(i15, s(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (h(obj, i15, i14)) {
                            i2Var.q(i15, s(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (h(obj, i15, i14)) {
                            i2Var.i(i15, o(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (h(obj, i15, i14)) {
                            i2Var.r0(i15, s(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (h(obj, i15, i14)) {
                            i2Var.c(i15, o(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (h(obj, i15, i14)) {
                            i2Var.zzb(i15, i(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (h(obj, i15, i14)) {
                            j(i15, C10326a2.k(obj, iR & 1048575), i2Var);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (h(obj, i15, i14)) {
                            i2Var.o(i15, C10326a2.k(obj, iR & 1048575), t(i14));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (h(obj, i15, i14)) {
                            i2Var.u(i15, (AbstractC10374q0) C10326a2.k(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (h(obj, i15, i14)) {
                            i2Var.s(i15, o(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (h(obj, i15, i14)) {
                            i2Var.r(i15, o(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (h(obj, i15, i14)) {
                            i2Var.m(i15, o(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (h(obj, i15, i14)) {
                            i2Var.k(i15, s(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (h(obj, i15, i14)) {
                            i2Var.t(i15, o(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (h(obj, i15, i14)) {
                            i2Var.l(i15, s(obj, iR & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (h(obj, i15, i14)) {
                            i2Var.j(i15, C10326a2.k(obj, iR & 1048575), t(i14));
                            break;
                        } else {
                            break;
                        }
                }
            }
            Q1 q12 = this.f81890i;
            q12.g(q12.c(obj), i2Var);
            return;
        }
        if (this.f81885d) {
            this.f81891j.a(obj);
            throw null;
        }
        int length2 = this.f81882a.length;
        Unsafe unsafe = f81881n;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i16 < length2) {
            int iR2 = r(i16);
            int[] iArr = this.f81882a;
            int i19 = iArr[i16];
            int iQ = q(iR2);
            if (iQ <= 17) {
                int i20 = iArr[i16 + 2];
                int i21 = i20 & i13;
                if (i21 != i18) {
                    i17 = unsafe.getInt(obj, i21);
                    i18 = i21;
                }
                i10 = 1 << (i20 >>> 20);
            } else {
                i10 = i12;
            }
            long j10 = iR2 & i13;
            switch (iQ) {
                case 0:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.zzf(i19, C10326a2.f(obj, j10));
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 1:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.v(i19, C10326a2.g(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 2:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.f(i19, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 3:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.q(i19, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 4:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.i(i19, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 5:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.r0(i19, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 6:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.c(i19, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 7:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.zzb(i19, C10326a2.B(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 8:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        j(i19, unsafe.getObject(obj, j10), i2Var);
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 9:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.o(i19, unsafe.getObject(obj, j10), t(i16));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 10:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.u(i19, (AbstractC10374q0) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 11:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.s(i19, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 12:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.r(i19, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 13:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.m(i19, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 14:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.k(i19, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 15:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.t(i19, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 16:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.l(i19, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 17:
                    i11 = 0;
                    if ((i17 & i10) != 0) {
                        i2Var.j(i19, unsafe.getObject(obj, j10), t(i16));
                    } else {
                        continue;
                    }
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 18:
                    i11 = 0;
                    C1.e(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 19:
                    i11 = 0;
                    C1.i(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 20:
                    i11 = 0;
                    C1.l(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 21:
                    i11 = 0;
                    C1.t(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    i11 = 0;
                    C1.k(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 23:
                    i11 = 0;
                    C1.h(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 24:
                    i11 = 0;
                    C1.g(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 25:
                    i11 = 0;
                    C1.c(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 26:
                    C1.r(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var);
                    break;
                case 27:
                    C1.m(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, t(i16));
                    break;
                case 28:
                    C1.d(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var);
                    break;
                case 29:
                    C1.s(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    break;
                case 30:
                    i11 = 0;
                    C1.f(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 31:
                    i11 = 0;
                    C1.n(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case l3.f93325e /* 32 */:
                    i11 = 0;
                    C1.o(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 33:
                    i11 = 0;
                    C1.p(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 34:
                    i11 = 0;
                    C1.q(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, false);
                    continue;
                    i16 += 3;
                    i12 = i11;
                    i13 = 1048575;
                case 35:
                    C1.e(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 36:
                    C1.i(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 37:
                    C1.l(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 38:
                    C1.t(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 39:
                    C1.k(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 40:
                    C1.h(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 41:
                    C1.g(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 42:
                    C1.c(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 43:
                    C1.s(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 44:
                    C1.f(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 45:
                    C1.n(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 46:
                    C1.o(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 47:
                    C1.p(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 48:
                    C1.q(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, true);
                    break;
                case 49:
                    C1.j(this.f81882a[i16], (List) unsafe.getObject(obj, j10), i2Var, t(i16));
                    break;
                case 50:
                    A(i2Var, i19, unsafe.getObject(obj, j10), i16);
                    break;
                case 51:
                    if (h(obj, i19, i16)) {
                        i2Var.zzf(i19, l(obj, j10));
                        break;
                    }
                    break;
                case 52:
                    if (h(obj, i19, i16)) {
                        i2Var.v(i19, m(obj, j10));
                        break;
                    }
                    break;
                case 53:
                    if (h(obj, i19, i16)) {
                        i2Var.f(i19, s(obj, j10));
                        break;
                    }
                    break;
                case 54:
                    if (h(obj, i19, i16)) {
                        i2Var.q(i19, s(obj, j10));
                        break;
                    }
                    break;
                case 55:
                    if (h(obj, i19, i16)) {
                        i2Var.i(i19, o(obj, j10));
                        break;
                    }
                    break;
                case 56:
                    if (h(obj, i19, i16)) {
                        i2Var.r0(i19, s(obj, j10));
                        break;
                    }
                    break;
                case 57:
                    if (h(obj, i19, i16)) {
                        i2Var.c(i19, o(obj, j10));
                        break;
                    }
                    break;
                case 58:
                    if (h(obj, i19, i16)) {
                        i2Var.zzb(i19, i(obj, j10));
                        break;
                    }
                    break;
                case 59:
                    if (h(obj, i19, i16)) {
                        j(i19, unsafe.getObject(obj, j10), i2Var);
                        break;
                    }
                    break;
                case 60:
                    if (h(obj, i19, i16)) {
                        i2Var.o(i19, unsafe.getObject(obj, j10), t(i16));
                        break;
                    }
                    break;
                case 61:
                    if (h(obj, i19, i16)) {
                        i2Var.u(i19, (AbstractC10374q0) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 62:
                    if (h(obj, i19, i16)) {
                        i2Var.s(i19, o(obj, j10));
                        break;
                    }
                    break;
                case 63:
                    if (h(obj, i19, i16)) {
                        i2Var.r(i19, o(obj, j10));
                        break;
                    }
                    break;
                case 64:
                    if (h(obj, i19, i16)) {
                        i2Var.m(i19, o(obj, j10));
                        break;
                    }
                    break;
                case 65:
                    if (h(obj, i19, i16)) {
                        i2Var.k(i19, s(obj, j10));
                        break;
                    }
                    break;
                case 66:
                    if (h(obj, i19, i16)) {
                        i2Var.t(i19, o(obj, j10));
                        break;
                    }
                    break;
                case 67:
                    if (h(obj, i19, i16)) {
                        i2Var.l(i19, s(obj, j10));
                        break;
                    }
                    break;
                case 68:
                    if (h(obj, i19, i16)) {
                        i2Var.j(i19, unsafe.getObject(obj, j10), t(i16));
                        break;
                    }
                    break;
            }
            i11 = 0;
            i16 += 3;
            i12 = i11;
            i13 = 1048575;
        }
        Q1 q13 = this.f81890i;
        q13.g(q13.c(obj), i2Var);
    }

    private final void A(i2 i2Var, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static boolean g(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof K0) {
            return ((K0) obj).c();
        }
        return true;
    }

    private static final void j(int i10, Object obj, i2 i2Var) throws IOException {
        if (obj instanceof String) {
            i2Var.w(i10, (String) obj);
        } else {
            i2Var.u(i10, (AbstractC10374q0) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.atv_ads_framework.C10380s1 k(java.lang.Class r32, com.google.android.gms.internal.atv_ads_framework.InterfaceC10363m1 r33, com.google.android.gms.internal.atv_ads_framework.C10386u1 r34, com.google.android.gms.internal.atv_ads_framework.AbstractC10336d1 r35, com.google.android.gms.internal.atv_ads_framework.Q1 r36, com.google.android.gms.internal.atv_ads_framework.A0 r37, com.google.android.gms.internal.atv_ads_framework.C10357k1 r38) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.C10380s1.k(java.lang.Class, com.google.android.gms.internal.atv_ads_framework.m1, com.google.android.gms.internal.atv_ads_framework.u1, com.google.android.gms.internal.atv_ads_framework.d1, com.google.android.gms.internal.atv_ads_framework.Q1, com.google.android.gms.internal.atv_ads_framework.A0, com.google.android.gms.internal.atv_ads_framework.k1):com.google.android.gms.internal.atv_ads_framework.s1");
    }

    private final int n(Object obj) {
        int i10;
        int iY;
        int iY2;
        int iZ;
        int iY3;
        int iY4;
        int iY5;
        int iY6;
        int I10;
        int iY7;
        int iZ2;
        int iY8;
        int iY9;
        Unsafe unsafe = f81881n;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        for (int i14 = 0; i14 < this.f81882a.length; i14 += 3) {
            int iR = r(i14);
            int[] iArr = this.f81882a;
            int i15 = iArr[i14];
            int iQ = q(iR);
            if (iQ <= 17) {
                int i16 = iArr[i14 + 2];
                int i17 = i16 & 1048575;
                int i18 = i16 >>> 20;
                if (i17 != i13) {
                    i12 = unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << i18;
            } else {
                i10 = 0;
            }
            long j10 = iR & 1048575;
            switch (iQ) {
                case 0:
                    if ((i12 & i10) != 0) {
                        iY = AbstractC10394x0.y(i15 << 3);
                        I10 = iY + 8;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i12 & i10) != 0) {
                        iY2 = AbstractC10394x0.y(i15 << 3);
                        I10 = iY2 + 4;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i12 & i10) != 0) {
                        iZ = AbstractC10394x0.z(unsafe.getLong(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i12 & i10) != 0) {
                        iZ = AbstractC10394x0.z(unsafe.getLong(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i12 & i10) != 0) {
                        iZ = AbstractC10394x0.v(unsafe.getInt(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i12 & i10) != 0) {
                        iY = AbstractC10394x0.y(i15 << 3);
                        I10 = iY + 8;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i12 & i10) != 0) {
                        iY2 = AbstractC10394x0.y(i15 << 3);
                        I10 = iY2 + 4;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i12 & i10) != 0) {
                        iY4 = AbstractC10394x0.y(i15 << 3);
                        I10 = iY4 + 1;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i12 & i10) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof AbstractC10374q0) {
                            int i19 = i15 << 3;
                            int i20 = AbstractC10394x0.f81914d;
                            int iF = ((AbstractC10374q0) object).f();
                            iY5 = AbstractC10394x0.y(iF) + iF;
                            iY6 = AbstractC10394x0.y(i19);
                            I10 = iY6 + iY5;
                            i11 += I10;
                            break;
                        } else {
                            iZ = AbstractC10394x0.x((String) object);
                            iY3 = AbstractC10394x0.y(i15 << 3);
                            i11 += iY3 + iZ;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i12 & i10) != 0) {
                        I10 = C1.I(i15, unsafe.getObject(obj, j10), t(i14));
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i12 & i10) != 0) {
                        AbstractC10374q0 abstractC10374q0 = (AbstractC10374q0) unsafe.getObject(obj, j10);
                        int i21 = i15 << 3;
                        int i22 = AbstractC10394x0.f81914d;
                        int iF2 = abstractC10374q0.f();
                        iY5 = AbstractC10394x0.y(iF2) + iF2;
                        iY6 = AbstractC10394x0.y(i21);
                        I10 = iY6 + iY5;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i12 & i10) != 0) {
                        iZ = AbstractC10394x0.y(unsafe.getInt(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i12 & i10) != 0) {
                        iZ = AbstractC10394x0.v(unsafe.getInt(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i12 & i10) != 0) {
                        iY2 = AbstractC10394x0.y(i15 << 3);
                        I10 = iY2 + 4;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i12 & i10) != 0) {
                        iY = AbstractC10394x0.y(i15 << 3);
                        I10 = iY + 8;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i12 & i10) != 0) {
                        int i23 = unsafe.getInt(obj, j10);
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        iZ = AbstractC10394x0.y((i23 >> 31) ^ (i23 + i23));
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i12) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iY7 = AbstractC10394x0.y(i15 << 3);
                        iZ2 = AbstractC10394x0.z((j11 + j11) ^ (j11 >> 63));
                        I10 = iY7 + iZ2;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i12 & i10) != 0) {
                        I10 = AbstractC10394x0.u(i15, (InterfaceC10372p1) unsafe.getObject(obj, j10), t(i14));
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    I10 = C1.B(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 19:
                    I10 = C1.z(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 20:
                    I10 = C1.G(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 21:
                    I10 = C1.R(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    I10 = C1.E(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 23:
                    I10 = C1.B(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 24:
                    I10 = C1.z(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 25:
                    I10 = C1.v(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 26:
                    I10 = C1.O(i15, (List) unsafe.getObject(obj, j10));
                    i11 += I10;
                    break;
                case 27:
                    I10 = C1.J(i15, (List) unsafe.getObject(obj, j10), t(i14));
                    i11 += I10;
                    break;
                case 28:
                    I10 = C1.w(i15, (List) unsafe.getObject(obj, j10));
                    i11 += I10;
                    break;
                case 29:
                    I10 = C1.P(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 30:
                    I10 = C1.x(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 31:
                    I10 = C1.z(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case l3.f93325e /* 32 */:
                    I10 = C1.B(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 33:
                    I10 = C1.K(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 34:
                    I10 = C1.M(i15, (List) unsafe.getObject(obj, j10), false);
                    i11 += I10;
                    break;
                case 35:
                    iZ = C1.C((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i24 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i24);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZ = C1.A((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i25 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i25);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZ = C1.H((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i26 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i26);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZ = C1.S((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i27 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i27);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZ = C1.F((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i28 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i28);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZ = C1.C((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i29 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i29);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZ = C1.A((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i30 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i30);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i31 = C1.f81587d;
                    iZ = list.size();
                    if (iZ > 0) {
                        int i32 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i32);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZ = C1.Q((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i33 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i33);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZ = C1.y((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i34 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i34);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZ = C1.A((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i35 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i35);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZ = C1.C((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i36 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i36);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZ = C1.L((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i37 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i37);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZ = C1.N((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i38 = i15 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i38);
                        iY3 = iY9 + iY8;
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    I10 = C1.D(i15, (List) unsafe.getObject(obj, j10), t(i14));
                    i11 += I10;
                    break;
                case 50:
                    C10357k1.a(i15, unsafe.getObject(obj, j10), u(i14));
                    break;
                case 51:
                    if (h(obj, i15, i14)) {
                        iY = AbstractC10394x0.y(i15 << 3);
                        I10 = iY + 8;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (h(obj, i15, i14)) {
                        iY2 = AbstractC10394x0.y(i15 << 3);
                        I10 = iY2 + 4;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (h(obj, i15, i14)) {
                        iZ = AbstractC10394x0.z(s(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (h(obj, i15, i14)) {
                        iZ = AbstractC10394x0.z(s(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (h(obj, i15, i14)) {
                        iZ = AbstractC10394x0.v(o(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (h(obj, i15, i14)) {
                        iY = AbstractC10394x0.y(i15 << 3);
                        I10 = iY + 8;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (h(obj, i15, i14)) {
                        iY2 = AbstractC10394x0.y(i15 << 3);
                        I10 = iY2 + 4;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (h(obj, i15, i14)) {
                        iY4 = AbstractC10394x0.y(i15 << 3);
                        I10 = iY4 + 1;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (h(obj, i15, i14)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof AbstractC10374q0) {
                            int i39 = i15 << 3;
                            int i40 = AbstractC10394x0.f81914d;
                            int iF3 = ((AbstractC10374q0) object2).f();
                            iY5 = AbstractC10394x0.y(iF3) + iF3;
                            iY6 = AbstractC10394x0.y(i39);
                            I10 = iY6 + iY5;
                            i11 += I10;
                            break;
                        } else {
                            iZ = AbstractC10394x0.x((String) object2);
                            iY3 = AbstractC10394x0.y(i15 << 3);
                            i11 += iY3 + iZ;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (h(obj, i15, i14)) {
                        I10 = C1.I(i15, unsafe.getObject(obj, j10), t(i14));
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (h(obj, i15, i14)) {
                        AbstractC10374q0 abstractC10374q02 = (AbstractC10374q0) unsafe.getObject(obj, j10);
                        int i41 = i15 << 3;
                        int i42 = AbstractC10394x0.f81914d;
                        int iF4 = abstractC10374q02.f();
                        iY5 = AbstractC10394x0.y(iF4) + iF4;
                        iY6 = AbstractC10394x0.y(i41);
                        I10 = iY6 + iY5;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (h(obj, i15, i14)) {
                        iZ = AbstractC10394x0.y(o(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (h(obj, i15, i14)) {
                        iZ = AbstractC10394x0.v(o(obj, j10));
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (h(obj, i15, i14)) {
                        iY2 = AbstractC10394x0.y(i15 << 3);
                        I10 = iY2 + 4;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (h(obj, i15, i14)) {
                        iY = AbstractC10394x0.y(i15 << 3);
                        I10 = iY + 8;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (h(obj, i15, i14)) {
                        int iO = o(obj, j10);
                        iY3 = AbstractC10394x0.y(i15 << 3);
                        iZ = AbstractC10394x0.y((iO >> 31) ^ (iO + iO));
                        i11 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (h(obj, i15, i14)) {
                        long jS = s(obj, j10);
                        iY7 = AbstractC10394x0.y(i15 << 3);
                        iZ2 = AbstractC10394x0.z((jS + jS) ^ (jS >> 63));
                        I10 = iY7 + iZ2;
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (h(obj, i15, i14)) {
                        I10 = AbstractC10394x0.u(i15, (InterfaceC10372p1) unsafe.getObject(obj, j10), t(i14));
                        i11 += I10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        Q1 q12 = this.f81890i;
        int iA = i11 + q12.a(q12.c(obj));
        if (!this.f81885d) {
            return iA;
        }
        this.f81891j.a(obj);
        throw null;
    }

    private final int p(int i10) {
        return this.f81882a[i10 + 2];
    }

    private final int r(int i10) {
        return this.f81882a[i10 + 1];
    }

    private final InterfaceC10401z1 t(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC10401z1 interfaceC10401z1 = (InterfaceC10401z1) this.f81883b[i12];
        if (interfaceC10401z1 != null) {
            return interfaceC10401z1;
        }
        InterfaceC10401z1 interfaceC10401z1B = C10395x1.a().b((Class) this.f81883b[i12 + 1]);
        this.f81883b[i12] = interfaceC10401z1B;
        return interfaceC10401z1B;
    }

    private final Object u(int i10) {
        int i11 = i10 / 3;
        return this.f81883b[i11 + i11];
    }

    private final void x(Object obj, Object obj2, int i10) {
        int i11 = this.f81882a[i10];
        if (h(obj2, i11, i10)) {
            int iR = r(i10) & 1048575;
            Unsafe unsafe = f81881n;
            long j10 = iR;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f81882a[i10] + " is present but null: " + obj2.toString());
            }
            InterfaceC10401z1 interfaceC10401z1T = t(i10);
            if (!h(obj, i11, i10)) {
                if (g(object)) {
                    Object objZzc = interfaceC10401z1T.zzc();
                    interfaceC10401z1T.c(objZzc, object);
                    unsafe.putObject(obj, j10, objZzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                z(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!g(object2)) {
                Object objZzc2 = interfaceC10401z1T.zzc();
                interfaceC10401z1T.c(objZzc2, object2);
                unsafe.putObject(obj, j10, objZzc2);
                object2 = objZzc2;
            }
            interfaceC10401z1T.c(object2, object);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final int zza(Object obj) {
        int iY;
        int iY2;
        int iZ;
        int iY3;
        int iY4;
        int iY5;
        int iY6;
        int I10;
        int iY7;
        int iZ2;
        int iY8;
        int iY9;
        if (!this.f81886e) {
            return n(obj);
        }
        Unsafe unsafe = f81881n;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f81882a.length; i11 += 3) {
            int iR = r(i11);
            int iQ = q(iR);
            int i12 = this.f81882a[i11];
            int i13 = iR & 1048575;
            if (iQ >= G0.f81615M.zza() && iQ <= G0.f81628Z.zza()) {
                int i14 = this.f81882a[i11 + 2];
            }
            long j10 = i13;
            switch (iQ) {
                case 0:
                    if (d(obj, i11)) {
                        iY = AbstractC10394x0.y(i12 << 3);
                        I10 = iY + 8;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (d(obj, i11)) {
                        iY2 = AbstractC10394x0.y(i12 << 3);
                        I10 = iY2 + 4;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (d(obj, i11)) {
                        iZ = AbstractC10394x0.z(C10326a2.i(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (d(obj, i11)) {
                        iZ = AbstractC10394x0.z(C10326a2.i(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (d(obj, i11)) {
                        iZ = AbstractC10394x0.v(C10326a2.h(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (d(obj, i11)) {
                        iY = AbstractC10394x0.y(i12 << 3);
                        I10 = iY + 8;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (d(obj, i11)) {
                        iY2 = AbstractC10394x0.y(i12 << 3);
                        I10 = iY2 + 4;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (d(obj, i11)) {
                        iY4 = AbstractC10394x0.y(i12 << 3);
                        I10 = iY4 + 1;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (d(obj, i11)) {
                        Object objK = C10326a2.k(obj, j10);
                        if (objK instanceof AbstractC10374q0) {
                            int i15 = i12 << 3;
                            int i16 = AbstractC10394x0.f81914d;
                            int iF = ((AbstractC10374q0) objK).f();
                            iY5 = AbstractC10394x0.y(iF) + iF;
                            iY6 = AbstractC10394x0.y(i15);
                            I10 = iY6 + iY5;
                            i10 += I10;
                            break;
                        } else {
                            iZ = AbstractC10394x0.x((String) objK);
                            iY3 = AbstractC10394x0.y(i12 << 3);
                            i10 += iY3 + iZ;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (d(obj, i11)) {
                        I10 = C1.I(i12, C10326a2.k(obj, j10), t(i11));
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (d(obj, i11)) {
                        AbstractC10374q0 abstractC10374q0 = (AbstractC10374q0) C10326a2.k(obj, j10);
                        int i17 = i12 << 3;
                        int i18 = AbstractC10394x0.f81914d;
                        int iF2 = abstractC10374q0.f();
                        iY5 = AbstractC10394x0.y(iF2) + iF2;
                        iY6 = AbstractC10394x0.y(i17);
                        I10 = iY6 + iY5;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (d(obj, i11)) {
                        iZ = AbstractC10394x0.y(C10326a2.h(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (d(obj, i11)) {
                        iZ = AbstractC10394x0.v(C10326a2.h(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (d(obj, i11)) {
                        iY2 = AbstractC10394x0.y(i12 << 3);
                        I10 = iY2 + 4;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (d(obj, i11)) {
                        iY = AbstractC10394x0.y(i12 << 3);
                        I10 = iY + 8;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (d(obj, i11)) {
                        int iH = C10326a2.h(obj, j10);
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        iZ = AbstractC10394x0.y((iH >> 31) ^ (iH + iH));
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (d(obj, i11)) {
                        long jI = C10326a2.i(obj, j10);
                        iY7 = AbstractC10394x0.y(i12 << 3);
                        iZ2 = AbstractC10394x0.z((jI + jI) ^ (jI >> 63));
                        I10 = iY7 + iZ2;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (d(obj, i11)) {
                        I10 = AbstractC10394x0.u(i12, (InterfaceC10372p1) C10326a2.k(obj, j10), t(i11));
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    I10 = C1.B(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 19:
                    I10 = C1.z(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 20:
                    I10 = C1.G(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 21:
                    I10 = C1.R(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    I10 = C1.E(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 23:
                    I10 = C1.B(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 24:
                    I10 = C1.z(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 25:
                    I10 = C1.v(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 26:
                    I10 = C1.O(i12, (List) C10326a2.k(obj, j10));
                    i10 += I10;
                    break;
                case 27:
                    I10 = C1.J(i12, (List) C10326a2.k(obj, j10), t(i11));
                    i10 += I10;
                    break;
                case 28:
                    I10 = C1.w(i12, (List) C10326a2.k(obj, j10));
                    i10 += I10;
                    break;
                case 29:
                    I10 = C1.P(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 30:
                    I10 = C1.x(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 31:
                    I10 = C1.z(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case l3.f93325e /* 32 */:
                    I10 = C1.B(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 33:
                    I10 = C1.K(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 34:
                    I10 = C1.M(i12, (List) C10326a2.k(obj, j10), false);
                    i10 += I10;
                    break;
                case 35:
                    iZ = C1.C((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i19 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i19);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZ = C1.A((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i20 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i20);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZ = C1.H((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i21 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i21);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZ = C1.S((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i22 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i22);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZ = C1.F((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i23 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i23);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZ = C1.C((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i24 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i24);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZ = C1.A((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i25 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i25);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i26 = C1.f81587d;
                    iZ = list.size();
                    if (iZ > 0) {
                        int i27 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i27);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZ = C1.Q((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i28 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i28);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZ = C1.y((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i29 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i29);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZ = C1.A((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i30 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i30);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZ = C1.C((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i31 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i31);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZ = C1.L((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i32 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i32);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    iZ = C1.N((List) unsafe.getObject(obj, j10));
                    if (iZ > 0) {
                        int i33 = i12 << 3;
                        iY8 = AbstractC10394x0.y(iZ);
                        iY9 = AbstractC10394x0.y(i33);
                        iY3 = iY9 + iY8;
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    I10 = C1.D(i12, (List) C10326a2.k(obj, j10), t(i11));
                    i10 += I10;
                    break;
                case 50:
                    C10357k1.a(i12, C10326a2.k(obj, j10), u(i11));
                    break;
                case 51:
                    if (h(obj, i12, i11)) {
                        iY = AbstractC10394x0.y(i12 << 3);
                        I10 = iY + 8;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (h(obj, i12, i11)) {
                        iY2 = AbstractC10394x0.y(i12 << 3);
                        I10 = iY2 + 4;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (h(obj, i12, i11)) {
                        iZ = AbstractC10394x0.z(s(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (h(obj, i12, i11)) {
                        iZ = AbstractC10394x0.z(s(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (h(obj, i12, i11)) {
                        iZ = AbstractC10394x0.v(o(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (h(obj, i12, i11)) {
                        iY = AbstractC10394x0.y(i12 << 3);
                        I10 = iY + 8;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (h(obj, i12, i11)) {
                        iY2 = AbstractC10394x0.y(i12 << 3);
                        I10 = iY2 + 4;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (h(obj, i12, i11)) {
                        iY4 = AbstractC10394x0.y(i12 << 3);
                        I10 = iY4 + 1;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (h(obj, i12, i11)) {
                        Object objK2 = C10326a2.k(obj, j10);
                        if (objK2 instanceof AbstractC10374q0) {
                            int i34 = i12 << 3;
                            int i35 = AbstractC10394x0.f81914d;
                            int iF3 = ((AbstractC10374q0) objK2).f();
                            iY5 = AbstractC10394x0.y(iF3) + iF3;
                            iY6 = AbstractC10394x0.y(i34);
                            I10 = iY6 + iY5;
                            i10 += I10;
                            break;
                        } else {
                            iZ = AbstractC10394x0.x((String) objK2);
                            iY3 = AbstractC10394x0.y(i12 << 3);
                            i10 += iY3 + iZ;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (h(obj, i12, i11)) {
                        I10 = C1.I(i12, C10326a2.k(obj, j10), t(i11));
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (h(obj, i12, i11)) {
                        AbstractC10374q0 abstractC10374q02 = (AbstractC10374q0) C10326a2.k(obj, j10);
                        int i36 = i12 << 3;
                        int i37 = AbstractC10394x0.f81914d;
                        int iF4 = abstractC10374q02.f();
                        iY5 = AbstractC10394x0.y(iF4) + iF4;
                        iY6 = AbstractC10394x0.y(i36);
                        I10 = iY6 + iY5;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (h(obj, i12, i11)) {
                        iZ = AbstractC10394x0.y(o(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (h(obj, i12, i11)) {
                        iZ = AbstractC10394x0.v(o(obj, j10));
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (h(obj, i12, i11)) {
                        iY2 = AbstractC10394x0.y(i12 << 3);
                        I10 = iY2 + 4;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (h(obj, i12, i11)) {
                        iY = AbstractC10394x0.y(i12 << 3);
                        I10 = iY + 8;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (h(obj, i12, i11)) {
                        int iO = o(obj, j10);
                        iY3 = AbstractC10394x0.y(i12 << 3);
                        iZ = AbstractC10394x0.y((iO >> 31) ^ (iO + iO));
                        i10 += iY3 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (h(obj, i12, i11)) {
                        long jS = s(obj, j10);
                        iY7 = AbstractC10394x0.y(i12 << 3);
                        iZ2 = AbstractC10394x0.z((jS + jS) ^ (jS >> 63));
                        I10 = iY7 + iZ2;
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (h(obj, i12, i11)) {
                        I10 = AbstractC10394x0.u(i12, (InterfaceC10372p1) C10326a2.k(obj, j10), t(i11));
                        i10 += I10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        Q1 q12 = this.f81890i;
        return i10 + q12.a(q12.c(obj));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int length = this.f81882a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iR = r(i12);
            int i13 = this.f81882a[i12];
            long j10 = 1048575 & iR;
            int iHashCode = 37;
            switch (q(iR)) {
                case 0:
                    i10 = i11 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(C10326a2.f(obj, j10));
                    byte[] bArr = S0.f81715d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iFloatToIntBits = Float.floatToIntBits(C10326a2.g(obj, j10));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i11 * 53;
                    jDoubleToLongBits = C10326a2.i(obj, j10);
                    byte[] bArr2 = S0.f81715d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i11 * 53;
                    jDoubleToLongBits = C10326a2.i(obj, j10);
                    byte[] bArr3 = S0.f81715d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iFloatToIntBits = C10326a2.h(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i11 * 53;
                    jDoubleToLongBits = C10326a2.i(obj, j10);
                    byte[] bArr4 = S0.f81715d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iFloatToIntBits = C10326a2.h(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iFloatToIntBits = S0.a(C10326a2.B(obj, j10));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iFloatToIntBits = ((String) C10326a2.k(obj, j10)).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    Object objK = C10326a2.k(obj, j10);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iFloatToIntBits = C10326a2.k(obj, j10).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iFloatToIntBits = C10326a2.h(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iFloatToIntBits = C10326a2.h(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iFloatToIntBits = C10326a2.h(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i11 * 53;
                    jDoubleToLongBits = C10326a2.i(obj, j10);
                    byte[] bArr5 = S0.f81715d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iFloatToIntBits = C10326a2.h(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i11 * 53;
                    jDoubleToLongBits = C10326a2.i(obj, j10);
                    byte[] bArr6 = S0.f81715d;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    Object objK2 = C10326a2.k(obj, j10);
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
                    iFloatToIntBits = C10326a2.k(obj, j10).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iFloatToIntBits = C10326a2.k(obj, j10).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(l(obj, j10));
                        byte[] bArr7 = S0.f81715d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = Float.floatToIntBits(m(obj, j10));
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = s(obj, j10);
                        byte[] bArr8 = S0.f81715d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = s(obj, j10);
                        byte[] bArr9 = S0.f81715d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = o(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = s(obj, j10);
                        byte[] bArr10 = S0.f81715d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = o(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = S0.a(i(obj, j10));
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = ((String) C10326a2.k(obj, j10)).hashCode();
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = C10326a2.k(obj, j10).hashCode();
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = C10326a2.k(obj, j10).hashCode();
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = o(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = o(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = o(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = s(obj, j10);
                        byte[] bArr11 = S0.f81715d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = o(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = s(obj, j10);
                        byte[] bArr12 = S0.f81715d;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (h(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = C10326a2.k(obj, j10).hashCode();
                        i11 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f81890i.c(obj).hashCode();
        if (!this.f81885d) {
            return iHashCode2;
        }
        this.f81891j.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final Object zzc() {
        return ((K0) this.f81884c).i();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final boolean zzg(Object obj, Object obj2) {
        boolean zU;
        int length = this.f81882a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iR = r(i10);
            long j10 = iR & 1048575;
            switch (q(iR)) {
                case 0:
                    if (!B(obj, obj2, i10) || Double.doubleToLongBits(C10326a2.f(obj, j10)) != Double.doubleToLongBits(C10326a2.f(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!B(obj, obj2, i10) || Float.floatToIntBits(C10326a2.g(obj, j10)) != Float.floatToIntBits(C10326a2.g(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!B(obj, obj2, i10) || C10326a2.i(obj, j10) != C10326a2.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!B(obj, obj2, i10) || C10326a2.i(obj, j10) != C10326a2.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!B(obj, obj2, i10) || C10326a2.h(obj, j10) != C10326a2.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!B(obj, obj2, i10) || C10326a2.i(obj, j10) != C10326a2.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!B(obj, obj2, i10) || C10326a2.h(obj, j10) != C10326a2.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!B(obj, obj2, i10) || C10326a2.B(obj, j10) != C10326a2.B(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!B(obj, obj2, i10) || !C1.u(C10326a2.k(obj, j10), C10326a2.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!B(obj, obj2, i10) || !C1.u(C10326a2.k(obj, j10), C10326a2.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!B(obj, obj2, i10) || !C1.u(C10326a2.k(obj, j10), C10326a2.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!B(obj, obj2, i10) || C10326a2.h(obj, j10) != C10326a2.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!B(obj, obj2, i10) || C10326a2.h(obj, j10) != C10326a2.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!B(obj, obj2, i10) || C10326a2.h(obj, j10) != C10326a2.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!B(obj, obj2, i10) || C10326a2.i(obj, j10) != C10326a2.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!B(obj, obj2, i10) || C10326a2.h(obj, j10) != C10326a2.h(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!B(obj, obj2, i10) || C10326a2.i(obj, j10) != C10326a2.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!B(obj, obj2, i10) || !C1.u(C10326a2.k(obj, j10), C10326a2.k(obj2, j10))) {
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
                    zU = C1.u(C10326a2.k(obj, j10), C10326a2.k(obj2, j10));
                    break;
                case 50:
                    zU = C1.u(C10326a2.k(obj, j10), C10326a2.k(obj2, j10));
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
                    long jP = p(i10) & 1048575;
                    if (C10326a2.h(obj, jP) != C10326a2.h(obj2, jP) || !C1.u(C10326a2.k(obj, j10), C10326a2.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zU) {
                return false;
            }
        }
        if (!this.f81890i.c(obj).equals(this.f81890i.c(obj2))) {
            return false;
        }
        if (!this.f81885d) {
            return true;
        }
        this.f81891j.a(obj);
        this.f81891j.a(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzh(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.C10380s1.zzh(java.lang.Object):boolean");
    }

    private final boolean B(Object obj, Object obj2, int i10) {
        if (d(obj, i10) == d(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean d(Object obj, int i10) {
        int iP = p(i10);
        long j10 = iP & 1048575;
        if (j10 == 1048575) {
            int iR = r(i10);
            long j11 = iR & 1048575;
            switch (q(iR)) {
                case 0:
                    if (Double.doubleToRawLongBits(C10326a2.f(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C10326a2.g(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C10326a2.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C10326a2.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C10326a2.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C10326a2.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C10326a2.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C10326a2.B(obj, j11);
                case 8:
                    Object objK = C10326a2.k(obj, j11);
                    if (objK instanceof String) {
                        if (((String) objK).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objK instanceof AbstractC10374q0) {
                        if (AbstractC10374q0.f81870b.equals(objK)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C10326a2.k(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC10374q0.f81870b.equals(C10326a2.k(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C10326a2.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C10326a2.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C10326a2.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C10326a2.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C10326a2.h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C10326a2.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C10326a2.k(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C10326a2.h(obj, j10) & (1 << (iP >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean e(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return d(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean f(Object obj, int i10, InterfaceC10401z1 interfaceC10401z1) {
        return interfaceC10401z1.zzh(C10326a2.k(obj, i10 & 1048575));
    }

    private final boolean h(Object obj, int i10, int i11) {
        if (C10326a2.h(obj, p(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean i(Object obj, long j10) {
        return ((Boolean) C10326a2.k(obj, j10)).booleanValue();
    }

    private static double l(Object obj, long j10) {
        return ((Double) C10326a2.k(obj, j10)).doubleValue();
    }

    private static float m(Object obj, long j10) {
        return ((Float) C10326a2.k(obj, j10)).floatValue();
    }

    private static int o(Object obj, long j10) {
        return ((Integer) C10326a2.k(obj, j10)).intValue();
    }

    private static long s(Object obj, long j10) {
        return ((Long) C10326a2.k(obj, j10)).longValue();
    }

    private static Field v(Class cls, String str) {
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

    private final void w(Object obj, Object obj2, int i10) {
        if (!d(obj2, i10)) {
            return;
        }
        int iR = r(i10) & 1048575;
        Unsafe unsafe = f81881n;
        long j10 = iR;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            InterfaceC10401z1 interfaceC10401z1T = t(i10);
            if (!d(obj, i10)) {
                if (!g(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object objZzc = interfaceC10401z1T.zzc();
                    interfaceC10401z1T.c(objZzc, object);
                    unsafe.putObject(obj, j10, objZzc);
                }
                y(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!g(object2)) {
                Object objZzc2 = interfaceC10401z1T.zzc();
                interfaceC10401z1T.c(objZzc2, object2);
                unsafe.putObject(obj, j10, objZzc2);
                object2 = objZzc2;
            }
            interfaceC10401z1T.c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f81882a[i10] + " is present but null: " + obj2.toString());
    }

    private final void y(Object obj, int i10) {
        int iP = p(i10);
        long j10 = 1048575 & iP;
        if (j10 == 1048575) {
            return;
        }
        C10326a2.v(obj, j10, (1 << (iP >>> 20)) | C10326a2.h(obj, j10));
    }

    private final void z(Object obj, int i10, int i11) {
        C10326a2.v(obj, p(i11) & 1048575, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = g(r8)
            if (r0 != 0) goto L8
            goto L91
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.atv_ads_framework.K0
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.atv_ads_framework.K0 r0 = (com.google.android.gms.internal.atv_ads_framework.K0) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.p(r2)
            r0.zza = r1
            r0.n()
        L1b:
            int[] r0 = r7.f81882a
            int r0 = r0.length
        L1e:
            if (r1 >= r0) goto L83
            int r2 = r7.r(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = q(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.atv_ads_framework.C10380s1.f81881n
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            r6 = r5
            com.google.android.gms.internal.atv_ads_framework.j1 r6 = (com.google.android.gms.internal.atv_ads_framework.C10354j1) r6
            r6.b()
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.atv_ads_framework.d1 r2 = r7.f81889h
            r2.a(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.f81882a
            r2 = r2[r1]
            boolean r2 = r7.h(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.atv_ads_framework.z1 r2 = r7.t(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.atv_ads_framework.C10380s1.f81881n
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.a(r3)
            goto L80
        L6d:
            boolean r2 = r7.d(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.atv_ads_framework.z1 r2 = r7.t(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.atv_ads_framework.C10380s1.f81881n
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.a(r3)
        L80:
            int r1 = r1 + 3
            goto L1e
        L83:
            com.google.android.gms.internal.atv_ads_framework.Q1 r0 = r7.f81890i
            r0.e(r8)
            boolean r0 = r7.f81885d
            if (r0 == 0) goto L91
            com.google.android.gms.internal.atv_ads_framework.A0 r0 = r7.f81891j
            r0.b(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.C10380s1.a(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final void c(Object obj, Object obj2) {
        if (g(obj)) {
            obj2.getClass();
            for (int i10 = 0; i10 < this.f81882a.length; i10 += 3) {
                int iR = r(i10);
                int i11 = this.f81882a[i10];
                long j10 = 1048575 & iR;
                switch (q(iR)) {
                    case 0:
                        if (d(obj2, i10)) {
                            C10326a2.t(obj, j10, C10326a2.f(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (d(obj2, i10)) {
                            C10326a2.u(obj, j10, C10326a2.g(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (d(obj2, i10)) {
                            C10326a2.w(obj, j10, C10326a2.i(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (d(obj2, i10)) {
                            C10326a2.w(obj, j10, C10326a2.i(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (d(obj2, i10)) {
                            C10326a2.v(obj, j10, C10326a2.h(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (d(obj2, i10)) {
                            C10326a2.w(obj, j10, C10326a2.i(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (d(obj2, i10)) {
                            C10326a2.v(obj, j10, C10326a2.h(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (d(obj2, i10)) {
                            C10326a2.r(obj, j10, C10326a2.B(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (d(obj2, i10)) {
                            C10326a2.x(obj, j10, C10326a2.k(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        w(obj, obj2, i10);
                        break;
                    case 10:
                        if (d(obj2, i10)) {
                            C10326a2.x(obj, j10, C10326a2.k(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (d(obj2, i10)) {
                            C10326a2.v(obj, j10, C10326a2.h(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (d(obj2, i10)) {
                            C10326a2.v(obj, j10, C10326a2.h(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (d(obj2, i10)) {
                            C10326a2.v(obj, j10, C10326a2.h(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (d(obj2, i10)) {
                            C10326a2.w(obj, j10, C10326a2.i(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (d(obj2, i10)) {
                            C10326a2.v(obj, j10, C10326a2.h(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (d(obj2, i10)) {
                            C10326a2.w(obj, j10, C10326a2.i(obj2, j10));
                            y(obj, i10);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        w(obj, obj2, i10);
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
                        this.f81889h.b(obj, obj2, j10);
                        break;
                    case 50:
                        int i12 = C1.f81587d;
                        C10354j1 c10354j1A = (C10354j1) C10326a2.k(obj, j10);
                        C10354j1 c10354j1 = (C10354j1) C10326a2.k(obj2, j10);
                        if (!c10354j1.isEmpty()) {
                            if (!c10354j1A.d()) {
                                c10354j1A = c10354j1A.a();
                            }
                            c10354j1A.c(c10354j1);
                        }
                        C10326a2.x(obj, j10, c10354j1A);
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
                        if (h(obj2, i11, i10)) {
                            C10326a2.x(obj, j10, C10326a2.k(obj2, j10));
                            z(obj, i11, i10);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        x(obj, obj2, i10);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (h(obj2, i11, i10)) {
                            C10326a2.x(obj, j10, C10326a2.k(obj2, j10));
                            z(obj, i11, i10);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        x(obj, obj2, i10);
                        break;
                }
            }
            C1.a(this.f81890i, obj, obj2);
            if (!this.f81885d) {
                return;
            }
            this.f81891j.a(obj2);
            throw null;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }
}
