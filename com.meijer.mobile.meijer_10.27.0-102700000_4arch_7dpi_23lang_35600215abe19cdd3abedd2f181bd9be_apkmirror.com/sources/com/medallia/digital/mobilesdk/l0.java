package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class l0 {

    /* renamed from: a, reason: collision with root package name */
    private String f92467a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, String> f92468b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f92469c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f92470d;

    /* renamed from: e, reason: collision with root package name */
    private String f92471e;

    l0() {
        this.f92471e = null;
    }

    protected JSONObject a() {
        return this.f92470d;
    }

    protected HashMap<String, String> b() {
        return this.f92468b;
    }

    protected HashMap<String, String> c() {
        return this.f92469c;
    }

    public String d() {
        return this.f92471e;
    }

    protected String e() {
        return this.f92467a;
    }

    l0(String str) {
        this.f92471e = null;
        this.f92467a = str;
    }

    l0(String str, HashMap<String, String> map) {
        this.f92471e = null;
        this.f92467a = str;
        this.f92468b = map;
    }

    l0(String str, HashMap<String, String> map, String str2) {
        this.f92467a = str;
        this.f92468b = map;
        this.f92471e = str2;
    }

    l0(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject) {
        this.f92471e = null;
        this.f92467a = str;
        this.f92468b = map;
        this.f92469c = map2;
        this.f92470d = jSONObject;
    }

    l0(String str, HashMap<String, String> map, JSONObject jSONObject) {
        this.f92471e = null;
        this.f92467a = str;
        this.f92468b = map;
        this.f92470d = jSONObject;
    }
}
