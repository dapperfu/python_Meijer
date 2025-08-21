package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class c0 extends b0 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f92503i = 6;

    /* renamed from: a, reason: collision with root package name */
    private String f92504a;

    /* renamed from: b, reason: collision with root package name */
    private Object f92505b;

    /* renamed from: c, reason: collision with root package name */
    private ValueType f92506c;

    /* renamed from: d, reason: collision with root package name */
    private Lifetime f92507d;

    /* renamed from: e, reason: collision with root package name */
    private GroupType f92508e;

    /* renamed from: f, reason: collision with root package name */
    private String f92509f;

    /* renamed from: g, reason: collision with root package name */
    private long f92510g;

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f92511h;

    protected c0() {
    }

    private void k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f92511h = jSONObject;
        jSONObject.put("sessionId", l3.a((Object) this.f92509f));
        this.f92511h.put("value", l3.a(this.f92505b));
        this.f92511h.put("name", l3.a((Object) this.f92504a));
        this.f92511h.put("valueType", l3.a(this.f92506c));
        this.f92511h.put("lifetime", l3.a(this.f92507d));
        this.f92511h.put("groupType", l3.a(this.f92508e));
        this.f92511h.put("timestamp", l3.a(Long.valueOf(this.f92510g)));
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
        return this.f92511h;
    }

    protected GroupType e() {
        return this.f92508e;
    }

    protected Lifetime f() {
        return this.f92507d;
    }

    protected String g() {
        return this.f92509f;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.UserJourneyData;
    }

    protected String getName() {
        return this.f92504a;
    }

    protected long h() {
        return this.f92510g;
    }

    protected Object i() {
        return this.f92505b;
    }

    protected ValueType j() {
        return this.f92506c;
    }

    protected void l() throws JSONException {
        Object obj;
        String strA = d7.b().a(d7.a.SESSION_ID, "");
        this.f92509f = strA;
        JSONObject jSONObject = this.f92511h;
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
        return "[" + l8.a(this.f92510g) + "]" + this.f92511h.toString();
    }

    protected c0(Object obj, GroupType groupType, Lifetime lifetime, ValueType valueType, String str) {
        try {
            this.f92509f = d7.b().a(d7.a.SESSION_ID, "");
            this.f92510g = System.currentTimeMillis();
            this.f92504a = str;
            this.f92505b = obj != null ? obj.toString() : null;
            this.f92506c = valueType;
            this.f92507d = lifetime;
            this.f92508e = groupType;
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
            this.f92509f = str2;
            this.f92510g = j10;
            this.f92504a = str;
            this.f92505b = obj != null ? obj.toString() : null;
            this.f92506c = valueType;
            this.f92507d = lifetime;
            this.f92508e = groupType;
            k();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected c0(JSONObject jSONObject, GroupType groupType, Lifetime lifetime, String str) {
        try {
            this.f92509f = d7.b().a(d7.a.SESSION_ID, "");
            this.f92510g = System.currentTimeMillis();
            this.f92504a = str;
            ValueType valueType = null;
            String string = jSONObject != null ? jSONObject.toString() : null;
            this.f92505b = string;
            if (string != null) {
                valueType = ValueType.TypeString;
            }
            this.f92506c = valueType;
            this.f92507d = lifetime;
            this.f92508e = groupType;
            k();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
