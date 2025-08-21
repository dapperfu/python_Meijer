package com.adobe.marketing.mobile.campaign;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    String f63247a;

    /* renamed from: b, reason: collision with root package name */
    String f63248b;

    /* renamed from: c, reason: collision with root package name */
    int f63249c;

    class a extends HashMap<String, Object> {
        a() {
            put("url", i.this.f63247a);
            put("payload", i.this.f63248b);
            put("timeout", Integer.valueOf(i.this.f63249c));
        }
    }

    R5.r a() {
        return !g6.i.a(this.f63248b) ? R5.r.POST : R5.r.GET;
    }

    public String toString() {
        return new JSONObject(new a()).toString();
    }

    i(String str, String str2, int i10) {
        this.f63247a = str;
        this.f63248b = str2;
        this.f63249c = i10;
    }
}
