package com.adobe.marketing.mobile.campaign;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    String f62408a;

    /* renamed from: b, reason: collision with root package name */
    String f62409b;

    /* renamed from: c, reason: collision with root package name */
    int f62410c;

    class a extends HashMap<String, Object> {
        a() {
            put("url", i.this.f62408a);
            put("payload", i.this.f62409b);
            put("timeout", Integer.valueOf(i.this.f62410c));
        }
    }

    Q5.r a() {
        return !f6.i.a(this.f62409b) ? Q5.r.POST : Q5.r.GET;
    }

    public String toString() {
        return new JSONObject(new a()).toString();
    }

    i(String str, String str2, int i10) {
        this.f62408a = str;
        this.f62409b = str2;
        this.f62410c = i10;
    }
}
