package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Pp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7076Pp {

    /* renamed from: a, reason: collision with root package name */
    private Context f69422a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.common.util.f f69423b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.r0 f69424c;

    /* renamed from: d, reason: collision with root package name */
    private C7311Wp f69425d;

    /* synthetic */ C7076Pp(C7144Rp c7144Rp) {
    }

    public final C7076Pp a(Pc.r0 r0Var) {
        this.f69424c = r0Var;
        return this;
    }

    public final C7076Pp d(C7311Wp c7311Wp) {
        this.f69425d = c7311Wp;
        return this;
    }

    public final AbstractC7344Xp e() {
        C9233qy0.c(this.f69422a, Context.class);
        C9233qy0.c(this.f69423b, com.google.android.gms.common.util.f.class);
        C9233qy0.c(this.f69424c, Pc.r0.class);
        C9233qy0.c(this.f69425d, C7311Wp.class);
        return new C7110Qp(this.f69422a, this.f69423b, this.f69424c, this.f69425d, null);
    }

    public final C7076Pp b(Context context) {
        context.getClass();
        this.f69422a = context;
        return this;
    }

    public final C7076Pp c(com.google.android.gms.common.util.f fVar) {
        fVar.getClass();
        this.f69423b = fVar;
        return this;
    }
}
