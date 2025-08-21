package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Pp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7201Pp {

    /* renamed from: a, reason: collision with root package name */
    private Context f70262a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.common.util.f f70263b;

    /* renamed from: c, reason: collision with root package name */
    private Rc.r0 f70264c;

    /* renamed from: d, reason: collision with root package name */
    private C7436Wp f70265d;

    /* synthetic */ C7201Pp(C7269Rp c7269Rp) {
    }

    public final C7201Pp a(Rc.r0 r0Var) {
        this.f70264c = r0Var;
        return this;
    }

    public final C7201Pp d(C7436Wp c7436Wp) {
        this.f70265d = c7436Wp;
        return this;
    }

    public final AbstractC7469Xp e() {
        C9358qy0.c(this.f70262a, Context.class);
        C9358qy0.c(this.f70263b, com.google.android.gms.common.util.f.class);
        C9358qy0.c(this.f70264c, Rc.r0.class);
        C9358qy0.c(this.f70265d, C7436Wp.class);
        return new C7235Qp(this.f70262a, this.f70263b, this.f70264c, this.f70265d, null);
    }

    public final C7201Pp b(Context context) {
        context.getClass();
        this.f70262a = context;
        return this;
    }

    public final C7201Pp c(com.google.android.gms.common.util.f fVar) {
        fVar.getClass();
        this.f70263b = fVar;
        return this;
    }
}
