package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7186Sx {

    /* renamed from: a, reason: collision with root package name */
    private final C9812wN f70200a;

    /* renamed from: b, reason: collision with root package name */
    private final C8608l60 f70201b;

    C7186Sx(C9812wN c9812wN, C8608l60 c8608l60) {
        this.f70200a = c9812wN;
        this.f70201b = c8608l60;
    }

    public final void a(long j10, int i10) {
        C9705vN c9705vNA = this.f70200a.a();
        c9705vNA.d(this.f70201b.f75749b.f75337b);
        c9705vNA.b("action", "ad_closed");
        c9705vNA.b("show_time", String.valueOf(j10));
        c9705vNA.b("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        c9705vNA.b("acr", i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        c9705vNA.g();
    }
}
