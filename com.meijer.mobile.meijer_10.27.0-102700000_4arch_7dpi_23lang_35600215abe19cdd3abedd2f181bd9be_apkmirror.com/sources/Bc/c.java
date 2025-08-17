package Bc;

import tc.C17080d;
import tc.InterfaceC17078b;

/* loaded from: classes4.dex */
public final class c implements InterfaceC17078b<Bc.a> {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f2176a = new c();
    }

    public static c a() {
        return a.f2176a;
    }

    public static Bc.a b() {
        return (Bc.a) C17080d.d(b.a());
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bc.a get() {
        return b();
    }
}
