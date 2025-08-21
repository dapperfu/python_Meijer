package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11349r2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f86667a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86668b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86669c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f86670d;

    public C11349r2(String str, String str2, Bundle bundle, long j10) {
        this.f86667a = str;
        this.f86668b = str2;
        this.f86670d = bundle;
        this.f86669c = j10;
    }

    public static C11349r2 a(G g10) {
        return new C11349r2(g10.f85861a, g10.f85863c, g10.f85862b.U0(), g10.f85864d);
    }

    public final G b() {
        return new G(this.f86667a, new E(new Bundle(this.f86670d)), this.f86668b, this.f86669c);
    }

    public final String toString() {
        String str = this.f86668b;
        String string = this.f86670d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f86667a;
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
