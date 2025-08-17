package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9063pM {

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f77569b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f77570c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f77571d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f77572e;

    /* renamed from: a, reason: collision with root package name */
    private final Map f77568a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f77573f = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void e() {
        JSONObject jSONObjectF;
        Map map;
        try {
            this.f77571d = true;
            C9643uq c9643uqZzg = Lc.v.s().j().zzg();
            if (c9643uqZzg != null && (jSONObjectF = c9643uqZzg.f()) != null) {
                this.f77569b = ((Boolean) Mc.A.c().a(C8659lf.f76324f4)).booleanValue() ? jSONObjectF.optJSONObject("common_settings") : null;
                this.f77572e = jSONObjectF.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObjectF.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.f77568a.containsKey(strOptString2)) {
                                    map = (Map) this.f77568a.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f77568a.put(strOptString2, concurrentHashMap);
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
        if (this.f77573f.getAndSet(true)) {
            return;
        }
        Lc.v.s().j().s(new Runnable() { // from class: com.google.android.gms.internal.ads.nM
            @Override // java.lang.Runnable
            public final void run() {
                this.f77047a.f();
            }
        });
    }

    public final JSONObject a() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76324f4)).booleanValue()) {
            return this.f77569b;
        }
        return null;
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76296d4)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f77571d) {
            e();
            if (((Boolean) Mc.A.c().a(C8659lf.f76310e4)).booleanValue()) {
                g();
            }
        }
        Map map = (Map) this.f77568a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strA = C9276rM.a(this.f77572e, str, str2);
        if (strA != null) {
            return (JSONObject) map.get(strA);
        }
        return null;
    }

    final /* synthetic */ void f() {
        this.f77570c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.oM
            @Override // java.lang.Runnable
            public final void run() {
                this.f77363a.e();
            }
        });
    }

    public C9063pM(Executor executor) {
        this.f77570c = executor;
    }

    public final void d() {
        g();
        this.f77570c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mM
            @Override // java.lang.Runnable
            public final void run() {
                this.f76781a.e();
            }
        });
    }
}
