package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class N5<T> implements V5<T> {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f82755l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    private static final Unsafe f82756m = C10603n6.v();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f82757a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f82758b;

    /* renamed from: c, reason: collision with root package name */
    private final int f82759c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82760d;

    /* renamed from: e, reason: collision with root package name */
    private final K5 f82761e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f82762f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f82763g;

    /* renamed from: h, reason: collision with root package name */
    private final int f82764h;

    /* renamed from: i, reason: collision with root package name */
    private final int f82765i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC10540g6 f82766j;

    /* renamed from: k, reason: collision with root package name */
    private final Q4 f82767k;

    private N5(int[] iArr, Object[] objArr, int i10, int i11, K5 k52, boolean z10, int[] iArr2, int i12, int i13, P5 p52, C10673v5 c10673v5, AbstractC10540g6 abstractC10540g6, Q4 q42, F5 f52) {
        this.f82757a = iArr;
        this.f82758b = objArr;
        this.f82759c = i10;
        this.f82760d = i11;
        boolean z11 = false;
        if (q42 != null && (k52 instanceof AbstractC10494b5)) {
            z11 = true;
        }
        this.f82762f = z11;
        this.f82763g = iArr2;
        this.f82764h = i12;
        this.f82765i = i13;
        this.f82766j = abstractC10540g6;
        this.f82767k = q42;
        this.f82761e = k52;
    }

    private static int K(int i10) {
        return (i10 >>> 20) & com.medallia.digital.mobilesdk.l3.f93323c;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    @Override // com.google.android.gms.internal.measurement.V5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.N5.a(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void c(Object obj, byte[] bArr, int i10, int i11, C10663u4 c10663u4) throws IOException {
        v(obj, bArr, i10, i11, 0, c10663u4);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int v(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.C10663u4 r40) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.N5.v(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.u4):int");
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final boolean zzb(Object obj, Object obj2) {
        boolean zB;
        for (int i10 = 0; i10 < this.f82757a.length; i10 += 3) {
            int I10 = I(i10);
            long j10 = I10 & 1048575;
            switch (K(I10)) {
                case 0:
                    if (!l(obj, obj2, i10) || Double.doubleToLongBits(C10603n6.q(obj, j10)) != Double.doubleToLongBits(C10603n6.q(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!l(obj, obj2, i10) || Float.floatToIntBits(C10603n6.o(obj, j10)) != Float.floatToIntBits(C10603n6.o(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!l(obj, obj2, i10) || C10603n6.k(obj, j10) != C10603n6.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!l(obj, obj2, i10) || C10603n6.k(obj, j10) != C10603n6.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!l(obj, obj2, i10) || C10603n6.i(obj, j10) != C10603n6.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!l(obj, obj2, i10) || C10603n6.k(obj, j10) != C10603n6.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!l(obj, obj2, i10) || C10603n6.i(obj, j10) != C10603n6.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!l(obj, obj2, i10) || C10603n6.m(obj, j10) != C10603n6.m(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!l(obj, obj2, i10) || !X5.b(C10603n6.s(obj, j10), C10603n6.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!l(obj, obj2, i10) || !X5.b(C10603n6.s(obj, j10), C10603n6.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!l(obj, obj2, i10) || !X5.b(C10603n6.s(obj, j10), C10603n6.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!l(obj, obj2, i10) || C10603n6.i(obj, j10) != C10603n6.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!l(obj, obj2, i10) || C10603n6.i(obj, j10) != C10603n6.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!l(obj, obj2, i10) || C10603n6.i(obj, j10) != C10603n6.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!l(obj, obj2, i10) || C10603n6.k(obj, j10) != C10603n6.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!l(obj, obj2, i10) || C10603n6.i(obj, j10) != C10603n6.i(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!l(obj, obj2, i10) || C10603n6.k(obj, j10) != C10603n6.k(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!l(obj, obj2, i10) || !X5.b(C10603n6.s(obj, j10), C10603n6.s(obj2, j10))) {
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
                    zB = X5.b(C10603n6.s(obj, j10), C10603n6.s(obj2, j10));
                    break;
                case 50:
                    zB = X5.b(C10603n6.s(obj, j10), C10603n6.s(obj2, j10));
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
                    long J10 = J(i10) & 1048575;
                    if (C10603n6.i(obj, J10) != C10603n6.i(obj2, J10) || !X5.b(C10603n6.s(obj, j10), C10603n6.s(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zB) {
                return false;
            }
        }
        if (!((AbstractC10521e5) obj).zzc.equals(((AbstractC10521e5) obj2).zzc)) {
            return false;
        }
        if (this.f82762f) {
            return ((AbstractC10494b5) obj).zzb.equals(((AbstractC10494b5) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f82757a;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((AbstractC10521e5) obj).zzc.hashCode();
                return this.f82762f ? (iHashCode * 53) + ((AbstractC10494b5) obj).zzb.f82845a.hashCode() : iHashCode;
            }
            int I10 = I(i12);
            int i14 = 1048575 & I10;
            int iK = K(I10);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iK) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(C10603n6.q(obj, j10));
                    byte[] bArr = C10611o5.f83156b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(C10603n6.o(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C10603n6.k(obj, j10);
                    byte[] bArr2 = C10611o5.f83156b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C10603n6.k(obj, j10);
                    byte[] bArr3 = C10611o5.f83156b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = C10603n6.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C10603n6.k(obj, j10);
                    byte[] bArr4 = C10611o5.f83156b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = C10603n6.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = C10611o5.b(C10603n6.m(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) C10603n6.s(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objS = C10603n6.s(obj, j10);
                    if (objS != null) {
                        iHashCode2 = objS.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = C10603n6.s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = C10603n6.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = C10603n6.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = C10603n6.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C10603n6.k(obj, j10);
                    byte[] bArr5 = C10611o5.f83156b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = C10603n6.i(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = C10603n6.k(obj, j10);
                    byte[] bArr6 = C10611o5.f83156b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objS2 = C10603n6.s(obj, j10);
                    if (objS2 != null) {
                        iHashCode2 = objS2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
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
                    i10 = i13 * 53;
                    iFloatToIntBits = C10603n6.s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = C10603n6.s(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(g(obj, j10));
                        byte[] bArr7 = C10611o5.f83156b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 52:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(h(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 53:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = j(obj, j10);
                        byte[] bArr8 = C10611o5.f83156b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 54:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = j(obj, j10);
                        byte[] bArr9 = C10611o5.f83156b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 55:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = i(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 56:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = j(obj, j10);
                        byte[] bArr10 = C10611o5.f83156b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 57:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = i(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 58:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = C10611o5.b(k(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 59:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) C10603n6.s(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 60:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = C10603n6.s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 61:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = C10603n6.s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 62:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = i(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 63:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = i(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 64:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = i(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 65:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = j(obj, j10);
                        byte[] bArr11 = C10611o5.f83156b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 66:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = i(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 67:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = j(obj, j10);
                        byte[] bArr12 = C10611o5.f83156b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 68:
                    if (!p(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = C10603n6.s(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    private final V5 A(int i10) {
        Object[] objArr = this.f82758b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        V5 v52 = (V5) objArr[i12];
        if (v52 != null) {
            return v52;
        }
        V5 v5B = S5.a().b((Class) objArr[i12 + 1]);
        objArr[i12] = v5B;
        return v5B;
    }

    private final Object B(int i10) {
        int i11 = i10 / 3;
        return this.f82758b[i11 + i11];
    }

    private final InterfaceC10566j5 C(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC10566j5) this.f82758b[i11 + i11 + 1];
    }

    private final void E(Object obj, int i10, Object obj2) {
        f82756m.putObject(obj, I(i10) & 1048575, obj2);
        o(obj, i10);
    }

    private final void G(Object obj, int i10, int i11, Object obj2) {
        f82756m.putObject(obj, I(i11) & 1048575, obj2);
        q(obj, i10, i11);
    }

    private final int I(int i10) {
        return this.f82757a[i10 + 1];
    }

    private final int J(int i10) {
        return this.f82757a[i10 + 2];
    }

    private static boolean e(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC10521e5) {
            return ((AbstractC10521e5) obj).k();
        }
        return true;
    }

    private final int r(int i10, int i11) {
        int[] iArr = this.f82757a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
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

    private static final int s(byte[] bArr, int i10, int i11, EnumC10638r6 enumC10638r6, Class cls, C10663u4 c10663u4) throws IOException {
        EnumC10638r6 enumC10638r62 = EnumC10638r6.f83203c;
        switch (enumC10638r6.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                c10663u4.f83267c = Double.valueOf(Double.longBitsToDouble(C10672v4.e(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                c10663u4.f83267c = Float.valueOf(Float.intBitsToFloat(C10672v4.d(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int iC = C10672v4.c(bArr, i10, c10663u4);
                c10663u4.f83267c = Long.valueOf(c10663u4.f83266b);
                return iC;
            case 4:
            case 12:
            case 13:
                int iA = C10672v4.a(bArr, i10, c10663u4);
                c10663u4.f83267c = Integer.valueOf(c10663u4.f83265a);
                return iA;
            case 5:
            case 15:
                int i14 = i10 + 8;
                c10663u4.f83267c = Long.valueOf(C10672v4.e(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                c10663u4.f83267c = Integer.valueOf(C10672v4.d(bArr, i10));
                return i15;
            case 7:
                int iC2 = C10672v4.c(bArr, i10, c10663u4);
                c10663u4.f83267c = Boolean.valueOf(c10663u4.f83266b != 0);
                return iC2;
            case 8:
                return C10672v4.f(bArr, i10, c10663u4);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return C10672v4.h(S5.a().b(cls), bArr, i10, i11, c10663u4);
            case 11:
                return C10672v4.g(bArr, i10, c10663u4);
            case 16:
                int iA2 = C10672v4.a(bArr, i10, c10663u4);
                c10663u4.f83267c = Integer.valueOf(I4.a(c10663u4.f83265a));
                return iA2;
            case 17:
                int iC3 = C10672v4.c(bArr, i10, c10663u4);
                c10663u4.f83267c = Long.valueOf(I4.b(c10663u4.f83266b));
                return iC3;
        }
    }

    private static final void t(int i10, Object obj, InterfaceC10656t6 interfaceC10656t6) throws IOException {
        if (obj instanceof String) {
            interfaceC10656t6.zzm(i10, (String) obj);
        } else {
            interfaceC10656t6.d(i10, (G4) obj);
        }
    }

    static C10549h6 u(Object obj) {
        AbstractC10521e5 abstractC10521e5 = (AbstractC10521e5) obj;
        C10549h6 c10549h6 = abstractC10521e5.zzc;
        if (c10549h6 != C10549h6.a()) {
            return c10549h6;
        }
        C10549h6 c10549h6B = C10549h6.b();
        abstractC10521e5.zzc = c10549h6B;
        return c10549h6B;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.measurement.N5 w(java.lang.Class r32, com.google.android.gms.internal.measurement.H5 r33, com.google.android.gms.internal.measurement.P5 r34, com.google.android.gms.internal.measurement.C10673v5 r35, com.google.android.gms.internal.measurement.AbstractC10540g6 r36, com.google.android.gms.internal.measurement.Q4 r37, com.google.android.gms.internal.measurement.F5 r38) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.N5.w(java.lang.Class, com.google.android.gms.internal.measurement.H5, com.google.android.gms.internal.measurement.P5, com.google.android.gms.internal.measurement.v5, com.google.android.gms.internal.measurement.g6, com.google.android.gms.internal.measurement.Q4, com.google.android.gms.internal.measurement.F5):com.google.android.gms.internal.measurement.N5");
    }

    private final void z(Object obj, Object obj2, int i10) {
        int[] iArr = this.f82757a;
        int i11 = iArr[i10];
        if (p(obj2, i11, i10)) {
            int I10 = I(i10) & 1048575;
            Unsafe unsafe = f82756m;
            long j10 = I10;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            V5 v5A = A(i10);
            if (!p(obj, i11, i10)) {
                if (e(object)) {
                    Object objZza = v5A.zza();
                    v5A.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                q(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!e(object2)) {
                Object objZza2 = v5A.zza();
                v5A.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            v5A.zzd(object2, object);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.V5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r19, com.google.android.gms.internal.measurement.InterfaceC10656t6 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.N5.d(java.lang.Object, com.google.android.gms.internal.measurement.t6):void");
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final Object zza() {
        return ((AbstractC10521e5) this.f82761e).m();
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    @Override // com.google.android.gms.internal.measurement.V5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zze(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.N5.zze(java.lang.Object):int");
    }

    private final Object D(Object obj, int i10) {
        V5 v5A = A(i10);
        int I10 = I(i10) & 1048575;
        if (!n(obj, i10)) {
            return v5A.zza();
        }
        Object object = f82756m.getObject(obj, I10);
        if (e(object)) {
            return object;
        }
        Object objZza = v5A.zza();
        if (object != null) {
            v5A.zzd(objZza, object);
        }
        return objZza;
    }

    private final Object F(Object obj, int i10, int i11) {
        V5 v5A = A(i11);
        if (!p(obj, i10, i11)) {
            return v5A.zza();
        }
        Object object = f82756m.getObject(obj, I(i11) & 1048575);
        if (e(object)) {
            return object;
        }
        Object objZza = v5A.zza();
        if (object != null) {
            v5A.zzd(objZza, object);
        }
        return objZza;
    }

    private static boolean H(Object obj, int i10, V5 v52) {
        return v52.a(C10603n6.s(obj, i10 & 1048575));
    }

    private static void f(Object obj) {
        if (e(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double g(Object obj, long j10) {
        return ((Double) C10603n6.s(obj, j10)).doubleValue();
    }

    private static float h(Object obj, long j10) {
        return ((Float) C10603n6.s(obj, j10)).floatValue();
    }

    private static int i(Object obj, long j10) {
        return ((Integer) C10603n6.s(obj, j10)).intValue();
    }

    private static long j(Object obj, long j10) {
        return ((Long) C10603n6.s(obj, j10)).longValue();
    }

    private static boolean k(Object obj, long j10) {
        return ((Boolean) C10603n6.s(obj, j10)).booleanValue();
    }

    private final boolean l(Object obj, Object obj2, int i10) {
        if (n(obj, i10) == n(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean m(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return n(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private final boolean n(Object obj, int i10) {
        int iJ = J(i10);
        long j10 = iJ & 1048575;
        if (j10 == 1048575) {
            int I10 = I(i10);
            long j11 = I10 & 1048575;
            switch (K(I10)) {
                case 0:
                    if (Double.doubleToRawLongBits(C10603n6.q(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C10603n6.o(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C10603n6.k(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C10603n6.k(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C10603n6.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C10603n6.k(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C10603n6.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C10603n6.m(obj, j11);
                case 8:
                    Object objS = C10603n6.s(obj, j11);
                    if (objS instanceof String) {
                        if (((String) objS).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objS instanceof G4) {
                        if (G4.f82610b.equals(objS)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C10603n6.s(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (G4.f82610b.equals(C10603n6.s(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C10603n6.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C10603n6.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C10603n6.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C10603n6.k(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C10603n6.i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C10603n6.k(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C10603n6.s(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C10603n6.i(obj, j10) & (1 << (iJ >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final void o(Object obj, int i10) {
        int iJ = J(i10);
        long j10 = 1048575 & iJ;
        if (j10 == 1048575) {
            return;
        }
        C10603n6.j(obj, j10, (1 << (iJ >>> 20)) | C10603n6.i(obj, j10));
    }

    private final boolean p(Object obj, int i10, int i11) {
        if (C10603n6.i(obj, J(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private final void q(Object obj, int i10, int i11) {
        C10603n6.j(obj, J(i11) & 1048575, i10);
    }

    private static Field x(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    private final void y(Object obj, Object obj2, int i10) {
        if (!n(obj2, i10)) {
            return;
        }
        int I10 = I(i10) & 1048575;
        Unsafe unsafe = f82756m;
        long j10 = I10;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            V5 v5A = A(i10);
            if (!n(obj, i10)) {
                if (!e(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object objZza = v5A.zza();
                    v5A.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                }
                o(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!e(object2)) {
                Object objZza2 = v5A.zza();
                v5A.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            v5A.zzd(object2, object);
            return;
        }
        int i11 = this.f82757a[i10];
        String string = obj2.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
        sb2.append("Source subfield ");
        sb2.append(i11);
        sb2.append(" is present but null: ");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // com.google.android.gms.internal.measurement.V5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = e(r8)
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.AbstractC10521e5
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.measurement.e5 r0 = (com.google.android.gms.internal.measurement.AbstractC10521e5) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.r(r2)
            r0.zza = r1
            r0.l()
        L1b:
            int[] r0 = r7.f82757a
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L85
            int r2 = r7.I(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = K(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6f
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L6f;
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
            goto L82
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.N5.f82756m
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L82
            r6 = r5
            com.google.android.gms.internal.measurement.E5 r6 = (com.google.android.gms.internal.measurement.E5) r6
            r6.d()
            r2.putObject(r8, r3, r5)
            goto L82
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.C10603n6.s(r8, r3)
            com.google.android.gms.internal.measurement.n5 r2 = (com.google.android.gms.internal.measurement.InterfaceC10602n5) r2
            r2.zzb()
            goto L82
        L59:
            r2 = r0[r1]
            boolean r2 = r7.p(r8, r2, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.measurement.V5 r2 = r7.A(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.N5.f82756m
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.b(r3)
            goto L82
        L6f:
            boolean r2 = r7.n(r8, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.measurement.V5 r2 = r7.A(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.N5.f82756m
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.b(r3)
        L82:
            int r1 = r1 + 3
            goto L1d
        L85:
            com.google.android.gms.internal.measurement.g6 r0 = r7.f82766j
            r0.b(r8)
            boolean r0 = r7.f82762f
            if (r0 == 0) goto L93
            com.google.android.gms.internal.measurement.Q4 r0 = r7.f82767k
            r0.a(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.N5.b(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void zzd(Object obj, Object obj2) {
        f(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f82757a;
            if (i10 < iArr.length) {
                int I10 = I(i10);
                int i11 = 1048575 & I10;
                int iK = K(I10);
                int i12 = iArr[i10];
                long j10 = i11;
                switch (iK) {
                    case 0:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.r(obj, j10, C10603n6.q(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 1:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.p(obj, j10, C10603n6.o(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 2:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.l(obj, j10, C10603n6.k(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 3:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.l(obj, j10, C10603n6.k(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 4:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.j(obj, j10, C10603n6.i(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 5:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.l(obj, j10, C10603n6.k(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 6:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.j(obj, j10, C10603n6.i(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 7:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.n(obj, j10, C10603n6.m(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 8:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.t(obj, j10, C10603n6.s(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 9:
                        y(obj, obj2, i10);
                        break;
                    case 10:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.t(obj, j10, C10603n6.s(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 11:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.j(obj, j10, C10603n6.i(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 12:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.j(obj, j10, C10603n6.i(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 13:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.j(obj, j10, C10603n6.i(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 14:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.l(obj, j10, C10603n6.k(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 15:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.j(obj, j10, C10603n6.i(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 16:
                        if (!n(obj2, i10)) {
                            break;
                        } else {
                            C10603n6.l(obj, j10, C10603n6.k(obj2, j10));
                            o(obj, i10);
                            break;
                        }
                    case 17:
                        y(obj, obj2, i10);
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
                        InterfaceC10602n5 interfaceC10602n5Zzg = (InterfaceC10602n5) C10603n6.s(obj, j10);
                        InterfaceC10602n5 interfaceC10602n5 = (InterfaceC10602n5) C10603n6.s(obj2, j10);
                        int size = interfaceC10602n5Zzg.size();
                        int size2 = interfaceC10602n5.size();
                        if (size > 0 && size2 > 0) {
                            if (!interfaceC10602n5Zzg.zza()) {
                                interfaceC10602n5Zzg = interfaceC10602n5Zzg.zzg(size2 + size);
                            }
                            interfaceC10602n5Zzg.addAll(interfaceC10602n5);
                        }
                        if (size > 0) {
                            interfaceC10602n5 = interfaceC10602n5Zzg;
                        }
                        C10603n6.t(obj, j10, interfaceC10602n5);
                        break;
                    case 50:
                        int i13 = X5.f82937b;
                        C10603n6.t(obj, j10, F5.a(C10603n6.s(obj, j10), C10603n6.s(obj2, j10)));
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
                        if (!p(obj2, i12, i10)) {
                            break;
                        } else {
                            C10603n6.t(obj, j10, C10603n6.s(obj2, j10));
                            q(obj, i12, i10);
                            break;
                        }
                    case 60:
                        z(obj, obj2, i10);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!p(obj2, i12, i10)) {
                            break;
                        } else {
                            C10603n6.t(obj, j10, C10603n6.s(obj2, j10));
                            q(obj, i12, i10);
                            break;
                        }
                    case 68:
                        z(obj, obj2, i10);
                        break;
                }
                i10 += 3;
            } else {
                X5.d(this.f82766j, obj, obj2);
                if (this.f82762f) {
                    X5.c(this.f82767k, obj, obj2);
                    return;
                }
                return;
            }
        }
    }
}
