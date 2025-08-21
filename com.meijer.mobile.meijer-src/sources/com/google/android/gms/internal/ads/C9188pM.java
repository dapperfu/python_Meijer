package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9188pM {

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f78409b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f78410c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f78411d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f78412e;

    /* renamed from: a, reason: collision with root package name */
    private final Map f78408a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f78413f = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void e() {
        JSONObject jSONObjectF;
        Map map;
        try {
            this.f78411d = true;
            C9768uq c9768uqZzg = Nc.v.s().j().zzg();
            if (c9768uqZzg != null && (jSONObjectF = c9768uqZzg.f()) != null) {
                this.f78409b = ((Boolean) Oc.A.c().a(C8784lf.f77164f4)).booleanValue() ? jSONObjectF.optJSONObject("common_settings") : null;
                this.f78412e = jSONObjectF.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObjectF.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.f78408a.containsKey(strOptString2)) {
                                    map = (Map) this.f78408a.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f78408a.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    private final void g() {
        if (this.f78413f.getAndSet(true)) {
            return;
        }
        Nc.v.s().j().s(new Runnable() { // from class: com.google.android.gms.internal.ads.nM
            @Override // java.lang.Runnable
            public final void run() {
                this.f77887a.f();
            }
        });
    }

    public final JSONObject a() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77164f4)).booleanValue()) {
            return this.f78409b;
        }
        return null;
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77136d4)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f78411d) {
            e();
            if (((Boolean) Oc.A.c().a(C8784lf.f77150e4)).booleanValue()) {
                g();
            }
        }
        Map map = (Map) this.f78408a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strA = C9401rM.a(this.f78412e, str, str2);
        if (strA != null) {
            return (JSONObject) map.get(strA);
        }
        return null;
    }

    final /* synthetic */ void f() {
        this.f78410c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.oM
            @Override // java.lang.Runnable
            public final void run() {
                this.f78203a.e();
            }
        });
    }

    public C9188pM(Executor executor) {
        this.f78410c = executor;
    }

    public final void d() {
        g();
        this.f78410c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mM
            @Override // java.lang.Runnable
            public final void run() {
                this.f77621a.e();
            }
        });
    }
}
