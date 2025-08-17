package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9507tb0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f78598a;

    /* renamed from: b, reason: collision with root package name */
    private C7292Wb0 f78599b;

    /* renamed from: c, reason: collision with root package name */
    private long f78600c;

    /* renamed from: d, reason: collision with root package name */
    private int f78601d;

    public void i(C6885Ka0 c6885Ka0, C6817Ia0 c6817Ia0) {
        j(c6885Ka0, c6817Ia0, null);
    }

    public void o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.f78599b.get();
    }

    public void c() {
        this.f78599b.clear();
    }

    public final void d(String str, long j10) {
        if (j10 < this.f78600c || this.f78601d == 3) {
            return;
        }
        this.f78601d = 3;
        C8438jb0.a().h(a(), this.f78598a, str);
    }

    public final void g(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C10149zb0.e(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C8438jb0.a().f(a(), jSONObject);
    }

    public final void h(String str, long j10) {
        if (j10 >= this.f78600c) {
            this.f78601d = 2;
            C8438jb0.a().h(a(), this.f78598a, str);
        }
    }

    final void n(WebView webView) {
        this.f78599b = new C7292Wb0(webView);
    }

    public final boolean p() {
        return this.f78599b.get() != 0;
    }

    public C9507tb0(String str) {
        b();
        this.f78598a = str;
        this.f78599b = new C7292Wb0(null);
    }

    public final void b() {
        this.f78600c = System.nanoTime();
        this.f78601d = 1;
    }

    public final void e() {
        C8438jb0.a().c(a(), this.f78598a);
    }

    public final void f(C6783Ha0 c6783Ha0) {
        C8438jb0.a().d(a(), this.f78598a, c6783Ha0.b());
    }

    protected final void j(C6885Ka0 c6885Ka0, C6817Ia0 c6817Ia0, JSONObject jSONObject) throws JSONException {
        String strH = c6885Ka0.h();
        JSONObject jSONObject2 = new JSONObject();
        C10149zb0.e(jSONObject2, "environment", "app");
        C10149zb0.e(jSONObject2, "adSessionType", c6817Ia0.d());
        JSONObject jSONObject3 = new JSONObject();
        C10149zb0.e(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C10149zb0.e(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C10149zb0.e(jSONObject3, "os", "Android");
        C10149zb0.e(jSONObject2, "deviceInfo", jSONObject3);
        C10149zb0.e(jSONObject2, "deviceCategory", C10042yb0.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C10149zb0.e(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C10149zb0.e(jSONObject4, "partnerName", c6817Ia0.e().b());
        C10149zb0.e(jSONObject4, "partnerVersion", c6817Ia0.e().c());
        C10149zb0.e(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C10149zb0.e(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        C10149zb0.e(jSONObject5, "appId", C8226hb0.b().a().getApplicationContext().getPackageName());
        C10149zb0.e(jSONObject2, "app", jSONObject5);
        if (c6817Ia0.f() != null) {
            C10149zb0.e(jSONObject2, "contentUrl", c6817Ia0.f());
        }
        if (c6817Ia0.g() != null) {
            C10149zb0.e(jSONObject2, "customReferenceData", c6817Ia0.g());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = c6817Ia0.h().iterator();
        if (!it.hasNext()) {
            C8438jb0.a().j(a(), strH, jSONObject2, jSONObject6, jSONObject);
        } else {
            throw null;
        }
    }

    public final void k(boolean z10) {
        String str;
        if (p()) {
            if (true != z10) {
                str = "backgrounded";
            } else {
                str = "foregrounded";
            }
            C8438jb0.a().i(a(), this.f78598a, str);
        }
    }

    public final void l(float f10) {
        C8438jb0.a().e(a(), this.f78598a, f10);
    }

    public final void m(boolean z10) {
        String str;
        if (p()) {
            if (true != z10) {
                str = "unlocked";
            } else {
                str = "locked";
            }
            C8438jb0.a().g(a(), this.f78598a, str);
        }
    }
}
