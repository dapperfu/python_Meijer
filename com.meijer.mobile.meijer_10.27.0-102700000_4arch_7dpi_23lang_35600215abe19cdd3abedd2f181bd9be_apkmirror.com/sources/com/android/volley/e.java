package com.android.volley;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f62906a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62907b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (TextUtils.equals(this.f62906a, eVar.f62906a) && TextUtils.equals(this.f62907b, eVar.f62907b)) {
                return true;
            }
        }
        return false;
    }

    public final String a() {
        return this.f62906a;
    }

    public final String b() {
        return this.f62907b;
    }

    public int hashCode() {
        return (this.f62906a.hashCode() * 31) + this.f62907b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f62906a + ",value=" + this.f62907b + "]";
    }

    public e(String str, String str2) {
        this.f62906a = str;
        this.f62907b = str2;
    }
}
