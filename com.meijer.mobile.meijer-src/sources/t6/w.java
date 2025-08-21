package t6;

import Z.o0;
import android.graphics.Rect;
import h6.C14478i;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r6.C16863e;
import u6.AbstractC17353c;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17353c.a f162337a = AbstractC17353c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    static AbstractC17353c.a f162338b = AbstractC17353c.a.a(PreferencesHelper.PREF_ID, "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC17353c.a f162339c = AbstractC17353c.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC17353c.a f162340d = AbstractC17353c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static C14478i a(AbstractC17353c abstractC17353c) throws IOException {
        float f10;
        AbstractC17353c abstractC17353c2 = abstractC17353c;
        float fE = v6.q.e();
        Z.C<C16863e> c10 = new Z.C<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        o0<o6.d> o0Var = new o0<>();
        C14478i c14478i = new C14478i();
        abstractC17353c2.c();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        while (abstractC17353c2.hasNext()) {
            switch (abstractC17353c2.l(f162337a)) {
                case 0:
                    f10 = fE;
                    iNextDouble2 = (int) abstractC17353c.nextDouble();
                    abstractC17353c2 = abstractC17353c;
                    fE = f10;
                    break;
                case 1:
                    f10 = fE;
                    iNextDouble = (int) abstractC17353c.nextDouble();
                    abstractC17353c2 = abstractC17353c;
                    fE = f10;
                    break;
                case 2:
                    f10 = fE;
                    fNextDouble = (float) abstractC17353c.nextDouble();
                    abstractC17353c2 = abstractC17353c;
                    fE = f10;
                    break;
                case 3:
                    f10 = fE;
                    fNextDouble2 = ((float) abstractC17353c.nextDouble()) - 0.01f;
                    abstractC17353c2 = abstractC17353c;
                    fE = f10;
                    break;
                case 4:
                    f10 = fE;
                    fNextDouble3 = (float) abstractC17353c.nextDouble();
                    abstractC17353c2 = abstractC17353c;
                    fE = f10;
                    break;
                case 5:
                    String[] strArrSplit = abstractC17353c2.nextString().split("\\.");
                    if (!v6.q.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        c14478i.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    abstractC17353c2 = abstractC17353c;
                    break;
                case 6:
                    e(abstractC17353c2, c14478i, arrayList, c10);
                    abstractC17353c2 = abstractC17353c;
                    break;
                case 7:
                    b(abstractC17353c2, c14478i, map, map2);
                    abstractC17353c2 = abstractC17353c;
                    break;
                case 8:
                    d(abstractC17353c2, map3);
                    abstractC17353c2 = abstractC17353c;
                    break;
                case 9:
                    c(abstractC17353c2, c14478i, o0Var);
                    abstractC17353c2 = abstractC17353c;
                    break;
                case 10:
                    f(abstractC17353c2, arrayList2);
                    abstractC17353c2 = abstractC17353c;
                    break;
                default:
                    abstractC17353c2.m();
                    abstractC17353c2.skipValue();
                    abstractC17353c2 = abstractC17353c;
                    break;
            }
        }
        float f11 = fE;
        c14478i.t(new Rect(0, 0, (int) (iNextDouble2 * f11), (int) (iNextDouble * f11)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, c10, map, map2, v6.q.e(), o0Var, map3, arrayList2, iNextDouble2, iNextDouble);
        return c14478i;
    }

    private static void b(AbstractC17353c abstractC17353c, C14478i c14478i, Map<String, List<C16863e>> map, Map<String, h6.z> map2) throws IOException {
        abstractC17353c.b();
        while (abstractC17353c.hasNext()) {
            ArrayList arrayList = new ArrayList();
            Z.C c10 = new Z.C();
            abstractC17353c.c();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            while (abstractC17353c.hasNext()) {
                int iL = abstractC17353c.l(f162338b);
                if (iL != 0) {
                    if (iL != 1) {
                        if (iL != 2) {
                            if (iL != 3) {
                                if (iL != 4) {
                                    if (iL != 5) {
                                        abstractC17353c.m();
                                        abstractC17353c.skipValue();
                                    } else {
                                        strNextString3 = abstractC17353c.nextString();
                                    }
                                } else {
                                    strNextString2 = abstractC17353c.nextString();
                                }
                            } else {
                                iNextInt2 = abstractC17353c.nextInt();
                            }
                        } else {
                            iNextInt = abstractC17353c.nextInt();
                        }
                    } else {
                        abstractC17353c.b();
                        while (abstractC17353c.hasNext()) {
                            C16863e c16863eB = v.b(abstractC17353c, c14478i);
                            c10.i(c16863eB.e(), c16863eB);
                            arrayList.add(c16863eB);
                        }
                        abstractC17353c.d();
                    }
                } else {
                    strNextString = abstractC17353c.nextString();
                }
            }
            abstractC17353c.g();
            if (strNextString2 != null) {
                h6.z zVar = new h6.z(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                map2.put(zVar.e(), zVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        abstractC17353c.d();
    }

    private static void c(AbstractC17353c abstractC17353c, C14478i c14478i, o0<o6.d> o0Var) throws IOException {
        abstractC17353c.b();
        while (abstractC17353c.hasNext()) {
            o6.d dVarA = C17200m.a(abstractC17353c, c14478i);
            o0Var.j(dVarA.hashCode(), dVarA);
        }
        abstractC17353c.d();
    }

    private static void d(AbstractC17353c abstractC17353c, Map<String, o6.c> map) throws IOException {
        abstractC17353c.c();
        while (abstractC17353c.hasNext()) {
            if (abstractC17353c.l(f162339c) != 0) {
                abstractC17353c.m();
                abstractC17353c.skipValue();
            } else {
                abstractC17353c.b();
                while (abstractC17353c.hasNext()) {
                    o6.c cVarA = C17201n.a(abstractC17353c);
                    map.put(cVarA.b(), cVarA);
                }
                abstractC17353c.d();
            }
        }
        abstractC17353c.g();
    }

    private static void e(AbstractC17353c abstractC17353c, C14478i c14478i, List<C16863e> list, Z.C<C16863e> c10) throws IOException {
        abstractC17353c.b();
        int i10 = 0;
        while (abstractC17353c.hasNext()) {
            C16863e c16863eB = v.b(abstractC17353c, c14478i);
            if (c16863eB.g() == C16863e.a.IMAGE) {
                i10++;
            }
            list.add(c16863eB);
            c10.i(c16863eB.e(), c16863eB);
            if (i10 > 4) {
                v6.g.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC17353c.d();
    }

    private static void f(AbstractC17353c abstractC17353c, List<o6.h> list) throws IOException {
        abstractC17353c.b();
        while (abstractC17353c.hasNext()) {
            abstractC17353c.c();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (abstractC17353c.hasNext()) {
                int iL = abstractC17353c.l(f162340d);
                if (iL != 0) {
                    if (iL != 1) {
                        if (iL != 2) {
                            abstractC17353c.m();
                            abstractC17353c.skipValue();
                        } else {
                            fNextDouble2 = (float) abstractC17353c.nextDouble();
                        }
                    } else {
                        fNextDouble = (float) abstractC17353c.nextDouble();
                    }
                } else {
                    strNextString = abstractC17353c.nextString();
                }
            }
            abstractC17353c.g();
            list.add(new o6.h(strNextString, fNextDouble, fNextDouble2));
        }
        abstractC17353c.d();
    }
}
