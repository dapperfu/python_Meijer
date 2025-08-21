package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.r2;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f92956a;

    public h0(g0 g0Var) {
        this.f92956a = g0Var;
    }

    class a implements r2.f<JSONObject> {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a() {
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a(JSONObject jSONObject) {
            if (jSONObject != null) {
                v0.b(jSONObject.toString());
                t0.c().a(new PropertyConfigurationContract(jSONObject));
            }
            if (LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity")) {
                return;
            }
            y8.b().b(MedalliaWebView.f.preload);
            h0.this.f92956a.a(r2.e().f());
        }
    }

    protected void a(String str) {
        r2.e().a(str, new a());
    }

    protected void a(Locale locale, boolean z10) {
        if (locale == null) {
            return;
        }
        x3.e().a(locale);
        if (z10) {
            a(x3.e().d());
        }
    }

    protected boolean a() {
        if (x3.e().c() != null) {
            return false;
        }
        return x3.e().i();
    }
}
