package tc;

import java.util.concurrent.Executor;
import vc.C17655d;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class k implements InterfaceC17653b<Executor> {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f162472a = new k();
    }

    public static k a() {
        return a.f162472a;
    }

    public static Executor b() {
        return (Executor) C17655d.d(j.a());
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
