package w6;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class U {

    /* renamed from: a, reason: collision with root package name */
    private final String f165840a = "CYFSystemInfoManager";

    /* renamed from: c, reason: collision with root package name */
    String f165842c = "-1";

    /* renamed from: d, reason: collision with root package name */
    String f165843d = "-1";

    /* renamed from: e, reason: collision with root package name */
    String f165844e = "-1";

    /* renamed from: f, reason: collision with root package name */
    String f165845f = "-1";

    /* renamed from: g, reason: collision with root package name */
    String f165846g = "-1";

    /* renamed from: h, reason: collision with root package name */
    String f165847h = "-1";

    /* renamed from: i, reason: collision with root package name */
    String f165848i = "-1";

    /* renamed from: b, reason: collision with root package name */
    T f165841b = new T();

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
            C17774A.a(e10);
            return "default-info";
        }
    }

    U() {
    }
}
