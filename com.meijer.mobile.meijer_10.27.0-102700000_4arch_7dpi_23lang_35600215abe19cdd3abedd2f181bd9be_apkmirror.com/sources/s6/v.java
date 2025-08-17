package s6;

import android.graphics.Color;
import android.graphics.Rect;
import g6.C14209i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o6.C15998b;
import p6.C16263a;
import q6.C16475e;
import t6.AbstractC17067c;
import v6.C17512a;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160272a = AbstractC17067c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17067c.a f160273b = AbstractC17067c.a.a("d", "a");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC17067c.a f160274c = AbstractC17067c.a.a("ty", "nm");

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f160275a;

        static {
            int[] iArr = new int[C16475e.b.values().length];
            f160275a = iArr;
            try {
                iArr[C16475e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f160275a[C16475e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static C16475e b(AbstractC17067c abstractC17067c, C14209i c14209i) throws IOException {
        Float f10;
        boolean z10;
        float f11;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        C16475e.b bVar = C16475e.b.NONE;
        p6.h hVar = p6.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        abstractC17067c.c();
        boolean z11 = false;
        C16475e.b bVar2 = bVar;
        p6.h hVar2 = hVar;
        float fNextDouble = 0.0f;
        float f12 = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        String strNextString = null;
        o6.j jVarD = null;
        o6.k kVarA = null;
        C15998b c15998bF = null;
        C16263a c16263aB = null;
        C16899j c16899jB = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        long jNextInt2 = -1;
        float fNextDouble5 = 1.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        o6.n nVar = null;
        C16475e.a aVar = null;
        boolean z12 = false;
        while (abstractC17067c.hasNext()) {
            switch (abstractC17067c.l(f160272a)) {
                case 0:
                    strNextString2 = abstractC17067c.nextString();
                    z11 = false;
                    break;
                case 1:
                    jNextInt = abstractC17067c.nextInt();
                    z11 = false;
                    break;
                case 2:
                    strNextString = abstractC17067c.nextString();
                    z11 = false;
                    break;
                case 3:
                    f11 = fNextDouble5;
                    int iNextInt3 = abstractC17067c.nextInt();
                    aVar = C16475e.a.UNKNOWN;
                    if (iNextInt3 < aVar.ordinal()) {
                        aVar = C16475e.a.values()[iNextInt3];
                    }
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 4:
                    jNextInt2 = abstractC17067c.nextInt();
                    z11 = false;
                    break;
                case 5:
                    iNextInt = (int) (abstractC17067c.nextInt() * u6.q.e());
                    z11 = false;
                    break;
                case 6:
                    iNextInt2 = (int) (abstractC17067c.nextInt() * u6.q.e());
                    z11 = false;
                    break;
                case 7:
                    color = Color.parseColor(abstractC17067c.nextString());
                    z11 = false;
                    break;
                case 8:
                    nVar = C16892c.g(abstractC17067c, c14209i);
                    z11 = false;
                    break;
                case 9:
                    f11 = fNextDouble5;
                    int iNextInt4 = abstractC17067c.nextInt();
                    if (iNextInt4 >= C16475e.b.values().length) {
                        c14209i.a("Unsupported matte type: " + iNextInt4);
                    } else {
                        bVar2 = C16475e.b.values()[iNextInt4];
                        int i10 = a.f160275a[bVar2.ordinal()];
                        if (i10 == 1) {
                            c14209i.a("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            c14209i.a("Unsupported matte type: Luma Inverted");
                        }
                        c14209i.s(1);
                    }
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 10:
                    f11 = fNextDouble5;
                    abstractC17067c.b();
                    while (abstractC17067c.hasNext()) {
                        arrayList.add(x.a(abstractC17067c, c14209i));
                    }
                    c14209i.s(arrayList.size());
                    abstractC17067c.d();
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 11:
                    f11 = fNextDouble5;
                    abstractC17067c.b();
                    while (abstractC17067c.hasNext()) {
                        p6.c cVarA = C16897h.a(abstractC17067c, c14209i);
                        if (cVarA != null) {
                            arrayList2.add(cVarA);
                        }
                    }
                    abstractC17067c.d();
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 12:
                    f11 = fNextDouble5;
                    abstractC17067c.c();
                    while (abstractC17067c.hasNext()) {
                        int iL = abstractC17067c.l(f160273b);
                        if (iL == 0) {
                            jVarD = C16893d.d(abstractC17067c, c14209i);
                        } else if (iL != 1) {
                            abstractC17067c.m();
                            abstractC17067c.skipValue();
                        } else {
                            abstractC17067c.b();
                            if (abstractC17067c.hasNext()) {
                                kVarA = C16891b.a(abstractC17067c, c14209i);
                            }
                            while (abstractC17067c.hasNext()) {
                                abstractC17067c.skipValue();
                            }
                            abstractC17067c.d();
                        }
                    }
                    abstractC17067c.g();
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 13:
                    f11 = fNextDouble5;
                    abstractC17067c.b();
                    ArrayList arrayList3 = new ArrayList();
                    while (abstractC17067c.hasNext()) {
                        abstractC17067c.c();
                        while (abstractC17067c.hasNext()) {
                            int iL2 = abstractC17067c.l(f160274c);
                            if (iL2 == 0) {
                                int iNextInt5 = abstractC17067c.nextInt();
                                if (iNextInt5 == 29) {
                                    c16263aB = C16894e.b(abstractC17067c, c14209i);
                                } else if (iNextInt5 == 25) {
                                    c16899jB = new C16900k().b(abstractC17067c, c14209i);
                                }
                            } else if (iL2 != 1) {
                                abstractC17067c.m();
                                abstractC17067c.skipValue();
                            } else {
                                arrayList3.add(abstractC17067c.nextString());
                            }
                        }
                        abstractC17067c.g();
                    }
                    abstractC17067c.d();
                    c14209i.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 14:
                    fNextDouble5 = (float) abstractC17067c.nextDouble();
                    z11 = false;
                    break;
                case 15:
                    fNextDouble4 = (float) abstractC17067c.nextDouble();
                    z11 = false;
                    break;
                case 16:
                    f11 = fNextDouble5;
                    fNextDouble2 = (float) (abstractC17067c.nextDouble() * u6.q.e());
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 17:
                    f11 = fNextDouble5;
                    fNextDouble3 = (float) (abstractC17067c.nextDouble() * u6.q.e());
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
                case 18:
                    fNextDouble = (float) abstractC17067c.nextDouble();
                    break;
                case 19:
                    f12 = (float) abstractC17067c.nextDouble();
                    break;
                case 20:
                    c15998bF = C16893d.f(abstractC17067c, c14209i, z11);
                    break;
                case 21:
                    strNextString3 = abstractC17067c.nextString();
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    zNextBoolean = abstractC17067c.nextBoolean();
                    break;
                case 23:
                    if (abstractC17067c.nextInt() != 1) {
                        z12 = z11;
                        break;
                    } else {
                        z12 = true;
                        break;
                    }
                case 24:
                    int iNextInt6 = abstractC17067c.nextInt();
                    if (iNextInt6 < p6.h.values().length) {
                        hVar2 = p6.h.values()[iNextInt6];
                        break;
                    } else {
                        c14209i.a("Unsupported Blend Mode: " + iNextInt6);
                        hVar2 = p6.h.NORMAL;
                        break;
                    }
                default:
                    abstractC17067c.m();
                    abstractC17067c.skipValue();
                    f11 = fNextDouble5;
                    fNextDouble5 = f11;
                    z11 = false;
                    break;
            }
        }
        float f13 = fNextDouble5;
        abstractC17067c.g();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            z10 = z12;
            f10 = fValueOf;
            arrayList4.add(new C17512a(c14209i, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        } else {
            f10 = fValueOf;
            z10 = z12;
        }
        if (f12 <= 0.0f) {
            f12 = c14209i.f();
        }
        arrayList4.add(new C17512a(c14209i, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(f12)));
        arrayList4.add(new C17512a(c14209i, f10, f10, null, f12, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            c14209i.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (nVar == null) {
                nVar = new o6.n();
            }
            nVar.m(z10);
        }
        return new C16475e(arrayList2, c14209i, strNextString2, jNextInt, aVar, jNextInt2, strNextString, arrayList, nVar, iNextInt, iNextInt2, color, f13, fNextDouble4, fNextDouble2, fNextDouble3, jVarD, kVarA, arrayList4, bVar2, c15998bF, zNextBoolean, c16263aB, c16899jB, hVar2);
    }

    public static C16475e a(C14209i c14209i) {
        Rect rectB = c14209i.b();
        List list = Collections.EMPTY_LIST;
        return new C16475e(list, c14209i, "__container", -1L, C16475e.a.PRE_COMP, -1L, null, list, new o6.n(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, list, C16475e.b.NONE, null, false, null, null, p6.h.NORMAL);
    }
}
