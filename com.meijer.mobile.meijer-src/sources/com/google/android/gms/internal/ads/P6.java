package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class P6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f70104a;

    /* renamed from: b, reason: collision with root package name */
    private final String f70105b;

    public P6(String str, String str2) {
        this.f70104a = str;
        this.f70105b = str2;
    }

    public final String a() {
        return this.f70104a;
    }

    public final String b() {
        return this.f70105b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P6.class == obj.getClass()) {
            P6 p62 = (P6) obj;
            if (TextUtils.equals(this.f70104a, p62.f70104a) && TextUtils.equals(this.f70105b, p62.f70105b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f70104a.hashCode() * 31) + this.f70105b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f70104a + ",value=" + this.f70105b + "]";
    }
}
