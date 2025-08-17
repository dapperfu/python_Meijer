package hd;

import Z.C5504b;
import android.app.Activity;
import android.content.res.Resources;
import gd.C14243b;
import gd.C14247f;

/* renamed from: hd.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14423y extends t0 {

    /* renamed from: f, reason: collision with root package name */
    private final C5504b f134718f;

    /* renamed from: g, reason: collision with root package name */
    private final C14404e f134719g;

    private final void v() {
        if (this.f134718f.isEmpty()) {
            return;
        }
        this.f134719g.a(this);
    }

    @Override // hd.t0
    protected final void m(C14243b c14243b, int i10) throws Resources.NotFoundException {
        this.f134719g.F(c14243b, i10);
    }

    @Override // hd.t0
    protected final void n() {
        this.f134719g.G();
    }

    final C5504b t() {
        return this.f134718f;
    }

    C14423y(InterfaceC14408i interfaceC14408i, C14404e c14404e, C14247f c14247f) {
        super(interfaceC14408i, c14247f);
        this.f134718f = new C5504b();
        this.f134719g = c14404e;
        this.f134649a.o("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C14404e c14404e, C14401b c14401b) {
        InterfaceC14408i interfaceC14408iC = C14407h.c(activity);
        C14423y c14423y = (C14423y) interfaceC14408iC.y("ConnectionlessLifecycleHelper", C14423y.class);
        if (c14423y == null) {
            c14423y = new C14423y(interfaceC14408iC, c14404e, C14247f.m());
        }
        com.google.android.gms.common.internal.r.m(c14401b, "ApiKey cannot be null");
        c14423y.f134718f.add(c14401b);
        c14404e.a(c14423y);
    }

    @Override // hd.C14407h
    public final void h() {
        super.h();
        v();
    }

    @Override // hd.t0, hd.C14407h
    public final void j() {
        super.j();
        v();
    }

    @Override // hd.t0, hd.C14407h
    public final void k() {
        super.k();
        this.f134719g.b(this);
    }
}
