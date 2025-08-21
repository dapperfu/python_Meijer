package t6;

import android.graphics.Color;
import android.graphics.Rect;
import h6.C14478i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p6.C16407b;
import q6.C16608a;
import r6.C16863e;
import u6.AbstractC17353c;
import w6.C17845a;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162333a = AbstractC17353c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17353c.a f162334b = AbstractC17353c.a.a("d", "a");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC17353c.a f162335c = AbstractC17353c.a.a("ty", "nm");

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f162336a;

        static {
            int[] iArr = new int[C16863e.b.values().length];
            f162336a = iArr;
            try {
                iArr[C16863e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f162336a[C16863e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static C16863e b(AbstractC17353c abstractC17353c, C14478i c14478i) throws IOException {
        Float f10;
        boolean z10;
        float f11;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        C16863e.b bVar = C16863e.b.NONE;
        q6.h hVar = q6.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        abstractC17353c.c();
        boolean z11 = false;
        C16863e.b bVar2 = bVar;
        q6.h hVar2 = hVar;
        float fNextDouble = 0.0f;
        float f12 = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        String strNextString = null;
        p6.j jVarD = null;
        p6.k kVarA = null;
        C16407b c16407bF = null;
        C16608a c16608aB = null;
        C17197j c17197jB = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        long jNextInt2 = -1;
        float fNextDouble5 = 1.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        p6.n nVar = null;
        C16863e.a aVar = null;
        boolean z12 = false;
        while (abstractC17353c.hasNext()) {
            switch (abstractC17353c.l(f162333a)) {
                case 0:
                    strNextString2 = abstractC17353c.nextString();
                    z11 = false;
                    break;
                case 1:
                    jNextInt = abstractC17353c.nextInt();
                    z11 = false;
                    break;
                case 2:
                    strNextString = abstractC17353c.nextString();
                    z11 = false;
                    break;
                case 3:
                    f11 = fNextDouble5;
                    int iNextInt3 = abstractC17353c.nextInt();
                    aVar = C16863e.a.UNKNOWN;
                    if (iNextInt3 < aVar.ordinal()) {
                        aVar = C16863e.a.values()[iNextInt3];
                    }
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 4:
                    jNextInt2 = abstractC17353c.nextInt();
                    z11 = false;
                    break;
                case 5:
                    iNextInt = (int) (abstractC17353c.nextInt() * v6.q.e());
                    z11 = false;
                    break;
                case 6:
                    iNextInt2 = (int) (abstractC17353c.nextInt() * v6.q.e());
                    z11 = false;
                    break;
                case 7:
                    color = Color.parseColor(abstractC17353c.nextString());
                    z11 = false;
                    break;
                case 8:
                    nVar = C17190c.g(abstractC17353c, c14478i);
                    z11 = false;
                    break;
                case 9:
                    f11 = fNextDouble5;
                    int iNextInt4 = abstractC17353c.nextInt();
                    if (iNextInt4 >= C16863e.b.values().length) {
                        c14478i.a("Unsupported matte type: " + iNextInt4);
                    } else {
                        bVar2 = C16863e.b.values()[iNextInt4];
                        int i10 = a.f162336a[bVar2.ordinal()];
                        if (i10 == 1) {
                            c14478i.a("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            c14478i.a("Unsupported matte type: Luma Inverted");
                        }
                        c14478i.s(1);
                    }
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 10:
                    f11 = fNextDouble5;
                    abstractC17353c.b();
                    while (abstractC17353c.hasNext()) {
                        arrayList.add(x.a(abstractC17353c, c14478i));
                    }
                    c14478i.s(arrayList.size());
                    abstractC17353c.d();
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 11:
                    f11 = fNextDouble5;
                    abstractC17353c.b();
                    while (abstractC17353c.hasNext()) {
                        q6.c cVarA = C17195h.a(abstractC17353c, c14478i);
                        if (cVarA != null) {
                            arrayList2.add(cVarA);
                        }
                    }
                    abstractC17353c.d();
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 12:
                    f11 = fNextDouble5;
                    abstractC17353c.c();
                    while (abstractC17353c.hasNext()) {
                        int iL = abstractC17353c.l(f162334b);
                        if (iL == 0) {
                            jVarD = C17191d.d(abstractC17353c, c14478i);
                        } else if (iL != 1) {
                            abstractC17353c.m();
                            abstractC17353c.skipValue();
                        } else {
                            abstractC17353c.b();
                            if (abstractC17353c.hasNext()) {
                                kVarA = C17189b.a(abstractC17353c, c14478i);
                            }
                            while (abstractC17353c.hasNext()) {
                                abstractC17353c.skipValue();
                            }
                            abstractC17353c.d();
                        }
                    }
                    abstractC17353c.g();
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 13:
                    f11 = fNextDouble5;
                    abstractC17353c.b();
                    ArrayList arrayList3 = new ArrayList();
                    while (abstractC17353c.hasNext()) {
                        abstractC17353c.c();
                        while (abstractC17353c.hasNext()) {
                            int iL2 = abstractC17353c.l(f162335c);
                            if (iL2 == 0) {
                                int iNextInt5 = abstractC17353c.nextInt();
                                if (iNextInt5 == 29) {
                                    c16608aB = C17192e.b(abstractC17353c, c14478i);
                                } else if (iNextInt5 == 25) {
                                    c17197jB = new C17198k().b(abstractC17353c, c14478i);
                                }
                            } else if (iL2 != 1) {
                                abstractC17353c.m();
                                abstractC17353c.skipValue();
                            } else {
                                arrayList3.add(abstractC17353c.nextString());
                            }
                        }
                        abstractC17353c.g();
                    }
                    abstractC17353c.d();
                    c14478i.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 14:
                    fNextDouble5 = (float) abstractC17353c.nextDouble();
                    z11 = false;
                    break;
                case 15:
                    fNextDouble4 = (float) abstractC17353c.nextDouble();
                    z11 = false;
                    break;
                case 16:
                    f11 = fNextDouble5;
                    fNextDouble2 = (float) (abstractC17353c.nextDouble() * v6.q.e());
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 17:
                    f11 = fNextDouble5;
                    fNextDouble3 = (float) (abstractC17353c.nextDouble() * v6.q.e());
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 18:
                    fNextDouble = (float) abstractC17353c.nextDouble();
                    break;
                case 19:
                    f12 = (float) abstractC17353c.nextDouble();
                    break;
                case 20:
                    c16407bF = C17191d.f(abstractC17353c, c14478i, z11);
                    break;
                case 21:
                    strNextString3 = abstractC17353c.nextString();
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    zNextBoolean = abstractC17353c.nextBoolean();
                    break;
                case 23:
                    if (abstractC17353c.nextInt() != 1) {
                        z12 = z11;
                        break;
                    } else {
                        z12 = true;
                        break;
                    }
                case 24:
                    int iNextInt6 = abstractC17353c.nextInt();
                    if (iNextInt6 < q6.h.values().length) {
                        hVar2 = q6.h.values()[iNextInt6];
                        break;
                    } else {
                        c14478i.a("Unsupported Blend Mode: " + iNextInt6);
                        hVar2 = q6.h.NORMAL;
                        break;
                    }
                default:
                    abstractC17353c.m();
                    abstractC17353c.skipValue();
                    f11 = fNextDouble5;
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
            }
        }
        float f13 = fNextDouble5;
        abstractC17353c.g();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            z10 = z12;
            f10 = fValueOf;
            arrayList4.add(new C17845a(c14478i, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        } else {
            f10 = fValueOf;
            z10 = z12;
        }
        if (f12 <= 0.0f) {
            f12 = c14478i.f();
        }
        arrayList4.add(new C17845a(c14478i, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(f12)));
        arrayList4.add(new C17845a(c14478i, f10, f10, null, f12, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            c14478i.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (nVar == null) {
                nVar = new p6.n();
            }
            nVar.m(z10);
        }
        return new C16863e(arrayList2, c14478i, strNextString2, jNextInt, aVar, jNextInt2, strNextString, arrayList, nVar, iNextInt, iNextInt2, color, f13, fNextDouble4, fNextDouble2, fNextDouble3, jVarD, kVarA, arrayList4, bVar2, c16407bF, zNextBoolean, c16608aB, c17197jB, hVar2);
    }

    public static C16863e a(C14478i c14478i) {
        Rect rectB = c14478i.b();
        List list = Collections.EMPTY_LIST;
        return new C16863e(list, c14478i, "__container", -1L, C16863e.a.PRE_COMP, -1L, null, list, new p6.n(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, list, C16863e.b.NONE, null, false, null, null, q6.h.NORMAL);
    }
}
