package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.b30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7536b30 {

    /* renamed from: a, reason: collision with root package name */
    private final C9853wo f72702a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72703b;

    public C7536b30(C9853wo c9853wo, int i10) {
        this.f72702a = c9853wo;
        this.f72703b = i10;
    }

    public final int a() {
        return this.f72703b;
    }

    public final PackageInfo b() {
        return this.f72702a.f79531f;
    }

    public final String c() {
        return this.f72702a.f79529d;
    }

    public final String d() {
        return C7267Vf0.c(this.f72702a.f79526a.getString("ms"));
    }

    public final String e() {
        return this.f72702a.f79533h;
    }

    public final List f() {
        return this.f72702a.f79530e;
    }

    final boolean g() {
        return this.f72702a.f79537l;
    }

    final boolean h() {
        return this.f72702a.f79526a.getBoolean("is_gbid");
    }

    final boolean i() {
        return this.f72702a.f79536k;
    }
}
