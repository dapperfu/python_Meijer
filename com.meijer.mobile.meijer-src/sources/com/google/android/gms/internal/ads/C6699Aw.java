package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Aw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6699Aw implements InterfaceC9994ww {

    /* renamed from: a, reason: collision with root package name */
    private final Rc.r0 f66206a;

    @Override // com.google.android.gms.internal.ads.InterfaceC9994ww
    public final void a(Map map) {
        this.f66206a.o(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }

    public C6699Aw(Rc.r0 r0Var) {
        this.f66206a = r0Var;
    }
}
