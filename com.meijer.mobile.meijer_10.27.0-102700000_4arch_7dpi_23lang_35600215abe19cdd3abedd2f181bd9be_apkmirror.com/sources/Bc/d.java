package Bc;

import tc.C17080d;
import tc.InterfaceC17078b;

/* loaded from: classes4.dex */
public final class d implements InterfaceC17078b<Bc.a> {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f2177a = new d();
    }

    public static d a() {
        return a.f2177a;
    }

    public static Bc.a c() {
        return (Bc.a) C17080d.d(b.b());
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bc.a get() {
        return c();
    }
}
