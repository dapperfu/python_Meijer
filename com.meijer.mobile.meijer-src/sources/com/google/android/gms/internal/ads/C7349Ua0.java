package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ua0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7349Ua0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f71473a;

    /* renamed from: b, reason: collision with root package name */
    private final String f71474b;

    private C7349Ua0(String str, String str2) {
        this.f71473a = str;
        this.f71474b = str2;
    }

    public final String b() {
        return this.f71473a;
    }

    public final String c() {
        return this.f71474b;
    }

    public static C7349Ua0 a(String str, String str2) {
        C6774Db0.b(str, "Name is null or empty");
        C6774Db0.b(str2, "Version is null or empty");
        return new C7349Ua0(str, str2);
    }
}
