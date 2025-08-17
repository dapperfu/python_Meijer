package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes6.dex */
public final class XM implements C80 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f71319a;

    /* renamed from: b, reason: collision with root package name */
    private final C7392Zc f71320b;

    XM(C7392Zc c7392Zc, Map map) {
        this.f71319a = map;
        this.f71320b = c7392Zc;
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void C(EnumC9681v80 enumC9681v80, String str) {
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void L(EnumC9681v80 enumC9681v80, String str) {
        if (this.f71319a.containsKey(enumC9681v80)) {
            this.f71320b.c(((WM) this.f71319a.get(enumC9681v80)).f71074a);
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void a(EnumC9681v80 enumC9681v80, String str, Throwable th2) {
        if (this.f71319a.containsKey(enumC9681v80)) {
            this.f71320b.c(((WM) this.f71319a.get(enumC9681v80)).f71076c);
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void i(EnumC9681v80 enumC9681v80, String str) {
        if (this.f71319a.containsKey(enumC9681v80)) {
            this.f71320b.c(((WM) this.f71319a.get(enumC9681v80)).f71075b);
        }
    }
}
