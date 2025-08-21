package Bc;

import vc.C17655d;
import vc.InterfaceC17653b;

/* renamed from: Bc.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2928j implements InterfaceC17653b<AbstractC2923e> {

    /* renamed from: Bc.j$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C2928j f2688a = new C2928j();
    }

    public static C2928j a() {
        return a.f2688a;
    }

    public static AbstractC2923e c() {
        return (AbstractC2923e) C17655d.d(AbstractC2924f.d());
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2923e get() {
        return c();
    }
}
