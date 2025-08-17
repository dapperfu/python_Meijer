package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Aw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6574Aw implements InterfaceC9869ww {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.r0 f65366a;

    @Override // com.google.android.gms.internal.ads.InterfaceC9869ww
    public final void a(Map map) {
        this.f65366a.o(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }

    public C6574Aw(Pc.r0 r0Var) {
        this.f65366a = r0Var;
    }
}
