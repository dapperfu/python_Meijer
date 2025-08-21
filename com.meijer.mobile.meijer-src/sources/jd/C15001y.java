package jd;

import Z.C5604b;
import android.app.Activity;
import android.content.res.Resources;
import id.C14719b;
import id.C14723f;

/* renamed from: jd.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15001y extends t0 {

    /* renamed from: f, reason: collision with root package name */
    private final C5604b f140407f;

    /* renamed from: g, reason: collision with root package name */
    private final C14982e f140408g;

    private final void v() {
        if (this.f140407f.isEmpty()) {
            return;
        }
        this.f140408g.a(this);
    }

    @Override // jd.t0
    protected final void m(C14719b c14719b, int i10) throws Resources.NotFoundException {
        this.f140408g.F(c14719b, i10);
    }

    @Override // jd.t0
    protected final void n() {
        this.f140408g.G();
    }

    final C5604b t() {
        return this.f140407f;
    }

    C15001y(InterfaceC14986i interfaceC14986i, C14982e c14982e, C14723f c14723f) {
        super(interfaceC14986i, c14723f);
        this.f140407f = new C5604b();
        this.f140408g = c14982e;
        this.f140338a.M("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C14982e c14982e, C14979b c14979b) {
        InterfaceC14986i interfaceC14986iC = C14985h.c(activity);
        C15001y c15001y = (C15001y) interfaceC14986iC.A("ConnectionlessLifecycleHelper", C15001y.class);
        if (c15001y == null) {
            c15001y = new C15001y(interfaceC14986iC, c14982e, C14723f.m());
        }
        com.google.android.gms.common.internal.r.m(c14979b, "ApiKey cannot be null");
        c15001y.f140407f.add(c14979b);
        c14982e.a(c15001y);
    }

    @Override // jd.C14985h
    public final void h() {
        super.h();
        v();
    }

    @Override // jd.t0, jd.C14985h
    public final void j() {
        super.j();
        v();
    }

    @Override // jd.t0, jd.C14985h
    public final void k() {
        super.k();
        this.f140408g.b(this);
    }
}
