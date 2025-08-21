package Xc;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9296qN;
import com.google.android.gms.internal.ads.CN;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: h, reason: collision with root package name */
    private final CN f42019h;

    /* renamed from: i, reason: collision with root package name */
    private Map f42020i;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f42017f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f42018g = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    private final int f42012a = ((Integer) Oc.A.c().a(C8784lf.f76873K6)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private final long f42013b = ((Long) Oc.A.c().a(C8784lf.f76887L6)).longValue();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42014c = ((Boolean) Oc.A.c().a(C8784lf.f76943P6)).booleanValue();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42015d = ((Boolean) Oc.A.c().a(C8784lf.f76929O6)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final Map f42016e = Collections.synchronizedMap(new q0(this));

    private final synchronized void i(final C9296qN c9296qN) {
        if (this.f42014c) {
            ArrayDeque arrayDeque = this.f42018g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f42017f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            C7033Kq.f69014a.execute(new Runnable() { // from class: Xc.p0
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f41995a.e(c9296qN, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final synchronized void k() {
        long jA = Nc.v.c().a();
        try {
            Iterator it = this.f42016e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jA - ((r0) entry.getValue()).f42004a.longValue() <= this.f42013b) {
                    break;
                }
                this.f42018g.add(new Pair((String) entry.getKey(), ((r0) entry.getValue()).f42005b));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            Nc.v.s().x(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized String b(String str, C9296qN c9296qN) {
        r0 r0Var = (r0) this.f42016e.get(str);
        c9296qN.b().put("request_id", str);
        if (r0Var == null) {
            c9296qN.b().put("mhit", "false");
            return null;
        }
        c9296qN.b().put("mhit", "true");
        return r0Var.f42005b;
    }

    public final synchronized void d(String str, String str2, C9296qN c9296qN) {
        this.f42016e.put(str, new r0(Long.valueOf(Nc.v.c().a()), str2, new HashSet()));
        k();
        i(c9296qN);
    }

    public final synchronized void f(String str) {
        this.f42016e.remove(str);
    }

    public final synchronized boolean g(String str, String str2, int i10) {
        r0 r0Var = (r0) this.f42016e.get(str);
        if (r0Var == null) {
            return false;
        }
        r0Var.f42006c.add(str2);
        return r0Var.f42006c.size() < i10;
    }

    public final synchronized boolean h(String str, String str2) {
        r0 r0Var = (r0) this.f42016e.get(str);
        if (r0Var != null) {
            if (r0Var.f42006c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ void e(C9296qN c9296qN, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) throws JSONException {
        j(c9296qN, arrayDeque, "to");
        j(c9296qN, arrayDeque2, "of");
    }

    public s0(CN cn2) {
        this.f42019h = cn2;
    }

    private final void j(C9296qN c9296qN, ArrayDeque arrayDeque, String str) throws JSONException {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c9296qN.b());
            this.f42020i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f42020i.put("e_r", str);
            this.f42020i.put("e_id", (String) pair2.first);
            if (this.f42015d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(C5569c.b(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                l(this.f42020i, "e_type", (String) pair.first);
                l(this.f42020i, "e_agent", (String) pair.second);
            }
            this.f42019h.g(this.f42020i);
        }
    }

    private static final void l(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
