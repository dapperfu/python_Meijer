package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class l0 {

    /* renamed from: a, reason: collision with root package name */
    private String f93306a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, String> f93307b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f93308c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f93309d;

    /* renamed from: e, reason: collision with root package name */
    private String f93310e;

    l0() {
        this.f93310e = null;
    }

    protected JSONObject a() {
        return this.f93309d;
    }

    protected HashMap<String, String> b() {
        return this.f93307b;
    }

    protected HashMap<String, String> c() {
        return this.f93308c;
    }

    public String d() {
        return this.f93310e;
    }

    protected String e() {
        return this.f93306a;
    }

    l0(String str) {
        this.f93310e = null;
        this.f93306a = str;
    }

    l0(String str, HashMap<String, String> map) {
        this.f93310e = null;
        this.f93306a = str;
        this.f93307b = map;
    }

    l0(String str, HashMap<String, String> map, String str2) {
        this.f93306a = str;
        this.f93307b = map;
        this.f93310e = str2;
    }

    l0(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject) {
        this.f93310e = null;
        this.f93306a = str;
        this.f93307b = map;
        this.f93308c = map2;
        this.f93309d = jSONObject;
    }

    l0(String str, HashMap<String, String> map, JSONObject jSONObject) {
        this.f93310e = null;
        this.f93306a = str;
        this.f93307b = map;
        this.f93309d = jSONObject;
    }
}
