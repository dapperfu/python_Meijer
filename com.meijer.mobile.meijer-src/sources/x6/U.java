package x6;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class U {

    /* renamed from: a, reason: collision with root package name */
    private final String f170485a = "CYFSystemInfoManager";

    /* renamed from: c, reason: collision with root package name */
    String f170487c = "-1";

    /* renamed from: d, reason: collision with root package name */
    String f170488d = "-1";

    /* renamed from: e, reason: collision with root package name */
    String f170489e = "-1";

    /* renamed from: f, reason: collision with root package name */
    String f170490f = "-1";

    /* renamed from: g, reason: collision with root package name */
    String f170491g = "-1";

    /* renamed from: h, reason: collision with root package name */
    String f170492h = "-1";

    /* renamed from: i, reason: collision with root package name */
    String f170493i = "-1";

    /* renamed from: b, reason: collision with root package name */
    T f170486b = new T();

    public static String a() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("-2,3,-50,-301", T.f()));
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                sb2.append(pair.first);
                sb2.append(",");
                sb2.append(pair.second);
            }
            return sb2.toString();
        } catch (Exception e10) {
            r.e("CYFSystemInfoManager", "Exception in getNewDeviceInfo", e10);
            C18095A.a(e10);
            return "default-info";
        }
    }

    U() {
    }
}
