package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import F.u0;
import F.v0;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final u0 f47435a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final u0 f47436b = d();

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f47437c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));

    /* renamed from: d, reason: collision with root package name */
    private static final Set<String> f47438d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));

    private static u0 c() {
        u0 u0Var = new u0();
        v0.b bVar = v0.b.YUV;
        u0Var.a(v0.a(bVar, v0.a.VGA));
        u0Var.a(v0.a(v0.b.PRIV, v0.a.PREVIEW));
        u0Var.a(v0.a(bVar, v0.a.MAXIMUM));
        return u0Var;
    }

    private static u0 d() {
        u0 u0Var = new u0();
        v0.b bVar = v0.b.PRIV;
        u0Var.a(v0.a(bVar, v0.a.PREVIEW));
        u0Var.a(v0.a(bVar, v0.a.VGA));
        u0Var.a(v0.a(v0.b.YUV, v0.a.MAXIMUM));
        return u0Var;
    }

    private List<u0> f(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f47435a);
        }
        return arrayList;
    }

    private static boolean g() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    private static boolean i() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f47437c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean j() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator<String> it = f47438d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static boolean h() {
        if (!g() && !i() && !j()) {
            return false;
        }
        return true;
    }

    public List<u0> e(String str) {
        if (g()) {
            return f(str);
        }
        if (!i() && !j()) {
            return Collections.EMPTY_LIST;
        }
        return Collections.singletonList(f47436b);
    }
}
