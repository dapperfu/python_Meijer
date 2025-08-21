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
public final class C10267zW {

    /* renamed from: a, reason: collision with root package name */
    private final Map f81276a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f81277b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f81278c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f81279d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f81280e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Executor f81281f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f81282g;

    private final synchronized AbstractC8363hh0 h(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(Nc.v.s().j().zzg().c())) {
                boolean zMatches = Pattern.matches((String) Oc.A.c().a(C8784lf.f77275n3), str);
                boolean zMatches2 = Pattern.matches((String) Oc.A.c().a(C8784lf.f77289o3), str);
                if (zMatches) {
                    map = new HashMap(this.f81280e);
                } else if (zMatches2) {
                    map = new HashMap(this.f81279d);
                }
                return AbstractC8363hh0.c(map);
            }
            return AbstractC8363hh0.d();
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
                        if (((BW) this.f81276a.get(str2)) != null) {
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
        this.f81277b.clear();
        this.f81276a.clear();
        this.f81280e.clear();
        this.f81279d.clear();
        m();
        n();
        k();
    }

    private final synchronized void k() {
        JSONObject jSONObjectF;
        try {
            if (!((Boolean) C9534sg.f79123b.e()).booleanValue()) {
                if (((Boolean) Oc.A.c().a(C8784lf.f77008U1)).booleanValue() && (jSONObjectF = Nc.v.s().j().zzg().f()) != null) {
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
                                    this.f81279d.put(strOptString, dw2);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.f81280e.put(strOptString, dw2);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            Rc.p0.l("Malformed config loading JSON.", e10);
        } finally {
        }
    }

    private final synchronized void l(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.f81278c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.f81278c.put(str, map);
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
            JSONObject jSONObjectF = Nc.v.s().j().zzg().f();
            if (jSONObjectF != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectF.optJSONArray("ad_unit_id_settings");
                    this.f81282g = jSONObjectF.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                            String lowerCase = ((Boolean) Oc.A.c().a(C8784lf.f76919Na)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
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
                    Rc.p0.l("Malformed config loading JSON.", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void n() {
        JSONObject jSONObjectF;
        if (!((Boolean) C9534sg.f79126e.e()).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f76994T1)).booleanValue() && (jSONObjectF = Nc.v.s().j().zzg().f()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectF.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Bundle bundleO = o(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f81277b.put(strOptString, new DW(strOptString, zOptBoolean2, zOptBoolean, true, bundleO));
                        }
                    }
                } catch (JSONException e10) {
                    Rc.p0.l("Malformed config loading JSON.", e10);
                }
            }
        }
    }

    public final synchronized Map a(String str, String str2) {
        HashMap map;
        try {
            Map mapB = b(str, str2);
            AbstractC8363hh0 abstractC8363hh0H = h(str2);
            map = new HashMap();
            for (Map.Entry entry : ((AbstractC8363hh0) mapB).entrySet()) {
                String str3 = (String) entry.getKey();
                if (abstractC8363hh0H.containsKey(str3)) {
                    DW dw2 = (DW) abstractC8363hh0H.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new DW(str3, dw2.f67086b, dw2.f67087c, dw2.f67088d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            AbstractC8684ki0 abstractC8684ki0K = abstractC8363hh0H.entrySet().iterator();
            while (abstractC8684ki0K.hasNext()) {
                Map.Entry entry2 = (Map.Entry) abstractC8684ki0K.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((DW) entry2.getValue()).f67088d) {
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
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(Nc.v.s().j().zzg().c()) && (map = (Map) this.f81278c.get(str)) != null) {
                List<BW> list = (List) map.get(str2);
                if (list == null) {
                    String strA = C9401rM.a(this.f81282g, str2, str);
                    if (((Boolean) Oc.A.c().a(C8784lf.f76919Na)).booleanValue()) {
                        strA = strA.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strA);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (BW bw2 : list) {
                        String str3 = bw2.f66385a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(bw2.f66386b);
                    }
                    return AbstractC8363hh0.c(map2);
                }
            }
            return AbstractC8363hh0.d();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Map c() {
        if (TextUtils.isEmpty(Nc.v.s().j().zzg().c())) {
            return AbstractC8363hh0.d();
        }
        return AbstractC8363hh0.c(this.f81277b);
    }

    public final synchronized void g(String str) {
        if (!TextUtils.isEmpty(str) && !this.f81276a.containsKey(str)) {
            this.f81276a.put(str, new BW(str, "", new Bundle()));
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
        this.f81281f.execute(new RunnableC10053xW(this));
    }

    C10267zW(Executor executor) {
        this.f81281f = executor;
    }

    public final void e() {
        Nc.v.s().j().s(new Runnable() { // from class: com.google.android.gms.internal.ads.yW
            @Override // java.lang.Runnable
            public final void run() {
                this.f81079a.f();
            }
        });
        this.f81281f.execute(new RunnableC10053xW(this));
    }
}
