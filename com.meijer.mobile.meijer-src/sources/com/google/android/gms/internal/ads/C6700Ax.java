package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ax, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6700Ax {

    /* renamed from: a, reason: collision with root package name */
    private final String f66208a;

    /* renamed from: b, reason: collision with root package name */
    private final C8903ml f66209b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f66210c;

    /* renamed from: d, reason: collision with root package name */
    private C6870Fx f66211d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC7194Pi f66212e = new C9996wx(this);

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC7194Pi f66213f = new C10317zx(this);

    public C6700Ax(String str, C8903ml c8903ml, Executor executor) {
        this.f66208a = str;
        this.f66209b = c8903ml;
        this.f66210c = executor;
    }

    static /* bridge */ /* synthetic */ boolean g(C6700Ax c6700Ax, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(c6700Ax.f66208a);
    }

    public final void c(C6870Fx c6870Fx) {
        this.f66209b.b("/updateActiveView", this.f66212e);
        this.f66209b.b("/untrackActiveViewUnit", this.f66213f);
        this.f66211d = c6870Fx;
    }

    public final void d(InterfaceC9133ot interfaceC9133ot) {
        interfaceC9133ot.h0("/updateActiveView", this.f66212e);
        interfaceC9133ot.h0("/untrackActiveViewUnit", this.f66213f);
    }

    public final void e() {
        this.f66209b.c("/updateActiveView", this.f66212e);
        this.f66209b.c("/untrackActiveViewUnit", this.f66213f);
    }

    public final void f(InterfaceC9133ot interfaceC9133ot) {
        interfaceC9133ot.X("/updateActiveView", this.f66212e);
        interfaceC9133ot.X("/untrackActiveViewUnit", this.f66213f);
    }
}
