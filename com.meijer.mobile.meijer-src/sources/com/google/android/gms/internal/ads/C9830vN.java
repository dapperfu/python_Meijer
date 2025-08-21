package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.vN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9830vN {

    /* renamed from: a, reason: collision with root package name */
    private final Map f79888a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9937wN f79889b;

    C9830vN(C9937wN c9937wN) {
        this.f79889b = c9937wN;
    }

    static /* bridge */ /* synthetic */ C9830vN a(C9830vN c9830vN) {
        c9830vN.f79888a.putAll(c9830vN.f79889b.f80318c);
        return c9830vN;
    }

    public final C9830vN c(Z50 z50) {
        b("aai", z50.f72905w);
        b("request_id", z50.f72888n0);
        b("ad_format", Z50.a(z50.f72863b));
        return this;
    }

    public final C9830vN d(C7773c60 c7773c60) {
        b("gqi", c7773c60.f73943b);
        return this;
    }

    public final String e() {
        return this.f79889b.f80316a.b(this.f79888a);
    }

    public final void f() {
        this.f79889b.f80317b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uN
            @Override // java.lang.Runnable
            public final void run() {
                this.f79676a.i();
            }
        });
    }

    public final void g() {
        this.f79889b.f80317b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sN
            @Override // java.lang.Runnable
            public final void run() {
                this.f79068a.j();
            }
        });
    }

    public final void h() {
        this.f79889b.f80317b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tN
            @Override // java.lang.Runnable
            public final void run() {
                this.f79403a.k();
            }
        });
    }

    final /* synthetic */ void i() {
        this.f79889b.f80316a.e(this.f79888a);
    }

    final /* synthetic */ void j() {
        this.f79889b.f80316a.g(this.f79888a);
    }

    final /* synthetic */ void k() {
        this.f79889b.f80316a.f(this.f79888a);
    }

    public final C9830vN b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f79888a.put(str, str2);
        }
        return this;
    }
}
