package Vc;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C9171qN;
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
    private final CN f37307h;

    /* renamed from: i, reason: collision with root package name */
    private Map f37308i;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f37305f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f37306g = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    private final int f37300a = ((Integer) Mc.A.c().a(C8659lf.f76033K6)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private final long f37301b = ((Long) Mc.A.c().a(C8659lf.f76047L6)).longValue();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37302c = ((Boolean) Mc.A.c().a(C8659lf.f76103P6)).booleanValue();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37303d = ((Boolean) Mc.A.c().a(C8659lf.f76089O6)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final Map f37304e = Collections.synchronizedMap(new q0(this));

    private final synchronized void i(final C9171qN c9171qN) {
        if (this.f37302c) {
            ArrayDeque arrayDeque = this.f37306g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f37305f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            C6908Kq.f68174a.execute(new Runnable() { // from class: Vc.p0
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f37283a.e(c9171qN, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final synchronized void k() {
        long jA = Lc.v.c().a();
        try {
            Iterator it = this.f37304e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jA - ((r0) entry.getValue()).f37292a.longValue() <= this.f37301b) {
                    break;
                }
                this.f37306g.add(new Pair((String) entry.getKey(), ((r0) entry.getValue()).f37293b));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            Lc.v.s().x(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized String b(String str, C9171qN c9171qN) {
        r0 r0Var = (r0) this.f37304e.get(str);
        c9171qN.b().put("request_id", str);
        if (r0Var == null) {
            c9171qN.b().put("mhit", "false");
            return null;
        }
        c9171qN.b().put("mhit", "true");
        return r0Var.f37293b;
    }

    public final synchronized void d(String str, String str2, C9171qN c9171qN) {
        this.f37304e.put(str, new r0(Long.valueOf(Lc.v.c().a()), str2, new HashSet()));
        k();
        i(c9171qN);
    }

    public final synchronized void f(String str) {
        this.f37304e.remove(str);
    }

    public final synchronized boolean g(String str, String str2, int i10) {
        r0 r0Var = (r0) this.f37304e.get(str);
        if (r0Var == null) {
            return false;
        }
        r0Var.f37294c.add(str2);
        return r0Var.f37294c.size() < i10;
    }

    public final synchronized boolean h(String str, String str2) {
        r0 r0Var = (r0) this.f37304e.get(str);
        if (r0Var != null) {
            if (r0Var.f37294c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ void e(C9171qN c9171qN, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) throws JSONException {
        j(c9171qN, arrayDeque, "to");
        j(c9171qN, arrayDeque2, "of");
    }

    public s0(CN cn2) {
        this.f37307h = cn2;
    }

    private final void j(C9171qN c9171qN, ArrayDeque arrayDeque, String str) throws JSONException {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c9171qN.b());
            this.f37308i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f37308i.put("e_r", str);
            this.f37308i.put("e_id", (String) pair2.first);
            if (this.f37303d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(C5366c.b(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                l(this.f37308i, "e_type", (String) pair.first);
                l(this.f37308i, "e_agent", (String) pair.second);
            }
            this.f37307h.g(this.f37308i);
        }
    }

    private static final void l(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
