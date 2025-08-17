package x3;

import androidx.media3.common.ParserException;
import d3.C13474i;
import e3.f;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f169044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f169045b;

    /* renamed from: c, reason: collision with root package name */
    public final int f169046c;

    /* renamed from: d, reason: collision with root package name */
    public final int f169047d;

    /* renamed from: e, reason: collision with root package name */
    public final int f169048e;

    /* renamed from: f, reason: collision with root package name */
    public final int f169049f;

    /* renamed from: g, reason: collision with root package name */
    public final int f169050g;

    /* renamed from: h, reason: collision with root package name */
    public final int f169051h;

    /* renamed from: i, reason: collision with root package name */
    public final int f169052i;

    /* renamed from: j, reason: collision with root package name */
    public final int f169053j;

    /* renamed from: k, reason: collision with root package name */
    public final int f169054k;

    /* renamed from: l, reason: collision with root package name */
    public final float f169055l;

    /* renamed from: m, reason: collision with root package name */
    public final int f169056m;

    /* renamed from: n, reason: collision with root package name */
    public final String f169057n;

    /* renamed from: o, reason: collision with root package name */
    public final f.k f169058o;

    public static C a(d3.D d10) throws ParserException {
        return b(d10, false, null);
    }

    public static C c(d3.D d10, f.k kVar) throws ParserException {
        return b(d10, true, kVar);
    }

    private static C b(d3.D d10, boolean z10, f.k kVar) throws ParserException {
        boolean z11;
        int i10;
        f.g gVarT;
        int i11;
        try {
            if (z10) {
                d10.X(4);
            } else {
                d10.X(21);
            }
            int iH = d10.H() & 3;
            int iH2 = d10.H();
            int iF = d10.f();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= iH2) {
                    break;
                }
                d10.X(1);
                int iP = d10.P();
                for (int i15 = 0; i15 < iP; i15++) {
                    int iP2 = d10.P();
                    i14 += iP2 + 4;
                    d10.X(iP2);
                }
                i13++;
            }
            d10.W(iF);
            byte[] bArr = new byte[i14];
            f.k kVar2 = kVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            float f10 = 1.0f;
            String strF = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 < iH2) {
                int iH3 = d10.H() & 63;
                int iP3 = d10.P();
                int i28 = i12;
                f.k kVarY = kVar2;
                while (i28 < iP3) {
                    int iP4 = d10.P();
                    boolean z12 = z11;
                    byte[] bArr2 = e3.f.f128084a;
                    int i29 = iH;
                    System.arraycopy(bArr2, i12, bArr, i27, bArr2.length);
                    int length = i27 + bArr2.length;
                    System.arraycopy(d10.e(), d10.f(), bArr, length, iP4);
                    if (iH3 == 32 && i28 == 0) {
                        kVarY = e3.f.y(bArr, length, length + iP4);
                        i10 = iH2;
                    } else {
                        if (iH3 == 33 && i28 == 0) {
                            f.h hVarU = e3.f.u(bArr, length, length + iP4, kVarY);
                            i16 = hVarU.f128118b + 1;
                            i17 = hVarU.f128124h;
                            int i30 = hVarU.f128125i;
                            i19 = hVarU.f128121e + 8;
                            i20 = hVarU.f128122f + 8;
                            int i31 = hVarU.f128128l;
                            i10 = iH2;
                            int i32 = hVarU.f128129m;
                            int i33 = hVarU.f128130n;
                            float f11 = hVarU.f128126j;
                            int i34 = hVarU.f128127k;
                            f.c cVar = hVarU.f128119c;
                            if (cVar != null) {
                                i11 = i34;
                                strF = C13474i.f(cVar.f128093a, cVar.f128094b, cVar.f128095c, cVar.f128096d, cVar.f128097e, cVar.f128098f);
                            } else {
                                i11 = i34;
                            }
                            f10 = f11;
                            i25 = i11;
                            i22 = i32;
                            i23 = i33;
                            i21 = i31;
                            i18 = i30;
                        } else {
                            i10 = iH2;
                            if (iH3 == 39 && i28 == 0 && (gVarT = e3.f.t(bArr, length, length + iP4)) != null && kVarY != null) {
                                i12 = 0;
                                i24 = gVarT.f128111d == kVarY.f128137b.get(0).f128089b ? 4 : 5;
                            }
                        }
                        i12 = 0;
                    }
                    i27 = length + iP4;
                    d10.X(iP4);
                    i28++;
                    z11 = z12;
                    iH = i29;
                    iH2 = i10;
                }
                i26++;
                kVar2 = kVarY;
            }
            return new C(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iH + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, f10, i25, strF, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z10 ? "L-HEVC config" : "HEVC config");
            throw ParserException.a(sb2.toString(), e10);
        }
    }

    private C(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f10, int i20, String str, f.k kVar) {
        this.f169044a = list;
        this.f169045b = i10;
        this.f169046c = i11;
        this.f169047d = i12;
        this.f169048e = i13;
        this.f169049f = i14;
        this.f169050g = i15;
        this.f169051h = i16;
        this.f169052i = i17;
        this.f169053j = i18;
        this.f169054k = i19;
        this.f169055l = f10;
        this.f169056m = i20;
        this.f169057n = str;
        this.f169058o = kVar;
    }
}
