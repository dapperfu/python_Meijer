package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10083yw implements InterfaceC9869ww {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.r0 f80312a;

    @Override // com.google.android.gms.internal.ads.InterfaceC9869ww
    public final void a(Map map) {
        this.f80312a.q(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }

    public C10083yw(Pc.r0 r0Var) {
        this.f80312a = r0Var;
    }
}
