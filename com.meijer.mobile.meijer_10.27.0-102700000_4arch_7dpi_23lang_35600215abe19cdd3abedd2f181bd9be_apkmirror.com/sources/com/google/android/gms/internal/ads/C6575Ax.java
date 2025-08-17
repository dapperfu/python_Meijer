package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ax, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6575Ax {

    /* renamed from: a, reason: collision with root package name */
    private final String f65368a;

    /* renamed from: b, reason: collision with root package name */
    private final C8778ml f65369b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f65370c;

    /* renamed from: d, reason: collision with root package name */
    private C6745Fx f65371d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC7069Pi f65372e = new C9871wx(this);

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC7069Pi f65373f = new C10192zx(this);

    public C6575Ax(String str, C8778ml c8778ml, Executor executor) {
        this.f65368a = str;
        this.f65369b = c8778ml;
        this.f65370c = executor;
    }

    static /* bridge */ /* synthetic */ boolean g(C6575Ax c6575Ax, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(c6575Ax.f65368a);
    }

    public final void c(C6745Fx c6745Fx) {
        this.f65369b.b("/updateActiveView", this.f65372e);
        this.f65369b.b("/untrackActiveViewUnit", this.f65373f);
        this.f65371d = c6745Fx;
    }

    public final void d(InterfaceC9008ot interfaceC9008ot) {
        interfaceC9008ot.h0("/updateActiveView", this.f65372e);
        interfaceC9008ot.h0("/untrackActiveViewUnit", this.f65373f);
    }

    public final void e() {
        this.f65369b.c("/updateActiveView", this.f65372e);
        this.f65369b.c("/untrackActiveViewUnit", this.f65373f);
    }

    public final void f(InterfaceC9008ot interfaceC9008ot) {
        interfaceC9008ot.X("/updateActiveView", this.f65372e);
        interfaceC9008ot.X("/untrackActiveViewUnit", this.f65373f);
    }
}
