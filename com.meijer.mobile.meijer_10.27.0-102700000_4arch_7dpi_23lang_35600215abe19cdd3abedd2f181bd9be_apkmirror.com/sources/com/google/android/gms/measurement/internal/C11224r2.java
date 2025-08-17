package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11224r2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f85827a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85828b;

    /* renamed from: c, reason: collision with root package name */
    public final long f85829c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f85830d;

    public C11224r2(String str, String str2, Bundle bundle, long j10) {
        this.f85827a = str;
        this.f85828b = str2;
        this.f85830d = bundle;
        this.f85829c = j10;
    }

    public static C11224r2 a(G g10) {
        return new C11224r2(g10.f85021a, g10.f85023c, g10.f85022b.W0(), g10.f85024d);
    }

    public final G b() {
        return new G(this.f85827a, new E(new Bundle(this.f85830d)), this.f85828b, this.f85829c);
    }

    public final String toString() {
        String str = this.f85828b;
        String string = this.f85830d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f85827a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(string);
        return sb2.toString();
    }
}
