package rc;

import java.util.concurrent.Executor;
import tc.C17080d;
import tc.InterfaceC17078b;

/* loaded from: classes4.dex */
public final class k implements InterfaceC17078b<Executor> {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f157982a = new k();
    }

    public static k a() {
        return a.f157982a;
    }

    public static Executor b() {
        return (Executor) C17080d.d(j.a());
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
