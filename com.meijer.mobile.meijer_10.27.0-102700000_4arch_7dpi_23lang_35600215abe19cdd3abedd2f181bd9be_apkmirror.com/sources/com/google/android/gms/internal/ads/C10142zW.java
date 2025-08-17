package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10142zW {

    /* renamed from: a, reason: collision with root package name */
    private final Map f80436a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f80437b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f80438c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f80439d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f80440e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Executor f80441f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f80442g;

    private final synchronized AbstractC8238hh0 h(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(Lc.v.s().j().zzg().c())) {
                boolean zMatches = Pattern.matches((String) Mc.A.c().a(C8659lf.f76435n3), str);
                boolean zMatches2 = Pattern.matches((String) Mc.A.c().a(C8659lf.f76449o3), str);
                if (zMatches) {
                    map = new HashMap(this.f80440e);
                } else if (zMatches2) {
                    map = new HashMap(this.f80439d);
                }
                return AbstractC8238hh0.c(map);
            }
            return AbstractC8238hh0.d();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized List i(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleO = o(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str2 = (String) arrayList2.get(i11);
                        g(str2);
                        if (((BW) this.f80436a.get(str2)) != null) {
                            arrayList.add(new BW(str2, str, bundleO));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void j() {
        this.f80437b.clear();
        this.f80436a.clear();
        this.f80440e.clear();
        this.f80439d.clear();
        m();
        n();
        k();
    }

    private final synchronized void k() {
        JSONObject jSONObjectF;
        try {
            if (!((Boolean) C9409sg.f78283b.e()).booleanValue()) {
                if (((Boolean) Mc.A.c().a(C8659lf.f76168U1)).booleanValue() && (jSONObjectF = Lc.v.s().j().zzg().f()) != null) {
                    JSONArray jSONArray = jSONObjectF.getJSONArray("adapter_settings");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String strOptString = jSONObject.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                                boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject2.optString("platform");
                                DW dw2 = new DW(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.f80439d.put(strOptString, dw2);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.f80440e.put(strOptString, dw2);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            Pc.p0.l("Malformed config loading JSON.", e10);
        } finally {
        }
    }

    private final synchronized void l(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.f80438c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.f80438c.put(str, map);
            List arrayList = (List) map.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map.put(str2, arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void m() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectF = Lc.v.s().j().zzg().f();
            if (jSONObjectF != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectF.optJSONArray("ad_unit_id_settings");
                    this.f80442g = jSONObjectF.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                            String lowerCase = ((Boolean) Mc.A.c().a(C8659lf.f76079Na)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    arrayList.addAll(i(jSONArrayOptJSONArray.getJSONObject(i11), strOptString));
                                }
                            }
                            l(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e10) {
                    Pc.p0.l("Malformed config loading JSON.", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void n() {
        JSONObject jSONObjectF;
        if (!((Boolean) C9409sg.f78286e.e()).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76154T1)).booleanValue() && (jSONObjectF = Lc.v.s().j().zzg().f()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectF.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Bundle bundleO = o(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f80437b.put(strOptString, new DW(strOptString, zOptBoolean2, zOptBoolean, true, bundleO));
                        }
                    }
                } catch (JSONException e10) {
                    Pc.p0.l("Malformed config loading JSON.", e10);
                }
            }
        }
    }

    public final synchronized Map a(String str, String str2) {
        HashMap map;
        try {
            Map mapB = b(str, str2);
            AbstractC8238hh0 abstractC8238hh0H = h(str2);
            map = new HashMap();
            for (Map.Entry entry : ((AbstractC8238hh0) mapB).entrySet()) {
                String str3 = (String) entry.getKey();
                if (abstractC8238hh0H.containsKey(str3)) {
                    DW dw2 = (DW) abstractC8238hh0H.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new DW(str3, dw2.f66246b, dw2.f66247c, dw2.f66248d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            AbstractC8559ki0 abstractC8559ki0K = abstractC8238hh0H.entrySet().iterator();
            while (abstractC8559ki0K.hasNext()) {
                Map.Entry entry2 = (Map.Entry) abstractC8559ki0K.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((DW) entry2.getValue()).f66248d) {
                    map.put(str4, (DW) entry2.getValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    public final synchronized Map b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(Lc.v.s().j().zzg().c()) && (map = (Map) this.f80438c.get(str)) != null) {
                List<BW> list = (List) map.get(str2);
                if (list == null) {
                    String strA = C9276rM.a(this.f80442g, str2, str);
                    if (((Boolean) Mc.A.c().a(C8659lf.f76079Na)).booleanValue()) {
                        strA = strA.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strA);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (BW bw2 : list) {
                        String str3 = bw2.f65545a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(bw2.f65546b);
                    }
                    return AbstractC8238hh0.c(map2);
                }
            }
            return AbstractC8238hh0.d();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Map c() {
        if (TextUtils.isEmpty(Lc.v.s().j().zzg().c())) {
            return AbstractC8238hh0.d();
        }
        return AbstractC8238hh0.c(this.f80437b);
    }

    public final synchronized void g(String str) {
        if (!TextUtils.isEmpty(str) && !this.f80436a.containsKey(str)) {
            this.f80436a.put(str, new BW(str, "", new Bundle()));
        }
    }

    private static final Bundle o(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    final /* synthetic */ void f() {
        this.f80441f.execute(new RunnableC9928xW(this));
    }

    C10142zW(Executor executor) {
        this.f80441f = executor;
    }

    public final void e() {
        Lc.v.s().j().s(new Runnable() { // from class: com.google.android.gms.internal.ads.yW
            @Override // java.lang.Runnable
            public final void run() {
                this.f80239a.f();
            }
        });
        this.f80441f.execute(new RunnableC9928xW(this));
    }
}
