package x3;

import androidx.media3.common.ParserException;
import d3.C13607i;
import e3.f;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f170132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f170133b;

    /* renamed from: c, reason: collision with root package name */
    public final int f170134c;

    /* renamed from: d, reason: collision with root package name */
    public final int f170135d;

    /* renamed from: e, reason: collision with root package name */
    public final int f170136e;

    /* renamed from: f, reason: collision with root package name */
    public final int f170137f;

    /* renamed from: g, reason: collision with root package name */
    public final int f170138g;

    /* renamed from: h, reason: collision with root package name */
    public final int f170139h;

    /* renamed from: i, reason: collision with root package name */
    public final int f170140i;

    /* renamed from: j, reason: collision with root package name */
    public final int f170141j;

    /* renamed from: k, reason: collision with root package name */
    public final int f170142k;

    /* renamed from: l, reason: collision with root package name */
    public final float f170143l;

    /* renamed from: m, reason: collision with root package name */
    public final int f170144m;

    /* renamed from: n, reason: collision with root package name */
    public final String f170145n;

    /* renamed from: o, reason: collision with root package name */
    public final f.k f170146o;

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
                    byte[] bArr2 = e3.f.f129420a;
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
                            i16 = hVarU.f129454b + 1;
                            i17 = hVarU.f129460h;
                            int i30 = hVarU.f129461i;
                            i19 = hVarU.f129457e + 8;
                            i20 = hVarU.f129458f + 8;
                            int i31 = hVarU.f129464l;
                            i10 = iH2;
                            int i32 = hVarU.f129465m;
                            int i33 = hVarU.f129466n;
                            float f11 = hVarU.f129462j;
                            int i34 = hVarU.f129463k;
                            f.c cVar = hVarU.f129455c;
                            if (cVar != null) {
                                i11 = i34;
                                strF = C13607i.f(cVar.f129429a, cVar.f129430b, cVar.f129431c, cVar.f129432d, cVar.f129433e, cVar.f129434f);
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
                                i24 = gVarT.f129447d == kVarY.f129473b.get(0).f129425b ? 4 : 5;
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
        this.f170132a = list;
        this.f170133b = i10;
        this.f170134c = i11;
        this.f170135d = i12;
        this.f170136e = i13;
        this.f170137f = i14;
        this.f170138g = i15;
        this.f170139h = i16;
        this.f170140i = i17;
        this.f170141j = i18;
        this.f170142k = i19;
        this.f170143l = f10;
        this.f170144m = i20;
        this.f170145n = str;
        this.f170146o = kVar;
    }
}
