package mc;

import Xb.a;
import eb.C13784a;
import eb.C13785b;
import kc.C15116a;
import kc.l;
import nc.C15931c;

/* renamed from: mc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15706c implements d {

    /* renamed from: b, reason: collision with root package name */
    private static final C13784a f150973b = C13785b.a(C15706c.class.getSimpleName());

    /* renamed from: a, reason: collision with root package name */
    private l f150974a;

    @Override // mc.d
    public final boolean a(C15116a c15116a, String str) {
        if (!Ub.c.a(Xb.e.f41788c).equalsIgnoreCase(c15116a.j())) {
            return false;
        }
        c15116a.j();
        C15931c c15931c = new C15931c();
        c15931c.i(Integer.valueOf(c15116a.a()));
        c15931c.k(c15116a.g());
        c15931c.t(Integer.valueOf(c15116a.k()));
        c15931c.j(a.EnumC0897a.GIMBAL);
        this.f150974a.b(c15116a, c15931c);
        return true;
    }

    public C15706c(l lVar) {
        this.f150974a = lVar;
    }
}
