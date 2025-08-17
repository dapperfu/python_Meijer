package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.vN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9705vN {

    /* renamed from: a, reason: collision with root package name */
    private final Map f79048a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9812wN f79049b;

    C9705vN(C9812wN c9812wN) {
        this.f79049b = c9812wN;
    }

    static /* bridge */ /* synthetic */ C9705vN a(C9705vN c9705vN) {
        c9705vN.f79048a.putAll(c9705vN.f79049b.f79478c);
        return c9705vN;
    }

    public final C9705vN c(Z50 z50) {
        b("aai", z50.f72065w);
        b("request_id", z50.f72048n0);
        b("ad_format", Z50.a(z50.f72023b));
        return this;
    }

    public final C9705vN d(C7648c60 c7648c60) {
        b("gqi", c7648c60.f73103b);
        return this;
    }

    public final String e() {
        return this.f79049b.f79476a.b(this.f79048a);
    }

    public final void f() {
        this.f79049b.f79477b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uN
            @Override // java.lang.Runnable
            public final void run() {
                this.f78836a.i();
            }
        });
    }

    public final void g() {
        this.f79049b.f79477b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sN
            @Override // java.lang.Runnable
            public final void run() {
                this.f78228a.j();
            }
        });
    }

    public final void h() {
        this.f79049b.f79477b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tN
            @Override // java.lang.Runnable
            public final void run() {
                this.f78563a.k();
            }
        });
    }

    final /* synthetic */ void i() {
        this.f79049b.f79476a.e(this.f79048a);
    }

    final /* synthetic */ void j() {
        this.f79049b.f79476a.g(this.f79048a);
    }

    final /* synthetic */ void k() {
        this.f79049b.f79476a.f(this.f79048a);
    }

    public final C9705vN b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f79048a.put(str, str2);
        }
        return this;
    }
}
