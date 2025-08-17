package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.o6;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class a6 extends k0<String> {

    /* renamed from: g, reason: collision with root package name */
    private final e5 f91612g;

    /* renamed from: h, reason: collision with root package name */
    private final b5 f91613h;

    /* renamed from: i, reason: collision with root package name */
    private final d5 f91614i;

    /* renamed from: j, reason: collision with root package name */
    private String f91615j;

    class a implements o6.a {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            a6.this.b(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.b("LivingLens ProcessMediaClient - success");
            a6.this.f92394d.a((n6<T>) k6Var.b());
        }
    }

    a6(o6 o6Var, l0 l0Var, e5 e5Var, b5 b5Var, d5 d5Var, n6<String> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.f91612g = e5Var;
        this.f91613h = b5Var;
        this.f91614i = d5Var;
        a(false);
    }

    private JSONObject e() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", new JSONObject().put(PreferencesHelper.PREF_ID, "").put("type", "media-capture-upload").put("attributes", f()));
            a4.e("LivingLens Media Object: " + jSONObject);
            return jSONObject;
        } catch (JSONException e10) {
            a4.c("LivingLens Can not create Media Object To Process " + e10.getMessage());
            return null;
        }
    }

    private JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientId", this.f91613h.b()).put("apiKey", this.f91613h.a()).put("title", this.f91612g.c() + "-" + this.f91612g.getFormId() + " sent at: " + this.f91612g.h()).put("mediaType", j5.d(this.f91612g.f())).put("thirdPartySource", "Medallia").put("thirdPartyMediaId", this.f91614i.a()).put("languageCode", x3.e().f()).put("countryCode", x3.e().a()).put("description", "Android Digital SDK Media Capture").put("namedFilters", h());
            jSONObject.put("metadata", g());
            return jSONObject;
        } catch (Exception e10) {
            a4.c("LivingLens " + e10.getMessage());
            return jSONObject;
        }
    }

    private JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("respondentId", this.f91612g.b()).put("questionId", "");
            return jSONObject;
        } catch (Exception e10) {
            a4.c("LivingLens Can not getMetaDataObject" + e10.getMessage());
            return jSONObject;
        }
    }

    private JSONArray h() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayListE = this.f91613h.e();
        if (arrayListE != null) {
            try {
                if (arrayListE.contains(o3.f92643a)) {
                    jSONArray.put(new JSONObject().put("group", o3.f92643a).put("filters", new JSONArray().put(!this.f91612g.getFormId().isEmpty() ? this.f91612g.getFormId() : "empty")));
                }
                if (arrayListE.contains(o3.f92644b)) {
                    jSONArray.put(new JSONObject().put("group", o3.f92644b).put("filters", new JSONArray().put(!this.f91612g.getFormId().isEmpty() ? this.f91612g.c() : "empty")));
                }
                if (arrayListE.contains(o3.f92645c)) {
                    jSONArray.put(new JSONObject().put("group", o3.f92645c).put("filters", new JSONArray().put(!this.f91612g.a().isEmpty() ? this.f91612g.a() : "empty")));
                }
                if (arrayListE.contains(o3.f92646d)) {
                    jSONArray.put(new JSONObject().put("group", o3.f92646d).put("filters", new JSONArray().put(!this.f91612g.d().isEmpty() ? this.f91612g.d() : "empty")));
                }
                if (arrayListE.contains(o3.f92647e)) {
                    jSONArray.put(new JSONObject().put("group", o3.f92647e).put("filters", new JSONArray().put(this.f91612g.b().isEmpty() ? "empty" : this.f91612g.b())));
                    return jSONArray;
                }
            } catch (Exception e10) {
                a4.c("LivingLens " + e10.getMessage());
            }
        }
        return jSONArray;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 a(i6 i6Var) {
        return new s1(h4.a.f92141W);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected void b() {
        b5 b5Var = this.f91613h;
        if (b5Var != null && b5Var.b() != null && this.f91613h.d() != null && this.f91613h.a() != null && this.f91613h.c() != null && this.f91613h.h() != null) {
            this.f91615j = this.f91613h.d() + this.f91613h.c() + this.f91613h.b() + this.f91613h.h();
        }
        h4 h4VarD = d();
        if (h4VarD != null) {
            n6<T> n6Var = this.f92394d;
            if (n6Var != 0) {
                n6Var.a(h4VarD);
                return;
            }
            return;
        }
        try {
            this.f92391a.b(this.f91615j, null, null, e(), s4.f().i().f().a().intValue(), new a());
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 d() {
        if (TextUtils.isEmpty(this.f91615j)) {
            h4.a aVar = h4.a.f92142X;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (this.f91612g != null && this.f91613h != null && this.f91614i != null) {
            return null;
        }
        h4.a aVar2 = h4.a.f92143Y;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }
}
