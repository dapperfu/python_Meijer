package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.sv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9565sv0<T> implements Hv0<T> {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f79278m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    private static final Unsafe f79279n = C7753bw0.q();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f79280a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f79281b;

    /* renamed from: c, reason: collision with root package name */
    private final int f79282c;

    /* renamed from: d, reason: collision with root package name */
    private final int f79283d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9245pv0 f79284e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f79285f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f79286g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f79287h;

    /* renamed from: i, reason: collision with root package name */
    private final int f79288i;

    /* renamed from: j, reason: collision with root package name */
    private final int f79289j;

    /* renamed from: k, reason: collision with root package name */
    private final Uv0 f79290k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC9456ru0 f79291l;

    private C9565sv0(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC9245pv0 interfaceC9245pv0, boolean z10, int[] iArr2, int i12, int i13, C9779uv0 c9779uv0, C7857cv0 c7857cv0, Uv0 uv0, AbstractC9456ru0 abstractC9456ru0, C8710kv0 c8710kv0) {
        this.f79280a = iArr;
        this.f79281b = objArr;
        this.f79282c = i10;
        this.f79283d = i11;
        this.f79286g = interfaceC9245pv0 instanceof Gu0;
        boolean z11 = false;
        if (abstractC9456ru0 != null && (interfaceC9245pv0 instanceof Cu0)) {
            z11 = true;
        }
        this.f79285f = z11;
        this.f79287h = iArr2;
        this.f79288i = i12;
        this.f79289j = i13;
        this.f79290k = uv0;
        this.f79291l = abstractC9456ru0;
        this.f79284e = interfaceC9245pv0;
    }

    private static int G(int i10) {
        return (i10 >>> 20) & com.medallia.digital.mobilesdk.l3.f93323c;
    }

    private static boolean p(int i10) {
        return (i10 & 536870912) != 0;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void a(Object obj, byte[] bArr, int i10, int i11, Mt0 mt0) throws IOException {
        x(obj, bArr, i10, i11, 0, mt0);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int x(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.Mt0 r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9565sv0.x(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.Mt0):int");
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f79280a.length; i13 += 3) {
            int iH = H(i13);
            int[] iArr = this.f79280a;
            int i14 = 1048575 & iH;
            int iG = G(iH);
            int i15 = iArr[i13];
            long j10 = i14;
            int iHashCode = 37;
            switch (iG) {
                case 0:
                    i10 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(C7753bw0.j(obj, j10));
                    byte[] bArr = Tu0.f71313b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(C7753bw0.k(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C7753bw0.n(obj, j10);
                    byte[] bArr2 = Tu0.f71313b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C7753bw0.n(obj, j10);
                    byte[] bArr3 = Tu0.f71313b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iFloatToIntBits = C7753bw0.l(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C7753bw0.n(obj, j10);
                    byte[] bArr4 = Tu0.f71313b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iFloatToIntBits = C7753bw0.l(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = Tu0.a(C7753bw0.H(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) C7753bw0.p(obj, j10)).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objP = C7753bw0.p(obj, j10);
                    if (objP != null) {
                        iHashCode = objP.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = C7753bw0.p(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iFloatToIntBits = C7753bw0.l(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iFloatToIntBits = C7753bw0.l(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iFloatToIntBits = C7753bw0.l(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C7753bw0.n(obj, j10);
                    byte[] bArr5 = Tu0.f71313b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iFloatToIntBits = C7753bw0.l(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    jDoubleToLongBits = C7753bw0.n(obj, j10);
                    byte[] bArr6 = Tu0.f71313b;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objP2 = C7753bw0.p(obj, j10);
                    if (objP2 != null) {
                        iHashCode = objP2.hashCode();
                    }
                    i12 = i11 + iHashCode;
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
                    i10 = i12 * 53;
                    iFloatToIntBits = C7753bw0.p(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = C7753bw0.p(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(A(obj, j10));
                        byte[] bArr7 = Tu0.f71313b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(B(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr8 = Tu0.f71313b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr9 = Tu0.f71313b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr10 = Tu0.f71313b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Tu0.a(v(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) C7753bw0.p(obj, j10)).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C7753bw0.p(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C7753bw0.p(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr11 = Tu0.f71313b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = I(obj, j10);
                        byte[] bArr12 = Tu0.f71313b;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = C7753bw0.p(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i12 * 53) + ((Gu0) obj).zzt.hashCode();
        return this.f79285f ? (iHashCode2 * 53) + ((Cu0) obj).zza.f79989a.hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final boolean zzk(Object obj, Object obj2) {
        boolean zJ;
        for (int i10 = 0; i10 < this.f79280a.length; i10 += 3) {
            int iH = H(i10);
            long j10 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!o(obj, obj2, i10) || Double.doubleToLongBits(C7753bw0.j(obj, j10)) != Double.doubleToLongBits(C7753bw0.j(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!o(obj, obj2, i10) || Float.floatToIntBits(C7753bw0.k(obj, j10)) != Float.floatToIntBits(C7753bw0.k(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!o(obj, obj2, i10) || C7753bw0.n(obj, j10) != C7753bw0.n(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!o(obj, obj2, i10) || C7753bw0.n(obj, j10) != C7753bw0.n(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!o(obj, obj2, i10) || C7753bw0.l(obj, j10) != C7753bw0.l(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!o(obj, obj2, i10) || C7753bw0.n(obj, j10) != C7753bw0.n(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!o(obj, obj2, i10) || C7753bw0.l(obj, j10) != C7753bw0.l(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!o(obj, obj2, i10) || C7753bw0.H(obj, j10) != C7753bw0.H(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!o(obj, obj2, i10) || !Jv0.j(C7753bw0.p(obj, j10), C7753bw0.p(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!o(obj, obj2, i10) || !Jv0.j(C7753bw0.p(obj, j10), C7753bw0.p(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!o(obj, obj2, i10) || !Jv0.j(C7753bw0.p(obj, j10), C7753bw0.p(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!o(obj, obj2, i10) || C7753bw0.l(obj, j10) != C7753bw0.l(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!o(obj, obj2, i10) || C7753bw0.l(obj, j10) != C7753bw0.l(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!o(obj, obj2, i10) || C7753bw0.l(obj, j10) != C7753bw0.l(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!o(obj, obj2, i10) || C7753bw0.n(obj, j10) != C7753bw0.n(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!o(obj, obj2, i10) || C7753bw0.l(obj, j10) != C7753bw0.l(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!o(obj, obj2, i10) || C7753bw0.n(obj, j10) != C7753bw0.n(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!o(obj, obj2, i10) || !Jv0.j(C7753bw0.p(obj, j10), C7753bw0.p(obj2, j10))) {
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
                    zJ = Jv0.j(C7753bw0.p(obj, j10), C7753bw0.p(obj2, j10));
                    break;
                case 50:
                    zJ = Jv0.j(C7753bw0.p(obj, j10), C7753bw0.p(obj2, j10));
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
                    long jE = E(i10) & 1048575;
                    if (C7753bw0.l(obj, jE) != C7753bw0.l(obj2, jE) || !Jv0.j(C7753bw0.p(obj, j10), C7753bw0.p(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zJ) {
                return false;
            }
        }
        if (!((Gu0) obj).zzt.equals(((Gu0) obj2).zzt)) {
            return false;
        }
        if (this.f79285f) {
            return ((Cu0) obj).zza.equals(((Cu0) obj2).zza);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.ads.Hv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9565sv0.zzl(java.lang.Object):boolean");
    }

    private final int D(int i10) {
        if (i10 < this.f79282c || i10 > this.f79283d) {
            return -1;
        }
        return F(i10, 0);
    }

    private final int E(int i10) {
        return this.f79280a[i10 + 2];
    }

    private final int F(int i10, int i11) {
        int length = (this.f79280a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f79280a[i13];
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

    private final int H(int i10) {
        return this.f79280a[i10 + 1];
    }

    private final Mu0 J(int i10) {
        int i11 = i10 / 3;
        return (Mu0) this.f79281b[i11 + i11 + 1];
    }

    private final Hv0 K(int i10) {
        Object[] objArr = this.f79281b;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Hv0 hv0 = (Hv0) objArr[i12];
        if (hv0 != null) {
            return hv0;
        }
        Hv0 hv0B = C10207yv0.a().b((Class) objArr[i12 + 1]);
        this.f79281b[i12] = hv0B;
        return hv0B;
    }

    private final Object L(Object obj, int i10, Object obj2, Uv0 uv0, Object obj3) {
        int i11 = this.f79280a[i10];
        Object objP = C7753bw0.p(obj, H(i10) & 1048575);
        if (objP == null || J(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object M(int i10) {
        int i11 = i10 / 3;
        return this.f79281b[i11 + i11];
    }

    private final void i(Object obj, Object obj2, int i10) {
        int i11 = this.f79280a[i10];
        if (u(obj2, i11, i10)) {
            int iH = H(i10) & 1048575;
            Unsafe unsafe = f79279n;
            long j10 = iH;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f79280a[i10] + " is present but null: " + obj2.toString());
            }
            Hv0 hv0K = K(i10);
            if (!u(obj, i11, i10)) {
                if (t(object)) {
                    Object objZze = hv0K.zze();
                    hv0K.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                l(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!t(object2)) {
                Object objZze2 = hv0K.zze();
                hv0K.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            hv0K.zzg(object2, object);
        }
    }

    private final void m(Object obj, int i10, Object obj2) {
        f79279n.putObject(obj, H(i10) & 1048575, obj2);
        k(obj, i10);
    }

    private final void n(Object obj, int i10, int i11, Object obj2) {
        f79279n.putObject(obj, H(i11) & 1048575, obj2);
        l(obj, i10, i11);
    }

    private static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Gu0) {
            return ((Gu0) obj).V();
        }
        return true;
    }

    private static final void w(int i10, Object obj, InterfaceC8605jw0 interfaceC8605jw0) throws IOException {
        if (obj instanceof String) {
            interfaceC8605jw0.zzG(i10, (String) obj);
        } else {
            interfaceC8605jw0.c(i10, (Zt0) obj);
        }
    }

    static Vv0 y(Object obj) {
        Gu0 gu0 = (Gu0) obj;
        Vv0 vv0 = gu0.zzt;
        if (vv0 != Vv0.c()) {
            return vv0;
        }
        Vv0 vv0F = Vv0.f();
        gu0.zzt = vv0F;
        return vv0F;
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
    static com.google.android.gms.internal.ads.C9565sv0 z(java.lang.Class r32, com.google.android.gms.internal.ads.InterfaceC8924mv0 r33, com.google.android.gms.internal.ads.C9779uv0 r34, com.google.android.gms.internal.ads.C7857cv0 r35, com.google.android.gms.internal.ads.Uv0 r36, com.google.android.gms.internal.ads.AbstractC9456ru0 r37, com.google.android.gms.internal.ads.C8710kv0 r38) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9565sv0.z(java.lang.Class, com.google.android.gms.internal.ads.mv0, com.google.android.gms.internal.ads.uv0, com.google.android.gms.internal.ads.cv0, com.google.android.gms.internal.ads.Uv0, com.google.android.gms.internal.ads.ru0, com.google.android.gms.internal.ads.kv0):com.google.android.gms.internal.ads.sv0");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.Hv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r21, com.google.android.gms.internal.ads.InterfaceC8605jw0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9565sv0.c(java.lang.Object, com.google.android.gms.internal.ads.jw0):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0714 A[PHI: r0
      0x0714: PHI (r0v2 com.google.android.gms.internal.ads.sv0<T>) = 
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v39 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
      (r0v1 com.google.android.gms.internal.ads.sv0<T>)
     binds: [B:18:0x004f, B:278:0x0707, B:248:0x0643, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.Hv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9565sv0.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final Object zze() {
        return ((Gu0) this.f79284e).K();
    }

    private static double A(Object obj, long j10) {
        return ((Double) C7753bw0.p(obj, j10)).doubleValue();
    }

    private static float B(Object obj, long j10) {
        return ((Float) C7753bw0.p(obj, j10)).floatValue();
    }

    private static int C(Object obj, long j10) {
        return ((Integer) C7753bw0.p(obj, j10)).intValue();
    }

    private static long I(Object obj, long j10) {
        return ((Long) C7753bw0.p(obj, j10)).longValue();
    }

    private final Object d(Object obj, int i10) {
        Hv0 hv0K = K(i10);
        int iH = H(i10) & 1048575;
        if (!q(obj, i10)) {
            return hv0K.zze();
        }
        Object object = f79279n.getObject(obj, iH);
        if (t(object)) {
            return object;
        }
        Object objZze = hv0K.zze();
        if (object != null) {
            hv0K.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object e(Object obj, int i10, int i11) {
        Hv0 hv0K = K(i11);
        if (!u(obj, i10, i11)) {
            return hv0K.zze();
        }
        Object object = f79279n.getObject(obj, H(i11) & 1048575);
        if (t(object)) {
            return object;
        }
        Object objZze = hv0K.zze();
        if (object != null) {
            hv0K.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field f(Class cls, String str) {
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

    private static void g(Object obj) {
        if (t(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void h(Object obj, Object obj2, int i10) {
        if (!q(obj2, i10)) {
            return;
        }
        int iH = H(i10) & 1048575;
        Unsafe unsafe = f79279n;
        long j10 = iH;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            Hv0 hv0K = K(i10);
            if (!q(obj, i10)) {
                if (!t(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object objZze = hv0K.zze();
                    hv0K.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                }
                k(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!t(object2)) {
                Object objZze2 = hv0K.zze();
                hv0K.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            hv0K.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f79280a[i10] + " is present but null: " + obj2.toString());
    }

    private final void j(Object obj, int i10, Bv0 bv0) throws IOException {
        long j10 = i10 & 1048575;
        if (p(i10)) {
            C7753bw0.D(obj, j10, bv0.zzs());
        } else if (this.f79286g) {
            C7753bw0.D(obj, j10, bv0.zzr());
        } else {
            C7753bw0.D(obj, j10, bv0.zzp());
        }
    }

    private final void k(Object obj, int i10) {
        int iE = E(i10);
        long j10 = 1048575 & iE;
        if (j10 == 1048575) {
            return;
        }
        C7753bw0.B(obj, j10, (1 << (iE >>> 20)) | C7753bw0.l(obj, j10));
    }

    private final void l(Object obj, int i10, int i11) {
        C7753bw0.B(obj, E(i11) & 1048575, i10);
    }

    private final boolean o(Object obj, Object obj2, int i10) {
        if (q(obj, i10) == q(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean q(Object obj, int i10) {
        int iE = E(i10);
        long j10 = iE & 1048575;
        if (j10 == 1048575) {
            int iH = H(i10);
            long j11 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (Double.doubleToRawLongBits(C7753bw0.j(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C7753bw0.k(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C7753bw0.n(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C7753bw0.n(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C7753bw0.l(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C7753bw0.n(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C7753bw0.l(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C7753bw0.H(obj, j11);
                case 8:
                    Object objP = C7753bw0.p(obj, j11);
                    if (objP instanceof String) {
                        if (((String) objP).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objP instanceof Zt0) {
                        if (Zt0.f73122b.equals(objP)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C7753bw0.p(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (Zt0.f73122b.equals(C7753bw0.p(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C7753bw0.l(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C7753bw0.l(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C7753bw0.l(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C7753bw0.n(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C7753bw0.l(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C7753bw0.n(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C7753bw0.p(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C7753bw0.l(obj, j10) & (1 << (iE >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean r(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return q(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean s(Object obj, int i10, Hv0 hv0) {
        return hv0.zzl(C7753bw0.p(obj, i10 & 1048575));
    }

    private final boolean u(Object obj, int i10, int i11) {
        if (C7753bw0.l(obj, E(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean v(Object obj, long j10) {
        return ((Boolean) C7753bw0.p(obj, j10)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r2 = r3;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0610 A[LOOP:3: B:202:0x060c->B:204:0x0610, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Hv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r12, com.google.android.gms.internal.ads.Bv0 r13, com.google.android.gms.internal.ads.C9350qu0 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9565sv0.b(java.lang.Object, com.google.android.gms.internal.ads.Bv0, com.google.android.gms.internal.ads.qu0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // com.google.android.gms.internal.ads.Hv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = t(r8)
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.Gu0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.Gu0 r0 = (com.google.android.gms.internal.ads.Gu0) r0
            r0.z()
            r0.y()
            r0.D()
        L18:
            int[] r0 = r7.f79280a
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L85
            int r2 = r7.H(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = G(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6f
            r5 = 60
            if (r2 == r5) goto L57
            r5 = 68
            if (r2 == r5) goto L57
            switch(r2) {
                case 17: goto L6f;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L82
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.C9565sv0.f79279n
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L82
            r6 = r5
            com.google.android.gms.internal.ads.jv0 r6 = (com.google.android.gms.internal.ads.C8603jv0) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L82
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.C7753bw0.p(r8, r3)
            com.google.android.gms.internal.ads.Su0 r2 = (com.google.android.gms.internal.ads.Su0) r2
            r2.zzb()
            goto L82
        L57:
            int[] r2 = r7.f79280a
            r2 = r2[r1]
            boolean r2 = r7.u(r8, r2, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.Hv0 r2 = r7.K(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.C9565sv0.f79279n
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L82
        L6f:
            boolean r2 = r7.q(r8, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.Hv0 r2 = r7.K(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.C9565sv0.f79279n
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L82:
            int r1 = r1 + 3
            goto L1b
        L85:
            com.google.android.gms.internal.ads.Uv0 r0 = r7.f79290k
            r0.i(r8)
            boolean r0 = r7.f79285f
            if (r0 == 0) goto L93
            com.google.android.gms.internal.ads.ru0 r0 = r7.f79291l
            r0.a(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9565sv0.zzf(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.Hv0
    public final void zzg(Object obj, Object obj2) {
        g(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f79280a.length; i10 += 3) {
            int iH = H(i10);
            int i11 = 1048575 & iH;
            int[] iArr = this.f79280a;
            int iG = G(iH);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iG) {
                case 0:
                    if (q(obj2, i10)) {
                        C7753bw0.z(obj, j10, C7753bw0.j(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(obj2, i10)) {
                        C7753bw0.A(obj, j10, C7753bw0.k(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(obj2, i10)) {
                        C7753bw0.C(obj, j10, C7753bw0.n(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(obj2, i10)) {
                        C7753bw0.C(obj, j10, C7753bw0.n(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(obj2, i10)) {
                        C7753bw0.B(obj, j10, C7753bw0.l(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(obj2, i10)) {
                        C7753bw0.C(obj, j10, C7753bw0.n(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(obj2, i10)) {
                        C7753bw0.B(obj, j10, C7753bw0.l(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(obj2, i10)) {
                        C7753bw0.x(obj, j10, C7753bw0.H(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(obj2, i10)) {
                        C7753bw0.D(obj, j10, C7753bw0.p(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    h(obj, obj2, i10);
                    break;
                case 10:
                    if (q(obj2, i10)) {
                        C7753bw0.D(obj, j10, C7753bw0.p(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(obj2, i10)) {
                        C7753bw0.B(obj, j10, C7753bw0.l(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(obj2, i10)) {
                        C7753bw0.B(obj, j10, C7753bw0.l(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(obj2, i10)) {
                        C7753bw0.B(obj, j10, C7753bw0.l(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(obj2, i10)) {
                        C7753bw0.C(obj, j10, C7753bw0.n(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(obj2, i10)) {
                        C7753bw0.B(obj, j10, C7753bw0.l(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(obj2, i10)) {
                        C7753bw0.C(obj, j10, C7753bw0.n(obj2, j10));
                        k(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    h(obj, obj2, i10);
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
                    Su0 su0Zzf = (Su0) C7753bw0.p(obj, j10);
                    Su0 su0 = (Su0) C7753bw0.p(obj2, j10);
                    int size = su0Zzf.size();
                    int size2 = su0.size();
                    if (size > 0 && size2 > 0) {
                        if (!su0Zzf.zzc()) {
                            su0Zzf = su0Zzf.zzf(size2 + size);
                        }
                        su0Zzf.addAll(su0);
                    }
                    if (size > 0) {
                        su0 = su0Zzf;
                    }
                    C7753bw0.D(obj, j10, su0);
                    break;
                case 50:
                    int i13 = Jv0.f68833b;
                    C7753bw0.D(obj, j10, C8710kv0.b(C7753bw0.p(obj, j10), C7753bw0.p(obj2, j10)));
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
                    if (u(obj2, i12, i10)) {
                        C7753bw0.D(obj, j10, C7753bw0.p(obj2, j10));
                        l(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    i(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(obj2, i12, i10)) {
                        C7753bw0.D(obj, j10, C7753bw0.p(obj2, j10));
                        l(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    i(obj, obj2, i10);
                    break;
            }
        }
        Jv0.A(this.f79290k, obj, obj2);
        if (this.f79285f) {
            Jv0.z(this.f79291l, obj, obj2);
        }
    }
}
