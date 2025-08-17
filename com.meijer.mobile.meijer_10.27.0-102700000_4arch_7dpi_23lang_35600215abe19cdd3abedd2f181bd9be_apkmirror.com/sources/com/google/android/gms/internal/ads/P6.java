package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class P6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f69264a;

    /* renamed from: b, reason: collision with root package name */
    private final String f69265b;

    public P6(String str, String str2) {
        this.f69264a = str;
        this.f69265b = str2;
    }

    public final String a() {
        return this.f69264a;
    }

    public final String b() {
        return this.f69265b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P6.class == obj.getClass()) {
            P6 p62 = (P6) obj;
            if (TextUtils.equals(this.f69264a, p62.f69264a) && TextUtils.equals(this.f69265b, p62.f69265b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f69264a.hashCode() * 31) + this.f69265b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f69264a + ",value=" + this.f69265b + "]";
    }
}
