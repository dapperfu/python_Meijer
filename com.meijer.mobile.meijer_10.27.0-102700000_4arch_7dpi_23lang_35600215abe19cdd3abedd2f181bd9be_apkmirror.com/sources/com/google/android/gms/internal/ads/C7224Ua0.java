package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ua0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7224Ua0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f70633a;

    /* renamed from: b, reason: collision with root package name */
    private final String f70634b;

    private C7224Ua0(String str, String str2) {
        this.f70633a = str;
        this.f70634b = str2;
    }

    public final String b() {
        return this.f70633a;
    }

    public final String c() {
        return this.f70634b;
    }

    public static C7224Ua0 a(String str, String str2) {
        C6649Db0.b(str, "Name is null or empty");
        C6649Db0.b(str2, "Version is null or empty");
        return new C7224Ua0(str, str2);
    }
}
