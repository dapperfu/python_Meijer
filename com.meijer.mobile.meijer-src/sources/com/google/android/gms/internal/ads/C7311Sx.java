package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7311Sx {

    /* renamed from: a, reason: collision with root package name */
    private final C9937wN f71040a;

    /* renamed from: b, reason: collision with root package name */
    private final C8733l60 f71041b;

    C7311Sx(C9937wN c9937wN, C8733l60 c8733l60) {
        this.f71040a = c9937wN;
        this.f71041b = c8733l60;
    }

    public final void a(long j10, int i10) {
        C9830vN c9830vNA = this.f71040a.a();
        c9830vNA.d(this.f71041b.f76589b.f76177b);
        c9830vNA.b("action", "ad_closed");
        c9830vNA.b("show_time", String.valueOf(j10));
        c9830vNA.b("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        c9830vNA.b("acr", i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        c9830vNA.g();
    }
}
