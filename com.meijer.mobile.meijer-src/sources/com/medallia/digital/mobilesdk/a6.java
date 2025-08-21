package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.o6;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class a6 extends k0<String> {

    /* renamed from: g, reason: collision with root package name */
    private final e5 f92451g;

    /* renamed from: h, reason: collision with root package name */
    private final b5 f92452h;

    /* renamed from: i, reason: collision with root package name */
    private final d5 f92453i;

    /* renamed from: j, reason: collision with root package name */
    private String f92454j;

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
            a6.this.f93233d.a((n6<T>) k6Var.b());
        }
    }

    a6(o6 o6Var, l0 l0Var, e5 e5Var, b5 b5Var, d5 d5Var, n6<String> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.f92451g = e5Var;
        this.f92452h = b5Var;
        this.f92453i = d5Var;
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
            jSONObject.put("clientId", this.f92452h.b()).put("apiKey", this.f92452h.a()).put("title", this.f92451g.c() + "-" + this.f92451g.getFormId() + " sent at: " + this.f92451g.h()).put("mediaType", j5.d(this.f92451g.f())).put("thirdPartySource", "Medallia").put("thirdPartyMediaId", this.f92453i.a()).put("languageCode", x3.e().f()).put("countryCode", x3.e().a()).put("description", "Android Digital SDK Media Capture").put("namedFilters", h());
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
            jSONObject.put("respondentId", this.f92451g.b()).put("questionId", "");
            return jSONObject;
        } catch (Exception e10) {
            a4.c("LivingLens Can not getMetaDataObject" + e10.getMessage());
            return jSONObject;
        }
    }

    private JSONArray h() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayListE = this.f92452h.e();
        if (arrayListE != null) {
            try {
                if (arrayListE.contains(o3.f93482a)) {
                    jSONArray.put(new JSONObject().put("group", o3.f93482a).put("filters", new JSONArray().put(!this.f92451g.getFormId().isEmpty() ? this.f92451g.getFormId() : "empty")));
                }
                if (arrayListE.contains(o3.f93483b)) {
                    jSONArray.put(new JSONObject().put("group", o3.f93483b).put("filters", new JSONArray().put(!this.f92451g.getFormId().isEmpty() ? this.f92451g.c() : "empty")));
                }
                if (arrayListE.contains(o3.f93484c)) {
                    jSONArray.put(new JSONObject().put("group", o3.f93484c).put("filters", new JSONArray().put(!this.f92451g.a().isEmpty() ? this.f92451g.a() : "empty")));
                }
                if (arrayListE.contains(o3.f93485d)) {
                    jSONArray.put(new JSONObject().put("group", o3.f93485d).put("filters", new JSONArray().put(!this.f92451g.d().isEmpty() ? this.f92451g.d() : "empty")));
                }
                if (arrayListE.contains(o3.f93486e)) {
                    jSONArray.put(new JSONObject().put("group", o3.f93486e).put("filters", new JSONArray().put(this.f92451g.b().isEmpty() ? "empty" : this.f92451g.b())));
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
        return new s1(h4.a.f92980W);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected void b() {
        b5 b5Var = this.f92452h;
        if (b5Var != null && b5Var.b() != null && this.f92452h.d() != null && this.f92452h.a() != null && this.f92452h.c() != null && this.f92452h.h() != null) {
            this.f92454j = this.f92452h.d() + this.f92452h.c() + this.f92452h.b() + this.f92452h.h();
        }
        h4 h4VarD = d();
        if (h4VarD != null) {
            n6<T> n6Var = this.f93233d;
            if (n6Var != 0) {
                n6Var.a(h4VarD);
                return;
            }
            return;
        }
        try {
            this.f93230a.b(this.f92454j, null, null, e(), s4.f().i().f().a().intValue(), new a());
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 d() {
        if (TextUtils.isEmpty(this.f92454j)) {
            h4.a aVar = h4.a.f92981X;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (this.f92451g != null && this.f92452h != null && this.f92453i != null) {
            return null;
        }
        h4.a aVar2 = h4.a.f92982Y;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }
}
