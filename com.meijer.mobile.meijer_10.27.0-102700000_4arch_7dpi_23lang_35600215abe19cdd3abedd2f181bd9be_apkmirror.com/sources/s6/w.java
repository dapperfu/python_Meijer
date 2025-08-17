package s6;

import Z.o0;
import android.graphics.Rect;
import g6.C14209i;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q6.C16475e;
import t6.AbstractC17067c;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160276a = AbstractC17067c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    static AbstractC17067c.a f160277b = AbstractC17067c.a.a(PreferencesHelper.PREF_ID, "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC17067c.a f160278c = AbstractC17067c.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC17067c.a f160279d = AbstractC17067c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static C14209i a(AbstractC17067c abstractC17067c) throws IOException {
        float f10;
        AbstractC17067c abstractC17067c2 = abstractC17067c;
        float fE = u6.q.e();
        Z.C<C16475e> c10 = new Z.C<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        o0<n6.d> o0Var = new o0<>();
        C14209i c14209i = new C14209i();
        abstractC17067c2.c();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        while (abstractC17067c2.hasNext()) {
            switch (abstractC17067c2.l(f160276a)) {
                case 0:
                    f10 = fE;
                    iNextDouble2 = (int) abstractC17067c.nextDouble();
                    abstractC17067c2 = abstractC17067c;
                    fE = f10;
                    break;
                case 1:
                    f10 = fE;
                    iNextDouble = (int) abstractC17067c.nextDouble();
                    abstractC17067c2 = abstractC17067c;
                    fE = f10;
                    break;
                case 2:
                    f10 = fE;
                    fNextDouble = (float) abstractC17067c.nextDouble();
                    abstractC17067c2 = abstractC17067c;
                    fE = f10;
                    break;
                case 3:
                    f10 = fE;
                    fNextDouble2 = ((float) abstractC17067c.nextDouble()) - 0.01f;
                    abstractC17067c2 = abstractC17067c;
                    fE = f10;
                    break;
                case 4:
                    f10 = fE;
                    fNextDouble3 = (float) abstractC17067c.nextDouble();
                    abstractC17067c2 = abstractC17067c;
                    fE = f10;
                    break;
                case 5:
                    String[] strArrSplit = abstractC17067c2.nextString().split("\\.");
                    if (!u6.q.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        c14209i.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    abstractC17067c2 = abstractC17067c;
                    break;
                case 6:
                    e(abstractC17067c2, c14209i, arrayList, c10);
                    abstractC17067c2 = abstractC17067c;
                    break;
                case 7:
                    b(abstractC17067c2, c14209i, map, map2);
                    abstractC17067c2 = abstractC17067c;
                    break;
                case 8:
                    d(abstractC17067c2, map3);
                    abstractC17067c2 = abstractC17067c;
                    break;
                case 9:
                    c(abstractC17067c2, c14209i, o0Var);
                    abstractC17067c2 = abstractC17067c;
                    break;
                case 10:
                    f(abstractC17067c2, arrayList2);
                    abstractC17067c2 = abstractC17067c;
                    break;
                default:
                    abstractC17067c2.m();
                    abstractC17067c2.skipValue();
                    abstractC17067c2 = abstractC17067c;
                    break;
            }
        }
        float f11 = fE;
        c14209i.t(new Rect(0, 0, (int) (iNextDouble2 * f11), (int) (iNextDouble * f11)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, c10, map, map2, u6.q.e(), o0Var, map3, arrayList2, iNextDouble2, iNextDouble);
        return c14209i;
    }

    private static void b(AbstractC17067c abstractC17067c, C14209i c14209i, Map<String, List<C16475e>> map, Map<String, g6.z> map2) throws IOException {
        abstractC17067c.b();
        while (abstractC17067c.hasNext()) {
            ArrayList arrayList = new ArrayList();
            Z.C c10 = new Z.C();
            abstractC17067c.c();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            while (abstractC17067c.hasNext()) {
                int iL = abstractC17067c.l(f160277b);
                if (iL != 0) {
                    if (iL != 1) {
                        if (iL != 2) {
                            if (iL != 3) {
                                if (iL != 4) {
                                    if (iL != 5) {
                                        abstractC17067c.m();
                                        abstractC17067c.skipValue();
                                    } else {
                                        strNextString3 = abstractC17067c.nextString();
                                    }
                                } else {
                                    strNextString2 = abstractC17067c.nextString();
                                }
                            } else {
                                iNextInt2 = abstractC17067c.nextInt();
                            }
                        } else {
                            iNextInt = abstractC17067c.nextInt();
                        }
                    } else {
                        abstractC17067c.b();
                        while (abstractC17067c.hasNext()) {
                            C16475e c16475eB = v.b(abstractC17067c, c14209i);
                            c10.i(c16475eB.e(), c16475eB);
                            arrayList.add(c16475eB);
                        }
                        abstractC17067c.d();
                    }
                } else {
                    strNextString = abstractC17067c.nextString();
                }
            }
            abstractC17067c.g();
            if (strNextString2 != null) {
                g6.z zVar = new g6.z(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                map2.put(zVar.e(), zVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        abstractC17067c.d();
    }

    private static void c(AbstractC17067c abstractC17067c, C14209i c14209i, o0<n6.d> o0Var) throws IOException {
        abstractC17067c.b();
        while (abstractC17067c.hasNext()) {
            n6.d dVarA = C16902m.a(abstractC17067c, c14209i);
            o0Var.j(dVarA.hashCode(), dVarA);
        }
        abstractC17067c.d();
    }

    private static void d(AbstractC17067c abstractC17067c, Map<String, n6.c> map) throws IOException {
        abstractC17067c.c();
        while (abstractC17067c.hasNext()) {
            if (abstractC17067c.l(f160278c) != 0) {
                abstractC17067c.m();
                abstractC17067c.skipValue();
            } else {
                abstractC17067c.b();
                while (abstractC17067c.hasNext()) {
                    n6.c cVarA = C16903n.a(abstractC17067c);
                    map.put(cVarA.b(), cVarA);
                }
                abstractC17067c.d();
            }
        }
        abstractC17067c.g();
    }

    private static void e(AbstractC17067c abstractC17067c, C14209i c14209i, List<C16475e> list, Z.C<C16475e> c10) throws IOException {
        abstractC17067c.b();
        int i10 = 0;
        while (abstractC17067c.hasNext()) {
            C16475e c16475eB = v.b(abstractC17067c, c14209i);
            if (c16475eB.g() == C16475e.a.IMAGE) {
                i10++;
            }
            list.add(c16475eB);
            c10.i(c16475eB.e(), c16475eB);
            if (i10 > 4) {
                u6.g.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC17067c.d();
    }

    private static void f(AbstractC17067c abstractC17067c, List<n6.h> list) throws IOException {
        abstractC17067c.b();
        while (abstractC17067c.hasNext()) {
            abstractC17067c.c();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (abstractC17067c.hasNext()) {
                int iL = abstractC17067c.l(f160279d);
                if (iL != 0) {
                    if (iL != 1) {
                        if (iL != 2) {
                            abstractC17067c.m();
                            abstractC17067c.skipValue();
                        } else {
                            fNextDouble2 = (float) abstractC17067c.nextDouble();
                        }
                    } else {
                        fNextDouble = (float) abstractC17067c.nextDouble();
                    }
                } else {
                    strNextString = abstractC17067c.nextString();
                }
            }
            abstractC17067c.g();
            list.add(new n6.h(strNextString, fNextDouble, fNextDouble2));
        }
        abstractC17067c.d();
    }
}
