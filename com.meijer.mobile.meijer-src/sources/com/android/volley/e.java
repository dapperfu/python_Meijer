package com.android.volley;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f63745a;

    /* renamed from: b, reason: collision with root package name */
    private final String f63746b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (TextUtils.equals(this.f63745a, eVar.f63745a) && TextUtils.equals(this.f63746b, eVar.f63746b)) {
                return true;
            }
        }
        return false;
    }

    public final String a() {
        return this.f63745a;
    }

    public final String b() {
        return this.f63746b;
    }

    public int hashCode() {
        return (this.f63745a.hashCode() * 31) + this.f63746b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f63745a + ",value=" + this.f63746b + "]";
    }

    public e(String str, String str2) {
        this.f63745a = str;
        this.f63746b = str2;
    }
}
