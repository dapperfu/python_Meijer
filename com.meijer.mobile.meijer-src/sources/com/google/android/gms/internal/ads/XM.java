package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes6.dex */
public final class XM implements C80 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f72159a;

    /* renamed from: b, reason: collision with root package name */
    private final C7517Zc f72160b;

    XM(C7517Zc c7517Zc, Map map) {
        this.f72159a = map;
        this.f72160b = c7517Zc;
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void J(EnumC9806v80 enumC9806v80, String str) {
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void N(EnumC9806v80 enumC9806v80, String str) {
        if (this.f72159a.containsKey(enumC9806v80)) {
            this.f72160b.c(((WM) this.f72159a.get(enumC9806v80)).f71914a);
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void a(EnumC9806v80 enumC9806v80, String str, Throwable th2) {
        if (this.f72159a.containsKey(enumC9806v80)) {
            this.f72160b.c(((WM) this.f72159a.get(enumC9806v80)).f71916c);
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void i(EnumC9806v80 enumC9806v80, String str) {
        if (this.f72159a.containsKey(enumC9806v80)) {
            this.f72160b.c(((WM) this.f72159a.get(enumC9806v80)).f71915b);
        }
    }
}
