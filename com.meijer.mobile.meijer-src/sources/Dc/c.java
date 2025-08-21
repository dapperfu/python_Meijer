package Dc;

import vc.C17655d;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class c implements InterfaceC17653b<Dc.a> {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f6121a = new c();
    }

    public static c a() {
        return a.f6121a;
    }

    public static Dc.a b() {
        return (Dc.a) C17655d.d(b.a());
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Dc.a get() {
        return b();
    }
}
