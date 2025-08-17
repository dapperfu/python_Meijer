package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class c0 extends b0 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f91664i = 6;

    /* renamed from: a, reason: collision with root package name */
    private String f91665a;

    /* renamed from: b, reason: collision with root package name */
    private Object f91666b;

    /* renamed from: c, reason: collision with root package name */
    private ValueType f91667c;

    /* renamed from: d, reason: collision with root package name */
    private Lifetime f91668d;

    /* renamed from: e, reason: collision with root package name */
    private GroupType f91669e;

    /* renamed from: f, reason: collision with root package name */
    private String f91670f;

    /* renamed from: g, reason: collision with root package name */
    private long f91671g;

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f91672h;

    protected c0() {
    }

    private void k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f91672h = jSONObject;
        jSONObject.put("sessionId", l3.a((Object) this.f91670f));
        this.f91672h.put("value", l3.a(this.f91666b));
        this.f91672h.put("name", l3.a((Object) this.f91665a));
        this.f91672h.put("valueType", l3.a(this.f91667c));
        this.f91672h.put("lifetime", l3.a(this.f91668d));
        this.f91672h.put("groupType", l3.a(this.f91669e));
        this.f91672h.put("timestamp", l3.a(Long.valueOf(this.f91671g)));
    }

    protected String a() {
        return a(Long.valueOf(h())) + a(g()) + a(getName()) + "=" + a(i()) + "\n";
    }

    protected String b() {
        return a(l8.b(h())) + a(Long.valueOf(h())) + a(g().substring(0, 6) + "..") + a(getName()) + "=" + a(i()) + "\n";
    }

    protected String c() {
        return null;
    }

    protected JSONObject d() {
        return this.f91672h;
    }

    protected GroupType e() {
        return this.f91669e;
    }

    protected Lifetime f() {
        return this.f91668d;
    }

    protected String g() {
        return this.f91670f;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.UserJourneyData;
    }

    protected String getName() {
        return this.f91665a;
    }

    protected long h() {
        return this.f91671g;
    }

    protected Object i() {
        return this.f91666b;
    }

    protected ValueType j() {
        return this.f91667c;
    }

    protected void l() throws JSONException {
        Object obj;
        String strA = d7.b().a(d7.a.SESSION_ID, "");
        this.f91670f = strA;
        JSONObject jSONObject = this.f91672h;
        if (jSONObject != null) {
            if (strA != null) {
                obj = strA;
            } else {
                try {
                    obj = JSONObject.NULL;
                } catch (JSONException e10) {
                    a4.c(e10.getMessage());
                    return;
                }
            }
            jSONObject.put("sessionId", obj);
        }
    }

    public String toString() {
        return "[" + l8.a(this.f91671g) + "]" + this.f91672h.toString();
    }

    protected c0(Object obj, GroupType groupType, Lifetime lifetime, ValueType valueType, String str) {
        try {
            this.f91670f = d7.b().a(d7.a.SESSION_ID, "");
            this.f91671g = System.currentTimeMillis();
            this.f91665a = str;
            this.f91666b = obj != null ? obj.toString() : null;
            this.f91667c = valueType;
            this.f91668d = lifetime;
            this.f91669e = groupType;
            k();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private String a(Object obj) {
        return "[" + obj + "]";
    }

    protected c0(Object obj, GroupType groupType, Lifetime lifetime, ValueType valueType, String str, long j10, String str2) {
        try {
            this.f91670f = str2;
            this.f91671g = j10;
            this.f91665a = str;
            this.f91666b = obj != null ? obj.toString() : null;
            this.f91667c = valueType;
            this.f91668d = lifetime;
            this.f91669e = groupType;
            k();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected c0(JSONObject jSONObject, GroupType groupType, Lifetime lifetime, String str) {
        try {
            this.f91670f = d7.b().a(d7.a.SESSION_ID, "");
            this.f91671g = System.currentTimeMillis();
            this.f91665a = str;
            ValueType valueType = null;
            String string = jSONObject != null ? jSONObject.toString() : null;
            this.f91666b = string;
            if (string != null) {
                valueType = ValueType.TypeString;
            }
            this.f91667c = valueType;
            this.f91668d = lifetime;
            this.f91669e = groupType;
            k();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
