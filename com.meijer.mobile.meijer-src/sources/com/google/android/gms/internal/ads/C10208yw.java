package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10208yw implements InterfaceC9994ww {

    /* renamed from: a, reason: collision with root package name */
    private final Rc.r0 f81152a;

    @Override // com.google.android.gms.internal.ads.InterfaceC9994ww
    public final void a(Map map) {
        this.f81152a.q(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }

    public C10208yw(Rc.r0 r0Var) {
        this.f81152a = r0Var;
    }
}
